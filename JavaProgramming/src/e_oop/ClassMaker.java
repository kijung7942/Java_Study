package e_oop;

public class ClassMaker {
	//전역변수를 하나 만들어주세요.
	int iv = 0;
	
	//파라미터도 없고 반환타입도 없는 메서드 생성.
	// 메서드 안에서 전역변수를 출력.
	void method(){
		System.out.println(iv);
	}
	
	// 전역변수와 동일한 타입의 리턴타입이 있고 파라미터는 없는 메서드
	// 리턴 값은 전역변수.
	int method2(){
		return iv;				
	}
	
	
	// 리턴타입은 없고 파라미터가 있는 메서드를 만들기
	// 메서드 안에서 파라미터를 출력
	
	void method3(String str){
		System.out.println(str);
	}
	
	// int타입의 리턴타입과 int타입의 파라미터 두개가 있는 메서드 생성
	//메서드 안에서 두 파라미터를 곱한 결과를 리턴
	int method4(int x, int y){
		return x*y;
	}
	//return의 역할 :  1. 메서드를 종료하는 역할(메서드 내의 if문에 넣어서 씀)
	//               2. 리턴값을 돌려주는 역할(void에서는 생략가능)
	
	
	
	
	
	
	
}
