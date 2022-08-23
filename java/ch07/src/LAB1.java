//class Employee{
//	public String name;
//	String address;
//	protected int salary;
//	private int rrn;
//	
//	public Employee(String name, String address, int salary, int rrn) {
//		super();
//		this.name = name;
//		this.address = address;
//		this.salary = salary;
//		this.rrn = rrn;
//	}
//	@Override
//	public String toString() {
//		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
//	}
//}
class Manager extends Employee{
	private int bonus;

	public Manager(String name, String address, int salary, int rrn, int bonus) {
		super(name, address, salary, rrn);
		this.bonus = bonus;
	}
	public void test() {
		System.out.println("name = " + name);
		System.out.println("address = " + address);
		System.out.println("salary = " + salary);
//		System.out.println("rrn = " + rrn);		/* 접근 불가 */
	}
}
public class LAB1 {
	public static void main(String[] args) {
		Manager m = new Manager("Tom","Seoul",1000000,123456,5000000);
		
		System.out.println(m);
		m.test();
	}
}