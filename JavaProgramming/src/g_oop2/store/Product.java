package g_oop2.store;

public class Product {

	String name; // 물건의 이름
	int price;   // 가격
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	String getInfo(){
		return name + "(" + price + "원)";
	}
	
}
