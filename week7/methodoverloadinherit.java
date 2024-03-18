class student{
    String fullname;
    int rollnumber;
    String department;
    void get(String name,int roll,String dept)
    {
        fullname=name;
        rollnumber=roll;
        department=dept;
    }
}
class student1 extends student{
    String section;
    void get(String name,int roll,String dept,String sec)
    {
        fullname=name;
        rollnumber=roll;
        department=dept;
        section=sec;
    }
    void display()
    {
        System.out.println("Name : "+fullname);
        System.out.println("Rollnumber : "+rollnumber);
        System.out.println("Department : "+department);
        System.out.println("Section : "+section);
    }
}
public class methodoverloadinherit {
    public static void main(String[] args) {
        student1 s1 = new student1();
        s1.get("mounika",13,"cse");
        s1.display();
        student1 s2 = new student1();
        s2.get("mounika",13,"cse","A");
        s2.display();
    }
}
