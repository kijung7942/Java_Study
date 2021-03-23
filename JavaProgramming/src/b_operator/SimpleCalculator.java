package b_operator;
import java.util.*;
public class SimpleCalculator {

	public static void main(String[] args) {
		// 두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어 주세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자 입력>");
		double a = Double.parseDouble(sc.nextLine());

		System.out.println("연산자 입력>");
		String o = sc.nextLine();
		
		System.out.println("두 번째 숫자 입력>");
		double b = Double.parseDouble(sc.nextLine());
		
		String plus = a + b + "";
		String minus = a - b + "";
		String multi = a * b + "";
		String div = a / b + "";

		String result = o.equals("+") ? plus 
					: (o.equals("-") ? minus 
							: (o.equals("*") ? multi 
									: (o.equals("/") ? div :"연산 오류" )));
		double d_result = Math.round(Double.parseDouble(result)*100)/100;
		String ds_result = "" + d_result;
		String _result = result == "연산오류" ? result : ds_result;   
			
				System.out.println(d_result);
//		System.out.println(" = " + _result);
//      과제할때는 과제 결과 나오는 것에 집중하지 말고 과제를 하면서 공부를 해야하는거라고 생각!
				// 과제하면서 너무 쉽다 생각되면 교재에 있는 챕터 별 연습문제 풀어보기
				// 혹은 본인이 만들 수 있는거를 만들어 보기.
		
				
				
				
		
		
	}

}
