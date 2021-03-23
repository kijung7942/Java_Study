package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUpdate {

	public static void main(String[] args) {

		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc24";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "update R set B = ? where B = ?";
			ps = con.prepareStatement(sql);
			ps.setObject(1, "f"); // 쿼리문에서 MEM_HP 라는 ? 의 인덱스는 1
			ps.setObject(2, "w"); // 쿼리문에서 MEM_HP 라는 ? 의 인덱스는 2
			
			int result = ps.executeUpdate();
			System.out.println("영향받은 행의 수 : " + result);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(rs != null)	try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			if(ps != null)	try {ps.close();} catch (SQLException e) {e.printStackTrace();}
			if(con != null)	try {con.close();} catch (SQLException e) {e.printStackTrace();}
		}
		
	}

}
