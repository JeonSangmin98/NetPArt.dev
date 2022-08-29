import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile2 {
	public static void main(String[] args) {
		FileReader in = null;
		FileWriter out = null;
		
		try {
			in = new FileReader("input.txt");
			out = new FileWriter("output2.txt");
			
			int c;
			while((c = in.read()) != -1) {
				out.write(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null)
					in.close();
				if(out != null)
					out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}