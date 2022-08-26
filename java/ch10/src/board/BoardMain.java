package board;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		boolean stop = false;
		Scanner sc = new Scanner(System.in);
		BoardDAO boardDAO = new BoardDAO();
		
		do {
			System.out.println("메뉴를 입력하세요");
			System.out.println("1. 게시판 글쓰기");
			System.out.println("2. 글 목록 보기");
			System.out.println("3. 글 삭제");
			System.out.println("4. 종료");
			
			System.out.print("메뉴번호 입력: ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				boardDAO.writeArticle(sc);
				break;
			case 2:
				boardDAO.listArticles();
				break;
			case 3:
				boardDAO.removeArticle(sc);
				break;
			case 4:
				stop = true;
				break;
			}
		}while(!stop);
//		Map<String,String> board = new HashMap<String,String>();
//		Scanner sc = new Scanner(System.in);
//		BoardDAO boardDAO = new BoardDAO();
//		do {
//			System.out.println("메뉴를 입력하세요");
//			System.out.println("1. 게시판 글쓰기");
//			System.out.println("2. 글 목록 보기");
//			System.out.println("3. 글 삭제");
//			System.out.println("4. 종료");
//			
//			System.out.print("메뉴번호 입력: ");
//			int menu = sc.nextInt();
//			
//		}while(true);
	}// main()
}