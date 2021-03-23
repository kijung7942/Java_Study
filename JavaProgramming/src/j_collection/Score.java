package j_collection;

import java.util.ArrayList;

public class Score {

	public static void main(String[] args) {

		/*
		 *  우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를
		 *  0~100까지 랜덤으로 생성해주시고, 아래와 같이 출력해주세요.
		 *  
		 *  -아래-
		 *  		국어		영어		수학		사회		과학		Oracle		Java		합계		평균		석차
		 *  
		 *  홍길동	90		90		90		90		90		90			90			630		90.00		1	
		 *  홍길동	90		90		90		90		90		90			90			630		90.00		1	
		 *  홍길동	90		90		90		90		90		90			90			630		90.00		1	
		 *  홍길동	90		90		90		90		90		90			90			630		90.00		1	
		 *  홍길동	90		90		90		90		90		90			90			630		90.00		1	
		 * 과목합계	450		450		450		450		450		450			450			
		 * 과목평균	90.00	90.00	90.00	90.00	90.00	90.00		90.00 
		 */
		
		String[] name1 = {"김병수", "곽명훈", "김나위", "김성현", "김영광", "김정명", "김찬미", "김현민", "김현성", "류창현", "맹세희", 
				"배병주", "설동비", "양규진", "여지연", "오태훈", "이기정", "이상훈", "이재헌", "이치우", "전민주", "조기범", "조영현",
				"조항민", "최진우"};
		
		
		
		ArrayList students = new ArrayList();

		ArrayList<String> name = new ArrayList<>();
		for(int i = 0; i < name1.length; i ++){
			name.add(name1[i]);
		}
		ArrayList<Integer> kor = new ArrayList<>();
		ArrayList<Integer> eng = new ArrayList<>();
		ArrayList<Integer> math = new ArrayList<>();
		ArrayList<Integer> social = new ArrayList<>();
		ArrayList<Integer> science = new ArrayList<>();
		ArrayList<Integer> oracle = new ArrayList<>();
		ArrayList<Integer> java = new ArrayList<>();
		ArrayList<Integer> subSum = new ArrayList<>();
		for(int i = 0; i < name1.length; i ++){
			kor.add((int)(Math.random()*100+1));
			eng.add((int)(Math.random()*100+1));
			math.add((int)(Math.random()*100+1));
			social.add((int)(Math.random()*100+1));
			science.add((int)(Math.random()*100+1));
			oracle.add((int)(Math.random()*100+1));
			java.add((int)(Math.random()*100+1));
		}
		ArrayList<ArrayList> subject = new ArrayList<>();
		subject.add(kor);
		subject.add(eng);
		subject.add(math);
		subject.add(social);
		subject.add(science);
		subject.add(oracle);
		subject.add(java);
		subject.add(subSum);
		
		
//		int sizeKor = kor.size();
//		System.out.println(kor + "size:" + sizeKor);
		ArrayList<Integer> nameSum = new ArrayList<>();
		ArrayList<Double> avg = new ArrayList<>();
		for(int i = 0 ; i < name.size() ; i++){
			nameSum.add(kor.get(i)+eng.get(i)+math.get(i)+social.get(i)+science.get(i)+oracle.get(i)+java.get(i));
			avg.add(Math.round((double)nameSum.get(i)/7.0*100)/100.0);
		}

		ArrayList<Integer> rank = new ArrayList<>();
		for(int i = 0; i < name.size(); i++){
			int count = 1;
			for(int j =0; j <name.size();j++){
				if(nameSum.get(i) < nameSum.get(j)){
					count++;}
			}
			rank.add(count);
		}
		System.out.print("\t국어\t영어\t수학\t사회\t과학\tOracle\tJava\t합계\t평균\t석차\n");
		for(int i = 0 ; i < name1.length; i++){
			System.out.println(name.get(i)+"\t"+kor.get(i)+"\t"+eng.get(i)+
					"\t"+math.get(i)+"\t"+social.get(i)+"\t"+science.get(i)+
					"\t"+oracle.get(i)+"\t"+java.get(i)+"\t"+nameSum.get(i)+"\t"+avg.get(i)+"\t"+rank.get(i));
		
		}
		System.out.print("과목합계\t");
		int sum = 0;
		for(int i = 0; i < 7; i++){
			for(int j = 0 ; j < 25; j++){
			 sum += (int)(subject.get(i).get(j));
			}
			subSum.add(sum);
			sum = 0;
			System.out.print(subSum.get(i)+"\t");
		}
		ArrayList<Double> subAvg = new ArrayList<>();
		for(int i = 0 ; i < subSum.size(); i++){
			subAvg.add(Math.round((double)subSum.get(i)/name.size()*100.0)/100.0);
		}
		
		System.out.print("\n과목평균\t");
		for(int i = 0; i < subSum.size(); i++){
			System.out.print(subAvg.get(i)+"\t");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
	
