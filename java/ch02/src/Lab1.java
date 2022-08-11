import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double radius, a;
		
		System.out.print("반지름을 입력하시오 : ");
		radius = input.nextDouble();
		
		a = radius * radius * 3.14;
		System.out.println(a);
	}

}
