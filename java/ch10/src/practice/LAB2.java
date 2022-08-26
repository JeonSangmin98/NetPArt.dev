package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LAB2 {
	public static void main(String[] args) {
		Map<String, String> st = new HashMap<String,String>();
		System.out.println("메뉴를 입력하세요");
		System.out.println("1. 게시판 글쓰기");
		System.out.println("2. 글 목록 보기");
		System.out.println("3. 글 삭제");
		System.out.println("4. 종료");
		st.put("1", "게시판 글을 작성 하세요\n"+"작성자: "+"\n이메일: "+
			"\n비밀번호: "+"\n제목: "+"\n글 내용: ");
		st.put("2", "글 목록 보기");
		st.put("3", "글 삭제");
		st.put("4", "종료");
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("메뉴번호 입력: ");
			int input = sc.nextInt();
			if(input == 4) {
				break;
			}
			
			String value = st.get(input);
			if(value == null && input == 2) {
				System.out.println("등록된 글이 없습니다.");
			}else if(input == 1) {
				System.out.println();
			}
		}while(true);

//		System.out.println(st.get("1"));
	}
}