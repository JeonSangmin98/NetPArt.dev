import java.util.Calendar;

public class CalendarEx2 {
	public static void main(String[] args) {
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2017, 9, 15);
		
		// 두 날짜간의 차이를 얻으려면, getTimeInMillis()을 이용해서 천분의 일초 단위로 변환
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		System.out.println("그 날(date1)부터 지금(date2)까지 " + difference + "초가 지났습니다.");
		System.out.println("일(day)로 계산하면 " + difference/(24*60*60) + "일 입니다.");
		// 1일 = 24 * 60 * 60
	}
}