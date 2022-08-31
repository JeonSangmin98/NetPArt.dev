package practice;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
//		Date today = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat();
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.(예: 2021/05/11)");
//		sdf = new SimpleDateFormat("yyyy/MM/dd");
//		String result = sdf.format(today);
//		System.out.println(">>" + result);
//		sdf = new SimpleDateFormat("E요일");
//		System.out.println("입력하신 날짜는 " + sdf + " 입니다.");
		
		String pattern = "yyyy/MM/dd";
		String pattern2 = "입력하신 날짜는 E요일 입니다.";
		
		SimpleDateFormat df = new SimpleDateFormat(pattern);
		SimpleDateFormat df2 = new SimpleDateFormat(pattern2);
		
		Scanner s = new Scanner(System.in);
		Date inDate = null;
		
		do {
			System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요.(예:2021/05/11)");
			try {
				System.out.print(">>");
				// 설정포맷형식으로 입력 받은 날짜 String을 Date형으로 변경
				inDate = df.parse(s.next());
				break;
			}catch(Exception e) {}
		}while(true);
		
		System.out.println(df2.format(inDate));
	}
}