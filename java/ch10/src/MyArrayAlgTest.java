public class MyArrayAlgTest {
	public static void main(String[] args) {
		String[] language = {"C++","C#","Java"};
		String last = MyArrayAlg./*<String>*/getLast(language);
		System.out.println(last);
		
		Integer[] number = {1,2,3,4,5};
		Integer num = MyArrayAlg.getLast(number);
		System.out.println(num);
		
		MyArrayAlg.swap(number,1,2);
		for(Integer value : number) {
			System.out.print(value + " ");
		}System.out.println();
		
		MyArrayAlg.swap(language,1,2);
		for(String value : language) {
			System.out.print(value + " ");
		}System.out.println();
	}
}