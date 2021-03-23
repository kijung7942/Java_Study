package c_statement;
import java.util.*;
public class SelfTest2 {

	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요 ex)123");
		
			int fir = (int)(Math.random()*10),
				sec = (int)(Math.random()*10),
				thir = (int)(Math.random()*10);
		 
					System.out.println(fir+ "" + sec + thir);

	while (sec == fir || sec == thir || fir == thir){
				fir = (int)(Math.random()*10);
				sec = (int)(Math.random()*10);
				thir = (int)(Math.random()*10);}

				System.out.println(fir + ""+ sec + thir);
	}

}
