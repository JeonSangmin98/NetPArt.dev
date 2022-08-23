package Practice;

abstract class Unit{
	int x,y;
	
	void stop() {
		// 현재 위치에서 정지
		System.out.println("정지");
	}
	abstract void move(int x, int y);
}
class Marine extends Unit{	// 보병
	void move(int x, int y) {
		// 지정된 위치로 이동
		System.out.println(x + " " + y +" 로 이동");
	}
	void stimPack() {
		// 스팀팩을 사용한다
		System.out.println("스팀팩 사용");
	}
}	// Marine
class Tank extends Unit{	// 탱크
	void move(int x, int y) {
		// 지정된 위치로 이동
		System.out.println(x + " " + y +" 로 이동");
	}
	void changeMode() {
		// 공격모드를 변경한다
		System.out.println("시즈모드로 변경");
	}
}	// Tank
class DropShip extends Unit{	// 수송선
	void move(int x, int y) {
		// 지정된 위치로 이동
		System.out.println(x + " " + y +" 로 이동");
	}
	void load() {
		// 선택된 대상을 태운다
		System.out.println("유닛 태움");
	}
	void unload() {
		// 선택된 대상을 내린다.
		System.out.println("유닛 내림");
	}
}	// DropShip
public class StarCraft {
	public static void main(String[] args) {
		Marine m = new Marine();
		Tank t = new Tank();
		DropShip d = new DropShip();
		
		m.move(3, 1);
		m.stop();
		m.stimPack();
		
		t.move(2, 4);
		t.stop();
		t.changeMode();
		
		d.move(5, 8);
		d.stop();
		d.load();
		d.move(3, 3);
		d.unload();
		
	}
}