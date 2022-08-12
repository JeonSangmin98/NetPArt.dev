
public class Lab3 {

	public static void main(String[] args) {
		// 배열 최소값 찾기
//		int s[] = {12,3,19,6,18,8,12,4,1,19};
//		int minimum = 0;
//		
//		for(int i=0;i<s.length;i++) {
//			if(s[0]>s[i]) {
//				minimum = s[i];
//			}
//		}
//		System.out.println("최소값은 " + minimum);
		
		// 풀이
		int s[] = {12,3,19,6,18,8,12,4,1,19};
		int minimum = s[0];
		int maximum = s[0];
		
		for(int i=1;i<s.length;i++) {
			if(minimum > s[i]) {
				minimum = s[i];
			}
			
			if(maximum < s[i]) {
				maximum = s[i];
			}
		}
		System.out.println("최소값은 " + minimum);
		System.out.println("최대값은 " + maximum);
		
	}

}
