import java.time.LocalDateTime;


public class Lab1Solve {

	public static void main(String[] args) {

		LocalDateTime timePoint = LocalDateTime.now();
		int currentHour = timePoint.getHour();

		
		System.out.println("현재시간은 " + timePoint);
		if(currentHour < 11) {
			System.out.println("Good Morning");
		}else if(currentHour < 15) {
			System.out.println("Good Afternoon");
		}else if(currentHour <20) {
			System.out.println("Good Evening");
		}else {
			System.out.println("Good Night");
		}
	}

}