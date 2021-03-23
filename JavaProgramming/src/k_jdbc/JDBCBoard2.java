package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import e_oop.ScanUtil;

public class JDBCBoard2 {

	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "pc24";
	String password = "java";
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	ResultSetMetaData metadata = null;
	
	
	
	public static void main(String[] args) {

		
		/*
		 *  TB_JDBC_BOARD 테이블을 사용해 게시판 프로그램을 만들기.
		 */
		JDBCBoard2 JDBCB = new JDBCBoard2();
		
		JDBCB.start();
		JDBCB.end();
		
	}

	private void end() {
		
	}

	void start(){
		JDBCBoard board = new JDBCBoard();
		while(true){
			System.out.println("=========================================================");
			System.out.println("번호\t제목\t내용\t작성자\t작성일");
			System.out.println("=========================================================");
			if(board.selectCount()==0)
				System.out.println("게시글이 없습니다.");
			else
				board.selectAll();
			System.out.println("=========================================================");
			System.out.println("메뉴를 선택하세요 > 1.등록 2.조회 3.수정 4.삭제 5.종료");
				int input = ScanUtil.nextInt();
				switch(input){
				case 1:
					System.out.println("제목을 입력하세요");
					String title = ScanUtil.nextLine();
					System.out.println("내용을 입력하세요");
					String content = ScanUtil.nextLine();
					System.out.println("작성자를 입력하세요");
					String user_id = ScanUtil.nextLine();
					
					insert(title,content,user_id);
					break;
				case 2:
					break;
				case 3:
					System.out.println("수정할 게시물의 번호를 입력하세요");
					int updateInput = ScanUtil.nextInt();
					System.out.println("수정할 게시물의 내용을 입력하세요");
					String updateContent = ScanUtil.nextLine();
					update(updateInput, updateContent);
					break;
				case 4:
					System.out.println("삭제할 게시물의 번호를 써주세요.");
					int deleteInput = ScanUtil.nextInt();
					delete(deleteInput);
					break;
				case 5:
					System.out.println("종료합니다.");
					System.exit(0);
				}
		}
	}
	
	private void delete(int deleteInput) {
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "DELETE FROM TB_JDBC_BOARD WHERE BOARD_NO = ?";
			ps = con.prepareStatement(sql);
			ps.setObject(1, deleteInput);
			
			rs = ps.executeQuery();
					
			int result = ps.executeUpdate();
					System.out.println("영향받은 행의 수 : "+result);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			if(rs != null) try {rs.close();} catch (Exception e){}
			if(ps != null) try {ps.close();} catch (Exception e){}
			if(con != null) try {con.close();} catch (Exception e){}
		}
	
	}

	private void update(int updateInput, String content) {
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "update TB_JDBC_BOARD set CONTENT = ? where BOARD_NO = ?";
			ps = con.prepareStatement(sql);
			ps.setObject(1, content);
			ps.setObject(2, updateInput); 
			
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
	

	private void insert(String title, String content, String user_id) {
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "INSERT INTO TB_JDBC_BOARD (BOARD_NO,TITLE,CONTENT,USER_ID,REG_DATE) VALUES((SELECT MAX(BOARD_NO)+1 FROM TB_JDBC_BOARD),?,?,?,SYSDATE)";
			ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setString(3, user_id);
			
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

	int selectCount(){
		int columnCount = 0 ;
		try {
			con = DriverManager.getConnection(url, user, password);
			String sql = "SELECT * FROM TB_JDBC_BOARD";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			metadata = rs.getMetaData();
			columnCount = metadata.getColumnCount();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(rs != null)try{rs.close();}catch(Exception e){}
			if(ps != null)try{ps.close();}catch(Exception e){}
			if(con != null)try{con.close();}catch(Exception e){}
		}
		return columnCount;
	}	
	
	void selectAll(){
		
		try{
			con = DriverManager.getConnection(url, user, password);
			String sql = "SELECT * FROM TB_JDBC_BOARD";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			metadata = rs.getMetaData();
			int ccount = metadata.getColumnCount();
				while(rs.next()){
					for(int i = 1; i <= ccount; i++)
					{String str = rs.getString(i);
					System.out.print(str+"\t");}
					System.out.println();
				}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(rs != null)try{rs.close();}catch(Exception e){}
			if(ps != null)try{ps.close();}catch(Exception e){}
			if(con != null)try{con.close();}catch(Exception e){}
				
			
		}
		
		
			
	}
	
	
	
	
	
	
}