package kjPractice;

public class PracticeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kj np = new Kj();
		np.printName("김개똥");
//		System.out.println(np);

		int add = np.add((byte)3, 5);
		System.out.println(add);
	
	
	}

}
class Kj{
	void printName(String name){
			System.out.printf("입력한 이름은 %s 입니다.%n", name);
	}
	
	int add(int x, int y){
		return x+y;
	}
}