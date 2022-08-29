import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyLines {
	public static void main(String[] args) throws IOException {
		// FileReader에 BufferedReader 연결
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		
		try {
			inputStream = new BufferedReader(new FileReader("input.txt"));
			outputStream = new PrintWriter(new FileWriter("output.txt"));
			
			String l;
			
			// 한 줄 단위로 입출력 할 수 있다.
			while((l = inputStream.readLine()) != null) {
				outputStream.println(l);
			}
		} finally {
			if(inputStream != null)
				inputStream.close();
			if(outputStream != null)
				outputStream.close();
		}
		
	}
}