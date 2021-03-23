package kjPractice;

import java.util.Arrays;
import java.util.Scanner;


public class practiceRandomStudents {

	public static void main(String[] args) {
		// 입력한 숫자(스캐너)만큼 학생의 이름을 랜덤으로 출력하는 프로그램을 만들어주세요.
		// 중복 x, 
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 학생수를 입력해주세요> \n ex)25");
		int		num = Integer.parseInt(sc.nextLine());
	
		String[] name = {"김병수", "곽명훈", "김나위", "김성현", "김영광", 
				"김정명", "김찬미", "김현민", "김현성", "류창현", "맹세희", 
				"배병주", "설동비", "양규진", "여지연", "오태훈", "이기정",
				"이상훈", "이재헌", "이치우", "전민주", "조기범", "조영현",
				"조항민", "최진우"},  extract;
		extract = new String[num+1];
//		System.out.println(Arrays.toString(extract));
				
		int 	count = 1, i=0;
		do{ 
			int ran = (int)(Math.random()*25);
			extract[i] = name[ran];
			if(extract[i].equals("nothing")){
			while(extract[i].equals("nothing")){
				int ran2 = (int)(Math.random()*25);
				extract[i] = name[ran2];
				name[ran2] = "nothing";}
			}
		
			System.out.println(count + "번째 출력된 학생:" + extract[i]);
			name[ran] = "nothing";
			count++;
			i++;
//			System.out.println(Arrays.toString(name));
		}
		while(count < num+1);
		
	}

}
