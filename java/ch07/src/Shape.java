public class Shape {
	private int x,y;
	Shape(){
		
	}
	Shape(int x, int y){
		this.x = x;
		this.y = y;
	}
	void print() {
		System.out.println("x좌표 : " + x + " y좌표 : " + y);
	}
}
