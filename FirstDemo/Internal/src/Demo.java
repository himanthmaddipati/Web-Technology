class College1
{ 
//outer class
	static String name = "VNR";
	public void test( ){
	System.out.println("College name :"+name);
	}
	static class Student
	{ //outer class(non-static)
		String name = "Apple";
		String rollno = "22071a6901";
		public void disply( ){
			System.out.println("Student name :"+name);
			System.out.println("Student rollno :"+rollno);
			}
	}
}
class Demo{
public static void main(String[] args) {
College1 c = new College1( ); //object for outer class
c.test( );
College1.Student s = new College1.Student( ); //object for inner class
s.disply( );
}
}

