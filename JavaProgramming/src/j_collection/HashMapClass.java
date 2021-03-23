package j_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {

		/*
		 *  Object put(Object key, Object value) : 지정된 키와 값을 저장한다. (인덱스 대신에 저장해서 사용 : 순서 없음.)
		 *  Object remove(Object key) : 지정된 키로 저장된 값을 제거한다. 
		 *  Object get(Object key) : 지정된 키의 값(없으면 null)을 반환한다. 
		 *  Set keySet() : 저장된 모든 키를 Set으로 반환한다. (내가 저장한 맵이 아닐 때 키를 알기 위해 사용하는 메서드)
		 */
		
		
		HashMap<String, Object> map = new HashMap<>(); // 제네릭에도 2개가 들어감 -> key(String)와 값(Object)을
		// key는 보통 스트링 타입으로 쓴다.(대부분 키랑 값의 타입을 맞춰주는 편)
		
		
		map.put("a", 10);
		map.put("b", "홍길동");
		map.put("c", new Date());  // 값의 타입을 Object로 했기 때문에 아무타입의 값을 다 넣을 수 있다.
		System.out.println(map); // 출력 결과 : {b=홍길동, c=Thu Mar 18 10:14:09 KST 2021, a=10} (입력된 순번이랑 다름 = 순서가 없음)
		
		
		map.put("b", "이순신"); // 값을 덮어쓰게 되는 것임.
		System.out.println(map); // 출력 결과 : {b=이순신, c=Thu Mar 18 10:15:12 KST 2021, a=10} (홍길동이 이순신으로 바뀜)
		
		
		map.remove("a");
		System.out.println(map); // 출력 결과 : {b=이순신, c=Thu Mar 18 10:16:21 KST 2021} (a가 사라짐)
		
		Object value = map.get("b"); // 받는 타입은 제네릭으로 지정한 타입임.
		System.out.println(value);  // 출력 결과 : 이순신 => 원래는 String 타입을 넣어 놨지만 그냥 꺼내면 Object 타입임 
		String value2 = (String)map.get("b"); // -> 꺼낼 때 String 타입으로 형변환을 해주어야 String 메서드 호출 가능.
		
		
		// 여기부터는 Set
		
		
		Set<String> keys = map.keySet(); // keys라는 Set 타입의 변수에 모든 키를 String 타입으로 넣어 둠.
		//Set에는 get()이라는 메서드가 없음. -> 값을 꺼내기 위해서는 향상된 for문을 사용해야 함.
		
		for(String key : keys){ // 값을 담을 변수(타입은 ->의 타입을 기준으로 정해줌) : 을 기준으로 배열이나 셋이나 리스트 등의 여러개의 데이터를 가진 것이 들어 옴.
			System.out.println(key + " : " + map.get(key)); // 꺼내서 저장은 먼저하고 {}안의 실행문을 실행 = 저장을 먼저 하기 때문에 출력문 key의 값을 출력할 수 있음.
		}
		
		System.out.println(keys);
		

		//해쉬맵 사용하는 경우 = 데이터 상의 한 줄(row)를 표현할 때.
		// 회원 테이블 : 아이디, 비밀번호, 이름, 전화번호  => 모두 다 String으로 표현 가능
		HashMap<String, String> user = new HashMap<>();
		user.put("id", "admin");
		user.put("password", "admin123");
		user.put("name", "관리자");
		user.put("tel", "010-1234-1234");
		
		System.out.println(user); // 출력 {id=admin, tel=010-1234-1234, name=관리자, password=admin123} => 한명의 회원의 정보를 한 row에 표현 함.
		
		HashMap<String, String> user2 = new HashMap<>();
		user2.put("id", "wraq");
		user2.put("password", "wtqa123");
		user2.put("name", "관리자2");
		user2.put("tel", "010-3262-1234");
		
		ArrayList<HashMap<String,String>> table = new ArrayList(); // 테이블 형태로 만들어주기 위해서 HashMap을 포함 할 ArrayList를 만들어 줌.
		table.add(user);											// db연동해서 쓸 때 이렇게 해줘서 쓰면 됨. 
		table.add(user2);
		
		System.out.println(table);
		
		
		ArrayList<HashMap<String,String>> hakgwa = new ArrayList<>();
		
		HashMap<String,String> subject = new HashMap<>();
		subject.put("subCode", "H001");
		subject.put("name", "외식조리학과");
		subject.put("univCode", "W002");
		
		hakgwa.add(subject);

		HashMap<String,String> subject2 = new HashMap<>();
		subject2.put("subCode", "H002");
		subject2.put("name", "호텔관광경영학과");
		subject2.put("univCode", "W002");
		
		hakgwa.add(subject2);

		HashMap<String,String> subject3 = new HashMap<>();
		subject3.put("subCode", "H003");
		subject3.put("name", "철도경영학과");
		subject3.put("univCode", "W003");
		
		hakgwa.add(subject3);
		
		HashMap<String,String> subject4 = new HashMap<>();
		subject4.put("subCode", "H004");
		subject4.put("name", "간호학과");
		subject4.put("univCode", "W005");
		
		hakgwa.add(subject4);
		
		System.out.println(hakgwa);
		
		
		
		
		
		
		
	}

}
