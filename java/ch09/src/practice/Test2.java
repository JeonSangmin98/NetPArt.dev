package practice;

public class Test2 {

	public static void main(String[] args) {
		sub();
	}
	// (3) throws
	public static void sub() throws ArrayIndexOutOfBoundsException{
		int[] array = new int[10];
		// (2) try-catch 블록
		try {
			int i = array[10];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 잘못되었습니다.");
			e.printStackTrace();
		}
	}
	
}
// (1) : ArrayIndexOutOfBounds 오류
