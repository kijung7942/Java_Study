package kjPractice;

import java.util.*;

public class practiceThree {
// x = num[9],num[10] 아닌거에서 랜덤 돌려
	// y = x를 뺀거에서 돌리고 볼이 있으면 9번 10번 포함해서 돌리기
	// z = x빼고 y뺀거에서 내에서 돌리기 
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int[] num = new int[9];
			for(int i = 0 ; i < num.length; i++){
				num [i] = i+1;}
			System.out.println(Arrays.toString(num));
			int s = 0, b= 0, o= 0, i=0;
			boolean flag = true;
			do{
			int ran = 0,
				x = num[ran], 
				y = num[7],
				z = num[8];
			System.out.println(x +"" + y +"" + z + "\n S:B:O 입력해주세요> \n ex) 1/1/1 ");
			String sbo = sc.nextLine();
				s = Integer.parseInt(sbo.substring(0,1));
				b = Integer.parseInt(sbo.substring(2,3));
				o = Integer.parseInt(sbo.substring(4,5));
			
//					System.out.println(s+""+b+o);
			if(s==1){
				if(b==2){
				int temp = y;
					y = z;
					z = temp;
				}if(b==1){
					y = num[8];
					flag = false;
				}
				
				while(s!=2){
					y = num[i];
					if(y==num[ran]){continue;
					}
					System.out.println(x +"" + y +"" + z + "\n S:B:O 입력해주세요> \n ex) 1/1/1 ");
						 sbo = sc.nextLine();
					s = Integer.parseInt(sbo.substring(0,1));
					b = Integer.parseInt(sbo.substring(2,3));
					o = Integer.parseInt(sbo.substring(4,5));
						i++;
				    }
				if(!flag){z=num[8];
				}
						z = num[i];
						System.out.println(x +"" + y +"" + z + "\n S:B:O 입력해주세요> \n ex) 1/1/1 ");
							 sbo = sc.nextLine();
						s = Integer.parseInt(sbo.substring(0,1));
						b = Integer.parseInt(sbo.substring(2,3));
						o = Integer.parseInt(sbo.substring(4,5));
						z++;
						}
			}while(s!=3);
					System.out.println("정답입니다.");
				
			}
	}
