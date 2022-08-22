
class Animal{
	private double weight;
	String picture;
	
	void eat() {
		System.out.println("eat()가 호출되었음");
	}
	void sleep() {
		System.out.println("sleep()가 호출되었음");
	}
}
class Lion extends Animal{
	int legs=4;
	void roar() {
		System.out.println("roar()가 호출되었음");
	}
}
class Eagle extends Animal{
	int wings=2;
	void fly() {
		System.out.println("fly()가 호출되었음");
	}
}
public class AnimalTest {
	public static void main(String[] args) {
		Lion lion = new Lion();
		Eagle eagle = new Eagle();
		
		lion.eat();
		lion.sleep();
		lion.roar();
		
		eagle.eat();
		eagle.sleep();
		eagle.fly();
	}
}