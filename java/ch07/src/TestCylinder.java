class Circle{
	private double radius;
	private String color;
	
	Circle(){
		radius=0.0;
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return radius*radius*3.14;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", area=" + color + "]";
	}
}// end Circle
class Cylinder extends Circle{
	private double height;
	
	Cylinder(){
		height=0.0;
	}
	Cylinder(double radius){
		super(radius);
	}
	Cylinder(double radius, double height){
		super(radius);
		this.height = height;
	}
	double getHeight() {
		return height;
	}
	double getVolume() {
		return getArea()*height;
	}
	@Override
	public String toString() {
		return "Cylinder [height=" + height + "]";
	}
}// enc Cylinder
public class TestCylinder {
	public static void main(String[] args) {
		Cylinder obj1 = new Cylinder();
		System.out.println(obj1);
		System.out.println(obj1.getRadius());
		System.out.println(obj1.getArea());
		System.out.println(obj1.getHeight());
		System.out.println(obj1.getVolume());
		
		Cylinder obj2 = new Cylinder(5.0,3.0);
		System.out.println(obj2);
		System.out.println(obj2.getRadius());
		System.out.println(obj2.getArea());
		System.out.println(obj2.getHeight());
		System.out.println(obj2.getVolume());
	}
}