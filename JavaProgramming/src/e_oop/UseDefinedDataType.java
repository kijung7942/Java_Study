package e_oop;

import java.util.Arrays;

public class UseDefinedDataType {

	public static void main(String[] args) {

		
		/*
		 * 클래스: 사용자 정의 데이터 타입(원하는 대로 만들 수 있음.)
		 * - 데이터의 최종 진화 형태이다.(기본형 -> 배열 -> 클래스)
		 * - 서로 다른 타입의 데이터를 묶어서 사용하는 것이다.
		 * - 변수와 메서드로 구성할 수 있다.
		 */
		
		//기본형
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		String name;
		
		
		//배열
		int[] subject;
		int sum2;
		double avg2;
		String name2;
		
		//클래스
		Student student = new Student(); // 객체 생성(or 인스턴스화)
		
		student.kor = 80;
		student.eng = 90;
		student.math = 60; // . 은 지칭연산자(.뒤의 것을 지칭)
		student.sum = student.kor + student.eng + student.math;
		student.avg = student.sum / 3.0;
		student.name = "홍길동";
		
		student.scores[0] = 16;
		student.scores[1] = 50;
		student.scores[2] = 20;
		
		System.out.println(Arrays.toString(student.scores));
		System.out.println(student.sum);
		System.out.println(student.avg);
	}

}


class Student{

	int kor;
	int eng;
	int math;
	int[] scores = new int[2];
	int sum;
	double avg;
	String name;

	
}





