
public class ContinueTest {

	public static void main(String[] args) {
		String s = "no news is good news";
		int n=0;
		
		// continue 쓰기
//		for(int i=0;i<s.length();i++) {
//			// n이 나오는 횟수
//			char c = s.charAt(i);
//			if(c != 'n') {
//				continue;
//			}
//			// n의 개수를 하나 증가한다.
//			n++;
//		}
		
		// continue 안쓰기
		for(int i=0;i<s.length();i++) {
			// n이 나오는 횟수
			char c = s.charAt(i);
			if(c == 'n') {
				n++;  // n의 개수를 하나 증가한다.
			}
			
			
		}
		
		// 둘 중에 편하고 간편한것을 쓰면 됨. 
		System.out.println("문장에서 발견된 n의 개수 " + n);
	}
}