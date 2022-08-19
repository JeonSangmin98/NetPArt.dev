public class Rectangle extends Shape {
	private int width, height;
	
	int calArea() {
		return width * height;
	}
	void draw() {
		// 부모 클래스의 private 멤버 변수는 사용 할 수 없음
//		System.out.printf("(%d, %d) 위치에 가로 : %d, 세로 : %d", x, y, width, height);
	}
}