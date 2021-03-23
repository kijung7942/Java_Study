package k_jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JDBCTest {

	public static void main(String[] args) {
		JDBCTest j = new JDBCTest();
		List<Object> param = new ArrayList<>();
		param.add("x001");
		
		j.testMap("mem_id","member",param);
	}

	
	void testListMap(String table){
		JDBCUtil jdbc = JDBCUtil.getInstance(); // JDBCUtil은 싱클톤 패턴이라서 객체 생성이 아니고 메서드로 불러옴.
		String sql ="SELECT * FROM " + table;
		List<Map<String,Object>> list = jdbc.selectList(sql);
		
		for(int i = 0 ; i < list.size(); i ++){
			Map<String, Object> map = list.get(i);
			for(String key : map.keySet()){
				System.out.println(map.get(key) + "\t");
			}
			System.out.println();
		}
	}
	
	void testListMap(String table, List<Object> param){
		JDBCUtil jdbc = JDBCUtil.getInstance(); 
		String sql ="SELECT * FROM " + table + " where mem_id = ?";
		List<Map<String,Object>> list = jdbc.selectList(sql,param);
		
		for(int i = 0 ; i < list.size(); i ++){
			Map<String, Object> map = list.get(i);
			for(String key : map.keySet()){
				System.out.println(map.get(key) + "\t");
			}
			System.out.println();
		}
	}
	
	void testMap(String att, String table){
		JDBCUtil jdbc = JDBCUtil.getInstance(); // JDBCUtil은 싱클톤 패턴이라서 객체 생성이 아니고 메서드로 불러옴.
		String sql ="SELECT "+ att + " FROM " + table;
		Map<Integer,Object> map = jdbc.selectOne(sql);
		
			for(Integer key : map.keySet()){
				System.out.println(map.get(key) + "\t");
			}
			System.out.println();
		}

	void testMap(String att, String table, List<Object> param){
		JDBCUtil jdbc = JDBCUtil.getInstance(); // JDBCUtil은 싱클톤 패턴이라서 객체 생성이 아니고 메서드로 불러옴.
		String sql ="SELECT " + att + " FROM " + table + " where mem_id = ?";
		Map<Integer,Object> map = jdbc.selectOne(sql,param);
		
			for(Integer key : map.keySet()){
				System.out.println(map.get(key) + "\t");
			}
			System.out.println();
		}
}


