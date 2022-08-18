
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
	
	int inc(int a) {
		a = a + 1;
		return a;
	}
	void inc(MyCounter ctr) {
		ctr.counter += 1;
	}
	
	void inc(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i] += 1;
		}
	}
}