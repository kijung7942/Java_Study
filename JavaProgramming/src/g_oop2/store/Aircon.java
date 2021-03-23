package g_oop2.store;

public class Aircon extends Product{

	Aircon(String name, int price) {
		super(name, price);
	}

	void setTemperature(){
		System.out.println("온도를 설정합니다.");
	}
}
