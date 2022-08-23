
public class Cat extends Animal2 {
	public static void eat() {
		System.out.println("Cat의 정적 메소드 eat()");
	}
	public void sound() {
		System.out.println("Cat의 인스턴스 메소드 sound()");
	}
	
	public static void main(String[] args) {
		Cat myCat = new Cat();
		Animal2 myAnimal = myCat;
		
		// static은 오버라이딩 안됨
//		myAnimal.eat();
		Animal2.eat();
		Cat.eat();
		myAnimal.sound();
	}
}
