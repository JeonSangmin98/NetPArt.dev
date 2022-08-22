package type;
class Animal{
	void sound() {
		System.out.println("Animal 클래스의 sound()");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println("멍멍");
	}
}
class Cat extends Animal{
	void sound() {
		System.out.println("야옹");
	}
}
public class AnimalTest {
	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		Cat c = new Cat();
		
		a.sound();
		d.sound();
		c.sound();
	}
}