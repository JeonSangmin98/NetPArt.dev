public class TelevisionTest {
	public static void main(String[] args) {
		Television tv = new Television();
		tv.turnOn();
		tv.turnOff();
		
//		RemoteControl r = new RemoteControl();	// 안됨
		RemoteControl r = new Television();
		r.turnOff();
		r.turnOff();
		
		RemoteControl r2 = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("turnOn TV");
			}

			@Override
			public void turnOff() {
				System.out.println("turnOff TV");
			}
		};
		r2.turnOff();
		r2.turnOn();
	}
}