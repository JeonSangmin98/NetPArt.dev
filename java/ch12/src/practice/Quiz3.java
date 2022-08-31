package practice;

import java.util.Random;

public class Quiz3 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		for(int i=0; i<10; i++) {
			System.out.println(ran.nextInt(156)+100 + " ");
		}
		
		System.out.println("");
		System.out.println("========================================");
	}
}