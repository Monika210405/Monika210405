import java.util.Scanner;
class Student
{
  public
    Student()
    {
      String collegeName="MVGR";
      int collegeCode=33;
      System.out.print("CollegeName : "+collegeName+"\n"+"CollegeCode : "+collegeCode+"\n");
    }
    Student(String fullName,double semPercentage)
    {
      System.out.print("FullName : "+fullName+"\n"+"SemPercentage : "+semPercentage+"\n");
    }
}

public class Constructor
{
  public static void main(String[] args)
  {
    @SuppressWarnings("unused")
    Student monika=new Student();
    @SuppressWarnings("unused")
    String name;
    double percentage;
    Scanner input=new Scanner(System.in);
    System.out.print("Enter your sweet name : ");
    name=input.nextLine();
    System.out.print("Enter your semPercentage : ");
    percentage=input.nextDouble();
    Student monika01=new Student(name,percentage);
  }
}
