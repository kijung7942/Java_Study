package d_array;

import java.util.Arrays;


public class Quiz {

	public static void main(String[] args) {

		// 거스름돈 동전 갯수
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("낸 돈 입력");
//		int money = Integer.parseInt(sc.nextLine());
//		
//		int price = (int)(Math.random()*300) * 10;
//		
//		int change = money - price;
//		int[] coin = {500, 100, 50, 10};
//		System.out.println("낸 돈 : " + money);
//		/*
//		 * 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요.
//		 *
//		 * ex) 거스름돈 2860원
//		 * 500원 : 5개
//		 * 100원 : 3개
//		 * 50원 : 1개
//		 * 10원 : 1개
//		
//		int fh = 0, h = 0, ft = 0, t = 0;
//		fh = change / 500;
//		h = change % 500 / 100;
//		ft = change % 100 /50;
//		t = change % 100 % 50 / 10;
//		System.out.println("거스름돈 :" + change + "원\n 500원 : " + coin[0] + "개\n 100원 : " + coin[1] 
//				+"개\n 50원 : "+ coin[2] +"개\n 10원: "+ coin[3] +"개");

//		//거스름돈 정답
//		int money = (int)(Math.random()*500)*10;
//		int[] coin = {500,100,50,10};
//		for(int i =0; i < coin.length; i++){
//			System.out.println(coin[i]+"원:"+money/coin[i]+"개");
//			money %= coin[i];
//		}
//
//		
		
		// 그래프 그리기
		int[] arr = new int[20];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() *5) + 1;
		}
//		System.out.println(Arrays.toString(arr));
		
		/*
		 *  1~5 사이의 숫자가 발생된 만큼 *을 사용해 그래프를 그려주세요.
		 *  
		 *  1 : *** 3
		 *  2 : **** 4
		 *  3 : ** 2
		 *  4 : ***** 5
		 *  5 : ****** 6 
		 */
		
		
		
		int[] count = new int[5];
//		
//		for(int i = 0 ; i < count.length; i++){
//				for(int j=0; j < arr.length; j++){ 
//					if(arr[j] == i+1){
//						count[i]++;
//					}
//				}
//		}
//		System.out.print("count어레이 : ");
//		System.out.println(Arrays.toString(count));
//
//		for(int i = 0 ; i < count.length; i++){
//			System.out.print(i+1 + ": ");
//			for(int j = 0 ; j < count[i]; j++){
//				System.out.print("*");
//			}
//			System.out.println(" " +count[i]);
//		}
			
			// 정답
//		for(int i = 0; i < arr.length; i ++){
//			count[arr[i]-1]++;
//		}
//		for(int i = 0; i < count.length; i++){
//			System.out.print(i+1+":");
//			for(int j = 0; j<count[i]; j++){
//				System.out.print("*");
//			}
//			System.out.println(" "+count[i]);
//			}
		
			//배열에 중복된 숫자 제거
			arr = new int[10];
			for(int i = 0; i<arr.length; i++){
				arr[i] = (int)(Math.random()*5) + 1;
			}
			System.out.println("aaa_"+"arr: " + Arrays.toString(arr));
			/*
			 * 1~5 사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어주세요.
			 * [3, 4, 3, 1, 1, 3, 4, 5, 2, 4]
			 * [3, 4, 1, 5, 2] 
			 */
//			int max = 0; boolean flag = true;
//			count = new int[5];
//			for(int i = 0; i < arr.length ; i++){
//					if(max < arr[i])
//					{max = arr[i];}
//			}
//			int[] new_arr = new int[max];
//			new_arr[0] = arr[0];
//			System.out.println("new_arr: " + Arrays.toString(new_arr));
//			for(int i = 0; i < max-1; i++){
//				flag = true;
//				for(int j = 0; j < max-1; j++){
//					System.out.println("i=" + i + "j=" + j);
//					if(arr[i+1] != new_arr[j]){
//						new_arr[i+1] = arr[j];
//						flag = false;}
//					
//					if(!flag){break;
//					
//					}
//					
//					
//					
//				}
//				System.out.println("new_arr2: " + Arrays.toString(new_arr));
//			}
			
			int[] temp = new int[5];
			int counted = 0;
			for(int i = 0; i <arr.length; i++){
				boolean flag = true;
				for(int j = 0; j < temp.length; j++){
					if(arr[i] == temp[j]){
						flag = false;
					}
				}
				if(flag){
					temp[counted++] = arr[i];
				}
			}
			System.out.println(Arrays.toString(temp)); // 배열의 갯수가 정확히 안나옴
			
			int[] result = new int[counted];
			for(int i = 0; i < result.length; i++){
				result[i] = temp[i];
			}
			System.out.println(Arrays.toString(result));
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
	
	
	
	
	
	
	}

}





