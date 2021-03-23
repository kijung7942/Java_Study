package g_oop2.store;

import java.util.Arrays;

public class Customer {
	int money = 100000;
	Product[] item = new Product[2];
	
	void buy(Product p){
		if(money < p.price){
			System.out.println("잔돈이 부족하다.");
			return;
		}
		
		money -= p.price;
		for(int i = 0 ; i < item.length; i++){
			if(item[i] == null){
				item[i] = p;
				break;
			}
		}System.out.println(p.getInfo() + " 를 구매했다.");
	}
	
	void showItem(){
		int count = 0;
		System.out.println("============= 장 바 구 니 =============");
		for(int i = 0; i < item.length; i++){
			if(item[i] == null){
				count++;
				}else{
				System.out.println(item[i].getInfo());
				count--;}
		}
		System.out.println(count);
		System.out.println(Arrays.toString(item));
			if(count == item.length){
				System.out.printf("                         장바구니 비었음%n");
			}System.out.println("===================================");
	}
}
