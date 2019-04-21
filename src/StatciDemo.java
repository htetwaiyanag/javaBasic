class Employee
{
	
	static int e_id;
	int e_name;
	int salary;
	static String company_name;
	
	static {
		company_name = "Delivery Service";
		e_id=1;
	}
}


public class StatciDemo {
	
	public static void main(String args[])
	{
		
		Employee me=new Employee();
		
		System.out.println(Employee.company_name);
		
		System.out.print(me.e_id);
		
	}

}
