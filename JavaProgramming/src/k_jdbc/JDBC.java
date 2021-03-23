package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) {

		/*
		 *  JDBC(Java Database Connectivity)
		 *  -자바와 데이터베이스를 연결해주는 라이브러리
		 *  -ojdbc: 오라클 JDBC
		 *  
		 *  오라클 설치된 폴더에서 ojdbc.jar 파일을 찾아서 라이브러리추가를 해주면 됨.
		 *  프로젝트 익스프롤러에서 프로젝트에 오른쪽 클릭한 다음 필드패스에서 3번째 탭의 라이브러리로 들어가서 add external jars에다가 추가해주면 됨. 
		 *  
		 *  JDBC 작성 단계
		 *  1. Connection 생성(DB 연결)
		 *  2. Statement 생성(쿼리 작성)
		 *  3. Query 실행
		 *  4. ResultSet 에서 결과 추출(select인 경우)
		 *  5. ResultSet, Statement, Connection 닫기
		 */
	
		//데이터베이스 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc24";
		String password = "java";
		
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		//try - catch문을 이용해서 db에 연결할거임.
	
		try {
			con = DriverManager.getConnection(url, user, password);
			// jdbc상의 드라이버에 연결해주는 클래스 java와 sql사이를 연결해줌. => 겟커넥션이라는 메서드를 이용해서 url,user,password에 맞는 정보를 con에 넣어줌.
			// 여기까지 접속까지 완료한 것임. => Statement(쿼리문)를 작성
			
			String sql = "SELECT * FROM MEMBER";
			ps = con.prepareStatement(sql);
			// 쿼리문도 작성완료.
			
			//select = 셀렉의 결과를 rs에 저장함 ResultSet 타입의 리턴값.
			rs = ps.executeQuery();
					
//					insert, update, delete => int타입의 리턴값을 줌. // 영향(삽입,수정,삭제)받은 행의 갯수
//					int result = ps.executeUpdate();
			
			
			// select인 경우에만 ResultSet 에서 결과 추출
			while(rs.next()){ //다음 행을 바라보면서 다음 행이 존재하는지 여부를 리턴(리턴값 boolean).(한번에 한 행씩 추출한다고 보면 됨.)
				String memId = rs.getString(1); // 컬럼의 테이블 내의 인덱스 번호로 값을 가져옴.
				String memPass = rs.getString("MEM_PASS"); // 컬럼명으로  값을 가져옴.
				System.out.println("MEM_ID : " + memId + "/ MEM_PASS : "+memPass);
			}
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
