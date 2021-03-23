package h_exception;

import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) {
		/*
		 *  예외 발생시키기
		 *   - throw new Exception();
		 *   - throw 예약어와 예외 클래스의 객체로 예외를 발생시킬 수 있다.
		 */
		
		
		
		// 원래 예외가 발생되는 시점에 해당하는 예외 클래스의 객체가 발생이 되는 것임.(그래서 예외처리할때 파라미터 값에 객체 값이 들어가는 거임)
		
//		try {
//			throw new IOException();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		throw new NullPointerException(); // 가장 많이 보는 에러 -> null을 참조했다는 뜻.
//	
//		String str = null;
//		
//		System.out.println(str.equals("abc"));
//	
//	    new IndexOutOfBoundsException(); // 인덱스 값을 넘어갔다.
	
		int[] a = new int[10];
		
		for(int i = 0 ; i <= a.length; i++){
			System.out.println(a[i]);
		}
	
	
	
	
	
	}
}
