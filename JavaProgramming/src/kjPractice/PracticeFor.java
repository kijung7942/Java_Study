package kjPractice;

public class PracticeFor {

	public static void main(String[] args) {

		
		// for 문으로 별 찍기
		
		
		// 이등변 삼각형
//		                 i반복횟수     em     별    j 반복횟수
		//       *       1         6    / 1   7
		//      ***      2         5    / 3   8
		//     *****     3         4    / 5   9
		//    *******    4         3    / 7   10
		//   *********   5         2    / 9   11
		//  ***********  6         1    / 11  12
		// ************* 7         0    / 13  13
//		for(int i = 1 ; i < 8; i++){
//			for(int j = 7; j > i; j--){
//				System.out.print("/");				
//			}
//			for(int j = 1; j <= (i*2)-1; j++){
//			System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int i = 8; i > 0; i-- ){
//			for(int j = 2; j <= i; j++){
//				
//				System.out.print("*");
//			}
//					System.out.print("*");
//					System.out.println();
//		}
		
		
		int i = 0;
		for(i = 0 ; i < 10 ; i++){
			 System.out.println("처음 포문 = " + i);
		};
		for(int j = i ; j < 20 ; j++){
			System.out.println(" 두번째 포문 j =" + j);
			System.out.println("=================");
		}
		
	}

}
