public class Student {
	String name;
	int ban,no,kor,eng,math;
	
	int getTotal() {
		return kor+eng+math;
	}
	float getAverage() {
//		return (kor+eng+math)/3;
//		return (int)(getTotal()/3f*10+0.5f) / 10f;  반올림
		return getTotal()/3f;
	}
}