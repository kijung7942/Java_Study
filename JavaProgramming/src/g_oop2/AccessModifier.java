package g_oop2;

public class AccessModifier {

	/*
	 * 접근제어자
	 * 클래스에는 퍼블릭과 디폴트만 붙일 수 있음.
	 * 지역변수(lv)에는 붙을 수 없고 전역변수(iv), 클래스변수(cv), 인스턴스메소드(im), 클래스메소드(static Method) 에만 붙는다.
	 */
	
	public String publicVar = "public: 접근제한이 없음";
	protected String protectedVar = "protected: 같은 패키지 + 상속받은 클래스에서 가능";
	String defaultVar = "default: 같은 패키지에서만 접근 가능";
	private String privateVar = "private: 클래스 내에서만 접근 가능";
	
	public void publicMethod(){
		System.out.println(publicVar);
	}
	
	protected void protectedMethod() {
		System.out.println(protectedVar);
	}
	
	void defaultMethod(){
		System.out.println(defaultVar);
	}
	
	private void privateMethod(){
		System.out.println(privateVar);
	}
	
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
		System.out.println(am.privateVar);
		am.privateMethod();
		
		
		Time t = new Time();
		
		System.out.println(t.getTime()); // 결과 값 = 9:330:-20
		// 사용자가 개발자의 의도와 다른 값을 입력해도 그대로 출력되기 때문에 접근제어자가 필요한 것임.
		//
		t.setHour(23);
		t.setMinute(59);
		t.setSecond(60);
		t.clock();
	}	
}
