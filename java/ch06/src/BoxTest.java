public class BoxTest {
	public static void main(String[] args) {
		Box b = new Box(20,20,30);
		
		b.print();
		
		Box obj1 = new Box(10,20,50);
		Box obj2 = new Box(10,30,30);
		Box largest = obj2.whoLargest(obj1, obj2);
		System.out.println(largest);
		
		System.out.println("obj1 == obj2 : " + obj1.isSameBox(obj2));
	}
}