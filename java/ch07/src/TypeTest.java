class A{
	
}
class B{
	
}
class C extends A{
	
}
public class TypeTest {
	public static void main(String[] args) {
//		A a1 = new B();	// no
		A a2 = new C();	// yes, 상속을 받으면 참조 가능
	}
}