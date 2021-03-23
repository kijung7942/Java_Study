package g_oop2;

public class SampleChild extends SampleParent {

	void childMethod(){ //새로 생성한 메서드
		System.out.println(var);		// 상속받은 변수
		System.out.println(method(7,13)); // 상속받은 메서드
	}


	// 오버라이딩 : 상속받은 메서드의 내용을 조금 수정하기 위해 덧 쓰는 것.
	// super, super() : this랑 비슷 함. 상속과 관련 함. 부모클래스의 멤버와 자식클래스의 멤버를 구분하기 위함.
	//	this() : 생성자에서 클래스 내의 다른 생성자를 호출
	// super() : 자식클래스의 생성자에서 부모클래스의 생성자를 호출
	// 다형성 (= 다양한 형태를 가짐.) : 부모클래스가 있으면 여러 자식 클래스가 있음. 기존에는 클래스 이름과 똑같은 타입의 변수를 사용했었음.
	//							 이를 상속을 이용하면 클래스 타입과 다른 타입의 변수를 만들 수 있음. 
	//							예시) Product aircon = new Aircon(); => 프로덕트(부모) 클래스를 가진 에어컨(자식) 객체
	
	
	
	
	// 오버라이딩 : 상속받은 메서드의 내용을 재정의 하는 것.
	// 사용법 : 부모 클래스의 메서드를 그대로 복붙함.
//	int method(int a, int b){   // 기존 메서드에서 복붙(리턴타입, 메서드명, 파라미터가 부모 클래스의 메서드와 모두 같아야 함.)
//		return a + b;			
//	}
	// 그 이후에 내용만 변경
	@Override // 어노테이션(Annotation) 오버라이딩임을 확인해주는 안전장치.(클래스나 메소드 등에 붙여줌.)(어노테이션은 오버라이딩 말고 여러개 있음)
	int method(int a, int b){   // 내용을 + 에서 *로 변경
		return a * b;
	}
	
	
	// super, super()
	int var; // 자식 클래스에 있는 var
	
	void test(double var){
		System.out.println("자식lv: " + var); // 지역변수 var
		System.out.println("자식iv: " + this.var); // 클래스 내의 인스턴스변수 var
		System.out.println("부모iv: " + super.var);  // 부모클래스로부터 상속받은 인스턴스 변수 var
		// super : 부모 클래스의 멤버와 자식 클래스의 멤버가 이름이 중복될 때 둘을 구분하기 위해 사용.
		System.out.println(this.method(10,20));  // 자식클래스에서 새로 오버라이딩한 메서드
		System.out.println(super.method(10,20)); // 부모클래스에서 상속받은 메서드
	}
	
	SampleChild(){
		super(); // 부모클래스의 생성자 호출 : 상속받은 부모클래스의 변수가 초기화 되어야 하기 때문 -> 자식클래스에서는 반드시 해줘야 함.
				 // 부모클래스에 기본생성자(파라미터x)가 있고 자식클래스에서 super 기본 생성자를 명시 안했을 때는 컴파일러가 자동으로 만들어 줌.
				 // (파라미터가 있는 부모클래스 생성자를 가져올 경우 수동으로 명시 해야 함.)
	}
	
	
	// 다형성 : 여러가지 객체를 부모의 클래스타입으로 만들 수 있음.
	public static void main(String[] args) {
		SampleChild sc = new SampleChild(); // 기존에 변수 만들었던 방법 
		SampleParent sp = new SampleChild(); // 다형성을 이용한 방법(부모클래스 타입의 변수 + 자식 클래스(객체)) 
		// sp = new SampleChild2(); 
		// sp = new SampleChild3(); // 샘플차일드 2, 3이 있다면 이렇게도 가능
		
		// 부모자식 간에는 형변환이 가능함.
		double d = 3.0;
		int i = (int)d; // 이런느낌
		sc = (SampleChild)sp;
		sp = (SampleParent)sc; // 생략 가능
		// 자식타입 -> 부모타입 형변환은 생략 가능.
	
//		SampleChild sc2 = (SampleChild)new SampleParent(); // 형변환 생략 불가(헷갈릴땐 가지고있는 멤버수를 비교)
	    //자식멤버 : 5~6개						부모멤버 : 2~3개    // 에러남. => 자식멤버의 멤버가 더 크기 때문에 형변환불가. 
	
		SampleParent sp2 = new SampleChild(); // 형변환 생략 가능.
		System.out.println(sp2.var);
		System.out.println(sp2);
		System.out.println(sp2.method(10,20));
	
	
	
	}
}
