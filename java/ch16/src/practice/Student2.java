package practice;

public class Student2 {

	public static void main(String[] args) {
		String[] studentArr = {"student1","student2","student3","student4","student5"};
		int[] numArr = {20,40,68,80,100};
		
		int sum = 0;
		double avg = 0;
		
		for(int i=0; i<numArr.length; i++)
			sum += numArr[i];
		
		avg = (double)sum / studentArr.length;
		
		System.out.println("전체 학생 수 : " + studentArr.length + "명");
		System.out.println("점수 합계 : " + sum);
		System.out.println("점수 평균 : " + avg);
	}
}