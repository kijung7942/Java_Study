package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
//
//		/*
//		 * 배열(데이터)
//		 * - 여러개의 값을 하나의 변수에 저장해서 사용하는 것이다.
//		 * - 참조형 타입이다.(변수에 주소를 저장하는 것임.)
//		 * - 인덱스로 값을 구분한다.(주소에서 가져올 값을 구분)
//		 * - 길이를 변경 할 수 없다.
//		 */
//		
//		int[] array; // 배열의 주소를 저장할 공간이 만들어진다. []를 붙여서 배열임을 선언(보통 타입 뒤에 []를 붙임)
//		array = new int[5]; // 배열이 생성되고 그 주소가 저장된다(5개의 값을 저장할 수 있는 array 배열). : 배열의 초기화 new 타입[배열의 길이];
//
//		/*
//		 *  변수 = 주소가 들어감
//		 *  주소는 기본값 0으로 5개가 들어가 있음. {0, 0, 0, 0, 0,}
//		 *  첫번째 0이 변수에 저장되는 주소 값이 됨.
//		 */
//		
//		
//		// 배열 초기화와 동시에 기본값이 저장된다.
//		/*
//		 * 기본값
//		 * - byte, short, int, long : 0
//		 * - float, double : 0
//		 * - char : 0 -> 사실상 공백(' ')
//		 * - boolean : false
//		 * - 참조형 타입 : null
//		 * (while, if 등 메서드 안에서 주소를 입력했을 시 메서드 밖에서는 기본값으로만 쓸 수 있음.)
//		 */
//		
//		array = new int[]{1, 2, 3, 4, 5}; // 길이를 설정하지 않고 {}안에 직접 값을 저장하는 방법.
//		int[] array2 = {6, 7, 8, 9}; // 선언과 초기화를 동시에 했을때만 가능한 방법.
//		
//		// 배열에서 특정 값을 불러오는 방법
//		// 어레이명[인덱스번호] : 0번이 첫 번째 값, 1번이 두 번째 값, 2번이 세 번째 값
//		
//		System.out.println(array[0]); 
//		System.out.println(array[1]); 
//		System.out.println(array[2]); 
//		System.out.println(array[3]); 
//		System.out.println(array[4]); 
////		System.out.println(array[5]); // 에러 발생함 -> array 인덱스에는 0~4번까지만 등록 되어있기 때문.
//		
//		// 어레이 인덱스에 새로운 값 입력(배열의 타입에 맞는 인덱스 값만 저장 가능. 
//		//ex)
////		int a[] = {3.0};  // => 불가 int타입에 double타입 리터럴을 넣으려고 했기 때문)
//		// 어레이명[인덱스번호] = 새로운 값;
//		array[0] = 10;
//		array[1] = 20;
//		array[2] = 30;
//		array[3] = 40;
//		array[4] = 50;
//
//		
//		// 주로 for문과 함께 사용하는 경우가 많음. 
//		// array.length는 array 길이 만큼이라는 내용임.
//		// 아래 for문에서 array.length는 5임.(인덱스가 0~4까지 5개)
//		//
//		for(int i = 0; i < array.length; i++){    
//			        // i<= array.length 하면 i가 5일때도 실행을 하게 되는데 index는 4까지이므로 에러가 남. 
//			System.out.println(array[i]);
//		}
//		
//		for(int i = 0; i < array.length; i++){    
//			array[i] = (i + 1) * 10;
//			System.out.println(array[i]);
//		}
//		
//		
//		// 10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요.
//		
//		int[] z;
//		z = new int[10];
//		z = new int[]{1,1,1,1,1,1,1,1,1,1};
//		z[0] = (int)(Math.random()*100)+1;
//		int[] x = {1,1,1,1,1,1,1,1,1,1};
//
//		for(int i = 0 ; i < z.length ; i++){
//			z[i] = (int)(Math.random()*100)+1;
////			System.out.println(z); // I@28084850 -> 주소가 출력됨.
//			System.out.println(z[i]);
//			
//		}
//		System.out.println(Arrays.toString(z));
//		//[78, 27, 97, 52, 64, 60, 61, 48, 98, 99] 배열의 값을 한번에 출력해주는 메서드
//			
//			int sum = 0;
//			
//		//배열에 저장된 모든 값의 합계와 평균을 구하면?
//		for(int i = 0; i < z.length ; i++){
//				sum += z[i]; }
//		double avg = (double)sum / (double)z.length;
//		System.out.println("합계 = " + sum + " /" + " 평균 =" + avg);
//		
//		
//		// 배열에 저장된 값들 중 최소값과 최대값을 출력해주세요.
//		
//		int max = z[0], min =z[0];
//		
//		for(int i = 1; i < z.length ; i++) {
//			if(max < z[i]){
//				max = z[i];
//		}
//			if(min > z[i]){
//				min = z[i];		
//			}
//		} System.out.println("max = " + max + " / min = " + min);
//		
//		int[] shuffle = new int[10];
//		for(int i = 0; i <shuffle.length; i++){
//			 shuffle[i] = i+1;
//		}
//		System.out.println(Arrays.toString(shuffle));
//		
//		
//		//shuffle 안의 인덱스 값들을 서로 바꿔서 섞어주세요.
//		int shu = shuffle[0], random = 0 , random2 = 0;
//		for(int i = 1 ; i <= 10; i++){
//			random = (int)(Math.random()*10);
//			random2 = (int)(Math.random()*10);
//			shuffle[random] = shuffle[random2]; 
//		}	
//			System.out.println(Arrays.toString(shuffle));
//		
//		
		// 1~10 사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
			
//			int[] ran = new int[500]; 
//			int[] count = new int[10];
//			for(int i=0; i < ran.length; i++){
//			int random = (int)(Math.random()*10)+1; // 임의의 한자리수 생성
//			ran[i] = random;				   // 위에서 생성된 임의의 한자리수를 어레이 ran에 저장
//			} // 임의의 어레이 ran 완성
//			System.out.println(Arrays.toString(ran));
//			
//			for(int i = 0 ; i < ran.length; i++){
//					switch(ran[i]){
//						case 1: count[0]++;
//						break;
//						case 2: count[1]++;
//						break;				
//						case 3: count[2]++;
//						break;
//						case 4: count[3]++;
//						break;
//						case 5: count[4]++;
//						break;
//						case 6: count[5]++;
//						break;
//						case 7: count[6]++;
//						break;
//						case 8: count[7]++;
//						break;
//						case 9: count[8]++;
//						break;
//						case 10: count[9]++;
//						break;
//				 }
//				}
//			System.out.println(Arrays.toString(count));
			
			
			
			
			
			 
				}
			
		
		
		
	}











