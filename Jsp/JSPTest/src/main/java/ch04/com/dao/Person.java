package ch04.com.dao;

public class Person {
	private int id = 20220930;
	private String name = "홍길동";
	
	public Person(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
//	public static void main(String[] args) {
//		Person person = new Person();
//		System.out.println("아이디 : " + person.getId());
//		System.out.println("이름 : " + person.getName());
//	}
//	serializable  = 운영체제가 다를때 방지
}