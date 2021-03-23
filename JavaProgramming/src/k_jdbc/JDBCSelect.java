package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBCSelect {

	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc24";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT * FROM R";
			ps = con.prepareStatement(sql);
//			ps.setString(1, "a1");
			
			rs = ps.executeQuery();
			ResultSetMetaData metaData = rs.getMetaData();
			
			int columnCount = metaData.getColumnCount();
			
			while(rs.next()){
				for(int i = 1 ; i <= columnCount ; i ++){
				String columnName = rs.getString(i); 
				System.out.println(columnName);
				}
				System.out.println();
			}

			String sql2 = "SELECT TABLE_NAME FROM USER_TABLES";
			ps = con.prepareStatement(sql2);
			rs = ps.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(rs != null)	try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			if(ps != null)	try {ps.close();} catch (SQLException e) {e.printStackTrace();}
			if(con != null)	try {con.close();} catch (SQLException e) {e.printStackTrace();}
		}
		
		
		
	}

}
