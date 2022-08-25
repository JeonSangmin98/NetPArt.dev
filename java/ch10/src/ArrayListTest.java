import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Milk");
		list1.add("Bread");
		list1.add("Butter");
		
		list1.add(1, "Apple");
		list1.set(2, "Grape");
		
		for(String ele : list1) {
			System.out.println(ele);
		}System.out.println();
		
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("하나");
		list2.add("둘");
		list2.add("셋");
		list2.add("넷");
		
		String s;
		Iterator e = list2.iterator();
		while(e.hasNext()) {
			s = (String)e.next();	// 반복자는 Object 타입을 반환
			System.out.println(s);
		}
		
	}
}