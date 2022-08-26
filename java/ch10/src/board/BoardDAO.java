package board;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardDAO {
	private ArrayList<BoardVO> boardList;
	
	public BoardDAO() {
		boardList = new ArrayList<BoardVO>();
	}//BoardDAO
	
	public void writeArticle(Scanner sc) {
		System.out.println("게시판 글을 작성 하세요");
		System.out.print("작성자 : ");
		String register = sc.next();
		System.out.print("비밀번호 : ");
		String passwd = sc.next();
		System.out.print("제목 : ");
		String subject = sc.next();
		System.out.print("글 내용 : ");
		String content = sc.next();
		
		BoardVO vo = new BoardVO(register,subject,content,passwd);
		boardList.add(vo);
	}//writeArticle
	public void listArticles() {
		if(boardList.size()>0) {
			for(BoardVO vo : boardList) {
				System.out.println(vo);
			}
		}else {
			System.out.println("등록된 글이 없습니다.");
		}
	}//listArticles
	public void removeArticle(Scanner sc) {
		if(boardList.size()>0) {
			System.out.println("제거할 글의 작성자와 비밀번호를 입력하세요.");
			System.out.print("작성자 : ");
			String register = sc.next();
			System.out.print("비밀번호 : ");
			String passwd = sc.next();
			
			removeArticle(register, passwd);
		}else {
			System.out.println("등록된 글이 없습니다.");
		}
	}//removeArticle
	private void removeArticle(String register, String passwd) {
		int index = -1;
		for(int i=0;i<boardList.size();i++) {
			BoardVO vo = boardList.get(i);
			if(vo.getRegister().equals(register) && vo.getPasswd().equals(passwd)) {
				index = i;
				boardList.remove(vo);
				System.out.println("삭제되었습니다.");
				break;
			}
		}//end for
		if(index == -1) {
			System.out.println("해당 작성자가 없거나 비밀번호가 일치하지 않습니다.");
		}
	}//removeArticel
}//BoardDAO