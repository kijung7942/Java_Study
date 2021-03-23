package e_oop;

public class StringSpeedTest {

	public static void main(String[] args) {

		// 스트링 클래스는 새로운 문자열을 더할 때 기존에 있던거에 새로운 문자열을 더하는게 아님
		// 아예 새로운 객체를 만드는거라 시간이 오래걸림.
		// 따라서 StringBuffer 같은 클래스를 사용하는게 처리 속도 향상에 기여함.
	
//		String str = "a";
//		
//		long start = System.currentTimeMillis();
//		for(int i = 0; i < 200000; i++){
//			str += "a";
//		
//		}
//		long end = System.currentTimeMillis();
//		
//		System.out.println(end - start+"ms");
		
		StringBuffer sb = new StringBuffer("a");
		long start = System.currentTimeMillis();
		for(int i =0; i < 200000; i++){
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - start+"ms");
	}

}
