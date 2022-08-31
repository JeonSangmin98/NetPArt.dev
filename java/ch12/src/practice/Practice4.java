package practice;

import java.util.StringTokenizer;

public class Practice4 {
	public static void main(String[] args) {
		String str = "990208-1012752";
		StringTokenizer st = new StringTokenizer(str,"-");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken() + " ");
		}
	}
}