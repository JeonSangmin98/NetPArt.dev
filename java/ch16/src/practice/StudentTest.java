package practice;

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student("김철수",1,2,90,85,75,80);
//		System.out.println(s.info());
		System.out.println("총점: " + s.getSum());
		System.out.println("평군: " + s.getAverage());
		
		Student s1 = new Student("김자바",1,2,80,80,80,80);
//		System.out.println(s1.info());
		System.out.println("총점: " + s1.getSum());
		System.out.println("평군: " + s1.getAverage());
	}
}