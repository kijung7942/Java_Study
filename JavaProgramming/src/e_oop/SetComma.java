package e_oop;

import java.util.Scanner;

public class SetComma {

	public static void main(String[] args) {

		//숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마(,)를 붙여 출력.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 숫자를 입력하세요>");
//		String test = sc.nextLine();
//		
//		int length = test.length();
//		String comma[] = new String[(int)(test.length()-0.1)/3+1];
//		for(int i = (int)(test.length()-0.1)/3+1; 0 < i; i --){
//			if(i == (int)(test.length()-0.1)/3+1){
//				comma[i-1] = test.substring(0,test.length()-(i-1)*3);
//				System.out.print(comma[i-1]);
//			}else
//			{comma[i-1] = test.substring(test.length()-i*3,(test.length()-i*3)+3);
//			System.out.print(","+comma[i-1]);}
//		}
		
		// 선생님이 하신거.
		String num = sc.nextLine();
		String num2 = "";
		int count = 0;
		for(int i = num.length()-1; i >= 0 ; i --){
			num2 = num.charAt(i) + num2;
			count++;
			if(count % 3 == 0 && count != num.length()){
				num = "," + num2;
			}
		}
		System.out.println(num2);
		
	
	
	
	
	
	
	
	
	
	
	}
}
