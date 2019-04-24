class Outer{
	
	int a;
	public void display() {
		
		System.out.println("hello");
	}
	
	static class Inner{
		
		public void display() {
			
			System.out.println("Hello world");
		}
	}
}
public class InnderDemo {

	public static void main(String[] args) {
		
		Outer obj = new Outer();
		
		obj.display();
		
		Outer.Inner obj1 = new Outer.Inner();
		
		obj1.display();

	}

}
