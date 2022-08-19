class Employee{
	private String name;
	private double salary;
	private static int count = 0;
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
		count++;
	}

	public static int getCount() {
		return count;
	}
	
	// 소멸자, 개체가 사라질 때 호출
	@Override
	protected void finalize() {
		count--;
	}
}
public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new Employee("aaa",25000);
		Employee e2 = new Employee("bbb",30000);
		Employee e3 = new Employee("ccc",15000);
		
		System.out.println("현재의 직원수 = " + Employee.getCount());
	}
}