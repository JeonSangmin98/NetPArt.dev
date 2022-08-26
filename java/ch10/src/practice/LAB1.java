package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LAB1 {
	public static void main(String[] args) {
		// <String,String> 매개변수를 가지는 HashMap객체 생성
		Map<String,String> dic = new HashMap<String,String>();
		// key, value에 해당하는 단어 put()
		dic.put("map", "지도");
		dic.put("school", "학교");
		dic.put("book", "책");
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		// 사용자로 부터 단어 입력
		do {
			System.out.print("영어 단어를 입력하시오: ");
			String key = sc.next();
			// quit를 입력하면 종료
			if(key.equals("quit")) {
				break;
			}
			// key 값으로 단어 가져오기
			String value = dic.get(key);
			if(value == null)
				System.out.println("단어가 사전에 없습니다. ");
			else
				System.out.println("단어의 의미는 " + value);
		}while(true);
		
	}
}