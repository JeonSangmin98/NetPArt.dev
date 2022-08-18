public class Car {
	private String model,color;
	private int speed,id;
//	static int numbers = 0;
	private static int numbers = 0;	// 정적 변수
	public Car(String model, String color, int speed) {
		super();
		this.model = model;
		this.color = color;
		this.speed = speed;
		id = ++numbers;
	}
	
	// 정적 메소드
	public static int getNumberOfCars() {
		return numbers;
	}
}