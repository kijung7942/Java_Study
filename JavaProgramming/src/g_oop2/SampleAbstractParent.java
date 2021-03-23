package g_oop2;

public abstract class SampleAbstractParent {

	/*
	 * 추상 클래스와 추상 메서드
	 * 추상 클래스 : 객체 생성이 불가하기 때문에 확장해서 부모 클래스로 사용.
	 * 추상 메서드 : 자식 클래스 마다 메서드의 내용이 조금씩 다를 때 메서드에 오버라이딩해서 쓰기 위해 생성.
	 * 			(자식 클래스에게 추상 메서드를 강제로 만들게끔 유도하는 역할) 
	 */
	
	void method(){ //일반적인 메서드의 형태
	}
	
	abstract void abstractMethod(); //추상 메서드 : 선언부만 있고 구현부는 없는 메서드
	
}



class SampleAbstractChild extends SampleAbstractParent{
	@Override
	void abstractMethod(){
		
	}
}