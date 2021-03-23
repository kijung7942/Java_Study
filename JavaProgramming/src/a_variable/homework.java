package a_variable;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("회원가입을 위해 아이디를 입력해주세요>");
		String id = sc.nextLine();
		
		System.out.println("비밀번호를 입력해주세요(숫자)>");
			int pw = Integer.parseInt(sc.nextLine());
		
		System.out.println("이름을 입력해주세요>");
			String name = sc.nextLine();

		System.out.println("나이를 입력해주세요>");
			int age = Integer.parseInt(sc.nextLine());
		
		System.out.println("키를 입력해주세요>");
			double height = Double.parseDouble(sc.nextLine());
		
		
		System.out.println("==========================");
		System.out.println("회원가입 완료!!");
		System.out.println("==========================");
		System.out.println("입력된 정보를 보기 원하시면 \n[내 정보 보기]를 입력해주세요>");
			sc.nextLine();
	
		System.out.println("============= 내 정보 =============");
		System.out.println("아이디 :" +id);
		System.out.println("비밀번호 :" +pw);
		System.out.println("이름 :" +name);
		System.out.println("나이 :" +age);
		System.out.println("키 :" +height);
		System.out.println("================================");
    
		System.out.printf("아이디: %s\n비밀번호 : %d\n이름 :%s\n나이 :%d\n키 :%3.1f", id, pw, name, age, height);
//		System.out.printf("키 : %3.1f", height);
		
		/*  과제: 다음과 같은 프로그램을 작성해주세요.
	     * 
	     *  =================== 회원가입 ===================
	     *  아이디> admin
	     *  비밀번호(4자리숫자)>1234
	     *  이름 > 홍길동
	     *  나이 > 30
	     *  키 > 185.5
	     *  ==============================================
	     *  회원가입 완료!!
	     *  =================== 내 정보 ====================
	     *  아이디 : admin
	     *  비밀번호 :1234
	     *  이름 : 홍길동
	     *  나이 : 30세
	     *  키 : 185.5cm
	     *  ==============================================
	     *  
	     */
		
	}

}
