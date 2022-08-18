import java.util.Scanner;

public class ArrayProc {
	// 배열 갯수만큼 입력 받아서 배열 요소의 값 설정
	void getValues(int[] arr) {
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			System.out.print("성적 입력 : ");
			arr[i] = scan.nextInt();
		}
		scan.close();
	}
	
	// 배열 요소들의 합을 구한 뒤 평균을 구해서 출력하기
	double getAverage(int[] arr) {
		double total = 0.0;
		for(int ele:arr)
			total = total + ele;
		return total / arr.length;
	}
}