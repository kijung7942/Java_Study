package kjPractice.star.terran;

import java.util.Arrays;
import java.util.Scanner;

public class Barrack {

	   public static void main(String[] args) {
		      
		      int[] arr=new int[45];
		      int[] arr1=new int[45];
		      for(int i=0; i<45; i++) {
		         arr[i]=i+1;
		         arr1[i]=i+1;
		         int x=(int)(Math.random()*45);
		         int y=(int)(Math.random()*45);
		         
		         int test=arr[x];
		         arr[x]=arr[y];
		         arr[y]=test;}
				   System.out.print("arr :");
				   System.out.println(Arrays.toString(arr));
				   System.out.print("arr1 :");
				   System.out.println(Arrays.toString(arr1));
				if((arr[0]==arr1[0])&&(arr[1]==arr1[1])&&(arr[2]==arr1[2])&&(arr[3]==arr1[3])&&
				      (arr[4]==arr1[4])&&(arr[5]==arr1[5])) {
				   System.out.println("당첨되었습니다!");
				}
		      
	   }
}