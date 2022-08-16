public class BoxTest {
	public static void main(String[] args) {
		Box b = new Box();
		
		b.width = 20;
		b.height = 20;
		b.length = 30;
		System.out.println("상자의 가로, 세로, 높이는 " + b.width + ", " + b.height + ", " + b.length + "입니다.");
	}
}