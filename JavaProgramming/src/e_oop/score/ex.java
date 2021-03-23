package e_oop.score;

public class ex {

	public static void main(String[] args) {
		Student[] students = new Student[10];

		for (int i = 0; i < students.length; i++) {
			Student student = new Student();

			student.name = "학생" + (i + 1);
			student.rank = 1;
			student.kor = (int) (Math.random() * 101);
			student.eng = (int) (Math.random() * 101);
			student.math = (int) (Math.random() * 101);

			students[i] = student;
		}
		
		//성적관리 프로그램을 온성해주세요
		//합계,평균,석차를 구하고 석차순으로 출력
		
		//학생별 합계,평균
		for (int i = 0; i < students.length; i++) {
			students[i].sum = students[i].kor+students[i].eng+students[i].math;
			students[i].avg = (double)Math.round(students[i].sum / 3.0 *100)/100.0; 
		}
		//석차구하기
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length; j++) {
				if(students[i].sum < students[j].sum){
					students[i].rank++;
				}
			}
		}
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
		
//		//정렬안하고 석차순 출력
//		for (int i = 1; i <= students.length; i++) {
//			for (int j = 0; j < students.length; j++) {
//				if(i == students[j].rank){System.out.println(students[j].name+"\t"+students[j].kor+"\t"+students[j].eng+"\t"+students[j].math+"\t"+students[j].sum+"\t"+students[j].rank);break;}
//			}
//		}
		//랭크 순으로 배열정렬
		for(int j=0;j<students.length;j++){
		for (int i = 0; i < students.length-1; i++) {
				if(students[i].rank > students[i+1].rank){
					Student tmp = students[i];
					students[i] = students[i+1];
					students[i+1] = tmp;
				}
			}
		}
		//배열순서대로 출력
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].name+"\t"+students[i].kor+"\t"+students[i].eng+"\t"+students[i].math+"\t"+students[i].sum+"\t"+students[i].avg+"\t"+students[i].rank);
			
		}
		
		//과목 합계
		int korSum=0;
		int engSum=0;
		int mathSum=0;
		for (int i = 0; i < students.length; i++) {
			korSum+= students[i].kor;
			engSum+=students[i].eng;
			mathSum+=students[i].math;
		}
		System.out.println("과목 총점"+"\t"+korSum+"\t"+engSum+"\t"+mathSum);
		
		
		//과목평균
		double korAvg = Math.round((double)korSum / students.length *100)/100.0;
		double engAvg = Math.round((double)engSum / students.length*100)/100.0;
		double mathAvg = Math.round((double)mathSum / students.length*100)/100.0;
		System.out.println("과목 평균"+"\t"+korAvg+"\t"+engAvg+"\t"+mathAvg);
		
	}

}

