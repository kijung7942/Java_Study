package g_oop2.test;

import g_oop2.AccessModifier;

public class AccessTest extends AccessModifier {

	public static void main(String[] args) {
	AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
//		System.out.println(am.protectedVar); // 이렇게 바로 접근하면 에러남.
//		am.protectedMethod();				 // 상속받은 Test 클래스의 객체를 새로 만들어서
											 // protected 변수나 메서드에 접근 가능
//		System.out.println(am.defaultVar);
//		am.defaultMethod();
//		
//		System.out.println(am.privateVar);
//		am.privateMethod();
	
		
		AccessTest at = new AccessTest();
		
		System.out.println(at.protectedVar);
		at.protectedMethod();
	}

}
