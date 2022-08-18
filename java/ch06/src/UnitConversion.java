public class UnitConversion {
	public static double kiloToMile(double k){
		return k*0.621371;
	}
	public static double mileToKilo(double m){
		return m*1.609344;
	}
	public static double celsiusToFahrenheit(double c){
		return (c*1.8)+32;
	}
	public static double fahrenheitToCelsiius(double f){
		return (f-32)/1.8;
	}
}