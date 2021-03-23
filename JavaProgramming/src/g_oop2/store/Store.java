package g_oop2.store;

public class Store {

	public static void main(String[] args) {
		Desktop d1 = new Desktop("삼성 컴퓨터", 100000);
		Desktop d2 = new Desktop("엘지 컴퓨터", 100000);

		Aircon ac1 = new Aircon("삼성 에어컨", 200000);
		Aircon ac2 = new Aircon("엘지 에어컨", 200000);
	
		TV tv1 = new TV("삼성 TV", 300000);
		TV tv2 = new TV("엘지 TV", 300000);
	
	Customer c = new Customer();
		System.out.println(d1.getInfo());
		System.out.println(d2.getInfo());
		c.showItem();
		c.buy(tv2); // buy의 파라미터의 타입은 Product인데 자식 타입인 TV 타입의 tv2가 들어가도 에러가 안남.
					// tv2 앞의 형변환인 (Product)tv2 가 생략되어 숨겨져 있는 것임.
		c.buy(ac2);
		c.buy(d1);
		c.buy(d1);
		c.buy(d1);
		c.buy(d1);
		c.buy(d1);
		c.buy(d1);
		c.buy(d1);
		c.buy(d1);
		
		c.showItem();
	
	}
	
}


