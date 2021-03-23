package d_array;

import java.util.Arrays;
import java.util.Scanner;


public class RandomStudents {

	public static void main(String[] args) {
		// 입력한 숫자(스캐너)만큼 학생의 이름을 랜덤으로 출력하는 프로그램을 만들어주세요.
		// 중복 x, 
		// 방법 1. 뽑은거가 중복인지를 확인하고 중복이면 다시 뽑기 
		// 방법 2. name어레이를 셔플한다음 앞에서부터 5개 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 학생수를 입력해주세요> \n ex)25");
		int		count = Integer.parseInt(sc.nextLine());
	
		String[] students = {"김병수", "곽명훈", "김나위", "김성현", "김영광", 
				"김정명", "김찬미", "김현민", "김현성", "류창현", "맹세희", 
				"배병주", "설동비", "양규진", "여지연", "오태훈", "이기정",
				"이상훈", "이재헌", "이치우", "전민주", "조기범", "조영현",
				"조항민", "최진우"};
		String[] pick = new String[count];
		int pickCount = 0;
		
		do{
			int random = (int)(Math.random()*students.length);
			
			// 여러개 중에 1개라도 중복 값이 있는지를 확인하는 boolean 을 이용한 for문
			boolean flag = true;
			for(int j = 0; j <pick.length; j++){
				if(students[random].equals(pick[j])){
					flag = false;
				}
			}
			// 여기까지 했을때, 중복되는 값이 있으면 flag를 false로 돌리기 때문에
			// 밑에 pick = student에 저장이 안됨.
			if(flag){
				pick[pickCount] = students[random];
				pickCount++;
			
			
			}
		}while(pickCount < count);
	}

}
