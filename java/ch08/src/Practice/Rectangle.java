package Practice;

interface GraphicsObject{
	int getArea();
	void draw();
}
public class Rectangle implements GraphicsObject{
	private int length;
	private int width;

	void setDimensions(int l, int w) {
		length = l;
		width = w;
	}

	@Override
	public int getArea() {
		return length * width;
	}

	@Override
	public void draw() {
		System.out.println("사각형");
	}
}
