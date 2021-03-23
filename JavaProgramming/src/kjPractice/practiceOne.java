package kjPractice;

import java.util.Scanner;

public class practiceOne {

	public static void main(String[] args) {

   //else if 문 예제
		/*
		 *  1) 나이 별로 요금을 부과하기 -> 나이를 입력 받고 요금 출력
		 *   - 8세 미만의 요금은 1,000원
		 *   - 14세 미만의 요금은 2,000원
		 *   - 20세 미만의 요금은 2,500원
		 *   - 20세 이상의 요금은 3,000원
		 */
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("생년월일을 입력 해주세요ex)900509>");
//		
//		String age = sc.nextLine();
//		String y = age.substring(0,2);
//		String y2 = age.substring(0,1);
//		boolean b = true;
//		if(b == y2.equals("0") || y2.equals("1")){ y = 20 + "" + y;}
//		else{ y= 19 + "" + y; }
//
//		int ra = 2021 - Integer.parseInt(y);
//	
//		
//		if (ra < 8){System.out.println("나이는" + ra + "세 이며 요금은 1,000원 입니다.");
//		
//		}
//		else if(ra < 14){System.out.println("나이는" + ra + "세 이며 요금은 2,000원 입니다.");
		
//		}
//		else if(ra < 20){System.out.println("나이는" + ra + "세 이며 요금은 2,500원 입니다.");
//		
//		}
//		else{System.out.println("나이는 " + ra + "세 이며 요금은 3,000원 입니다.");
//		
//		}
			
		// 도시락 주문 10개까지는 개당 2,500원이고 10개 초과하는 양 주문하면 개당 2,400원 / 도시락 개수를 입력 받아 금액을 계산하는 프로그램.
		
		System.out.println("갯수");
		int count = sc.nextInt();
		
		if(count <= 10){
			int price = count * 2500;
			System.out.printf("총 금액은 %d원입니다." , price );
		
		}
		else{System.out.println(count * 2400);
		
		}
		
		
		
		
	}

}

