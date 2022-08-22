package _abstract;
abstract class Shape{	// 추상 메소드를 가지고 있으면 클래스도 추상 클래스
	int x, y;
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public abstract void draw();	// 추상메소드
} // Shape

class Rectangle extends Shape{
	int width,height;
	
	@Override
	public void draw() {	// 추상메소드를 구현
		System.out.println("사각형 그리기");
	}
} // Rectangle

class Circle extends Shape{
	int radius;

	@Override
	public void draw() {	// 추상메소드 구현
		System.out.println("원 그리기");
	}
} // Circle
public class AnimalTest {
	public static void main(String[] args) {
	}
}