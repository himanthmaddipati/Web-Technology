class Student
{
  int sno,tot;
  String name;
  static int grandtot;
  Student(int sno,String name,int tot)
  {
    this.sno=sno;
    this.name=name;
    this.tot=tot;
  }  
  static void display()
  {
     int a=1;
    System.out.println("class total :"+grandtot);
    System.out.println("class total :"+a);
  }
  public void show()
  {
   System.out.println("student serial number:"+sno); 
   System.out.println("student name :"+name);
   System.out.println("student total :"+tot);
   grandtot+=tot;
  }
}

class Static1Example 
{
  public static void main(String args[])
  {
    Student s1=new Student(1,"siva",90);
    Student s2=new Student(2,"sai",80);
    Student s3=new Student(3,"hari",85); 
    s1.show();
    s2.show();
    s3.show();
    Student.display(); 
    System.out.println("student total :"+Student.grandtot);
 }
}
