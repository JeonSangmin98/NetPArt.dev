interface Drivalbe{
	void drive();
}
interface Flyable{
	void fly();
}

public class FlyingCar implements Drivalbe, Flyable{
	@Override
	public void fly() {
		System.out.println("하늘을 날고 있음");
	}

	@Override
	public void drive() {
		System.out.println("운전을 하고 있음");
	}
	
	public static void main(String[] args) {
		FlyingCar obj = new FlyingCar();
		obj.drive();
		obj.fly();
	}
}