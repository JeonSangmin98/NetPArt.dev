import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ImageFileCopy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("원본 파일 이름을 입력하세요: ");
		String inputFileName = scan.next();
		
		System.out.print("복사 파일 이름을 입력하세요: ");
		String outputFileName = scan.next();
		
		// try-with resource - 스트링 닫기 생략
		try(FileInputStream in = new FileInputStream(inputFileName);
				FileOutputStream out = new FileOutputStream(outputFileName)){
			int c;
			while((c = in.read()) != -1) {
				out.write(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
		System.out.println(inputFileName + "을 " + outputFileName +"로 복사하였습니다.");
	}

}
