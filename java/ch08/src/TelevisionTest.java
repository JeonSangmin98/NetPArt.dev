public class TelevisionTest {
	public static void main(String[] args) {
		Television tv = new Television();
		tv.turnOn();
		tv.turnOff();
		
//		RemoteControl r = new RemoteControl();
		RemoteControl r = new Television();
		r.turnOff();
		r.turnOff();
	}
}