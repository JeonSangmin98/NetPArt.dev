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
	
	
	Box whoLargest(Box box1, Box box2) {
		if(box1.volume > box2.volume)
			return box1;
		else
			return box2;
	}
	@Override
	public String toString() {
		return "Box [width=" + width + ", height=" + height + ", length=" + length + "]";
	}
	
	boolean isSameBox(Box obj) {
		if((obj.width == this.width) & (obj.length == this.length)
				& (obj.height == this.height))
			return true;
		else
			return false;
	}
}