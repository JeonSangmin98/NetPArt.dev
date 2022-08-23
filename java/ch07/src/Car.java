public class Car {
	private String model;
	int speed;
	
	Car(){
		
	}

	public Car(String model) {
		super();	// Object
		this.model = model;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Car) {
			// Object obj를 형변환
			Car car = (Car)obj;
			// firstCar의 model과 Object obj(= Car car)와 비교
			// 객체 주소가 아닌 문자열 비교
			return this.model.equals(car.model);
		}else {
			return false;
		}
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", speed=" + speed + "]";
	}
	
}