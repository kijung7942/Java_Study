package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC2 {

	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc24";
		String password = "java";
		
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null; // select문을 쓰려고 할 때만 사용하는 변수임.
		
		try {
			con = DriverManager.getConnection(url, user, password); // 커넥션타입의 값을 넘겨줌.
			
			String sql = "SELECT * FROM CART WHERE CART_MEMBER = ?"; //?는 원래 "a001"같은 값이 들어가지만
																	//?를 넣어줌으로써 값을 동적으로 만듬.
			ps = con.prepareStatement(sql);
			ps.setString(1, "a001"); // 앞의 1은 물음표의 인덱스 번호 , 뒤의 a001은 물음표 데이터의 값
//			ps.setInt(parameterIndex, x);		데이터의 값에 따라서 setInt, setDate, setObject등으로 메서드 변경 가능.
//			ps.setDate(parameterIndex, x);
//			ps.setObject(parameterIndex, x);
			
			rs = ps.executeQuery();
			
			
			ResultSetMetaData metaData = null;
			metaData = rs.getMetaData(); // ResultSet에 들어있는 MetaData를 받는 메서드 (MetaData는 Data의 Data: 컬럼 명이 몇개가 있는지, row는 몇 행인지 등을 수치화해서 보여줌.)
			
			int columnCount = metaData.getColumnCount(); //컬럼이 몇개인지를 반환해주는 메서드 getColumnCount
			
			while(rs.next()){
				for(int i = 1 ; i <= columnCount; i++){
					Object value = rs.getObject(i);
					System.out.println(value + "\t");
				}
				System.out.println();
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs != null) try {rs.close();} catch (Exception e){}
			if(ps != null) try {ps.close();} catch (Exception e){}
			if(con != null) try {con.close();} catch (Exception e){}
		}
		
		
		
		
		
	}

}
