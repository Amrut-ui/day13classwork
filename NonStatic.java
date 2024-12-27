package day13;

public class NonStatic {
	//non static variable
	String name ="amrut desale";
	static String name1 ="chetan sir";
	//non static method
	public void display() {
		System.out.println(this.name);
	}
	public static void print() {
		System.out.println(name1);
	}

	public static void main(String[] args) {
		//using non-static
		NonStatic n = new NonStatic();
		n.display();
		//using Static
		NonStatic.print();
		
		
		
	}

}
