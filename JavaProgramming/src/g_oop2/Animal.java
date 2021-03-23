package g_oop2;

public abstract class Animal {

	
	String name;
	int leg;
	String howl;
	
	void run(){
		System.out.println("달려가자~~");
	}
	
	abstract void sound(); 
}

class Dog extends Animal{

	
	@Override
	void sound() {
		System.out.println("왈왈");
	}
	
class Cat extends Animal{

	@Override
	void sound() {
		System.out.println("야옹");		
	}
	
}

class bird extends Animal{

	@Override
	void sound() {
		System.out.println("짹짹");
		
	}
	
}
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
		d.run();
	}
}
