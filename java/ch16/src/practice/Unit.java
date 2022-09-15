package practice;

public class Unit {
	int x,y;
	void move(int x, int y) {
		this.x += x;
		this.y += y;
		System.out.println(x + "만큼 이동, " + y +"만큼 이동");
	}
	void stop() {
		System.out.println(x + "," + y +"좌표 에서 정지");
	}
	void attack() {
		System.out.println("대상을 공격");
	}
	
	public static void main(String[] args) {
		Zealot z = new Zealot();
		Dragoon d = new Dragoon();
		Carrier c = new Carrier();
		
		z.move(10, 10);
		z.stop();
		z.attack();
		
		d.move(20, 20);
		d.stop();
		d.attack();
		
		c.move(50, 20);
		c.stop();
		c.attack();
	}
}
class Zealot extends Unit{
	void move(int x, int y) {
		this.x += x;
		this.y += y;
		System.out.println("질럿이 " + x + "만큼 이동, " + y +"만큼 이동");
	}
	void stop() {
		System.out.println(x + "," + y +"좌표 에서 정지");
	}
	void attack() {
		System.out.println("질럿이 대상을 공격");
	}
}
class Dragoon extends Unit{
	void move(int x, int y) {
		this.x += x;
		this.y += y;
		System.out.println("드라군이 " + x + "만큼 이동, " + y +"만큼 이동");
	}
	void stop() {
		System.out.println(x + "," + y +"좌표 에서 정지");
	}
	void attack() {
		System.out.println("드라군이 대상을 공격");
	}
}
class Carrier extends Unit{
	void move(int x, int y) {
		this.x += x;
		this.y += y;
		System.out.println("캐리어가 " + x + "만큼 이동, " + y +"만큼 이동");
	}
	void stop() {
		System.out.println(x + "," + y +"좌표 에서 정지");
	}
	void attack() {
		System.out.println("캐리어가 대상을 공격");
	}
}