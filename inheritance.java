class college{
    int stdid;
    int dept;
    college(int stdid,int dept)
    {
        this.stdid = stdid;
        this.dept = dept;
    }
}

class dept{
    int deptid;
    int marks;
    dept(int stdid,int dept,int marks,int deptid)
    {
        super(stdid,dept);
        this.marks = marks;
        this.deptid = deptid;
    }
}
class inheritance {

    college himanth = new dept(1, 5,100, 5);
    System.out.print(himanth.marks);
}
