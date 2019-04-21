
public class NestedLoop {
	
	public static void main(String args[])
	{
		//four rows four columns
		for(int n=0;n<4;n++)
		{
			for(int i=0;i<4;i++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//number pyramid
		for(int a=1;a<=6;a++)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(b+" ");
			}
			System.out.println();
		}
		
		//alphabet pyramid
		String[] alphabets= {"A ","B ","C"};
		for(int b=0;b<=2;b++)
		{
			for(int a=0;a<=b;a++)
			{
				System.out.print(alphabets[a]);
			}
			System.out.println();
		}
		
		//dollar sign with a hole
		for(int a=0;a<4;a++)
		{
			for(int b=0;b<4;b++)
			{
				if( (a==1&&b==1) || (a==1&&b==2) || (a==2&&b==1) || (a==2&&b==2))
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print("$ ");
				}
				
			}
			System.out.println();
			
		}
		
		
		
		
		
	}
		
}
