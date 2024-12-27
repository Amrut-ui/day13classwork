package day13;

public class StaticMethod {

public static int roll = 24;
static class InnerClass{
	public  void display() {
		System.out.println("the roll no is"+roll);
	}
	
	
}
static void testamrut() {
	InnerClass a = new InnerClass();
	a.display();
}
	public static void main(String[] args) {
		testamrut();
		

	}

}
