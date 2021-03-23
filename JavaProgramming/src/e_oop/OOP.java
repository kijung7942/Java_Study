package e_oop;

public class OOP {

	public static void main(String[] args) {

		/*
		 *  객체지향 프로그램(Object Oriented Programming)
		 *  - 프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라 객체간의 상호작용으로 보는 것.
		 *  - 코드의 재사용성이 높고 유지보수가 용이하다.
		 */
		
		SampleClass sc = new SampleClass();
		System.out.println(sc.field);
		String returnValue = sc.method(5);
		System.out.println(returnValue);
		sc.method2();		// 메서드 내에 출력 명령어가 있기 때문에 println에 안들어 감.

		
		sc.flowTest1();
		
		
		
		
		/*
		 * 다음을 한줄씩 계산해서 최종 결과값 출력
		 * 1. 123456+654321
		 * 2. 1번의 값 * 123456
		 * 3. 2번의 값 / 123456
		 * 4. 3번의 값 - 654321
		 * 5. 4번의 값 % 123456
		 */
		Calculator c = new Calculator();
		
		double a = 123456, b= 654321;
		
		double one = c.plus(a, b);
		double two = c.multi(one,a);
		double three = c.div(two,a);
		double four = c.minus(three, b); 
		double five = c.remain(four, a);
				
		System.out.println(five);
		
		double result = c.plus(123456,654321);
		result = c.multi(result, 123456);
		result = c.div(result,123456);
		result = c.minus(result, 654321);
		result = c.remain(result,123456);
		System.out.println(result);
		
	}

}
