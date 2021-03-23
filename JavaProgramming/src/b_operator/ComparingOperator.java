package b_operator;

public class ComparingOperator {

	public static void main(String[] args) {
		/*
		 * 비교연산자 
		 * - <, >, <=, >=, ==, !=   // == 같다, != 같지 않다.
		 * - 문자열 비교 : equals()
		 */
		
		int x =10, y=20;
		boolean b = x < y; //비교연산자의 연산결과는 boolean타입.
		System.out.println("1 = " + b);
	
		b = x <= y -15; // 비교연산과 산술연산이 같이 있는 경우 산술연산이 먼저 계산된다.
		System.out.println("2 = " + b);
		
		String str1 = "abc";
		String str2 = "abcd";  // Java에서는 같은 리터럴일 경우 같은 주소에 저장함.(메모리를 아끼기 위해서)
		b = str1 == str2;      // 문자열의 내용이 아닌 주소를 비교한 것.(참조형 타입이기 때문)
		System.out.println("3 = " + b); // 문자열끼리의 비교는 ==이 아닌 equals 메서드를 사용해야함.
		
		b = str1.equals(str2); // 주소가 아닌 리터럴(내용)이 같은지를 확인하는 메서드
		System.out.println("4 = " + b);
		b = !str1.equals(str2); // str1이라는 변수 앞에 !를 붙이면 비교해서 다르면 true값.
		System.out.println("5 = " + b);
		
		// 다음의 문장들을 코드로 작성해주세요.
		// 1. x가 y보다 크다.
			b = x > y;
			System.out.println("x가 y보다 크면 true=" + b);
		// 2. x는 y보다 작거나 같다.
			b = x <= y;
			System.out.println("x가 y보다 크면 true=" + b);
		// 3. y는 홀수이다.
			 b = y%2 == 1;
			 System.out.println("y=" + y + "/" + "y가 홀수면 true=" + b);
		// 4. "기본형"과 "참조형"은 다르다.
			String str3 = "기본형", str4 = "참조형";
			b = !str3.equals(str4);
			System.out.println("기본형과 참조형이 다르면 ture =" + b);
			
			
			
			
		
		
		
		
		
		
		
	}

}
