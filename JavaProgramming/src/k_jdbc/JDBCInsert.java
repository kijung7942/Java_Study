package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCInsert {

	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc24";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "INSERT INTO R (A,B,C) VALUES('C','V','B')";
			ps = con.prepareStatement(sql);
			
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
