

public class UnaryOperater {

	public static void main(String[] args) {
		// 변수 선언 & 초기화
		int x=1;
		int y=1;
		
		int nextx = ++x;
		int nexty = y++;
		
		System.out.println(nextx + " " + x);
		System.out.println(nexty + " " + y);
		System.out.printf("x=%d, nextx=%d\n", x, nextx);
		System.out.printf("y=%d, nexty=%d", y, nexty);
	}

}


