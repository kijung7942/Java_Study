package e_oop;

import java.util.Arrays;

public class StringClass {

	public static void main(String[] args) {

		/*
		 * String
		 * - 여러개의 문자를 사용하기 쉽게 만들어 놓은 클래스
		 * 
		 *  String의 주요 매서드
		 *  - equals() : 문자열의 내용이 같은지 반환.
		 *  - length() : 문자열의 길이 반환
		 *  - charAt() : 특정 인덱스에 위치한 문자를 반환.
		 *  - substring() : 문자열의 특정 부분을 잘라서 반환.
		 *  - indexOf() : 문자열 내의 특정 문자의 인덱스를 반환.(위치의 숫자를 반환.)
		 *  - contains() : 문자열이 특정 문자열을 포함하고 있는지 여부를 반환.
		 *  - split() : 문자열을 특정 문자를 기준으로 나누어 배열형태로 반환.
		 *  - trim() : 문자열 앞뒤의 공백을 제거해 반환.
		 *  - valueOf() : 다른 탕비의 데이터를 문자열로 변환해 반환.
		 */
		
		boolean equals = "문자열".equals("문자열");
		
		System.out.println(equals);
		
		String str1 = "문자열";
		String str2 = null;
			System.out.println(str1.equals(str2));
//			System.out.println(str2.equals(str1)); // 널포인터익셉션 에러남 str2가 null값이기 때문에
			// 따라서 코드를 짤 때는 null이 있을 수 있는 변수를 앞에두지 않는다.
			
		String str = "12345";
		int length = str.length();
		char charAt = 'a';
		for(int i = 0; i < length; i++){
			charAt = str.charAt(i);
		}
		//문자열 뒤집기
		String rev = "";
		for(int i = str.length()-1; 0 <= i; i--){
			rev += str.charAt(i);
		}
		System.out.println(rev);
		
		str = "0123456789";
		String sub1 = str.substring(3); // 3번 인덱스부터 잘라서 반환.
		System.out.println(sub1);
		String sub2 = str.substring(5, 8); // 3번 인덱스부터 잘라서 반환. (8번 인덱스는 포함하지 않음.
		System.out.println(sub2);
			
		
		str = "수박 오렌지 귤 블루베리";
		int index = str.indexOf("오렌지"); // 문자열 내에 찾으려는 값이 없으면 -1 출력

		//substring과 indexOf를 조합하여 문자열 자르기
		String[] menu = {"수박 20000원", "오렌지 100000원", "귤 500원", "블루베리 3000원"};
		for(int i = 0; i < menu.length; i++){
			String name = menu[i].substring(0,menu[i].indexOf(" "));
			System.out.println(name);
			//가격만 잘라서 int타입 변수에 저장.
			int price = Integer.parseInt(menu[i].substring(menu[i].indexOf(" ")+1,(menu[i].indexOf("원"))));
			System.out.println(price);
		}
		
		
		// contains 포함하면 true, 포함 안하면 false => 불린타입
		str = "abcd";
		boolean contains = str.contains("c");
		System.out.println(contains);
		
		//오렌지가 메뉴의 몇번 인덱스에 있는지 찾기.
		for(int i = 0; i < menu.length; i++){
			if(menu[i].contains("오렌지")){
				System.out.println("오렌지는 " + i + "번 인덱스에 있습니다.");
			}
		}
		
		
		// split = String type의 배열로 반환. (나누는 기준이 되는 문자는 포함하지 않음.)
		str = "a/b/c";
		String[] split = str.split("/");
		System.out.println(Arrays.toString(split));
	
		for(int i = 0 ; i < menu.length ; i ++){
			split = menu[i].split(" ");
			System.out.println("메뉴명 : " + split[0] + " / 가격: " + split[1]);
		}
		
		// trim 
		str = "  문 자 열\t\t\t\t";
		String trim = str.trim();
		System.out.println("["+ str + "]  -> ["+ trim + "]");
		
		String id = " myId";
		String password = "myPassword  ";
		System.out.println(id);
		System.out.println(password);
		System.out.println(id.trim());
		System.out.println(password.trim());
		
		//String.valueOf => 문자열로 형변환
		int number = 10;
		str = String.valueOf(number);
		str = number + ""; // 편법임.
		
		
		
	}

}
