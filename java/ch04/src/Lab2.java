
public class Lab2 {

	public static void main(String[] args) {
		String[] toppings =  {"Pepperoni","Mushrooms","Onions","Sausage","Bacon"};
		for(int i=0;i<toppings.length; i++) {
			System.out.print(toppings[i]+" ");
		}
		// for each 문
		for(String value : toppings) {
			System.out.print(value + " ");
		}
	}

}
