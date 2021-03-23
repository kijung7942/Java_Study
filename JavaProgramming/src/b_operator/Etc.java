package b_operator;
import java.util.*;
public class Etc {

	public static void main(String[] args) {
		/*
		 *  비트 연산자
		 *   - |, &, ^, ~, <<, >>
		 *   - 비트 단위로 연산한다.
		 *   
		 *  기타 연산자
		 *   - .(참조연산자) -> 특정 범위내에 속해 있는 멤버를 지칭할때 사용한다.
		 *   - (type) -> 형변환
		 *   - ?:(삼항연산자) -> 조건식 ? 조건식이 참이 경우 수행할 문자 : 조건식이 거짓일 경우 수행할 문장
         *                    엑셀 if(조건식,참일경우,거짓일경우)랑 같은데 처음 ,이 ? 이고 뒤에,이 :라고 생각하면 됨.
		 */
		
		// 1byte : 01010101  -> 8bit로 이루어져 있음.
		
//		System.out.println(10 | 15); // |: 둘다 0인 경우 0 그 외 1
		/* 10 : 2진수 00001010    각 자리마다 둘다 0이면 0의 값, 1이 있으면 1의 값 도출
		 * 15 : 2진수 00001111    
		 * 비트 연산 값  00001111    
		 */ 
		
//		int x = 10, y =20;
//		int result = x < y ? x : y; // int result = x; 와 같다고 보면 됨.
//		System.out.println(result);
		
		//주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자 2면 여자
		int regNo = 5;
		String gender = regNo == 1 ? "남자" : "여자";   // 이 상태면 regNo에 1이 아닌 다른 숫자가 들어오면 모두 여자로 인식.
//		System.out.println("당신의 성별은 " + gender + " 입니다.");
//		
//		gender = regNo == 1 ? "남자" : (regNo ==2 ? "여자" : "확인불가");
//		System.out.println("당신의 성별은 " + gender + " 입니다.");
		
		//2개의 숫자를 입력받고, 둘 중 더 큰 숫자를 출력
		
		Scanner sc= new Scanner(System.in);
//		System.out.println("첫번째 숫자 입력 a>");
//		
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.println("두번째 숫자 입력 a>");
//		
//		int b = Integer.parseInt(sc.nextLine());
//		
//		int c = a < b ? b : a;
//		System.out.println(c);
		
		// 숫자를 입력 받고, 그 숫자가 1이나 3이면 남자를, 2나 4면 여자를 출력
		// 그외의 숫자를 입력하면 확인불가.
		
		System.out.println("숫자 입력 >"); 
		int number = Integer.parseInt(sc.nextLine());
		gender = number == 1 || number == 3 ? "남자"
				: (number == 2 || number == 4 ? "여자" : "확인불가");
				
		System.out.println(gender);
		
		
		
		
		
		
		
	}

}
