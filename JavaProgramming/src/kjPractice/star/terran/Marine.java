package kjPractice.star.terran;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import e_oop.ScanUtil;
public class Marine {

	public static void main(String[] args) {
		
			boolean flag = true;
	first:	while(flag){
			System.out.println("주민등록번호 앞자리와 뒷자리 중 첫번째 자리를 입력해주세요.");
			System.out.print("예시)");
			for(int i = 1 ; i < 7; i++){
			System.out.print(i);}
			System.out.println("-1");
			String regNo = ScanUtil.nextLine();
						String regNoRegex = "[0-9]{6}-[1-4]{1}";
						Pattern p = Pattern.compile(regNoRegex);
						Matcher m = p.matcher(regNo);
							if(!m.matches()){
								System.out.println("형식에 맞지 않습니다. 다시 입력해주세요");
								continue;}
							while(flag){
								System.out.println("입력하신 주민등록번호가 맞나요? Y/N");
								System.out.println(regNo);
								String check;
								check = ScanUtil.nextLine();
								switch (check) {
								case "Y": flag=false;
									break;
								case "y": flag=false;
									break;
								case "N":
									continue first;
								case "n":
									continue first;
								default: 
									break first;
								}
						}	
			}
		
	}

}
