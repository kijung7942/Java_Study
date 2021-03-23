package e_oop;

public class Static {

	/*
	 * static을 붙이면 프로그램 실행시 메모리에 올라간다.
	 * 객체생성을 하지 않아도 사용할 수 있다. 
	 *  => 너무 자주 사용하기 때문에 객체 생성을 자주해야하는 메서드일 때, 메모리의 낭비를 아끼기 위함.
	 *  Math.random() / Math.round() 등
	 * 
	 * static을 붙인 변수는 객체간에 변수의 값을 공유한다.
	 * static이 붙은 멤버의 명칭 : 클래스 변수, 클래스 메서드
	 * static이 붙지 않은 멤버의 명칭 : 인스턴스 변수, 인스턴스 메서드
	 */

	//static 변수 앞에 붙이는 이유 : 값을 공유하기 위해 static을 붙인다.
	static int var;
	
	public static void main(String[] args) {
		
	Saram a = new Saram();
	Saram b = new Saram();
		
	
	a.name = "철수";
	b.name = "영희";
	
		a.saveMoney(100000);
		b.saveMoney(200000);
		a.saveMoney(100000);
	
		
		a.saveDateMoney(200000);
		b.saveDateMoney(200000);
		Saram.saveDateMoney(300000);
		System.out.println(a.dateAccount);
		
		
		
		System.out.println("문자열 입력>");
		String input1 = ScanUtil.nextLine();
		System.out.println("문자열 입력>");
		String input2 = ScanUtil.nextLine();
		
		
	}

}




class Saram{
	
	String name; // 사람의 이름
	int account; // 통장의 잔고
	
	
	void saveMoney(int money){
		account += money;
		System.out.println(name+"의 통장잔고: " + account + "원");
	}
	
	static int dateAccount; // 데이트 통장 잔고
	
	static void saveDateMoney(int money){
		dateAccount += money;
		System.out.println("데이트 통장 잔고 : "+ dateAccount+"원");
	}
	
	
}