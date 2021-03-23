package i_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {

		/*
		 *  정규표현식 : 문자열의 패턴을 검사하는 표현식: 아이디나 비밀번호 처럼 형식이 정해져 있는 걸 받을 때 사용
		 *  	만들기보다 만들어져있는거 구글링해서 쓰는게 안전할듯?
		 *  
		 *  ^	          뒷 문자로 시작                                                
		 *  $	          앞 문자로 종료                                                
		 *  .	          임의의 문자(줄바꿈 제외) : 한 글자                                         
		 *  *	      * 앞에 있는 문자가 0개 이상                                             
		 *  +	      + 앞에 있는 문자가 1개 이상                                             
		 *  ?	      ? 앞에 있는 문자가 없거나 1개                                            
		 *  []	          문자의 집합이나 범위([a-z]: a부터 z까지 중 1개의 문자, [^a-z]: a-z가 아닌 것 중 1개의 문자)          
		 *  {}	          앞 문자의 개수(문자{2}: '문자'라는 글자의 문자 갯수 = 2개, 문자열{2,4}: '문자열'이라는 글자의 문자 갯수 = 2개 이상 4개 이하)
		 *  () 	          그룹화
		 *  \|	      OR연산
		 *  \s	          공백, 탭, 줄바꿈
		 *  \S	     (공백, 탭, 줄바꿈)이 아닌 문자
		 *  \w	          알파벳이나 숫자
		 *  \W	     (알파벳이나 숫자)가 아닌 문자
		 *  \d	          숫자
		 *  \D	     (숫자)가 아닌 문자
		 *  (?i)	 (?i)뒷문자 : 뒷문자의 대소문자 구분 안함
		 *  \	          정규표현식에서 사용되는 특수문자 표현
		 */
		
		
//		String str = "abc123";
//		String regex = "[a-z]{3}[0-9]{1,3}";
//		String regex = "[a-z0-9]+"; // 소문자 a-z, 숫자 0-9로 이루어진 1개이상의 문자들만 있으면 true, 대문자나 특수문자 들어가 있으면 false
//		String regex = "\\w*"; // 알파벳이나 숫자가 0개 이상. 소문자 대문자 상관없고 숫자도 가능, 특수문자 불가
//		String regex = ".*"; // 모든 문자열 가능(줄바꿈만 제외)
		
		
		
		
		
		
//		문제. 아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식		
		String id = "abc123";  // 5~20자의 영문 소문자, 숫자와 특수기호(_)(-)만 사용 가능.
		String idRegex = "[a-z0-9-_]{5,20}";
		
		Pattern p = Pattern.compile(idRegex);
		Matcher m = p.matcher(id);
		
		String telNo = "010-345-4110"; // 01?-0000-0000의 형태만 가능
		String telNoRegex = "01[0-9]{1}-\\d{3,4}[-]{1}\\d{4}";
		
		Pattern p1 = Pattern.compile(telNoRegex);
		Matcher m1 = p1.matcher(telNo);
		
		String mail = "kijung7-2@yahoo.co.kr"; // 5~20자의 영문 소문자, 숫자와 특수기호(_)(-) + @ + 영문소문자 + .com / net / co.kr 등
		String mailRegex = "[a-z0-9-_]{5,20}@(naver.com|hanmail.net|[a-z]{1,10}.(com|net)|[a-z]{1,10}.(co|com).kr)";
//		[|]
		Pattern p2 = Pattern.compile(mailRegex);
		Matcher m2 = p2.matcher(mail);
		
		System.out.println("id유효성 = " + m.matches());
		System.out.println("전화번호 유효성 = " + m1.matches());
		System.out.println("메일유효성 = " + m2.matches());
	}

}
