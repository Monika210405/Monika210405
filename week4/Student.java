import java.util.Scanner;

class Student13
{
  public
    String fullName;
    int rollNum;
    double semPercentage;
    String collegeName;
    int collegeCode;
    Student13()
    {
      System.out.print("Student class is created!!\nIam a student\n");
    }
    protected void finalize() throws Throwable
    {
      System.out.print("The class is finalized\n");
    }
}

public class Student
{
  public static void main(String[] args)
  {
    Student13 monika=new Student13();
    Scanner input=new Scanner(System.in);
    System.out.print("Enter your sweet name : ");
    monika.fullName=input.nextLine();
    System.out.print("Enter your rollNumber : ");
    monika.rollNum=input.nextInt();
    System.out.print("Enter your semPercentage : ");
    monika.semPercentage=input.nextDouble();
    input.nextLine();
    System.out.print("Enter your collegeName : ");
    monika.collegeName=input.nextLine();
    System.out.print("Enter your collegeCode : ");
    monika.collegeCode=input.nextInt();
    System.out.print("Name : "+monika.fullName+"\n");
    System.out.print("RollNumber : "+monika.rollNum+"\n");
    System.out.print("SemPercentage : "+monika.semPercentage+"\n");
    System.out.print("CollegeName : "+monika.collegeName+"\n");
    System.out.print("CollegeCode : "+monika.collegeCode+"\n");
    input.close();
  }
}
