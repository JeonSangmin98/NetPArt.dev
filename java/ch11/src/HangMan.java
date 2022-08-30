import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class HangMan {
	
	// 파일에서 읽어오는 메소드
	public static String getRandomSolution() throws IOException {
		BufferedReader in = null;
//		String[] words = new String[100];
		ArrayList<String> words = new ArrayList<String>();
//		int count = 0;
		in = new BufferedReader(new FileReader("sample.txt"));
		String s;
		while((s = in.readLine())!=null) {
			words.add(s);
		}
//		for(int i = 0; i < words.size(); i++) {
//			String s = in.readLine();
//			if(s == null)
//				break;
//			
//			words.add(s);
//			count++;
//		}
		
		in.close();
		Random r = new Random();
		int idx = r.nextInt(words.size());
		return words.get(idx);
	}// getRandomSolution
	
	// 정답의 길이만큼 '_'을 생성
	public static StringBuffer getAnswer(String solution) {
		StringBuffer answer = new StringBuffer(solution.length());
		for(int i=0;i<solution.length();i++) {
			answer.append('_');
		}
		return answer;
	}
	
	// apple => p -> _pp__
	public static boolean check(String s, StringBuffer a, char ch) {
		int i;
		char c = Character.toUpperCase(ch);
		for(i=0;i<s.length();i++) {
			if(s.toUpperCase().charAt(i) == c) {	// '_'을 ch와 일치하는 문자로 치환
				a.setCharAt(i, c);
			}
			// 아스키코드 활용
//			if(s.charAt(i) == ch || s.charAt(i) == ch+32 || s.charAt(i) == ch-32)
		}	
		
//		for(i=0;i<s.length();i++) {
//			if(s.charAt(i) != a.charAt(i)) {	// 정답과 사용자 입력을 비교
//				return false;
//			}
//		}
		return s.equalsIgnoreCase(a.toString());
	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		try {
//			String solution = getRandomSolution();
//			StringBuffer answer = getAnswer(solution);
//			while(true) {
//			System.out.println("정답: " + solution);
//			System.out.println("현재 상태: " + answer);
//			System.out.print("글자를 추측하시오: ");
//			String c = sc.next();
//			// 사용자가 입력한 단어와 정답이 일치하면 반복 종료
//			if(check(solution,answer,c.charAt(0)) == true) {
//				break;
//				}
//			}
//			System.out.println("현재 상태: " + answer);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
}