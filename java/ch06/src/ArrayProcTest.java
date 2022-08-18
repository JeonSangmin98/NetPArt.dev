public class ArrayProcTest {
	final static int STUDENTS = 5;
	
	public static void main(String[] args) {
		// 배열 생성, 메소드 호출
		int[] scores = new int[STUDENTS];
		ArrayProc obj = new ArrayProc();
		obj.getValues(scores);
		System.out.println("평균은 = " + obj.getAverage(scores));
	}
}