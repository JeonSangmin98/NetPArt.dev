public class MyTvTest {
	public static void main(String[] args) {
		MyTv t = new MyTv(100,0);

		System.out.println("CH:"+t.getChannel()+",VOL:"+t.getVolume());
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:"+t.getChannel()+",VOL:"+t.getVolume());
		t.setVolume(100);
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:"+t.getChannel()+",VOL:"+t.getVolume());
	}
}