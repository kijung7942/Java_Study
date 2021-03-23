package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {

		
		
		/*
		 * 123
		 * 135 : 1 = Strike , 3 = Ball, 5 = Out "1스트라이크 1볼 1아웃"
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);		
		int x,y,z,fir,sec,thir;
		do{	x = (int)(Math.random()*9)+1;
			y = (int)(Math.random()*9)+1;
			z = (int)(Math.random()*9)+1;
		}while(x == y || x == z || y == z);
		
		while(true){
		System.out.println("숫자 3개 입력>");
		String num = sc.nextLine();
		int s =0, b =0,o = 0;
		fir = Integer.parseInt(num.substring(0,1));
		sec = Integer.parseInt(num.substring(1,2));
		thir = Integer.parseInt(num.substring(2,3));

		if(x==fir)
			s++;
		if(y==sec)
			s++;
		if(z==thir)
			s++;
		
		if(x==sec||x==thir)
			b++;
		if(y==fir||y==thir)
			b++;
		if(z==sec||z==fir)
			b++;
		
		o = 3-s-b;
		if(s==3){
			System.out.println("정답입니다.");
			break;
		}
		System.out.println(s+"스트라이크"+b+"볼"+o+"아웃");
		
		}
		
	}
}
				
				
				
				
				
				
				
				
				
				
				

		
		
		
		
		
