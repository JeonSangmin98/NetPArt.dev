public class Television {
	private int channel;
	private int volume;
	private boolean onOff;
	
	Television(int a, int b, boolean c){
		channel = a;
		volume = b;
		onOff = c;
	}

	void print() {
		System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
	}
}