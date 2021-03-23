package kjPractice;

import java.util.Arrays;

public class Examination2 {

	public static void main(String[] args) {

//		문제1.
//
//		arr배열의 모든값을 더하는 프로그램을 작성하세요
//		int[] arr ={10,20,30,40,50};
//		int sumArr = 0;
//
//		for(int i = 0 ; i < arr.length ; i++){
//			int sumArr += arr[i];
//		}

		
//		문제2 
//
//		5명의 이름을 입력받아 배열에 저장하는 프로그램을 작성하세요.
//
//		Scanner sc = new Scanner(System.in);
//		String[] name = new String[5];
//		for(int i = 0 ; i < name.length ; i ++){
//			System.out.println("이름을 입력 해주세요>");
//			name[i] = sc.nextLine();
//		}
		
		
//		 
//		문제3
//
//		score배열의 최대값, 최소값구하기 
//		int[] score = {79,88,91,33,100,55,95};
//		int max = score[0], min = score[0];
//		for(int i = 0; i < score.length ; i ++){
//					if(max < score[i])
//						max = score[i];
//					if(min > score[i])
//						min = score[i];
//				}	
		

		//		문제4
//
//		2차원 배열 arr2에 담긴 모든값의 총합과 평균을 구하는 프로그램을 작성하세요
//
//		int[][] arr2 = {
//		    {5,5,5,5,5},
//		    {10,10,10,10,10},
//		    {20,20,20,20,20},
//		    {30,30,30,30,30}
//		 };
//		int arrSum = 0;
//		double arrAvg = 0;
//		for(int i = 0; i < arr2.length; i++){
//			for(int j = 0; j < arr2[i].length; j++){
//				arrSum += arr2[i][j];
//			} arrAvg = ((double)arrSum/(arr2.length*arr2[i].length));
//		}
//
//		문제5
//
//		answer 배열의 각 숫자의 갯수를 세어 count배열에 넣고 
//		count배열의 각숫자만큼씩 *를 출력한다 
//
//		int[] answer= {1,1,2,3,4,4,4,3};
//		int[] counter = new int[4];
//
//		for(int i = 0 ; i < answer.length ; i++){
//			switch(answer[i]){
//			case 1: counter[0]++;
//			break;
//			case 2: counter[1]++;
//			break;
//			case 3: counter[2]++;
//			break;
//			case 4: counter[3]++;
//			break;
//			}
//		}
//		
//		for(int i = 0; i < counter.length ; i++){
//			System.out.print(i+1+"의 갯수 =");
//			for(int j = 0; j < counter[i] ; j++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		
//		
//		문제6
//		menu배열에서 메뉴이름과 가격중 메뉴이름을 추출하는 프로그램을 작성하세요.
//
//		String menu[] ={ "아메리카노 3000원", "카푸치노 4000원", "카페라떼 3500원"};
//		String name = null; 
//
//		for(int i = 0 ; i < menu.length ; i++){
//			name = menu[i].substring(0,menu[i].indexOf(' '));
//		}
		
		
//
//		문제7.
//		 
//		str변수에서 Java의 위치를 찾아 출력하는 프로그램을 작성하세요,
//
//		String str="i Love Java";
//		System.out.println(str.indexOf("Java"));
//
		
		
//		문제8
//
//		s변수에서 lang문자열을 추출하는 프로그램을 작성하세요 
//		String  s= "java.lang.Object";
//		System.out.println(s.substring(s.indexOf("lang"),s.indexOf(".O")));

		
		
		
//		문제9
//
//		animals변수에서 ,를 기준으로  문자열을  분리해서  3개의 단어로 각각 출력하는
//		 프로그램을 작성하세요
//		String animals = "dog,cat,bear";
//		String[] animals2 = animals.split(",");
		
		
		
		

//		 문제 10
//		str문자열에서 ,를 .으로 바꾸어 출력하는 프로그램을 작성하세요.
//		String str="java,lang,Object";
//		System.out.println(str.replaceAll(",","."));
//		
		
		
		

	}

}
