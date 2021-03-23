package b_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		/*
		 * 논리연산자 : 비교연산을 연결해주는 역할로 사용
		 * - &&(AND: 둘다 true여야 true), ||(OR: 둘중 하나라도 true면 true), !(NOT: true면 false, false면 true로 바꿈)
		 * - 피연산자로 boolean만 허용한다.
		 */
	
		int x =10, y=20;
		boolean b = 0 < x && x < 10 || x < y; // and가 뒤에 있어도 먼저 실행됨
		
		b = !(x < y);  // 10 < 20 원래는 true지만 !을 붙였으므로 결과 값은 false
		System.out.println(b); // !는 논리연산자 -> int 타입인 x에는 연산 불가 -> x<y에 ()를 해주어야 함.
		
		// 효율적 연산 
		b = true && true; // true
		b = true && false; // false
		b = false && true; // false 왼쪽이 이미 false이기 때문에 오른쪽 true는 확인하지 않음.
		b = false && false; // false
		
		b = true || true; //true  왼쪽이 이미 true이기 때문에 오른쪽 true는 확인하지 않음.
		b = true || false; //true
		b = false || true; //true
		b = false || false; //false
		// 왼쪽의 피연산자에서 결과가 정해지면 오른쪽은 수행하지 않는다.
		
		int a = 10;
		b = a < 5 && 0 < a++; // 앞의 a < 5 가 false여서 뒤의 a++은 실행이 아예 안됨.
		System.out.println(a); // a++이 실행 안됐기 때문에 a값은 11이 아닌 10으로 남아 있음.
		
		// 다음의 문장들을 코드로 작성
		// 1. x가 y보다 크고, x가 10보다 작다.
		b = x > y && x < 10;
		// 2. x가 짝수이고, x가 y의 배수이다.
		b = x % 2 == 0 && x % y == 0;
		// 3. x가 3의 배수이거나, x가 5의 배수이다.
		b= x % 3 == 0 || x % 5 == 0;
		
		
	}

}
