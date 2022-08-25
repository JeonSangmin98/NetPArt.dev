public class BoxTest {
	public static void main(String[] args) {
		Box<String> b = new Box<String>();
		b.set("Hello World");
//		String s= (String)b.get();
		String s= b.get();
//		Integer i2 = (Integer)b.get();
		
		Box<Integer> b2 = new Box<Integer>();
//		Box<int> b2 = new Box<int>();	// <>안에는 클래스만 가능
		b2.set(new Integer(10));
		b2.set(10);	// 오토박싱
		Integer i = (Integer)b2.get();
		int i2 = b2.get();	// 오토언박싱
	}
}