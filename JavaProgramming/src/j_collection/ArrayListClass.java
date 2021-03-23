package j_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClass {

	public static void main(String[] args) {
		
		
		/*
		 * Collections Framework : 다수의 데이터를 다루기 위한 표준화된 방법
		 * - List : 인덱스에 값을 저장 배열과 비슷하다고 보면 됨.      주로 사용되는 것 : ArrayList
		 * - Map  : 키와 값을 함께 저장 						    주로 사용되는 것 : HashMap
		 * - Set  : 인덱스라는 개념이 없음. 중복된 값이 저장되지 않음. (잘 사용되지 않음.)
		 * - List, Map, Set 은 모두 Interface임.
		 * 
		 * boolean add(Object obj) : 마지막 위치에 객체를 추가 후 성공여부를 반환 				(0번 인덱스부터 차례로 저장)
		 * void add(int index, Object obj) : 지정된 위치에 객체를 추가		 				(지정한 인덱스에 저장: 현재 저장되어 있는 인덱스 범위에만 넣을 수 있음)
		 * 																			(예시: [0:ㄱ][1:ㄴ][2:ㄷ][3:ㄹ]일때 [6]번 인덱스를 넣을 수는 없음)
		 *										 (예시: [0:ㄱ][1:ㄴ][2:ㄷ][3:ㄹ]일때 [ㅅ]을 2번 인덱스에 넣으면 [0:ㄱ][1:ㄴ][2:ㅅ][3:ㄷ][4:ㄹ] 이렇게 바뀜.)
		 * Object set(int index, Object obj) : 지정된 위치에 객체를 저장 후 기존 객체를 반환한다.
		 * int size() : 저장된 객체의 수를 반환한다.
		 * boolean remove(int index) : 지정된 위치의 객체를 제거한다.
		 */
		
		ArrayList sample = new ArrayList(); // 길이가 0인 상태 		
		
		sample.add("abc"); // 0번 인덱스 추가 : 길이가 1이 됨.
		sample.add(100);   // 1번 인덱스 추가 : 길이가 2가 됨. String 타입을 넣었다가 int 타입을 넣을 수 있음. 여기서 int는 Integer 100이라는 객체를 넣은 것임.
		sample.add(new Scanner(System.in)); // 2번 인덱스 추가 : 길이가 3이 됨.
		
		// 넣을때는 편하지만 가져올 때 타입이 뭔지 알 수 없음.
		
		// 따라서 제네릭<>안에 ArrayList에 들어가 있는 타입을 지정해주는게 보편적임.
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
//		list.add("abc");
		list.add(20); // add의 return타입은 boolean타입임.
		System.out.println(list.add(30)); // 저장이 잘 되었으면 true
		System.out.println(list);  // 값을 출력해서 보고 싶을때는 어레이리스트를 출력해주면 Arrays.toString 한거처럼 나옴.
								   // 출력 값 = [10, 20, 30]
		list.add(1,40);
		System.out.println(list);  // 출력 값 = [10, 40, 20, 30]
		
//		list.add(5,50);				// 실행시 에러, 저장되어 있는 인덱스 길이를 초과하기 때문에 
									// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 5, Size: 4
									// at java.util.ArrayList.rangeCheckForAdd(ArrayList.java:643)
									// at java.util.ArrayList.add(ArrayList.java:455)
									// at j_clloection.ArrayListClass.main(ArrayListClass.java:48)
		
//		list.set(2,50); // 기존에 있던 2번 인덱스의 값을 수정 return값은 기존에 들어있던 2번 인덱스의 값
		
		Integer before = list.set(2,50); // 원래 들어 있던 2번 인덱스의 값을 before에 저장하고 50의 값을 2번 인덱스로 저장
		System.out.println("before : " + before);
		System.out.println("after : " + list.get(2));
		System.out.println(list);
		
		Integer integer = list.get(2);
		System.out.println(integer);
		
//		for(int i = 0; i < list.size(); i++){ // 출력하고 삭제하는 방식으로 로직을 짜보았다.
//			System.out.println(i+ " : " + list.get(i));
//									
//			list.remove(i);
//		}
//		System.out.println(list);  // 결과는 list에 2개가 남아있다.
//									// 이유는 어레이리스트는 앞의 인덱스가 사라지면 땡겨지기 때문
//									// 따라서 반대로 큰 인덱스 부터 작은 인덱스로 출력하고 지우는 방식을 해야함.
//	
//		for(int i = list.size() - 1; 0 <= i; i--){
//			System.out.println(i + " : " + list.get(i));
//			list.remove(i);
//		}
//			System.out.println(list);
//	
//	
//				// list에 1~100사이의 랜덤값을 10개 저장
//			
//			for(int i = 0 ; i < 10; i++){
//				list.add((int)(Math.random()*100+1));
//			}
//			System.out.println(list);
//	
//				//list에 저장된 값의 합계와 평균
//			int sum = 0; double avg = 0;
//			for(int i = 0; i < 10; i++){
//				sum += list.get(i); 
//			}
//				avg = (double)sum/list.size();
//			System.out.println("sum = " + sum + " / avg = " + avg);
//			
//			/*
//			 * List에서는 wrapper class의 진짜 클래스 명을 써야한다.
//			 * 					auto boxing : 자동 형변환이 됨. => 자동 형변환 연산이 된다.
//			 * 
//			 * byte : Byte
//			 * short : Short
//			 * int : Integer
//			 * long : Long
//			 * float : Float
//			 * double : Double
//			 * char : Character
//			 * boolean : Boolean 
//			 */
//	
//				//list에서 최소값과 최대값을 출력
//			
//			int max = list.get(0); int min = list.get(0);
//			for(int i = 0; i < list.size(); i++){
//					if(max < list.get(i)){
//						max = list.get(i);}
//					if(min > list.get(i)){
//						min = list.get(i);
//					}
//			
//			}
//			System.out.println("max: " + max + " / min: "+ min);
			
			  // list를 오름차순으로 정렬
			
//			for(int i = 0 ; i < list.size(); i++ ){
//				for(int j = 0 ; j < list.size(); j ++){
//					if(list.get(i) < list.get(j)){
//						int temp = list.get(i);
//						int temp2 = list.set(j,temp);
//					    list.set(i,temp2);
//					}
//				}
//			}
//				System.out.println(list);
				
				
//			for(int i = 0; i < list.size()-1; i++){
//				min = i;
//				for(int j = i+1 ; j < list.size(); j++){
//					if(list.get(j) < list.get(min)){
//						min = j;
//					}
//				}
//				int temp = list.get(i);
//				list.set(i , list.get(min));
//				list.set(min,temp);
//				
//			}
//				System.out.println(list);
			
			
		//2차원
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
		
		list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		list2.add(list);
				
		list = new ArrayList<>();
		list.add(40);
		list.add(50);
		list.add(60);
				
		list2.add(list);
		
		list.add(70);
		list.add(80);
		
		System.out.println(list2);
		
		for(int i = 0; i < list2.size(); i++){
			ArrayList<Integer> li = list2.get(i);
			for(int j = 0 ; j <li.size(); j++){
				System.out.print(li.get(j) + "\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
	
	}
}
