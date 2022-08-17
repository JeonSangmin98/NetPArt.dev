public class Box {
	// - : private , + : public
	private int width,height,length,volume;
	
	Box(int w, int l, int h){
		width = w;
		length = l;
		height = h;
		volume = width*length*height;
	}
	public int getVolume() {
		return volume;
	}
	void print() {
		System.out.println("상자의 부피는 " + getVolume()
		+ "입니다.");
	}
}