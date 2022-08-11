import java.time.LocalDateTime;

public class Lab2 {

	public static void main(String[] args) {
		LocalDateTime timePoint = LocalDateTime.now();
		int currentHour = timePoint.getHour();
		String hello;
		
		if(currentHour >= 20) {
			hello = "Good Night";
		}else if(currentHour >= 15) {
			hello = "Good Evening";
		}else if(currentHour >= 11) {
			hello = "Good Afternoon";
		}else {
			hello = "Good Moring";
		}
		
		System.out.println("현재시간은 " + timePoint);
		System.out.println(hello);
	}

}
