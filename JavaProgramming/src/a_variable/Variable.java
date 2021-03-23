package a_variable;

import java.util.Scanner; // 다른패키지에 있는 클래스의 위치를 알려주는 것.
       //java.util.*  ---> 이렇게 해두면 java.util에 있는 모든 패키지를 import 할 수 있다.
       // * -> 모든 이라는 뜻.
public class Variable {        // {}: 블럭이라고 칭함.

	// 클래스는 변수(데이터)와 메서드(데이터를 가지고 할 일)로 구성된다.
	
	public static void main(String[] args) {
		/* 범위 주석 : 단축키 [ctrl + shift + /] (해제:\)   
		 main 메서드                                                                          * 메서드는 이름 뒤에 ()가 온다. -> 소괄호가 이름 뒤에 오면 무조건 메서드라 생각하면 됨.
		 main 메서드의 역할 : 프로그램의 시작과 끝.
		*/
		
	/* JAVA 문법 내용
	 *  데이터
	 *   - 기본형 : 변수에 데이터(값)를 직접 저장
	 *   - 참조형 : 변수에 데이터가 있는 주소를 저장
	 *   - 배열
	 *   - 클래스
	 *   
	 *  조작
	 *   - 산술연산
	 *   - 비교연산
	 *   - 논리연상
	 *   - 조건문
	 *   - 반복문
	 */
		
		/*
		 * 기본형 타입 : 이름(바이트크기: 표현할 수 있는 숫자의 범위가 다름.)
		 *  - 정수 : byte(1):128, short(2):6만, *int(4):20억, long(8):900경
		 *  - 실수 : float(4), *double(8) / 정확도 차이 float는      7자리까지 정확히 표현
		                                          double은  15자리까지 정확히 표현
		 *  - 문자 : char(2) - 1개의 문자만 표현 가능
		 *  - 논리 : boolean(1) - true, false만 표현 가능
		 */ 

		// 10 -> 상수
		// x -> 변수
		
		int x;  // 정수를 저장할 수 있는 x라는 변수(데이터를 담는 그릇)를 만든 것-> 변수 선언이라고 표현 함.
		
//		double x; -> 이렇게 하면 x밑에 빨간줄이 가는데 컴파일 에러임. 에러는 하나의 블럭 안에 똑같은 변수가 있기 때문임.
		double y;   // 실수를 저장할 수 있는 y라는 변수 선언.
		
		//=(대입연산자) : 오른쪽의 값을 왼쪽의 변수에 저장.
		x = 10; // 초기화 : 변수에 처음으로 값을 저장하는 행위.
		y = 3.14; // 변수의 타입에 맞는 값으로 저장해야 함.(실수를 저장)
		
		int abc = 30; // 일반적으로 선언과 초기화를 한번에 동시에 한다.
		long l = 40L; // 접미사 L을 붙여야 long타입이 된다.(대소문자 상관없으나 1과 l이 헷갈릴수있으므로 L로 써줌.)
		float f = 5.5f; // 접미사 f를 붙여야 float타입이 된다.
	    char c = '한'; // 따옴표안에 반드시 한글자만 넣어야 한다.(비어있는거도 안됨.)
	    boolean b = true; // true, false 
		
	    //8가지 기본형 타입을 사용해서 8가지 변수를 선언 및 초기화.
	    
	    byte 바이트 = 127;
	    short 숏 = 3219;
	    int 인티저 = 123;
	    long 롱 = 9230L;
	    float 플롯 = 1.24f;
	    double 더블 = 3.14;
	    char 캐릭터 = 'ㅋ';
	    boolean 불린 = false;
		
	    x = 20; // 10이었던 변수 x의 값을 지우고 20이라는 새로운 값으로 저장.(타입을 붙이지 않는다: 선언이 아니기 때문.)
	    y = 5.5;
	    
	    // 위에 선언한 8개 값에 새로운 데이터를 저장.
	    
	    	바이트 = -128;
	    	숏 = -3000;
	    	인티저 = -1;
			롱 = 900L;
			플롯 = 3.12f;
			더블 = 83.492;
			캐릭터 = 's';
			불린 = true;
			
		// 값을 콘솔창에 출력하는 방법			
			System.out.println(바이트);
			System.out.println(숏);
			System.out.println(인티저);
			System.out.println(롱);
			System.out.println(플롯);
			System.out.println(더블);
			System.out.println(캐릭터);
			System.out.println(불린);
			
		// 실행 단축키 : ctrl + F11
	    			
	    
		// 문자열 : ""로 묶음. 비어있을 수도 있고 한글자일수도 있고 여러글자일수도 있음.
		String str = "문자 여러개"; // 클래스는 참조형타입 데이터이다.(앞글자가 대문자는 클래스:약속임.)
	    System.out.println(str + 불린 + 더블);
    	// 문자열과 다른 타입의 데이터가 결합되면 문자열의 결과를 얻는다.(str + 불린) ->"문자 여러개" + true -> "문자 여러개" + "true" 
	    System.out.println(10 + 20 + str); // 계산을 앞에서부터 하기 때문에 값은 30문자 여러개
	    System.out.println(str + 10 + 20); // str+10이 문자열로 계산되어서 값은 문자 여러개1020
	    
	    //형변환: 다른 타입의 값을 저장하기 위해서는 값의 타입을 변경해 주어야 하는데 이를 형변환(type casting)이라 한다.
	    int small = 10;
	    long big = 10L;
	    
	    small = (int)big; // long타입인 big을 int에 넣으려고 하면 오류 남.(long타입이 표현범위가 더 크기 때문)
	    //변경하고 싶은 값 앞에 ()를 하고 ()안에 변경할 타입을 넣어준다.
	    
	    big = small; // 반대로 int타입인 small을 long타입에 넣는 것은 가능함.(long타입이 표현범위가 더 크기 때문)
	    
	    /*
	     * 명명규칙: 클래스, 변수 등의 이름을 지어주는 행위
	     *   - 영문자 대소문자, 한글, 숫자, 특수문자('_', '$') 두 개만을 사용할 수 있다.
	     *   - 이름은 숫자로 시작할 수 없다.
	     *   - 예약어는 사용할 수 없다.(어떤 의미로 사용하겠다고 이미 정해져있는 단어: 이클립스에서 진한 글씨로 표현해주는거)
	     *  아래 두가지는 개발자들 끼리의 약속(예의)임.
	     *   - [낙타식 표기법을 사용한다.(예시: mySampleVariable)]
	     *     * 낙타식 표기법: 변수나 클래스 이름 등이 여러단어로 이루어졌을 때, 두번째 단어 시작은 대문자로 씀(읽기 쉽게)
	     *   - [클래스명의 첫글자는 대문자로 한다.(예시: MySampleClass)]
	     *   - 한글을 사용해서 명명하면 encoding에서 문제가 될 수 있으므로 한글 사용 자제 
	     */
	    
	    /*
	     * 상수 : final + 변수
	     * - 값을 변경 할 수 없는 그릇
	     * - 이름을 명명할 때 대문자만을 사용해서 명명한다. 
	     * - 리터럴에 의미를 부여하기 위해 사용한다.(읽기 좋게 하기 위해)
	     */
	    
	    final int MAX_NUMBER = 10;
//        MAX_NUMBER = 20; -> 컴파일 에러 발생(상수이기 때문에 변경 불가)
	    
	    
	    System.out.print("줄바꿈을 하지 않는다.");
	    System.out.print("줄바꿈을 하지 않는다.\n"); 
//	      \:탈출문자 -> 탈출문자 뒤에 있는 문자에게 새로운 역할을 부여
//	      \n: 줄바꿈         \t:탭(여러간 띄어쓰기)   
	    
	    System.out.printf("문자열:%s, 숫자:%d \n", str, x); // 출력 포맷 지정
	    
	    // 입력
	    Scanner sc = new Scanner(System.in); // 입력받기 위한 클래스
	    /* 처음에 컴파일 에러 남. -> Scanner 클래스가 같은 패키지에 있지 않기 때문에 Scanner 클래스를 찾을 수 없다는거임.
	    * 따라서 Import를 해서 Scanner 클래스의 위치를 지정해주어야 함. import의 위치는 package와 public class 사이
//	    * 여담으로 string은 lang 패키지에 있고 자주 사용하기 때문에 따로 import 안해도 사용 가능.
//		* 단축키 ctrl + shift + o
//	    */
//	    
//	    System.out.print("아무거나 입력해주세요>");
//	    String str2 = sc.nextLine(); //사용자가 입력하고 enter키를 치면 sc에 입력한 값으로 저장 됨.(string타입)
//	    System.out.println(str2);

	    //문자열이 아닌 숫자를 결과 값으로 받고 싶을 때: 사용할 수는 있으나 버그가 있어서 사용하지 않는 것이 좋다.
//	    int nextInt = sc.nextInt();
//	    double nextDouble = sc.nextDouble();
	    
//	    System.out.println("int 입력>");
//	    int nextInt = sc.nextInt();
//	    String nextLine = sc.nextLine();
//	    System.out.println(nextInt);
//	    System.out.println("문자열 입력>");
//	    System.out.println(nextLine);
//	    System.out.println("입력 끝!");
	    // 버그 내용은 숫자를 입력하고 엔터를 치면 nextInt가 숫자를 받고 nextLine이 엔터를 받아서 입력이 종료되어 버림.
	    // 따라서 숫자를 받고 싶으면 nextLine으로 숫자를 받고 형변환을 해주는게 좋음.

//	    System.out.println("int 입력>");
////	    int number = sc.nextLine();  -> 컴파일 오류남. nextLine은 문자열인데 int로 받으려 했기 때문 
//	    int number = Integer.parseInt(sc.nextLine()); // Integer.parseInt를 사용하여 형변환해주는게 가능
////	    double number2 = Double.parseDouble(sc.nextLine()); // Double.parseDouble를 사용하여 형변환해주는게 가능
//	    System.out.println("int 입력완료");
	    
	    //자신의 이름을 저장할 변수를 선언
	    String myName;
	    
	    //위에서 선언한 변수를 초기화 하기 위해 이름을 입력받기
	    System.out.print("이름을 입력해주세요>");
	    myName = sc.nextLine();
	    
	    //자신의 나이를 저장할 변수를 선언(정수타입으로 받기)
	    int myAge;
	    
	    //나이를 입력받기
	    System.out.print("나이를 입력해주세요>");
	    myAge = Integer.parseInt(sc.nextLine());
	    
	    System.out.println("이름 : " + myName + " / 나이 : " + myAge);
	    System.out.printf("이름: %s, 나이: %d", myName, myAge);
	    
	    /*  과제: 다음과 같은 프로그램을 작성해주세요.
	     * 
	     *  =================== 회원가입 ===================
	     *  아이디> admin
	     *  비밀번호(4자리숫자)>1234
	     *  이름 > 홍길동
	     *  나이 > 30
	     *  키 > 185.5
	     *  ==============================================
	     *  회원가입 완료!!
	     *  =================== 내 정보 ====================
	     *  아이디 : admin
	     *  비밀번호 :1234
	     *  이름 : 홍길동
	     *  나이 : 30세
	     *  키 : 185.5cm
	     *  ==============================================
	     *  
	     */
	    
	    
	    
	    
	    
	}

}
