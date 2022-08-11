
//  Long형 정수변수 사용 예제
 
public class Light {

	public static void main(String[] args) {
		
		int lightSpeed = 300000;	// 선언 & 초기화
		long distance;	// 변수 선언
		
		distance = lightSpeed * 365L * 24 * 60 * 60;
		
		System.out.print("빛이 1년 동안 가는 거리 : " + distance + "km");	
		
	}

}