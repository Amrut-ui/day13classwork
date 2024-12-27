package day13;

public class StaticDemo {
    //Static Variabal
   public static int no=20;
	//instance Variable
	public static int no1=25;
	
	
	static class InnerClass{
		public  void display() {
			 System.out.println("no is"+no+"no1 is"+no1);
		 }
		 
	}
  static void testClass(){
		InnerClass one = new InnerClass();
		one.display();
	}
	
	public static void main(String[] args) {
		
		StaticDemo.testClass();
	}
}