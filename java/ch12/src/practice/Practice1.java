package practice;

import java.util.Random;
import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("최대: ");
		int max = keyboard.nextInt();
		System.out.print("최소: ");
		int min = keyboard.nextInt();
		
		Random ran = new Random();
		
		for(int i=0; i<10; i++) {
			System.out.print(ran.nextInt(max) + min + " ");
		}
		keyboard.close();
	}
}