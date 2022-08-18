public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car("S600","white",80);
		Car c2 = new Car("E500","blue",20);
		
//		int n = Car.numbers;	// 클래스 이름으로 접근할때는 static이 꼭 있어야됨
		int n = Car.getNumberOfCars();
		System.out.println("지금까지 생성된 자동차 수 = "+n);
	}
}