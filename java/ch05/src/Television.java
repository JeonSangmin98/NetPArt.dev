// 객체를 만들기 위한 틀, 설계도
public class Television {
	// 필드, 속성, 상태, 멤버변수
	int channel;
	int volume;
	boolean onOff;
	
	// 메소드, 멤버함수, 동작/기능
	void print() {
		System.out.println("텔레비전의 채널은 " + channel + 
				"이고 볼륨은 " + volume + "입니다.");
	}
	
	// 반환
	int getChannel() {
		return channel;
	}
	
	// 매개변수
	void setChannel(int ch) {
		channel = ch;
	}
}//end Television