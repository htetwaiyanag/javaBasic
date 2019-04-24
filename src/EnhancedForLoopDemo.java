
public class EnhancedForLoopDemo {

	public static void main(String[] args) {
		
		int oneD[] = { 1,2,3,4,5 };
		int twoD[][] = {
			
				{1,2,3},
				{4,5,6}
		};
		
		for(int a:oneD) {
			
			System.out.print(a);;
		}
		
		System.out.println();
		for(int b[]:twoD) {
			
			for(int c:b) {
				
				System.out.print(c);
			}
			
			System.out.println();
		}
	}

}
