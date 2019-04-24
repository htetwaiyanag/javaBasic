class Maths{
	
	public void add(int ... num) {
		
		int sum = 0;
		
		for(int a:num) {
			
			sum += a;
			
		}
		
		
		System.out.println(sum);
		
	}
}

public class VariableLengthArgumentDemo {

	public static void main(String[] args) {
		
		Maths num = new Maths();
		
		num.add(2,34,5435,3623,453,32,4,1);

	}

}
