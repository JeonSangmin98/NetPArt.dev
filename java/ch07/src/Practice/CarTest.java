package Practice;
class Car{
	int gasolineGauge;

	public Car(int oil) {
		gasolineGauge = oil;
	}
	
} // Car
class HybridCar extends Car{
	int electricGauge;

	public HybridCar(int oil, int ele) {
		super(oil);
		electricGauge = ele;
	}
}	// HybridCar
class HyBridWaterCar extends HybridCar{
	int waterGauge;

	public HyBridWaterCar(int oil, int ele, int wat) {
		super(oil, ele);
		waterGauge = wat;
	}
	
	public void showCurrentGauge() {
		System.out.println("잔여 가솔린 " + gasolineGauge);
		System.out.println("잔여 전기량 " + electricGauge);
		System.out.println("잔여 워터량 " + waterGauge);
	}
}	// HyBridWaterCar
public class CarTest {
	public static void main(String[] args) {
		HyBridWaterCar hwCar1 = new HyBridWaterCar(4,2,3);
		hwCar1.showCurrentGauge();
		
		HyBridWaterCar hwCar2 = new HyBridWaterCar(9,5,7);
		hwCar2.showCurrentGauge();
	}
}	// CarTest