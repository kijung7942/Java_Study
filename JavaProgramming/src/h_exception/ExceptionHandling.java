package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {
		/*
		 *  에러
		 *   - 컴파일 에러 : 컴파일 시에 발생되는 에러(빨간줄)
		 *   - 논리적 에러 : 실행은 되지만, 의도와 다르게 동작하는 것 (버그)
		 *   - 런타임 에러 : 실행 시에 발생되는 에러
		 *   
		 *  런타임 에러
		 *   - 런타임 에러 발생시 발생한 위치에서 프로그램이 비정상적으로 종료된다.
		 *   - 에러 : 프로그램 코드에 의해 수습될 수 없는 심각한 오류(처리 불가)
		 *   - 예외 : 프로그램 모드에 의해서 수습될 수 있는 다소 미약한 오류(처리 가능)
		 *   
		 *  예외
		 *   - 모든 예외는 Exception 클래스의 자식 클래스이다.
		 *   - RuntimeException 클래스와 그 자식들은 예외처리가 강제되지 않는다.(예외처리를 안해도 된다는 뜻)
		 *   - [RuntimeException 클래스와 그 자식들을 제외한] Exception 클래스의 자식들은 예외처리가 강제된다.
		 *   - 보통 예외처리가 강제되는 경우에만 형식적으로 예외처리를 한다고 보면 된다.
		 *   
		 *  예외처리(try-catch)
		 *   - 예외처리를 통해 프로그램이 비정상적으로 종료되는 것을 방지할 수 있다.
		 *   - try{} catch(Exception e){}
		 *   - try 블럭 안의 내용을 실행 중 예외가 발생하면 catch로 넘어간다.
		 *   - 여러 종류의 예외를 처리할 수 있도록 catch는 하나 이상 올 수 있다.
		 *   - 발생한 예외와 일치하는 catch 블럭안의 내용이 수행된 후 try-catch를 빠져나간다.
		 *   - 발생한 예외와 일치하는 catch가 없을 경우 예외는 처리되지 않는다.(프로그램이 종료되어 버린다.)
		 */
		
//		int result = 10/0; //  ArithmeticException 오류 발생(0으로 나눠서: /by zero)
//		System.out.println(result);
		
		try{  // try 내에서 오류가 발생하면 오류 난 줄에서 멈추고 catch를 찾아서 해당하는 catch를 실행하고 try-catch문을 빠져나옴.(sysout은 아예 실행을 안하는거임)
			int result = 10/0; // 계산할 때 ArithmeticException의 예외는 발생하더라도 프로그램이 꺼지지 않고 무시하고 진행
			System.out.println(result);
		}catch(ArithmeticException | IndexOutOfBoundsException e){ // |로 여러가지 파라미터를 설정하거나 catch를 여러개 써서 여러 예외처리 가능. 
			e.printStackTrace(); // 에러나는 페이지를 그대로 보여주는 메서드.(보통 이렇게 함)
		}catch(NullPointerException e){
			e.printStackTrace();
		}catch(Exception e){ // 모든 예외처리 가능 Exception이 모든 예외처리의 조상 클래스이기 때문에 자동형변환을 통해 모든 예외 클래스를 파라미터로 받을 수 있음.
			e.printStackTrace();
			
		}
		
//		int j = 10/0; // 실행하면 에러가 나지만 컴파일 에러는 발생 안함 - 런타임 에러
		// Thread.sleep(1000); // RuntimeException 클래스의 자식이 아니라 예외처리가 강제 됨.
							   // ctrl + 1 눌러보면 Surround with try catch 나옴 -> 형식상으로 해준다보면 됨.
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// ctrl + 1 해서 예외처리가 뜨면 예외처리 해주면 된다 정도만 알고 있으면 되는데
		// 중요한 것은 에러가 났을 때 에러 문구를 보는 능력이다. -> 에러를 수정할 수 있는 능력을 키울 것.
		// 에러메시지는 에러가 나는 순간의 callstack의 상태를 출력해주는 것임.
		
		test1();
		// 메인 메서드에서 test1을 호출하고 test1은 test2를 호출
		
		/*
		 * CallStack : LIFO (Last In First Out)   <---->  Queue : FIFO (First In First Out)
		 * |           |									|	   		 |
		 * |__test2()__|	1번째 출력: test2()				|___test2()__|	1번째 출력: main()
		 * |__test1()__|	2번째 출력: test1()				|___test1()__|  2번째 출력: test1()
		 * |__main()___|	3번째 출력: main()					|___main()___|  3번째 출력: test2()
		 * |___________|									|			 |
		 */
		
		
		
		
		
		
		
		
		
		
	}

	private static void test1() {
		test2();
	}

	private static void test2() {
//		System.out.println(10 / 0);
		try {
			new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
