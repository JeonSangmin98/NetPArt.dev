package type;
class Shape{
	int x,y;
	void draw() {
		System.out.println("Shape draw");
	}
}
class Rectangle extends Shape{
	int width,height;
	void draw() {
		System.out.println("Rectangle draw");
	}
}
class Triangle extends Shape{
	int base,height;
	void draw() {
		System.out.println("Triangle draw");
	}
}
class Circle extends Shape{
	int radius;
	void draw() {
		System.out.println("Circle draw");
	}
}
class Cylinder extends Shape{
	private int radius,height;
	void draw() {
		System.out.println("Cylinder draw");
	}
}
public class ShapeTest {
	static Shape arrOfShapes[];
	public static void main(String[] args) {
//		Shape s1, s2;
//		s1 = new Shape();
//		s2 = new Rectangle();	// 상향 형변환
//		
//		s2.x = 0;
//		s2.y = 0;
//		// 객체는 참조하지만 참조 타입을 Shape(부모)로 했기 때문(자식 변수는 모름)
////		s2.width = 10;
////		s2.height = 10;
//		// 하향 형변환(2가지)
//		((Rectangle)s2).width = 10;	
//		Rectangle r = (Rectangle)s2;
//		r.height = 10;
		
//		Shape s1,s2,s3,s4;
//		s1 = new Shape();
//		s2 = new Rectangle();
//		s3 = new Triangle();
//		s4 = new Circle();
		
		// 다형성
//		s1.draw();
//		s2.draw();
//		s3.draw();
//		s4.draw();
		init();
		drawAll();
		
	}	// main
	// 동적 바인딩
	public static void init() {
		// 초기화
		arrOfShapes = new Shape[4];
		arrOfShapes[0] = new Rectangle();
		arrOfShapes[1] = new Triangle();
		arrOfShapes[2] = new Circle();
		arrOfShapes[3] = new Cylinder();
	}
	public static void drawAll() {
		// for
//		for(int i =0;i<arrOfShapes.length;i++) {
//			arrOfShapes[i].draw();
//		}
		// for each
		for(Shape s : arrOfShapes) {
			// getClass() : 클래스에 대한 정보 반환
//			System.out.println("obj is of type \"" + s.getClass().getName() + "\"");
			s.draw();
		}
	}
}	// ShapeTest