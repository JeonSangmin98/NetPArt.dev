package animal;

public class Dog extends Animal{

	
	// 메소드 오버라이딩
//	public void eat() {
//		super.eat();	// 부모클래스 메소드 호출(일반적으로)
//		System.out.println("강아지가 먹고 있습니다.");
//	}
	// 우클릭 -> 소스 -> 오버라이드/메소드
	@Override
	public void eat() {
		super.eat();
		System.out.println("강아지가 먹고 있습니다.");
	}
}