package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		/*
		 * 다차원 배열
		 * - 배열안에 배열이 저장되어 있는 형태
		 */
		
		// 2차원 배열
		int[][] array2;
		
		// 3차원 배열
		int[][][] array3;
		
		/*
		 * {주소1, 주소2} 1차원배열에서는 주소값이 아닌 데이터 값이 들어있었으나 2차원 배열에서는 주소가 들어있음.
		 * 
		 * 주소1
		 * {0,0,0}
		 * 
		 * 주소2
		 * {0,0,0}
		 */
		
		int[][] arr = new int[2][3];
		int arr2 [][] = new int[][]{{1,2,3},{4,5,6}};
		int[] arr3[] = {{1,2,3},{4,5,6},{7,8,9}};
		
		int [][] arr4 = new int[3][]; // 가변 배열: 주소 지정만 하는 건 가능.
//		int [][] arr5 = new int[][3]; // 가변 배열 : 주소 지정 없이 불가.
		
		arr4[0] = new int[3]; // 0번 인덱스 주소의 데이터를 3개로 지정
		arr4[1] = new int[4]; // 1번 인덱스 주소의 데이터를 4개로 지정
		arr4[2] = new int[10]; // 2번 인덱스 주소의 데이터를 10개로 지정
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr4[2]));
		
//		arr[0] = 10; // 1차원 배열에는 값(데이터)를 저장할 수 없음.(주소(배열)가 들어가야함)
		arr[0] = new int[5]; // 배열을 저장해야한다.
		arr[0][0] = 10; // 2차원에 값을 저장할 수 있다.
		arr[0][1] = 20;
		arr[1][0] = 100;
		
		
		System.out.println(arr.length); // 1차원 배열의 길이
		System.out.println(arr[0].length); // 2차원 배열의 길이
		System.out.println(arr[1].length); // 2차원 배열의 길이
		
		for(int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr[i].length; j++){
				System.out.println(arr[i][j]);
			}
		}
		
		System.out.println(Arrays.toString(arr)); // 1차원 배열에 저장되어 있는 주소를 출력.
		System.out.println(Arrays.toString(arr[0])); // 2차원 배열 안에 있는 값을 보고 싶다.
		System.out.println(Arrays.toString(arr[1]));
		
		
		
		
		int[][] scores = new int[3][5]; // int [학생수][과목수]
		int[] sum = new int [scores.length]; // 합계
		double[] avg = new double[scores.length]; // 평균
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){
				scores[i][j] = (int)(Math.random()*101);
			}
			System.out.print("scores"+i+"= ");
			System.out.println(Arrays.toString(scores[i]));
		}

		
		for(int i = 0 ; i < scores.length; i ++){
			for(int j = 0; j < scores[i].length; j++){
				sum[i] += scores[i][j];
			}
			avg[i] = (double)sum[i] / scores[i].length;
			System.out.println(i+"번 학생의 합계 : "+sum[i]+"평균 : " + avg[i]);
		}

		
		
		
		
		
		
		
	}

}






