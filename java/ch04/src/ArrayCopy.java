import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] list = {10,20,30,40,50};
		int[] numbers = list;	// 참조값 복사, 하나의 배열을 공유
		int[] list_copy = Arrays.copyOf(list, list.length);	// 배열 하나 더 생성해서 요소값을 복사
		
		list[2] = 3000;
		numbers[0] = 1000;
		
		for(int ele : list) {
			System.out.print(ele + " ");
		}
		System.out.println("\n--------------");
		for(int ele : numbers) {
			System.out.print(ele + " ");
		}
		System.out.println("\n--------------");
		for(int ele : list_copy) {
			System.out.print(ele + " ");
		}
	}

}
