import java.util.Scanner;

public class UnitConversionTest {
	public static void main(String[] args) {
		UnitConversion uc = new UnitConversion();
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		double n1 = uc.kiloToMile(x);
		System.out.println(x +"km 는 " + n1 + " mile");
		double n2 = uc.mileToKilo(x);
		System.out.println(x +"mile 은 " + n2 + " kilo");
		double n3 = uc.celsiusToFahrenheit(x);
		System.out.println(x +"℃ 는  " + n3 + " ℉");
		double n4 = uc.fahrenheitToCelsiius(x);
		System.out.println(x +"℉ 는  " + n4 + " ℃");
	}
}