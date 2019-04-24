
public class TwoDArrayDemo {

	public static void main(String[] args) {
		
		int arr[][] = {
				
				{1,5},
				{2,4,6,8,},
				{10,20,30}
		};
		
		
		for(int row=0;row<arr.length;row++) {
			
			for(int col=0;col<arr[row].length;col++) {
				
				System.out.print(" "+arr[row][col]);
			}
			
			System.out.println();
		}
	}

}
