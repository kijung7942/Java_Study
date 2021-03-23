package j_collection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import e_oop.ScanUtil;

public class Board {

	public static void main(String[] args) {
		/*
		 * ArrayList와 HashMap을 사용해 게시판 테이블을 만들고
		 * 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어 주세요
		 * 
		 * 번호(PK), 제목, 내용, 작성자, 작성일
		 */
		
		SimpleDateFormat sdf = new SimpleDateFormat(); // 날짜형식을 원하는 형태로 바꿔주는 클래스
		// 예시 sdf.format.
		ArrayList<HashMap<String,String>> board = new ArrayList();
		HashMap<String,String> row = new HashMap();	
		Date d = new Date();
		int count = 0;
		while(true){
			System.out.println("메뉴를 선택해 주세요. \n 1.게시글 조회  2.게시글 등록  0.종료");
			first:	switch(ScanUtil.nextInt()){
						case 1: 																		 //게시글 조회
							if(board.size()==0){System.out.println("게시글이 없습니다.");break first;}		 //게시글 없을 경우.
							else{
								System.out.println("==================================================================");
								System.out.println("번호\t제목\t내용\t작성자\t작성일\t\t   수정일");
								System.out.println("------------------------------------------------------------------");
								for(int i = 0; i < board.size(); i++){
									System.out.print(board.get(i).get("번호")+"\t"+board.get(i).get("제목")+"\t"+board.get(i).get("내용")
											+"\t"+board.get(i).get("작성자")+"\t"+board.get(i).get("작성일")+"   "+board.get(i).get("수정일"));
									System.out.println();
								}
								System.out.println("==================================================================");
							} 																			 // 그외
							System.out.println("메뉴를 선택해 주세요. \n 1.게시글 수정  2.게시글 삭제  0.상위 메뉴");
							second: switch(ScanUtil.nextInt()){
								case 1: System.out.println("수정할 게시물의 번호를 입력해주세요.");                // 게시물 수정
									int num = ScanUtil.nextInt()-1; // 입력한 번호 -1 => 인덱스는 0부터여서
									board.get(num);
									System.out.println(board.get(num));
									System.out.println("수정할 내용을 선택해 주세요. \n 1.제목 2.내용 0.취소");
									switch(ScanUtil.nextInt()){											 // 수정 내용 선택
										case 1: 														 // 수정 내용 선택 : 제목
											System.out.println("수정할 제목을 입력해주세요.");
											board.get(num).put("제목", ScanUtil.nextLine());
											board.get(num).put("수정일", String.valueOf(d.getYear()-100+"년"+d.getMonth()+"월"+d.getDate()+"일"+d.getHours()+"시"+d.getMinutes()+"분"));
											System.out.println("제목 수정 완료!");
											break second;
										case 2:															 // 수정 내용 선택 : 내용
											System.out.println("수정할 내용을 입력해주세요.");
											board.get(num).put("내용", ScanUtil.nextLine());
											board.get(num).put("수정일", String.valueOf(d.getYear()-100+"년"+d.getMonth()+"월"+d.getDate()+"일"+d.getHours()+"시"+d.getMinutes()+"분"));
											System.out.println("내용 수정 완료!");
											break second;
										case 0:
											break first;	
									}
								case 2:System.out.println("삭제할 게시물의 번호를 입력해주세요.");				 // 게시물 삭제
									int num2 = 0;
									boolean flag = true;
									retry: while(flag){
										try{num2 = ScanUtil.nextInt()-1;
										board.get(num2);
									}catch(Exception e){
										System.out.println("잘못입력하였습니다. 다시 입력해 주세요.");
										continue retry; 
									}	flag = false;
									}
									System.out.println(board.get(num2));
									System.out.println("게시물을 삭제하시겠습니까?(Y/N)");
									switch(ScanUtil.nextLine()){
									case "Y": board.remove(num2);
										break first;
									case "y": board.remove(num2);
										break first;
									case "N": System.out.println("취소되었습니다.");
									break first;
									case "n": System.out.println("취소되었습니다.");
									break first;
									}
								case 0:
									break;
							}
							break;

						case 2:
							row = new HashMap();	
							count++; 
							row.put("번호",String.valueOf(count));
							row.put("작성일",String.valueOf(d.getYear()-100+"년"+d.getMonth()+"월"+d.getDate()+"일"+d.getHours()+"시"+d.getMinutes()+"분"));
							row.put("수정일"," ");
							System.out.println("제목을 써주세요>");
							row.put("제목",ScanUtil.nextLine());
							System.out.println("내용을 써주세요>");
							row.put("내용",ScanUtil.nextLine());
							System.out.println("작성자 명을 써주세요>");
							row.put("작성자",ScanUtil.nextLine());
							
							board.add(row);
							System.out.println("게시물 등록이 완료 되었습니다.");
							break;
						
				
						case 0:
							System.out.println("게시판이 종료됩니다.");
							System.exit(0);
						}
		
		}
		
		
		
		
		
		
	}

}
