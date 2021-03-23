package c_statement;

import java.util.Scanner;

public class RepetitiveStatement {

	public static void main(String[] args) {

		
		/*
		 *  반복문
		 *  - for 문 : 반복횟수가 정해져있을 때 주로 사용함.
		 *  - while문 : 반복횟수를 모를 때 주로 사용함.
		 *  - do-while문
		 *  
		 *  for 문
		 *  - for(초기화; 조건식; 증감식){}
		 *  - 조건식이 참(true)인 동안 블럭안에 있는 실행문을 정해진 횟수만큼 반복하는 문장
		 */
		
		for(int i = 1; i <= 10; i++ ){System.out.println(i + "번째 반복");
		}
		// for 문 안의 int i 는 for문의 블럭 안에서만 사용가능 -> 블럭을 벗어나면 변수 자체가 사라짐.
		
		// 규칙이 있는 문장들을 효율적으로 작성하기 위해 반복문을 사용한다.
		
		
		
		int sum = 0;
		
		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		sum += 6;
		sum += 7;
		sum += 8;
		sum += 9;
		sum += 10;
		
//		for(int i = 1; i<=10; i++){ sum+=i;
//		
//		}
		
		
		sum = 0;
		for(int i = 10; i > 1; i--){
			sum -=i;
		}
		// 실행 순서 : i가 10 인것부터 인지(초기화) -> 조건식 i>1 인지 확인 -> 실행문 실행 -> 증감식 실행 -> 조건식 i>1인지 확인 -> 조건식 맞으면 실행문 실행 -> 실행문 -> 증감식 --- 순으로 실행
		System.out.println(sum);
		
		
		// 1부터 100까지 짝수의 합을 출력.
		sum = 0;
		for(int i = 1; i<=100; i++){if(i%2 ==0){sum += i;}
		
		}System.out.println(sum);
		
		// 조건식 없이 쓰는 방법.
		sum = 0;
		for(int i = 0; i<=100; i += 2){ sum += i;
			
		}System.out.println(sum);
		
		// 1부터 100까지의 홀수의 합을 출력.
		sum = 0;
		for(int i = 1; i<=100; i++){if(i%2 == 1){sum += i;}
		
		}System.out.println(sum);
		
		// 조건식 없이 쓰는 방법.
		sum = 0;
		for(int i = 1; i<=100; i += 2){ sum += i;
		
		}System.out.println(sum);		

		//7단만 출력
//		for(int i = 1; i <= 9 ; i++){System.out.println(7 + "*" + i + "=" + 7*i);
//		}
		
		// 구구단 출력.
//		for(int i = 2; i <= 9; ++i){
//			for(int j =1; j <=9; ++j){System.out.printf("%d * %d = "+ i*j+"\n", i, j);
//			}
//			System.out.println();
//		}
		
//		for(int i = 2; i <= 9; ++i){
//			for(int j =1; j <=9; ++j){System.out.print(i + "*" + j + "=" + i*j);
//			}
//			System.out.println();
//		}		
		
		// 구구단이 가로로 가게 출력		2*1=2 3*1=3 4*1=4
//		for(int i = 1; i <= 9; ++i){
//			for(int j =2; j <=9; ++j){System.out.print(j + "*" + i + "=" + i*j + "\t");
//			}
//			System.out.println();
//		}		
		
		/*
		 * while문
		 *  - while(조건식){}
		 *   - 포함하고 있는 문장들을 조건식이 만족하는 동안 반복하는 문장
		 *   - 반복횟수가 정확하지 않은 경우게 주로 사용한다.
		 *   - 조건식은 true / false 두가지만 올 수 있음.
		 */
		 //에 2씩 몇번을 곱해야 1,000이상이 될까?
		
//		int count = 0;
//		int a = 1;
//		while(a < 1000){
//			a *= 2;
//			 count++;
//			 System.out.println(count + ":" + a);
//		}
//		
		
		/*
		 * do-while문
		 *  - do{}while(조건식);
		 *  - 최소한 한번의 수행을 보장한다. {}을 먼저 실행하고 조건식을 검사해서 조건에 벗어날 때까지 다시 실행.
		 *  - 적어도 한번의 결과 값이 있어야 할때 사용.
		 */
		
		// 숫자맞추기 게임		
//		Scanner sc = new Scanner(System.in);
//		
//		int answer = (int)(Math.random() * 100) + 1;
//		int input = 0;
//		do{
//			System.out.println("1 ~ 100 사이의 수를 입력해주세요>");
//			input = Integer.parseInt(sc.nextLine());
//			
//			if(answer < input){
//				System.out.println(input + "보다 작습니다.");
//			}else
//				if(input < answer){
//					System.out.println(input + "보다 큽니다.");
//				}else{
//					System.out.println("정답입니다.");
//				
//				}
//		}while(answer != input);
//		
		
		// 이름붙은 반복문(이름은 꼭 outer가 아니어도 됨)
//		 outer : for(int i =2; i <=9; i++){
//			 for(int j = 1; j <= 9; j++){
//				 if(j ==5){
////					 break; // 가장 가까운 반복 하나를 빠져나간다.
////					 break outer; // outer라는 이름의 반복문을 빠져나간다.
////					 continue; // 가장 가까운 반복문의 현재 반복회차를 빠져나간다. (5를 곱하는거만 건너뛴다.)
//					 continue outer; // outer라는 이름의 현재 반복회차를 빠져나간다.
//				 }
//				 System.out.println(i + " * " + j + " = " + i * j);
//			 }
//			 System.out.println();
//		 }
//		
		
		// 별찍기
		//		System.out.println("*");
		//		System.out.println("**");
		//		System.out.println("***");
		//		System.out.println("****");
		//		System.out.println("*****");

//		for(int i = 1; i <= 5; ++i){
//			for(int j = 1; j <= i; j++){
//			System.out.print("/");			
//			}
//			System.out.println();
//		}
//		System.out.println();

	//		System.out.println("*****");
	//		System.out.println("****");
	//		System.out.println("***");
	//		System.out.println("**");
	//		System.out.println("*");
//		
//		for(int i = 1; i <= 5; ++i){
//			for(int j = 5; j >= i; j--){
//				System.out.print("*");			
//			}
//			System.out.println();
//		}
//
//		System.out.println();

	//		System.out.println("////*    ");
	//		System.out.println("///***   ");
	//		System.out.println("//*****  ");
	//		System.out.println("/******* ");
	//		System.out.println("*********");
//		1 -> 1		1 -> 1
//		2 -> 3		2 -> 2	
//		3 -> 5		3 -> 3
//		4 -> 7		4 -> 4
//		5 -> 9		5 -> 5

	 for(int i = 1; i <= 5; i++){
			for(int j = 5; j > i; j--){
				System.out.print(" ");
			}
			for(int j = 1; j <= i * 2 -1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	// for-each문 : 배열 a에 있는 값들을 가지고 a배열의 길이만큼 각각 한번 씩 실행

	 int[] a = {1,2,3,4,5};
	 for(int i : a){
		 System.out.println(i);
	 }
	 // 아래의 for문과 같음.
	 for(int i = 0 ; i < a.length; i++){
		 System.out.println(a[i]);
	 }
	 
	 
		
		
	}

}
