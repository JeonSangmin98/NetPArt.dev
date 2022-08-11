import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		int w,h;
		double area,perimeter;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("사각형의 가로를 입력하시오: ");
		w = input.nextInt();
		System.out.print("사각형의 세로를 입력하시오: ");
		h = input.nextInt();
		
		area = w * h;
		perimeter = (w+h)*2;
		
		System.out.println("사각형의 넓이는 " + area);
		System.out.print("사각형의 둘레는 " + perimeter);
		
		input.close();
	}

}
