package e_oop.restaurant;

import java.util.Scanner;


public class Alba {

	// 메서드 : 알바가 해야 할 일(보스가 알바에게 시킨 일)
	// 파라미터 : 일을 하기 위해 필요한 것.(보스가 알바에게 주는 것)
	// 리턴타입 : 알바가 일을 하고 난 후 돌려주는 것.(알바가 보스에게 주는 것)
	
	// 주문 받는 메서드

		//주문 받기 위해 필요한 것 ? 없음.
		//주문 받은 후 보스에게 줄 것? 주문서
	String[] order(){
		System.out.println("주문 하시겠습니까?");
		return new String[]{ "짜장면","탕수육" };
		}
		
		
	//서빙하는 메서드
		//서빙 하기 위해 필요한 것 ? 음식.
		//서빙 후 보스에게 줄 것? 없음.
	void serve(String[] foods){
			System.out.println("주문하신 ["+foods[0]+"]과 [" +foods[1]+"]입니다");
			System.out.println("맛있게 드세요.");
		}
		
	//계산하는 메서드
	//계산 하기 위해 필요한 것? 계산서.
	//계산 후 보스에게 줄 것? 없음.
		
	void pay(String[] order){
			System.out.println(order[0]+"과 "+order[1]+"의 합계금액은");
			System.out.println("2만원 입니다. 안녕히 가세요.");
	}
		
		
		
		
	
	
	
}


