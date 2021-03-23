package kjPractice;

import java.util.*;

public class examination {

		public static void main(String[] args){
//			/*
//			 * 문제 1
//			 * 키보드를 통하여 입력한 값을 변수 num에 대입하고 num의 값에 따라
//			 * 양수, 음수, 0을 출력하는 코드를 작성.
//			 */
//			Scanner sc = new Scanner(System.in);
//			System.out.println("숫자를 입력해주세요>");
//			int num = Integer.parseInt(sc.nextLine());
//			if(num>0){
//				System.out.println("양수");
//			}else
//				if(num == 0){
//					System.out.println("0");
//				}else
//					System.out.println("음수");
//		
////		
//			/*
//			 * 문제 2
//			 * 문자형 변수 ch가 영문(대문자 또는 소문자)일때만
//			 * 변수 b의 값이 true가 되도록 하는 코드를 작성
//			 * (삼항연산자 이용)
//			 */
//
//			boolean b = false;
//			char ch = 'a'; 
//			int a = (int)'a', z = (int)'z', A = (int)'A', Z = (int)'Z';
//				b = a <= ch && ch <= z || A <= ch && ch <= Z ?true:false;
//					System.out.println(b);
//				 
//			/*
//			 *  문제 3
//			 *  문자형 변수 ch의 값을 소문자로 변경하는 코드를 작성
//			 */
//			char ch = 'A';
//			int sum = ch + 32; 
//			char result = (char)sum;
//
//					 System.out.println(result);
//			/*
//			 * 문제 4
//			 * 1~100까지의 합을 구하는 코드
//			 */
//
//		int sum =0;
//		for(int i = 1; i <= 100; i++){
//			sum += i;}
//			
//			/*
//			 *  문제 5
//			 *  정수를 입력받아 그 정수에 해당하는 구구단 작성
//			 */
//			
//			Scanner sc = new Scanner(System.in);
//			System.out.println("숫자를 입력해 주세요.");
//			
//			int a = Integer.parseInt(sc.nextLine());
//			
//			for(int i = 1; i <= 9; i++){
//				System.out.println(a + " * " + i + " = " + a*i);
//			}
//		
//			/*
//			 * 문제 6
//			 * Math.random() 을 이용하여 1~10사이의 임의의 정수를 5개 발생하여 합을 구하는 프로그램.
//			 */
//			int sum = 0;
//			for(int i = 1; i <= 5; i++){
//				int a = (int)(Math.random()*10)+1;
//				sum += a;
//			}
//			/*
//			 * 문제 7
//			 * 1~100 사이의 랜덤수를 한개 발생시켜 변수에 저장하고
//			 * 임의의 값을 입력받아 랜덤값을 맞추는 코드(맞출때까지 계속 입력받고 맞추면 종료)
//			 */
//		
//			int ran = (int)(Math.random()*100+1), a;
//			Scanner sc = new Scanner(System.in);
//			do{System.out.println("숫자를 입력해주세요");
//				a = Integer.parseInt(sc.nextLine());
//			}while(a != ran);
//			System.out.println("정답입니다!");
//			
		}
}
