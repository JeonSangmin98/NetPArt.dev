import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Milk");
		list.add("Bread");
		list.add("Butter");
		
		list.add(1, "Apple");
		list.set(2, "Grape");
		list.remove(3);
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}