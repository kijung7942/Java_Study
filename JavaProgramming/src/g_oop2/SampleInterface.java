package g_oop2;

public interface SampleInterface {

	/*
	 * 인터페이스 : 일반적인 변수나 메서드를 가질 수 없음. 객체 생성 불가. 상속 용도로 사용 가능.
	 * 			  상수(final)인 변수와 추상메서드(abstract)만 가질 수 있음. 변수의 이름은 대문자로 한다(상수라서).
	 * 			  클래스와 다르게 여러개의 인터페이스를 implement 할 수 있음.
	 * 			  기존에 이름이 같은 메서드를 붙였던 적이 있다면 생략해서 가져옴.(상속받는 메서드의 내용이 없기 때문에 가능한 것임.)
	 * 			  관계가 없는 것 끼리 관계를 만들어 줄 수 있다.(Starcraft클래스 참조)
	 */
	
	// 인터페이스의 모든 멤버변수는 public static final 제어자를 사용해야 한다.
//	public static final int NUM1 = 3;
	
	//모든 멤버변수의 제어자가 같기 때문에 생략이 가능.
	int NUM2 = 2;
	
	// 인터페이스의 모든 메서드는 public abstract 제어자를 사용해야 한다.
	public abstract void method1();
	
	// 모든 메서드의 제어자가 같기 때문에 생략이 가능하다.
	void method2();
	
}


class SampleImplement implements SampleInterface, SampleInterface2{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		System.out.println(NUM1); // 인터페이스 파일이라 출력 불가함.
	}
}

interface SampleInterface2{
	
	int NUM1 = 3;
	
	void method1();
	void method3();
	
}