
public class BadIndex {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = 0;
		}
		
		try {
			int result = arr[10];
		} catch (/*ArrayIndexOutOfBounds*/Exception e) {
			System.out.println("배열의 인덱스가 잘못되었습니다.");
//			e.printStackTrace();
		}
		
		System.out.println("이 문장이 실행이 될까요?");
	}

}
