
class College
{
	int studentid;
	int branch;
	String name;
	College(){
		studentid = 1;
		branch = 3;
		name  = "Hello";
	}
	College(int studentid,int branch,String name)
	{
		this.studentid = studentid;
		this.branch = branch;
		this.name = name;
	}
	public void show() {
		System.out.println("Name of student is "+name);
		System.out.println("Student id "+studentid);
		System.out.println("Branch No of student is"+branch);
	}
}
public class ConsOverload {

	public static void main(String[] args) {
		College s1 = new College();
		College s2 = new College(5,4,"Rahul");
		s1.show();
		s2.show();
	}

}
