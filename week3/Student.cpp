#include <iostream>
using namespace std;

class Student
{
  public:
    string fullName;
    int rollNum;
    double semPercentage;
    string collegeName;
    int collegeCode;
    Student()
    {
      cout<<"Student class initialized\n";
    }
    ~Student(){}
};

int main()
{
  Student Mounika;
  cout<<"Enter your name : ";
  getline(cin,Mounika.fullName);
  cout<<"Enter the roll number : ";
  cin>>Mounika.rollNum;
  cout<<"Enter the sem percentage : ";
  cin>>Mounika.semPercentage;
  cout<<"Enter the college name : ";
  cin>>Mounika.collegeName;
  cout<<"Enter college code : ";
  cin>>Mounika.collegeCode;
  cout<<"Name : "<<Mounika.fullName<<endl;
  cout<<"RollNum : "<<Mounika.rollNum<<endl;
  cout<<"SemPercentage : "<<Mounika.semPercentage<<endl;
  cout<<"CollegeName : "<<Mounika.collegeName<<endl;
  cout<<"CollegeCode : "<<Mounika.collegeCode<<endl;
  return 0;
}
