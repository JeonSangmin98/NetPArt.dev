package practice;

public class Practice6 {
	public static boolean contains(String src, String target) {
		if(src.toString().equals(target)) {
			return true;
		}else {
			return false;
		}
//		return indexOf(src.toString()) >= 0;
	}
	private static int indexOf(String string) {
		return 0;
	}
	public static void main(String[] args) {
		System.out.println(contains("12345","23"));
		System.out.println(contains("12345","67"));
		
//		String str = "12345";
//		System.out.println(str.contains(str));
	}
}