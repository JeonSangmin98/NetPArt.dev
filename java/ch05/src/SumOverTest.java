public class SumOverTest {
	public static void main(String[] args) {
		SumOver s = new SumOver();
		SumOver2 s2 = new SumOver2();
		
		System.out.println(s.sum(1, 2));
		System.out.println(s.sum(5, 3, 1));
		
		System.out.println(s2.sum(3, 4));
		System.out.println(s2.sum(5.2, 2.9));
	}

}
