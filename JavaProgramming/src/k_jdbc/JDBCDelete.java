package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDelete {

	void delete (int i) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc24";
		String password = "java";
		
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "DELETE FROM TB_JDBC_BOARD WHERE BOARD_NO = ?";
			ps = con.prepareStatement(sql);
			ps.setObject(1, "i");
			
			
			rs = ps.executeQuery();
					
			int result = ps.executeUpdate();
					System.out.println("영향받은 행의 수 : "+result);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//처음에 적으면 컴파일 에러가 남 -> try catch로 감싸야 함. -> 감싼 뒤에 con(커넥션) 변수에 값을 저장해주어야 함.
		finally{
			//운영체제의 도움을 받아서 가져온 정보는 해야할 처리과정이 끝나고 나면 자원을 반환해야 한다.
			if(rs != null) try {rs.close();} catch (Exception e){}
			if(ps != null) try {ps.close();} catch (Exception e){}
			if(con != null) try {con.close();} catch (Exception e){}
		}
	}

}
