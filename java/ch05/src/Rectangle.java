import java.util.Scanner;

public class Rectangle {
	Scanner scan = new Scanner(System.in);
	int w=scan.nextInt();
	int h=scan.nextInt();
	
	
	int area() {
		return w*h;
	}
	int perimeter() {
		return 2*w+2*h;
	}
}