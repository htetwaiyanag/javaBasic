class Student{
	
	int stu_id;
	String name;
	
	public void setInformation(int stu_id,String name) {
		
		this.stu_id = stu_id;
		this.name = name;
	}
	
	public void showInformation() {
		
		System.out.println(stu_id+name);
	}
}

public class OneDArrayDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		Student student[]= {s1,s2,s3};
		
		student[0].setInformation(1, "htet wai yan aung");
		student[1].setInformation(2, "tun tun");
		student[2].setInformation(3, "kyaw kyaw");
		
		for(int i=0;i<3;i++) {
			
			student[i].showInformation();
		}

	}

}
