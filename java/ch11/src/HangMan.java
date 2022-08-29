import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class HangMan {
	
	// 파일에서 읽어오는 메소드
	public static String getRandomSolution() throws IOException {
		BufferedReader in = null;
		String[] words = new String[100];
		int count = 0;
		in = new BufferedReader(new FileReader("sample.txt"));
		for(int i = 0; i < words.length; i++) {
			String s = in.readLine();
			if(s == null)
				break;
			
			words[i] = s;
			count++;
		}
		
		in.close();
		Random r = new Random();
		int idx = r.nextInt(count);
		return words[idx];
	}// getRandomSolution
	
	public static void main(String[] args) {
		try {
			String solution = getRandomSolution();
			System.out.println("정답: " + solution);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}