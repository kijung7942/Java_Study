package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 *  산술 연산자
		 *   - 사 칙 연 산  : +, -, *, /, %(나머지)
		 *   - 복합연산자  : +=, -=, *=, /=, %=
		 *   - 증감연산자  : ++, --
		 */  
		
		int result = 10 + 20 - 30 * 40 / 50 % 60;
		
		// 연산순서: 곱하기, 나누기, 나머지 부터
//		result = 10 / 3;
//		System.out.println(result);
//		result = 10 % 3;
//		System.out.println(result);
		
		
		//5개의 사칙연산자를 사용해 5개의 연산을 수행 후 결과를 출력
		
		int result2 = 10 + 2;
				System.out.println(result2);
		    result2 = 10 - 2;
		    	System.out.println(result2);
		    result2 = 5 * 3;
		    	System.out.println(result2);
		    result2 = 3 / 5;
		    	System.out.println(result2);
		    result2 = 2 % 3;
		    	System.out.println(result2);
		    
		/*복합연산자		
		  변수에 저장되어 있는 값에 연산을 수행할 때 수행할 연산자와 대입연산자를 결합해 사용할 수 있다.*/
	    	result = result + 3;
	    	result += 3;

	    	result -= 5;
	    	result *= 3;
	    	result /= 3;
	    	result %= 3;
	    	
    	// 아래의 문장을 복합연산자를 사용한 문장으로 만들기
    	//  result = result + 3;
    		result += 3;
    	result = 1;
    	//  result = result - 2 * 3;
    		result -= 2 * 3;
    		System.out.println(result);
		result =1;
    		result *= 2 - 3;
    		System.out.println(result);
    	//  result = result %5;
    		result %= 5;
    	
    	//증감연산자
    		//증가연산자(++) : 변수의 값을 1 증가시킨다.
    		//감소연산자(--) : 변수의 값을 1 감소시킨다.
    		int i = 0;
    		
    		++i; // 전위형 : 변수의 값을 읽어오기 전에 1 증가.
    		i++; // 후위형 : 변수의 값을 읽어 오고 난 후에 1 증가.
    		--i; 
    		i--; 
    		
    		
    		i =0;
    		System.out.println("++i =" + ++i);
    		i =0;
    		System.out.println("i++ =" + i++);
    		System.out.println("i=" + i);
    		
    		//피연산자의 타입이 서로 같아야만 연산이 가능.
    		int _int = 10;
    		double _double = 3.14;
    		double result3 = _int + _double; // 표현범위가 더 큰 타입(더블)로 형변환 된다.
    		int result4 = _int + (int)_double; // 형변환을 통해 int타입의 값을 받을 수도 있음.(값손실 있을 수 있음)
    		System.out.println(result3);
    		System.out.println(result4);
	    		
			long _long = 100L;
			_long = _int + _long;
			_int = _int + (int)_long; // int+long 타입의 결과는 long인데 int에 저장하려 해서 컴파일에러가 남 -> 형변환을 통해 에러 수정.
    		
    		byte _byte = 5;
    		short _short = 10;
    		_int = _byte + _short; // int보다 작은 타입은 int로 형변환된다. (오버플로우 방지)
    		System.out.println(_int);
	
    		char _char = 'a';    // 문자 a는 유니코드표에 따라 숫자 97임.
    		char _char2 = 'b';   // 문자 b는 유니코드표에 따라 숫자 98임.
    		_int = _char + _char2;
    		System.out.println(_int);
    		
    		//오버플로우, 언더플로우
    		// 표현범위를 벗어나는 값을 표현할 때 발생하는 현상.
    		byte b = 127; // byte는 -128~127까지만 표현 가능 
    		b++;          // 127 + 1 은 128이지만 byte에서는 표현 불가 -> 오버플로우
    		System.out.println(b);
    		b--;		  // -128 -1 은 -129이지만 byte에서 표현 불가 -> 언더플로우
    		System.out.println(b);

    		//다음을 한줄씩 계산해서 최종 결과값을 출력.
    		//1. "123456 + 654321 ="
    		//2. "1번의 결과값  * 123456 ="
    		//3. "2번의 결과값 / 123456 ="
    		//4. "3번의 결과값 - 654321 ="
    		//5. "4번의 결과값 % 123456 ="
    		
    		long ex = 123456 + 654321L;
    		System.out.println("long으로 계산");
    		System.out.println(ex);
    		ex *= 123456;
    		System.out.println(ex);
    		ex /= 123456;
    		System.out.println(ex);
    		ex -= 654321;
    		System.out.println(ex);
    		ex %= 123456;
    		System.out.println(ex);

    		int ex2 = 123456 + 654321; // 오버플로우 발생
    		System.out.println("int로 계산");
    		System.out.println(ex2);
    		ex2 *= 123456;
    		System.out.println(ex2);
    		ex2 /= 123456;
    		System.out.println(ex2);
    		ex2 -= 654321;
    		System.out.println(ex2);
    		ex2 %= 123456;
    		System.out.println(ex2);
	
    		//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구하기.
    		 int o = 123, p = 24236, q = 32345;
    		 int sum = o + p + q;
//    		 double aver = sum / 3; ---> sum과 3 둘 다 int 타입이기 때문에 결과가 int로 나옴.
    		 double aver = sum / 3.0;  // 따라서 뒤의 3을 3.0으로 실수로 만들어 줌.    		 
    		 System.out.println("합계=" + sum + ", 평균=" + aver);
    		 
    		 //소수점 아래 반올림
    		 aver = Math.round(aver);
    		 System.out.println(aver); // 소수점 첫째자리에서 반올림 함.

    		 aver = Math.round(aver*10) / 10.0; // 소수점의 자리를 옮겼다가 제자리로 옮김.(나누는 수 실수로 써야함 주의)
    		 
    		 //랜덤한 수를 발생
    		 Math.random(); // 0.0 ~ 1.0미만(0.99999...) -> double 타입임.
    		 int random = (int)(Math.random() * 100) + 1; // * 100 하면 0~99 이므로 +1 해서 1~100으로 만들어줌.
    		 System.out.println(random);
    		 
    		 
	
	
	
	}

}
