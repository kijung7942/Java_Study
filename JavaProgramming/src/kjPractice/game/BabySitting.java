package kjPractice.game;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class BabySitting {


	/* 아기 키우기 실시간 시뮬레이션
	 * 1. 아기 객체 생성
	 * 2. 난이도 설정 = 베이스 실행 간격(상: 3초 마다/중: 6초 마다/하: 9초 마다)
	 * 3. 행복 지수를 제외한 모두 지수 = min 0 max 10
	 * 4. 패배조건   = 행복도 -5, 승리조건은 없음(다마고치 특성).
	 * 5. 
	 */
	
	
	public static void main(String[] args) {
		//상 : 3초 / 중: 6초 / 하: 9초
		Scanner sc = new Scanner(System.in);
		System.out.println("아이의 이름을 정해주세요>");
		String name = sc.nextLine();
		final Baby b = new Baby(name);
		System.out.println("난이도 설정을 해주세요 1.하 / 2.중 / 3.상>");
		String count = sc.nextLine();
		int level = 0;
		do{if(count.equals("하")||count.equals("1")){
				level = 3;
			}else
				if(count.equals("중")||count.equals("2")){
					level = 2;
				}else
					if(count.equals("상")||count.equals("3")){
						level = 1;
					}else{
						System.out.println("다시 입력하세요.");
					}
					}while(level == 0);
		for(int i = 0 ; i < 40 ; i ++){
		System.out.println(" ");
		}
			for(int i = 0 ; i < 10 ; i++){
					b.crying1();
					for(int k = 0 ; k < 30; k++){
						System.out.println();}
					b.stop(100);
					b.crying2();
					for(int k = 0 ; k < 30; k++){
						System.out.println();}
					b.stop(100);
			}
				
		for(int h = 0 ; h < 25; h++){
			System.out.println();
		}
		
		Timer m_timer = new Timer(); 
		TimerTask m_task = new TimerTask(){
			@Override
			public void run(){
				// 베이스: 10초마다 배고픔 +1, 심심함 +1
				b.base();
			}
		};
		m_timer.schedule(m_task,10000,level*3000);
		TimerTask m2_task = new TimerTask(){
			@Override
			public void run(){
				if(b.poop==false){
//			System.out.println(b.name+"이(가) 응가를 했습니다.");	
			b.poop = true;
				}
			}
		};
		m_timer.schedule(m2_task, 10000,(int)(Math.random()*100000));
		
		while(true){
			if(b.happy <= -5){
				System.out.println("\t"+b.name+"의 행복지수가 -5가 되어 떠났습니다.");
				System.out.println("=============Game Over===============");
				System.exit(6);}
				System.out.println("-------------------------------");
				System.out.println("1.밥주기  2.씻기기  3.방치우기  4.놀아주기");
				System.out.println("5.상태보기 6.종료");
				System.out.println("-------------------------------");
				System.out.println("번호 입력>>>>>>");

			for(int i = 0 ; i < 23 ; i++){
				System.out.println();
			}
			int input = 0;
		do{
			try{
				input = Integer.parseInt(sc.nextLine());
			}catch(Exception e){
				System.out.println("제시된 숫자만 입력하세요");
			}
		}while(input == 0);
			switch (input) {
			case 1: b.feed(); break;
			case 2:	b.clean();	break;
			case 3: b.poop = b.cleanRoom(); break;
			case 4: b.play(); break;
			case 5: b.infor(); break;
			case 6:
				System.out.println("종료되었습니다.");
				System.exit(6);
			default:
				System.out.println("번호를 다시 입력하세요.");
				break;
				}
		}
	}
}