package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Finally {

	public static void main(String[] args) {

		/*
		 * finally
		 *  - 필요에 따라 try-catch 뒤에 finally를 추가해 줄 수 있다.
		 *  - finally는 예외의 발생여부와 상관없이 가장 마직막에 수행된다.
		 *  
		 * 자동 자원 반환 
		 *  - try(변수 선언; 변수 선언){} catch(Exception e){}
		 *  - 사용 후 반환이 필요한 객체를 try의 ()안에서 선언하면 try 블럭 종료시 자동으로 반환된다.
		 */ 
		
		FileInputStream fis = null; // 파일 읽기 클래스 - 운영체제의 도움을 받아서 파일을 읽어 온다.
		
		try {
			fis = new FileInputStream("e:/file.txt"); // 클래스의 객체 생성
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();   // 읽어 온 다음에 close를 안해주면 파일이 메모리에 올라가 있는 상태라서 메모리가 낭비 됨.
							   // 따라서 close 메서드는 반드시 실행이 되어야 함. -> catch 뒤에 finally{}를 붙여서 에러가 나도 꼭 실행해야 하는 문구를 블럭안에 써주기			
			} catch (Exception e) {  // 파라미터 값 IOException e -> Exception e로 만들기
				e.printStackTrace();
			}
		}
		// 예외 발생 시 : 에러 발생 시점에서 catch로 갔다가 finally로 실행
		// 예외 미 발생 시 : 그냥 쭉 진행 try -> finally -> 이후 진행

	// 위처럼 finally를 사용하면 코딩이 너무 길어짐 (자원반환 한줄 하려고 5줄 정도 써야 함)
		// ->> 그래서 자동자원 반환 try(변수 ; 변수){} catch(){}를 씀
		
		//자동 자원 반환(JDK1.7부터 가능)
		try(FileOutputStream fos = new FileOutputStream("e:/file.txt")){ //파일 아웃풋 스트림 -> 파일을 만드는(쓰는) 클래스
			String str = "파일에 쓰고 싶은 내용 아무거나 막 쓰봐라";
			
			byte[] bytes = str.getBytes();
			
			for(int i =0; i < bytes.length; i++){
				fos.write(bytes[i]);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		ArrayList a = new ArrayList<>();
	
	}

}
