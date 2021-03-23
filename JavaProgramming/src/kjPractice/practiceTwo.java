package kjPractice;

import java.util.Scanner;

public class practiceTwo {
	public static void main(String[] args) {
	 
	// 중첩 if 문 예제 1) 짝, 홀수 판단
		//1) 짝수이고 동시에 3의 배수이거나, 홀수이고 동시에 5의 배수만 출력

	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("입력");
//	 int n = sc.nextInt();
	 int n = (int)(Math.random()*100)+1;
	 
//	 
	 System.out.println(n);
//	 if(n%2 == 0 && n%3 == 0){System.out.println("입력하신 " + n + "는 짝수이면서 3의 배수입니다.");
//	 
//	 }
//	 else if(n%2 == 1 && n%5 ==0){System.out.println("입력하신 " + n + "는 홀수이면서 5의 배수입니다.");
//	 
//	 }
//	 
//	 else{System.out.println("입력하신 숫자는 해당사항 없습니다.");
//	 
//	 }
	 
	 
	 // 3의 배수이고 5의 배수일 경우 출력 & 3의 배수가 아니고 홀수일 경우 출력.
	 
	 if(n%3 == 0 && n%5 == 0){System.out.println(n);
	 
	 }
	 else if(n%3 != 0 && n%2 != 0){System.out.println(n);
	 
	 }
	 else{System.out.println("nothing");
	 
	 }
	 
	 
	 
	 
	 
 }
}
