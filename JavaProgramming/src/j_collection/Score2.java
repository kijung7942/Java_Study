package j_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Score2 {

	public static void main(String[] args) {
		
		String[] names = {"김병수", "곽명훈", "김나위", "김성현", "김영광", "김정명", "김찬미", "김현민", "김현성", "류창현", "맹세희", 
				"배병주", "설동비", "양규진", "여지연", "오태훈", "이기정", "이상훈", "이재헌", "이치우", "전민주", "조기범", "조영현",
				"조항민", "최진우"};
		
//		String[] names = {"a", "b", "c", "d", "e"};
		
		
		ArrayList<Student> students = new ArrayList<Student>();
		for(int i = 0 ; i < names.length; i++){
			students.add(new Student(names[i]));
		}
		
		for(int i = 0 ; i < students.size(); i++){
			for(int j = 0; j < students.size(); j++){
				if(students.get(i).sum < students.get(j).sum){
					students.get(i).rank++;
				}
			}
		}
		
		for(int i = 0; i < students.size()-1; i++){
			int min = i;
			for(int j = i+1; j < students.size(); j++){
				if(students.get(j).rank < students.get(min).rank){
					min = j;
				}
			}
				Student temp = students.set(i,students.get(min));
				students.set(min,temp);
		}
		
		System.out.print("\t국어\t영어\t수학\t사회\t과학\tOracle\tJava\t합계\t평균\t석차\n");
		for(int i = 0 ; i < students.size();i++){
			System.out.print(students.get(i).name+"\t");
			for(int j = 0 ; j < 7; j++){
				System.out.print(students.get(i).getScore(j)+"\t");
			}
			System.out.println(students.get(i).sum+"\t"+students.get(i).avg+"\t"+students.get(i).rank);
		}
		ArrayList<Integer> subSum = new ArrayList<Integer>();
		int sum = 0; 
		for(int j = 0; j < 7; j++){
			for(int i = 0 ; i < students.size(); i++){
				sum += students.get(i).getScore(j);
			}
			subSum.add(sum);
			sum = 0;
		}
		
		System.out.print("과목 합계\t");
		for(int i = 0 ; i < 7; i++){
		System.out.print(subSum.get(i)+"\t");
		}
		System.out.print("\n과목 평균\t");
		for(int i = 0 ; i < 7; i++){
			System.out.print(Math.round(((double)subSum.get(i)/students.size())*100.0)/100.0+"\t");
		}

		
			
		
	}

}


class Student{
	String name;

	int kor;
	int eng;
	int math;
	int social;
	int science;
	int oracle;
	int java;
	
	public int getScore(int i) {
		switch(i){
		case 0:
			i = kor; break;
		case 1:
			i = eng; break;
		case 2:
			i = math; break;
		case 3:
			i = social; break;
		case 4:
			i = science; break;
		case 5:
			i = oracle; break;
		case 6:
			i = java; break;
		}
		return i;
	}
 
	int sum;
	double avg;
	int rank = 1;
	
	Student(String name){
		this.name = name;
		kor = (int)(Math.random()*101);
		eng = (int)(Math.random()*101);
		math = (int)(Math.random()*101);
		social = (int)(Math.random()*101);
		science = (int)(Math.random()*101);
		oracle = (int)(Math.random()*101);
		java = (int)(Math.random()*101);
		
		sum = kor+eng+math+social+science+oracle+java;
		avg = Math.round(((double)sum/7.0*100.0))/100.0;
	}
}