package e_oop;

public class ClassMaker2 {
	
	
	// 인스턴수 변수 하나를 선언하고 명시적으로 초기화
	int iv = 1;
	
	// 위에서 선언한 인스턴수변수를 초기화 블럭을 사용해 초기화
	{
		iv = 2;
	}
	
	//위에서 선언한 인스턴스 변수를 생성자의 파라미터를 사용해 초기화.
	ClassMaker2(int iv){
		this.iv = iv;
	}
	
	//위에서 선언한 인스턴스변수를 생성자를 하나 더 만들어서 초기화.
	ClassMaker2(){
		this(3);
	}
		
	// 초기화 순서 : 명시적 -> 블럭 -> 생성자
	// 생성자가 제일 마지막에 초기화 됨. => 결국 초기화 된 값은 생성자
		
		

	
	public static void main(String[] args) {
		ClassMaker2 a = new ClassMaker2();
		System.out.println(a.iv);


	}
}
