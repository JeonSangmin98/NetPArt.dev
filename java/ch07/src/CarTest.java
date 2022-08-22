public class CarTest {
	public static void main(String[] args) {
		Car firstCar = new Car("BMW520");
		Car secondCar = new Car("BMW520");
		
		// 객체 주소가 다르기 때문에 '다른 차종' 출력
		if(firstCar.equals(secondCar))
			System.out.println("동일한 차종");
		else
			System.out.println("다른 차종");
		
	}
}