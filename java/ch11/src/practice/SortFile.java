package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class SortFile {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		try {
			FileReader fr = new FileReader("input2.txt");
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line == null)
					break;
				int value = Integer.parseInt(line);
				list.add(value);
			}
			fr.close();
			Collections.sort(list);
			PrintWriter pw = new PrintWriter(new FileWriter("output2.txt"));
			for(int value : list) {
				pw.println(value);
			}
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
// https://adunhansa.tistory.com/27 참고