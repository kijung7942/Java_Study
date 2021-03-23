package kjPractice.game;

public class Baby extends Birth{
	String name;
	int hunger = 0;
	int cleanliness = 0;
	int happy = 0;
	int boring = 0;
	boolean poop = false;
	void yn(){
		if(poop == true){System.out.print("응가함");}
		else{System.out.println("응가안함");
		}
	}
	
	final int hungerMax = 10;
	final int cleanlinessMax = 10;
	final int happyMax = 10;
	final int boringMax = 10;

	Baby(String name){
		this(name,0,0,0,0,0,false);
	}
	Baby(String name, int i, int j, int k, int l, int m, boolean b) {
		this.name = name;
	}
	void stop(int interval){
		try {
			Thread.sleep(interval);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	void infor(){
		System.out.println("======================================");
		System.out.println("================ 상 태 창 ===============");
		System.out.println("======================================");
		System.out.printf("이름: "+name+"%n행복지수: ");
		for(int i = 0 ; i < happy ; i++){System.out.print("■ ");}
		System.out.print(happy);
		System.out.printf("%n배고픔지수: ");
		for(int i = 0 ; i < hunger ; i++){System.out.print("■ ");}
		System.out.print(hunger);
		System.out.printf("%n불결지수 :");
		for(int i = 0 ; i < cleanliness ; i++){System.out.print("■ ");}
		System.out.print(cleanliness);
		System.out.printf("%n심심함지수: ");
		for(int i = 0 ; i < boring ; i++){System.out.print("■ ");}
		System.out.print(boring);
		System.out.printf("%n응가여부: ");yn();
		System.out.printf("%n======================================%n");
		System.out.println("======================================");
		System.out.println("======================================");
	}
	void feed(){
		System.out.println("우유를 먹입니다.");
		if(hunger <= 0){
			System.out.println(name+": 배 안고파!");
			System.out.println("억지로 우유를 먹여 행복지수가 내려갑니다.");
			happy--;}
		else{
		System.out.println("^_^ 행복지수가 오릅니다.");
		happy++;
		if(happy >= happyMax){
			happy = happyMax;
		}
		System.out.println("^_^ 배고픔지수가 내려갑니다.");
		hunger--;}
		}
	void play(){
		System.out.println(name+"와(과) 놀아줍니다.");
		System.out.println(name+": 꺄르륵!");
		System.out.println("^_^ 행복지수가 오릅니다.");
		happy++;
		if(happy >= happyMax){
			happy = happyMax;
		}
		System.out.println("^_^ 심심함지수가 내려갑니다.");
		boring--;
		if(boring <= 0){
			boring = 0;
		}
		System.out.println("T_T 배고픔지수가 올라갑니다.");
		hunger++;
		if(hunger>=hungerMax){
			hunger=hungerMax;
		}
		}
	void clean(){
		System.out.println(name+"을(를) 씻깁니다.");
		if(cleanliness <= 0){
			cleanliness = 0;
			System.out.println(name+": 아이, 귀찮아! 안씻을거야!! 싫어!!");
			happy--;
			System.out.println("억지로 씻기려해서 행복지수가 내려갑니다.");
		}
		else{
		System.out.println(name+": 고마워요! 아이 개운해~!");
		System.out.println("^-^ 불결지수가 내려갑니다.");
		cleanliness--;}
	}
	boolean cleanRoom(){
		System.out.println("방(응가)을 치워줍니다.");
		return false; 
	}
	
	void base(){
		System.out.println("-------------------------------");
		System.out.println("1.밥주기  2.씻기기  3.방치우기  4.놀아주기");
		System.out.println("5.상태보기 6.종료");
		System.out.println("-------------------------------");
		System.out.printf("ㅁㅁㅁㅁㅁㅁㅁㅁㅁ 주 의 ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ%n");
		System.out.printf("         시간이 지남에 따라 "+name+"(이)의 %n       배고픔과 심심함 지수가 올라갑니다.");
		hunger++;
		boring++;
		if(cleanliness > 3){System.out.printf("%n불결지수가 높아 아이의 행복도가 떨어집니다.");
		happy--;}
		if(cleanliness == cleanlinessMax){cleanliness = cleanlinessMax;}
		if(boring > 3){System.out.printf("%n심심함지수가 높아 아이의 행복도가 떨어집니다.");
		happy--;}
		if(boring == boringMax){boring = boringMax;}
		if(hunger > 3){System.out.printf("%n배고픔지수가 높아 아이의 행복도가 떨어집니다.");
		happy--;}
		if(hunger == hungerMax){hunger = hungerMax;}
		if(poop){System.out.printf("%nT_T 아이가 응가를 해서 불결지수가 올라갑니다.");
		cleanliness++;}
		System.out.printf("%nㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ%n");
		if(happy <= -5){
			for(int i = 0 ; i < 30 ; i++){
				System.out.println();}
			System.out.println(name+"의 행복지수가 -5가 되어 떠났습니다.");
			System.out.println("=====================================");
			System.out.println("=============Game Over===============");
			System.out.println("=====================================");
			for(int i = 0 ; i < 25 ; i++){
				System.out.println();}
			System.exit(6);
		}
		System.out.print("번호 입력>>>>>>");
		if(poop){
			for(int i = 0 ; i < 19 ; i++){
				System.out.println();
		}
			}
		else{
			for(int i = 0 ; i < 20 ; i++){
			System.out.println();
			}
		}
	}

}
	
