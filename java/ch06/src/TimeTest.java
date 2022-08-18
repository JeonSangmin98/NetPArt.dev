public class TimeTest {
	public static void main(String[] args) {
		Time t1 = new Time();
		
		System.out.println("기본 생성자 호출 후 시간: "
				+ t1);
		Time t2 = new Time(13,27,06);
		System.out.println("두번째 생성자 호출 후 시간 : "
				+ t2);
		Time t3 = new Time(99,66,77);
		System.out.println("올바르지 않은 시간 설정 후 시간 : "
				+ t3.toString());
	}
}