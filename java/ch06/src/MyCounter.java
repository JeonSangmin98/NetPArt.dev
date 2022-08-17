
public class MyCounter {
	private int counter;
	
	// 기본 생성자
	MyCounter(){
		counter = 1;
	}
	// 생성자 오버로딩
	MyCounter(int value){
		counter = value;
	}
	public int getCounter() {
		return counter;
	}
}