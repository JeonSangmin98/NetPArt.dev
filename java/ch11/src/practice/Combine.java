package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Combine {
	public static void main(String[] args) throws IOException {
		BufferedReader br1 = null;
		BufferedReader br2 = null;
		PrintWriter out = null;
		try {
			br1 = new BufferedReader(new FileReader("apple.txt"));
			br2 = new BufferedReader(new FileReader("banana.txt"));
			out = new PrintWriter(new FileWriter("applebanana.txt"));
			
			String l1,l2;
			
			while((l1 = br1.readLine()) != null) {
				out.println(l1);
			}
			while((l2 = br2.readLine()) != null) {
				out.println(l2);
			}
		} finally {
			if(br1 != null)
				br1.close();
			if(br2 != null)
				br2.close();
			if(out != null)
				out.close();
		}
	}

}
