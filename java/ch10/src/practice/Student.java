package practice;

import java.util.ArrayList;
import java.util.Scanner;

class Infomation{
	private ArrayList<Student> list;
	
	public Infomation() {
		list = new ArrayList<Student>();
	}
	public void info(Scanner sc) {
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("주소 : ");
		String addr = sc.next();
		System.out.print("전화번호 : ");
		int phone = sc.nextInt();
	
		Student st = new Student(name,addr,phone);
		list.add(st);
	}//writeArticle
	
	public void stack() {
		if(list.size()>0) {
			for(Student st : list) {
				System.out.println(st);
			}
		}else {
			System.out.println("등록된 글이 없습니다.");
		}
	}//listArticles
	public void remove(Scanner sc) {
		if(list.size()>0) {
			System.out.println("제거할 글의 이름과 주소, 전화번호를 입력하세요.");
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("주소 : ");
			String addr = sc.next();
			System.out.print("전화번호 : ");
			int phone = sc.nextInt();
					
			remove(name, addr, phone);
		}else {
			System.out.println("등록된 글이 없습니다.");
		}
	}//removeArticle
	private void remove(String name, String addr, int phone) {
		int index = -1;
		for(int i=0;i<list.size();i++) {
			Student st = list.get(i);
			if(st.getName().equals(name) && st.getAddr().equals(addr) 
					&& st.getPhone() == phone) {
				index = i;
				list.remove(st);
				System.out.println("삭제되었습니다.");
				break;
			}
		}//end for
		if(index == -1) {
			System.out.println("해당 작성자가 없습니다.");
		}
	}//removeArticel
}
public class Student {
	String name;
	String addr;
	int phone;
	
	
	public Student(String name, String addr, int phone) {
		super();
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "이름 = " + name + ", 주소 = " + addr + ", 전화번호 = " + phone;
	}
}
class StudentTest{
	public static void main(String[] args) {
		boolean stop = false;
		Scanner sc = new Scanner(System.in);
		Infomation student = new Infomation();
		
		do {
			System.out.println("메뉴를 입력하세요");
			System.out.println("1. 이름");
			System.out.println("2. 주소");
			System.out.println("3. 전화번호");
			System.out.println("4. 종료");
			
			System.out.print("메뉴번호 입력: ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				student.info(sc);
				break;
			case 2:
				student.stack();
				break;
			case 3:
				student.remove(sc);
				break;
			case 4:
				stop = true;
				break;
			}
		}while(!stop);
	}
}