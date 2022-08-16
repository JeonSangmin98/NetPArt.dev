public class TelevisionTest {
	public static void main(String[] args) {
		Television tv = new Television();
//		tv.channel = 7;
		tv.setChannel(7);
		tv.volume = 9;
		tv.onOff = true;
		int ch = tv.getChannel();
		System.out.println("텔레비전의 채널은 " + ch + 
				"이고 볼륨은 " + tv.volume + "입니다.");
		tv.print();
			
		
		Television tv2 = new Television();
//		tv2.channel = 9;
		tv2.setChannel(9);
		tv2.volume = 12;
		tv2.onOff = true;
		System.out.println("텔레비전의 채널은 " + tv2.getChannel() + 
				"이고 볼륨은 " + tv2.volume + "입니다.");
		tv2.print();
	}
}