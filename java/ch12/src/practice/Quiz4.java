package practice;

import java.util.StringTokenizer;

public class Quiz4 {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("a=3,b=5,c=6", "=,");
		int sum = 0, num;
		String s;
		while(st.hasMoreTokens()) {
			s = st.nextToken();
			System.out.println(s);
			try {
				num = Integer.parseInt(s);
				sum += num;
			}catch(NumberFormatException e) {}
		}
		
		System.out.println("합은 " + sum);
	}
}