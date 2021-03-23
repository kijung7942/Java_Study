package h_exception;

import java.io.IOException;

public class ThrowsException {

	public static void main(String[] args) {
		/*
		 * 메서드에 예외 선언하기
		 *  - 메서드 호출시 발생할 수 있는 예외를 선언해 줄수 있다.
		 *  - void method() throws IOException{}
		 *  - 메서드의 구현부 끝에 throws 예약어와 예외 클래스명으로 예외를 선언할 수 있다.
		 *  - 예외를 선언하면 예외처리를 하지 않고 자신을 호출한 메서드로 예외 처리를 넘겨준다.
		 *   -> 예외처리 하는 역할을 넘겨주는 이유 : 호출한 메서드에서 해당 예외는 일부러 발생하게 한 것임을 다른사람이 코드를 봤을 때 알수 있도록 하기 위해서.
		 */
		
		try {
			method(); // =>throws로 오류처리하는 것을 호출한 메서드에게 처리하라고 했기 때문에 try-catch로 싸줘야 함.
		} catch (IOException e) {
			e.printStackTrace();
		}

		method2(); // => 메서드 내에서 try-catch문으로 예외처리를 했기 때문에 메인에서는 try-catch로 싸지 않아도 됨.
		
	}


	private static void method() throws IOException {
		throw new IOException();  // method 메서드 안에서는 해당 에러가 나도 처리를 하지 않고 호출한 main메서드에서 에러에 대한 예외 처리를 해야 함.
	} //throw new IOException(); -> 이거는 강제로 에러 만드는 거임.

	private static void method2() {
		try {
			throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		}  // throws를 메서드 이름 뒤에 안붙여주면 method2 메서드 안에서 예외처리를 해야 함.
		// 예외 처리를 안하면 에러남.
	}
	
	
}
