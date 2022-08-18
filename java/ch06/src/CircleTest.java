public class CircleTest {
	public static void main(String[] args) {
		Point p = new Point(25,78);
		Circle c = new Circle(10,p);
//		Circle c = new Circle(10,new Point(25,78)); // 짧거나 한번만 쓰는것은 바로 객체생성 가능
		System.out.println(c);
	}
}