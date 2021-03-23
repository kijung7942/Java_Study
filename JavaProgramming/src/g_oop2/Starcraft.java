package g_oop2;

public class Starcraft {

	public static void main(String[] args) {
		Marine marine = new Marine();
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		SCV scv = new SCV();
		//인터페이스 repairable가 붙어있는 두 클래스는 repair라는 메소드 사용 가능
		scv.repair(tank);
		scv.repair(dropship);
		
		//인터페이스 repairable가 없는 클래스는 repair 메소드 불가
//		scv.repair(marine);
		
	}

}

class Unit{
	int hp;
	final int MAX_HP;
	
	Unit(int hp){
		MAX_HP = hp;
		this.hp = MAX_HP;
	}
}

class Marine extends Unit{
	Marine(){
		super(40);
	}
}

class Tank extends Unit implements Repairable{
	Tank(){
		super(150);
	}
}

class Dropship extends Unit implements Repairable{
	Dropship(){
		super(125);
	}
}


class SCV extends Unit{
	SCV(){
		super(60);
	}
	void repair(Repairable r){
		if(r instanceof Unit){ //Unit으로 형변환이 가능하다면
			Unit u = (Unit)r;   // 
			// Unit u는 상속받아온 Unit 클래스의 객체 u를 지역변수로 새로 만들어 준 것.
			while(u.hp < u.MAX_HP){
				u.hp++;
			}
		}
	}
}

// 멤버 없는 인터페이스를 만들어서 수리가 가능한 유닛이 어떤 것인지를 정해줄 수 있는 기준점을 줄 수 있다.
// 클래스 상속은 하나만 가능하기 때문에 내용없는 인터페이스를 넣어서 구분점으로 삼아주는 것.

interface Repairable{
	
}