package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {

		/*
		 * 조건문
		 *  - if문
		 *  - swich문
		 *  
		 *  if문
		 *  
		 *  - if(조건식){}: 조건식의 결과가 true이면 블럭안의 문장을 수행한다.
		 *      조건식 타입은 boolean으로 비교연산. 즉, true 나 false임. ture일때 {}이 실행
		 *  - else if(조건식){}: 다수의 조건이 필요할때 if뒤에 추가한다.
		 *      조건이 여러가지 일 때, if 뒤에 추가로 붙임. 윗 if문이 false일 때 else if를 실행하게 됨.
		 *  - else{} : 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다. 
		 *      위의 조건식들이 모두 false일 때 실행됨.
		 */
		
		
		int a = 1;
		
		if(a ==1){
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}
		
		if (a == 0){
			System.out.println("조건식의 연산결과가 fase이면 수행되지 않는다.");
		}
		
		
		if(a == 1){
			System.out.println("a가 1인 경우에 하고 싶은 것.");
		System.out.println(a);
		a=++a;
		} else if(a == 2){
			System.out.println("a가 2인 경우에 하고 싶은 것.");
		} else if(a == 3){
			System.out.println("a가 3인 경우에 하고 싶은 것.");
		}
		
		if(a==2){
			System.out.println("이렇게 하면 출력 가능?");
		}// 윗 if문의 실행문으로 다음 if문에 적용해서 true값을 뽑아내려면 else if 가 아닌 if문을 별개로 작성해야 한다.
		
		// 맨 윗 if가 트루면 맨 윗 if에 대한 실행문만 실행이 되고 빠져나옴.(밑의 else if 두개는 무시)
		// 조건을 한 묶음으로 사용하기 위해서는 반드시 else if를 사용하여야 한다.
		else{
			System.out.println("이외의 경우에 하고 싶은 실행문.");
		}
		// 위의 3조건이 모두 false가 나올 때, else가 실행 됨.
		
		
		if(a < 10){
			System.out.println("a가 10보다 작다.");
		}
		if(a < 20);{
			System.out.println("a가 20보다 작다.");
		}
		// 이렇게 하면 따로따로 조건문을 실행하는 것이므로 한묶음이 아닌게 된다. -> 한묶은은 반드시 else if로 사용할 것.
		
		
		
		
		
		// 시험점수가 60점 이상이면 합격 그렇지 않으면 불합격.
		int score = 60;
		if (score >= 60){
			System.out.println("합격");
		}
		else{System.out.println("불합격");
		
		}
		
		
		// 성적에 등급을 부여하는 프로그램.

//		score = 80;
//		String grade = null;
//		// a , b , c , d , e
//		if (90 <= score){
//			grade = "A";
//		}
//		else if (score >=80) {grade = "B";
//		}
//		else if (score >=70) {grade = "C";
//		}
//		else if (score >=60) {grade = "D";
//		}
//		else if (score >=50) {grade = "E";
//		}
//		else {grade = "F";
//		}
//			System.out.println(score + "점에 해당하는 등급은" + grade + "입니다.");
	
		score = 7;
		String grade = null;
		
		if (score>= 90){
			grade ="A";
		if (score >= 97){grade += "+";
			}
			else if (score <= 93){grade += "-";
			}
		}
		else if (score >= 80){
			grade = "B";
			if(score >= 87){grade += "+";
			}else if(score<83){grade +="-";
			}
		}
		else if (score >= 70){
			grade = "C";
			if(score >= 77){grade += "+";
			}else if(score<73){grade +="-";
			}
		}
		else if (score >= 60){
			grade = "D";
			if(score >= 67){grade += "+";
			}else if(score<63){grade +="-";
			}
		}
		else if (score >= 50){
			grade = "E";
			if(score >= 57){grade += "+";
			}else if(score<53){grade +="-";
			}
		}
		else{grade = "F";
		}
						
		System.out.println(score + "점에 해당하는 등급은" + grade + "입니다.");
		
		
		
		/*
		 * switch문(같은 표현일 때 switch문이 if문보다 연산속도가 빠르다. 
		 *         하지만 조건식과 정확해야 한다는 부분에서 자주 사용되지는 않음.)
		 * - switch(int/String){ case 1: break; )
		 * - 조건식의 결과는 정수와 문자열만 (JDK1.7부터 문자열 허용) 허용한다.
		 * - 조건식과 정확히 일치하는 case문 이후의 문장을 수행한다.
		 * - default : if문의 else와 같은 역할.
		 * - case문 같은 경우는 break를 만나기 전까지 계속 실행 (else if와는 다름)	
		 */
		
		a = 1;
		switch(a){
		case 1 : 
			System.out.println("a가 1인 경우에 하고 싶은 실행문");
			break;
		case 2 :
			System.out.println("a가 2인 경우에 하고 싶은 실행문");
			break;
		default :
			System.out.println("이외의 경우에 하고 싶은 실행문");
		}
		
		String b = "a";
		switch(b){
		case "a" :
			System.out.println("b가 \" a\"인 경우에 하고싶은 실행문");
			break;
		case "b" :
			System.out.println("b가 \"b\"인 경우에 하고 싶은 실행문");
			break;
		default:
			System.out.println("이외의 경우에 하고 싶은 실행문");
		}

		
		// 주어진 월에 해당하는 계절을 출력
		
	int month = 10;
	String season = null;
	
	switch(month){
	case 3:
	case 4:
	case 5:
		season = "봄";
		break;
	case 6:
	case 7:
	case 8:
		season = "여름";
		break;
	case 9:
	case 10:
	case 11:
		season ="가을";
		break;
	case 12:
	case 1:
	case 2:
		season = "겨울";
		break;
	}
	
	System.out.println(month + "월에 해당하는 계절은" + season + "입니다.");
	
	score = 40;
	grade = null;
		
	
	
	switch(score / 10){
	case 10 : case 9 : grade = "A";
	break;
	case 8 : grade = "B";
	break;
	case 7 : grade = "C";
	break;
	case 6 : grade = "D";
	break;
	default: grade = "F";
	
	
	}
		
	System.out.println(score + "점에 해당하는 등급은 " + grade + " 입니다.");
		
		
	// 연습문제 1. 숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
	
	Scanner sc = new Scanner(System.in);
	
//	System.out.println("첫 번째 숫자를 입력해주세요>");
//	int x = Integer.parseInt(sc.nextLine());
//	
//
//	if( x == 0 ){System.out.println("입력한 숫자는 0입니다.");}
//	else {System.out.println("입력한 숫자는 0이 아닙니다.");
//	};
//	
//	switch (x){
//	case 0 : System.out.println("입력한 숫자는 0입니다.");
//	break;
//	default : System.out.println("입력한 숫자는 0이 아닙니다.");
//	}
	
	
	// 연습문제 2. 숫자를 입력받아 그 숫자가 홀수 인지 짝수인지 출력.
	
//	if( x % 2 == 0 ){System.out.println("입력한 숫자는 짝수 입니다.");}
//	else {System.out.println("입력한 숫자는 홀수 입니다.");
//	};
//	
//	switch (x%2){
//	case 0 : System.out.println("입력한 숫자는 짝수 입니다.");
//	break;
//	default : System.out.println("입력한 숫자는 홀수 입니다.");
//	}
//	
	
	// 연습문제 3. 정수 3개를 입력 받아 총점, 평균, 등급을 출력해주세요
	
	
//	System.out.println("첫 번째 숫자를 입력해주세요>");
//	int x = Integer.parseInt(sc.nextLine());
//	System.out.println("두 번째 숫자를 입력해주세요>");
//	int y = Integer.parseInt(sc.nextLine());
//	System.out.println("세 번째 숫자를 입력해주세요>");
//	int z = Integer.parseInt(sc.nextLine());
//
//	double sum = (double)x + (double)y + (double)z;
//	double avg = (double)sum / 3.0;
//	String grade1 = null;
//	
//	if(avg >= 90){grade1 = "A";
//	   if(avg>=97){grade1 +=  "+";
//	   if(avg<=93){grade1 +=  "-";
//	   	}
//	   }
//	}
//	else if(avg >= 80){grade1 = "B";
//	   if(avg>=87){grade1 +=  "+";
//	   if(avg<=83){grade1 +=  "-";
//	   }
//     }
//   }
//	else if(avg >= 70){grade1 = "C";
//	   if(avg>=77){grade1 +=  "+";
//	   if(avg<=73){grade1 +=  "-";
//	   }
//	     }
//	   }   
//	else if(avg >= 60){grade1 = "D";
//	   if(avg>=67){grade1 +=  "+";
//	   if(avg<=63){grade1 +=  "-";
//	   }
//	   }
//	}
//	else {grade1 = "F";}
//	   System.out.println(avg);
//	System.out.println("총 점수는 " + sum + "이고 평균 점수는 " + avg + "이며 해당하는 등급은 " + grade1 + "입니다.");
//	
	
	// 1~100 사이의 랜덤한 수를 3개 발생시키고 오름차순으로 출력해주세요.
	int ran1 = (int)(Math.random()*100)+1;
	int ran2 = (int)(Math.random()*100)+1;
	int ran3 = (int)(Math.random()*100)+1;


//	System.out.println("ran1= " + ran1 + " / ran2= " + ran2 + " / ran3= " + ran3);
//	if(ran1>ran2 && ran1>ran3){
//		if(ran2>ran3){System.out.println(ran1 + "/" + ran2 + "/" + ran3);
//		}
//		if(ran3>ran2){System.out.println(ran1 + "/" + ran3 + "/" + ran2);
//		}
//	}
//	else if(ran2>ran3 && ran2 > ran1){
//		if(ran1>ran3){System.out.println(ran2 + "/" + ran1 + "/" + ran3);
//		}
//		if(ran3>ran1){System.out.println(ran2 + "/" + ran3 + "/" + ran1);
//		}
//	}
//	else if(ran3>ran1 && ran3>ran2){
//		if(ran1>ran2){System.out.println(ran3 + "/" + ran1 + "/" + ran2);
//		}
//		if(ran2>ran1){System.out.println(ran3 + "/" + ran2 + "/" + ran1);
//		}
//	}		 
	
	
	if(ran1>ran2){
		int temp = ran1;
		ran1 = ran2;
		ran2 = temp;
	}
	if(ran1>ran3){
		int temp = ran1;
		ran1 = ran3;
		ran3 = temp;
	}
	if(ran2>ran3){
		int temp = ran2;
		ran2 = ran3;
		ran3 = temp;
	}
	System.out.println(ran1 + " < " + ran2 + " < " + ran3);
	
	
	
	
	}
}