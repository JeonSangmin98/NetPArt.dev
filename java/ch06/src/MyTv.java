public class MyTv {
	private boolean isPowerOn;
	private int channel,volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public MyTv(int channel, int volume) {
		super();
		this.channel = channel;
		this.volume = volume;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}

	void turnOnOff() {
//		if(isPowerOn == true)
//			isPowerOn = false;
//		else
//			isPowerOn = true;
		isPowerOn = !isPowerOn;
	}
	
	void volumeUp() {
		if(volume < MAX_VOLUME)
			volume++;		
	}
	void volumeDown() {
		if(volume > MIN_VOLUME)
			volume--;
	}
	void channelUp() {
		if(channel == MAX_CHANNEL)
			channel = MIN_CHANNEL;
		else
			channel++;
	}
	void channelDown() {
		if(channel == MIN_CHANNEL)
			channel = MAX_CHANNEL;
		else
			channel--;
	}
}