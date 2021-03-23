package f_game;

public class Monster {

	int maxHp;		// 최대 체력		
	int maxMp;		// 최대 마나
	int hp;			// 체력
	int mp;			// 마나
	int att;		//공격력
	int def;		//방어력
	String name;
	Item[] items;
	
	Monster(String name, int hp, int mp, int att, int def, Item[] items){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.att = att;
		this.def = def;
		this.items = items; // 아이템을 여러개 가지고 있다가 사망시 랜덤하게 드랍하도록 함.
	}
	
	void attack(Character c){  // 파라미터 값에서 ctrl + 1 하면 리네임 할 수 있게 해줌.
		int damage = att - c.def;
		damage = damage <= 0 ? 1 : damage;
		c.hp = c.hp < damage ? c.hp - c.hp : c.hp - damage;
		System.out.println(name + "가 공격으로" + c.name + "에게" + damage + "만큼의 데미지를 주었습니다.");
		System.out.println(c.name + "의 남은 HP :" + c.hp);
	}
	
	Item itemDrop(){
		return items[(int)(Math.random()*items.length)];
	}
	
	

}
