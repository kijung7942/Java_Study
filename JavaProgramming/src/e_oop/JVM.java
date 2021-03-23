package e_oop;

public class JVM {

	public static void main(String[] args) {
		/*
		 *  JVM(Java Virtual Machine)
		 *   - 자바로 만들어진 프로그램이 실행되는 컴퓨터 안의 가상 컴퓨터
		 *   - 운영체제 -> JVM -> 자바 프로그램
		 *   - 장점 : 운영체제에 상관없이 실행 할 수 있다.
		 *   - 단점 : 속도가 느리다.
		 *   
		 *  JVM 메모리 구조(중요한 3가지만)
		 *   - Method Area(메서드 영역) : 클래스 멤버가 저장된다.
		 *   - Call Stack(호출 스택) : 현재 호출되어 있는 메서드가 저장된다.
		 *   - Heap : 객체(인스턴스)가 저장된다.
		 */
		
		
		// 01. 프로그램 실행시 main(), classVar, classMethod()가 MethodArea에 저장 됨.
		// 02. main()이 호출되어 CallStack에 저장 됨.
		
		System.out.println(classVar);
		// 03. System클래스의 out이 MethodArea에 저장 됨.
		// 04. println() 메서드가 CallStack에 저장 됨.
		// 05. println() 이 classVar를 출력 후 CallStack 에서 삭제 됨.
		
		classMethod();
		// 06. classMethod()가 호출되어 CallStack에 저장 됨.
		// 07. classMethod()의 내용을 실행
		// 08. classMethod()의 실행이 종료되어 CallStack에서 삭제 됨.
		
		JVM jvm = new JVM();
		// 09. JVM객체는 Heap에 저장 됨.
		// 10. 지역변수 jvm은 CallStack에 생성 되고, JVM객체의 주소가 jvm에 저장 됨.
		
		System.out.println(jvm.instanceVar);
		// 11. println()이 호출되어 CallStack에 저장 됨.(System.out은 이미 MethodArea에 저장이 된 상태)
		// 12. prinln()이 instanceVar를 출력 후 CallStack에서 삭제 됨.
		
		jvm.instanceMethod();
		// 13. instanceMethod()가 호출되어 CallStack에 저장 됨.
		// 14. instanceMethod()의 내용을 실행
		// 15. instanceMethod()의 실행이 종료되어 CallStack에서 삭제 됨.
		
		jvm = null;
		// 16. jvm변수에 null이 저장 됨.
		// 17. 어디에서도 주소를 참조하지 않는 JVM객체는 GarbageCollector에 의해 삭제 됨.
		
		// 18. main()의 실행이 종료되어 CallStack에서 삭제 됨.
		// 19. 프로그램이 종료되고 MethodArea의 데이터가 삭제 됨.
		
	}
	

	
	int instanceVar;
	static int classVar;
	
	void instanceMethod(){					// 인스턴스 메서드에서는 iv, cv 모두 사용 가능.
		System.out.println(instanceVar);
		System.out.println(classVar);
	}
	
	static void classMethod(){				// 클래스 메서드에서는 cv는 사용가능.(iv는 생성하지 않은 상태일 수 있기 때문)
//		System.out.println(instanceVar);  // iv가 아직 메모리에 올라오지 않은 상태(객체 생성하는 순간 메모리에 올라감)
		System.out.println(classVar);
	}
	
	
	
	
}
