
public class ArrayTest {
	public static void main(String[] args) {
		// 선언
		int[] intArray;
		char charArray[];
		// 생성
		int[] intArray2 = new int[10];	// 초기값을 모를때, 나중에 넣을때
		char charArray2[] = new char[10];
		// 초기화(값을 알 경우)
		int[] intArray3 = new int[]{1,2,3,4,5};
		int[] intArray4 = {1,2,3,4,5};	// new int(타입)[] 생략 가능
		char charArray3[] = new char[]{'h','e','l','l','o'};
		
		
		System.out.println(intArray3[2]);	// 하나의 요소만 가져올 때
		intArray3[2] = 300;	// 하나의 값을 바꿀때
//		intArray3[5] = 100; 
		
		
//		for(int i=0;i<intArray3.length;i++) {
//			System.out.print(intArray3[i] + " ");
//		}
		// for-each 문
		for(int value : intArray3) {
			System.out.print(value);
		}
		
		System.out.println("\n----------------");
		for(int i=0; i<intArray2.length; i++) {
			intArray2[i] = i;
		}
		for(int i=0;i<intArray2.length;i++) {
			System.out.print(intArray2[i] + " ");
		}
	}

}
