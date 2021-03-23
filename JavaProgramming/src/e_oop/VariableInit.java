package e_oop;

public class VariableInit {
	// 변수 초기화 하는 방법
	
		// 명시적 초기화
		int var = 10;
		static int classVar = 20;
	
		// 초기화 블럭: 여러줄의 코드로 초기화를 해야 할 때
		{
			var = 30;
		}
			// 클래스 변수를 초기화 하기 위해서는 블럭 앞에 static을 붙여준다.
		static {
			classVar = 40;
		}
	
	/* 생성자 new 클래스이름()
	*	- 클래스와 같은 이름의 메서드
	*   - 인스턴스 변수를 초기화하기 위해 사용.
	*	- 클래스에 생성자는 반드시 하나 이상 존재해야 한다.
	*	- 직접 선언해주지 않으면 컴파일러가 기본 생성자를 만들어준다.
	*	- 생성자는 리턴타입이 없다.(void도 안씀)
	*/
	
		// 기본 생성자: 인스턴스 변수를 초기화 하기 위함.(없으면 컴파일러가 만들어 줌)
		VariableInit(){
			var = 50;
			
			// 생성자 사용 이유
			// 초기화에 여러줄의 코드가 필요할 때
			// 초기화에 파라미터가 필요할 때
		}
		
		
		public static void main(String[] args) {
			Init i = new Init();
			i.a = 10;
			i.b = 20;
			i.c = 30;
			
			Init i2 = new Init();
			System.out.println(i2.a);
			i2.a = 40;
			i2.b = 50;
			i2.c = 60;
			
			
			Init i3 = new Init(70,80,90);

		}
	
		
}

class Init{
	int a;
	int b;
	int c;
	
	
	Init(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
		// this : 인스턴스 변수와 지역변수의 이름이 같을 때 둘을 구분하기 위해 사용.

	}

	// 오버로딩 : 같은 이름의 메서드를 여러개 정의 하는 것.
	// 이름이 같기 때문에 파라미터로 구분을 함. System.out.println 이 대표적인 오버로딩.
	Init(){
//		a = 10;
//		b = 20;
//		c = 30;
		this(10,20,30); // 위의 3줄 코드를 this()를 이용해서 한줄로 만듬(생성자 안에서만 사용가능)
						// this()는 생성자의 첫줄에서만 사용 가능.
		                // this 뒤에 괄호가 붙으면 클래스내의 다른 생성자 호출임.
	}
	
	
}