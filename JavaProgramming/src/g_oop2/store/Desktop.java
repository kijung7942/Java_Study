package g_oop2.store;

public class Desktop extends Product{

	Desktop(String name, int price) {
		super(name, price);
	}	
	
	void programming(){
		System.out.println("프로그램을 만듭니다.");
	}
	
}
