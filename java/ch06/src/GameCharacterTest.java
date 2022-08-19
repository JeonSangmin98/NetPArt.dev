import java.util.ArrayList;

class GameCharacter{
	private class GameItem{
		String name;
		int type,price;
		public int getPrice() {
			return price;
		}
		@Override
		public String toString() {
			return "GameCharacterItem [name=" + name + ", type=" + type + ", price=" + price + "]";
		}
	}// GameItem
	
	private ArrayList<GameItem> list = new ArrayList<>();
	
	public void add(String name, int type, int price) {
		GameItem item = new GameItem();
		item.name = name;
		item.type = type;
		item.price = price;
		list.add(item);
	}// add
	
	public void print() {
		int total = 0;
		for(GameItem item:list) {
			System.out.println(item);
			total += item.getPrice();
		}
		System.out.println(total);
	}
	
}// GameCharacter

public class GameCharacterTest {
	public static void main(String[] args) {
		GameCharacter charac = new GameCharacter();
		charac.add("Sword", 1, 100);
		charac.add("Sheild", 2, 50);
		charac.print();
	}
}