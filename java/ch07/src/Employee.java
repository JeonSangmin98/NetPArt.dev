
public class Employee{
	public String name;
	String address;
	protected int salary;
	private int rrn;
	private MyDate birthDate;
	
	public Employee(String name, MyDate birthDate) {
		super();
		this.name = name;
		this.birthDate = birthDate;
	}
	
	public Employee(String name, String address, int salary, int rrn) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.rrn = rrn;
	}

	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", birthDate=" + birthDate + "]";
	}
	
//	@Override
//	public String toString() {
//		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
//	}
}
