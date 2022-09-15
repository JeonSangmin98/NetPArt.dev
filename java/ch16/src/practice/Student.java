package practice;

public class Student {
	int ban, no, kor, eng, math, sci;
	String name;
	
	public Student(String name, int ban, int no, int kor, int eng, int math, int sci) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sci = sci;
		
	}

	public int getSum() {
		return (kor + eng + math + sci);
	}
	
	public float getAverage() {
		return (getSum() / 4);
	}

	public void info() {
		System.out.println();
	}
}