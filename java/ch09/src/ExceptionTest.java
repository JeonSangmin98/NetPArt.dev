
public class ExceptionTest {

	public static void main(String[] args) {
		int num;
		try {
			num = Integer.parseInt("ABC");
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormat 예외 발생");
		}
	}
}