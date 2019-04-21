class Calc3
{
	int num1;
	int num2;
	
	public Calc3(int num1,int num2)
	{
		this.num1 = num1;
		this.num2= num2;
	}
	
}
public class ThisKeywordDemo {
	
	public static void main(String args[])
	{
		
		Calc3 obj = new Calc3(3,5);
		System.out.println(obj.num1);
	}

}
