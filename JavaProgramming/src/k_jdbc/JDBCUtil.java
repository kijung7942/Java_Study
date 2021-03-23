package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCUtil {

	
		// 싱글톤 패턴 : 인스턴스의 생성을 제한하여 하나의 인스턴스만 사용하는 디자인 패턴
		// 객체를 하나만 생성할 수 있게 하는 것. 다른 클래스에서 필요하다면 만들어진 하나의 객체를 빌려주는 식으로 쓸 수만 있음.
	    // 새로 객체가 만들어지는게 아니기 때문에 데이터베이스로 쓸 수 있음.
	private JDBCUtil(){ // 생성자가 private이기 때문에 다른 클래스에서 객체 생성을 못함.
		
	}

	private static JDBCUtil instance;
	
	public static JDBCUtil getInstance(){
		if(instance == null){
			instance = new JDBCUtil();
		}
		return instance; // instance라는 만들어진 객체를 빌려줌.
	}

	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "pc24";
	String password = "java";
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	/*
	 * Map<String, Object> selectOne(String sql) // 조회의 결과가 한줄
	 * Map<String, Object> selectOne(String sql, List<Object> param) //param에서 sql안의 ?에 들어갈 값을 추출해서 넣어주는거임. 
	 * 
	 * List<Map<String, Object>> selectList(String sql) // 조회의 결과가 여러줄
	 * List<Map<String, Object>> selectList(String sql, List<Object> param)
	 * 
	 * int update(String sql) // 인서트,업데이트,딜리트의 결과
	 * int update(String sql, List<Object> param)
	 */

	
	public List<Map<String, Object>> selectList(String sql, List<Object> param){
		List<Map<String, Object>> list = new ArrayList<>();

		try {
			con = DriverManager.getConnection(url, user, password);

			ps = con.prepareStatement(sql);
			for(int i = 0 ; i < param.size(); i++){
				ps.setObject(i+1, param.get(i));
			}
			
			rs = ps.executeQuery();
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			while(rs.next()){
				Map<String, Object> row = new HashMap<String, Object>();
				for(int i = 1; i <= columnCount; i++){
					row.put(metaData.getColumnName(i), rs.getObject(i));
				}
				list.add(row);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(rs != null)	try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			if(ps != null)	try {ps.close();} catch (SQLException e) {e.printStackTrace();}
			if(con != null)	try {con.close();} catch (SQLException e) {e.printStackTrace();}
		}
		
		return list;
	}
	
	
	public List<Map<String, Object>> selectList(String sql){
		List<Map<String, Object>> list = new ArrayList<>();

		try {
			con = DriverManager.getConnection(url, user, password);

			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			while(rs.next()){
				Map<String, Object> row = new HashMap<String, Object>();
				for(int i = 1; i <= columnCount; i++){
					row.put(metaData.getColumnName(i), rs.getObject(i));
				}
				list.add(row);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(rs != null)	try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			if(ps != null)	try {ps.close();} catch (SQLException e) {e.printStackTrace();}
			if(con != null)	try {con.close();} catch (SQLException e) {e.printStackTrace();}
		}
		
		return list;
	}
	
	
	public Map<Integer, Object> selectOne(String sql){
		Map<Integer, Object> map = new HashMap<>();

		try {
			con = DriverManager.getConnection(url, user, password);

			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
				for(int i = 1; rs.next(); i++){
					map.put(i, rs.getObject(1));
				}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(rs != null)	try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			if(ps != null)	try {ps.close();} catch (SQLException e) {e.printStackTrace();}
			if(con != null)	try {con.close();} catch (SQLException e) {e.printStackTrace();}
		}
		
		return map;
	}
	
	public Map<Integer, Object> selectOne(String sql, List<Object> param){
		Map<Integer, Object> map = new HashMap<>();

		try {
			con = DriverManager.getConnection(url, user, password);

			ps = con.prepareStatement(sql);
			for(int i = 0 ; i < param.size(); i++){
				ps.setObject(i+1, param.get(i));
			}
			rs = ps.executeQuery();
				for(int i = 1; rs.next(); i++){
					map.put(i, rs.getObject(1));
				}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(rs != null)	try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			if(ps != null)	try {ps.close();} catch (SQLException e) {e.printStackTrace();}
			if(con != null)	try {con.close();} catch (SQLException e) {e.printStackTrace();}
		}
		
		return map;
	}
}


