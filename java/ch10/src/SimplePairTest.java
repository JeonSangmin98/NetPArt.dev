class SimplePair<T>{
	private T str1,str2;
	public SimplePair(T str1, T str2) {
		this.str1 = str1;
		this.str2 = str2;
	}
	
	public T getFirst() {
		return str1;
	}
	public T getSecond() {
		return str2;
	}
	
	public void setFirst(T str1) {
		this.str1 = str1;
	}
	public void setSecond(T str2) {
		this.str2 = str2;
	}
}

public class SimplePairTest {
	public static void main(String[] args) {
		SimplePair<String> pair = new SimplePair<String>("apple","tomato");
		System.out.println(pair.getFirst());
		System.out.println(pair.getSecond());
	}
}