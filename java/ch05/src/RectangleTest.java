public class RectangleTest {
	public static void main(String[] args) {
		Rectangle square = new Rectangle();
		
		square.area();
		square.perimeter();
		System.out.println("넓이는 " + square.area() 
				+ " 둘레는 " + square.perimeter());
	}
}