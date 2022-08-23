public class EmployeeTest {
	public static void main(String[] args) {
		MyDate birth = new MyDate(1990,11,20);
		Employee e = new Employee("홍길동",birth);
		Employee e2 = new Employee("홍길동",new MyDate(1990,11,12));
		System.out.println(e);
	}
}