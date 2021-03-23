package f_game;

import e_oop.ScanUtil;

public class MyGame {
		
		Character c;
		Item[] items;
							//몬스터도 등장을 하지만 죽었다가 나타나는 식으로 소모성으로 등장하여 
							// 전역변수가 아닌 main메서드의 지역변수로 사용.
		
		MyGame(){
			c = new Character("가렌", 100, 50, 20, 10);
		
			items = new Item[10];
			items[0] = new Item("무한의대검", 0, 0, 10, 0);
			items[1] = new Item("가시갑옷", 0, 0, 0, 10);
		}

	public static void main(String[] args) {
		new MyGame().start(); //메인메서드는 static이 붙어 있어서 사용이 불편함.(객체를 생성해서 써야하기 때문)
	}
	//따라서 start 메서드를 따로 만들어서 사용
	void start(){
		int input = 0;
		while(true){
			System.out.println("1. 내정보\t2. 사냥\t0. 종료");
			input = ScanUtil.nextInt();
			
			switch (input){
			case 1:
				c.showInfo();
				break;
			case 2:
				hunt();
				break;
			case 0:
				System.out.println("종료합니다.");
				System.exit(0);
			}
		}
	}
	
	void hunt(){
		Monster m = new Monster("고블린",20,10,15,10,new Item[]{items[0],items[1]});
		System.out.println(m.name+"을 만났습니다. 전투를 시작합니다.");

		int input = 0;
		battle : while(true){
			System.out.println("1. 공격\t2.도망");
			input = ScanUtil.nextInt();
			switch (input){
			case 1 : c.attack(m);
				if(m.hp <= 0){
					System.out.println(m.name + "을 처치하였습니다.");
					c.getExp(150);
					Item item = m.itemDrop();
					c.getItem(item);
					break battle;
				}
			m.attack(c);
			break;
			case 2:
				System.out.println("도망쳤습니다.");
				break battle;
			}
		}
	
	
	
	}
	
}
