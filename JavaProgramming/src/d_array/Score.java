package d_array;

import java.util.Arrays;

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
		
		
		
		String[] students = {"김병수", "곽명훈", "김나위", "김성현", "김영광", "김정명", "김찬미", "김현민", "김현성", "류창현", "맹세희", 
				"배병주", "설동비", "양규진", "여지연", "오태훈", "이기정", "이상훈", "이재헌", "이치우", "전민주", "조기범", "조영현",
				"조항민", "최진우"};
int[][] score = new int [25][7];
int[] subsum = new int [7];
int[] sum= new int [25];
double[] subavg = new double [7];
double[] avg = new double [25];


for(int i=0 ; i<score.length ; i++){
	for(int j=0 ; j<score[i].length ; j++){
	    score[i][j]=(int)(Math.random()*101);
	}
}

for(int i = 0 ; i < score.length ; i++){
	for(int j =0 ; j < score[i].length ; j++){
	sum[i] += score[i][j];
	}
	avg[i] = Math.round((double)sum[i] / score[i].length*100)/100;
}

for(int i = 0 ; i < score[i].length ; i++){
	for(int j =0 ; j < score.length ; j++){
		subsum[i] += score[j][i];
		subavg[i] = (double)subsum[i]/students.length;
	}
}



int[] rank = new int[students.length];
for(int i = 0; i < students.length ; i++){
	rank[i] = 1;
	for(int j = 1; j<students.length-1; j++){
	if(avg[i] > avg[j]){
		rank[i]++;
	}
} 
}

System.out.print("\t국어\t영어\t수학\t사회\t과학\tOracle\tJava\t합계\t평균\t석차\n");
for(int i = 0 ; i < students.length; i++){
	System.out.print(students[i]+"\t");
	for(int j = 0 ; j <subsum.length; j++){
	System.out.print(score[i][j]+"\t");
	}
	System.out.print(sum[i]+"\t"+avg[i]+"\t"+rank[i]);
	System.out.println();
}

	System.out.print("과목합계");
	for(int i =0; i < subsum.length; i++){
		System.out.print("\t" + subsum[i]);
	}
	System.out.print("\n과목평균");
	for(int i =0; i < subsum.length; i++){
		System.out.printf("\t%.2f",subavg[i]);
	}

}
}