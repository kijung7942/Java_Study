package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {

	/*
	 * 석차구하기 : 점수를 비교해 작은 점수의 등수를 증가시키는 방식.
	 * 선택정렬 : 가장 작은 숫자를 찾아서 앞으로 보내는 방식.
	 * 버블정렬 : 바로뒤의 숫자와 비교해서 큰수를 뒤로 보내는 방식.
	 * 삽입정렬 : 두번째 숫자부터 앞의 숫자들과 비교해서 크수는 뒤로 밀고 중간에 삽입하는 방식. 
	 */
		
		//		Arrays.sort(arr); => 정렬 메서드
		
		int[] arr = new int[10];
		for(int i = 0; i <arr.length ; i++){
			arr[i] = (int)(Math.random() * 100) + i;
		}
			System.out.println("원래 어레이 = " + Arrays.toString(arr) + "\n\n");

			
			
		// 삽입정렬 : 두번째 숫자부터 앞의 숫자들과 비교해서 큰수는 뒤로 밀고 작은수를 만나면 빈칸을 채워 넣는다.
			
			
//			for(int i = 0; i < arr.length+1; i++){
//				for(int j = 1; j < arr.length; j++){
//					boolean flag = true; 
//					if(arr[j] < arr[j-1]){
//						 int temp = arr[j-1];
//						 arr[j-1] = arr[j];		 
//						 arr[j] = temp;
//						 flag = false;
//						 }
//					if(!flag){
//						break;
//					}
//					
//					
//					 System.out.println("i =" + i+ "/ j= " + j);
//					 System.out.println(Arrays.toString(arr));
//					 System.out.println();
//					 }
//				}		
							
//			for(int i = 1; i < arr.length; i++){
//				int temp = arr[i];
//				int j = 0;
//				for(j = i -1; j >=0; j--){
//					if(temp < arr[j]){
//						arr[j + 1] = arr[j];
//					}else{
//						break;
//					}
//					
//					System.out.println(Arrays.toString(arr));
//						
//				}
//				 arr[j+1] = temp;
//			}
				
			
			
			
			
			
		// 버블정렬 : 앞에서부터 두개씩 비교해서 큰 숫자를 뒤로 보내 주세요.(반복해서 작은수부터 나오게 정렬)
//			int count = 0;
//			do{
//			for(int i = 0 ; i < arr.length - 1 ; i ++){
//				if(arr[i] > arr[i+1]){
//					int temp = arr[i+1];
//					    arr[i+1] = arr[i];
//					    arr[i] = temp;
//				}
//			 }	
//			count ++;
//			System.out.println(count + "번째 : " + Arrays.toString(arr));
//			}while(count < arr.length);
//			System.out.println(Arrays.toString(arr));
			
			
	for(int count = 0; count < arr.length; count++){
		boolean flag = true;
		for(int i = 0 ; i < arr.length - 1 ; i ++){
			if(arr[i] > arr[i+1]){
				int temp = arr[i+1];
				arr[i+1] = arr[i];
				arr[i] = temp;
				flag = false;
				}
		}
				if(flag){
					break;
			}
		System.out.println(count + "번째 : " + Arrays.toString(arr));
	}
			
			
			// 선택정렬 : 가장 작은 숫자를 어레이의 맨 앞으로 보내 주세요.(반복해서 작은수부터 나오게 정렬)
//			
//			for (int i = 0 ; i < arr.length - 1 ; i ++){
//				int min = i;
//				for (int j = i + 1 ; j < arr.length ; j++){
//					if(arr[j] < arr[min]){
//						min = j;
//					}
//				}
//				int temp = arr[i];
//				arr[i] = arr[min];
//				arr[min] = temp;
//							}
//			System.out.println(Arrays.toString(arr));
					
			
			

			// 석차구하기 : 내 점수와 새로운 점수를 비교해서 내 점수가 적으면 석차등수를 ++ 한다.
			// 석차 어레이에 1를 넣는다.
			
//		int[] rank = new int[arr.length];
//		for(int i = 0; i <rank.length ; i ++){
//			rank[i] = 1;
//		}
//		
//		// 나와 나머지 사람들을 다 비교하기 위해서 for문을 두개 만든다.
//			for(int i = 0; i <arr.length; i++){
//				for(int j = 0; j < arr.length; j++){
//					if( arr[i] < arr[j]){
//						rank[i]++;
//					}
//				}
//			}
//		
//			System.out.println(Arrays.toString(rank));
//		
			
			
			

		
		
		
		
			
			
			
			
			
			
	}

}





