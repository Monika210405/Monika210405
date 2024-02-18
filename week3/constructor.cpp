#include <iostream>
using namespace std;

class Student
{
  public:
    Student()
    {
      string collegeName="MVGR";
      int collegeCode=33;
      cout<<"CollegeName : "<<collegeName<<endl;
      cout<<"CollegeCode : "<<collegeCode<<endl;
    }
    Student(string fullName,double semPercentage)
    {
      cout<<"FullName : "<<fullName<<endl;
      cout<<"SemPercentage : "<<semPercentage<<endl;
    }
    ~Student(){}
};

int main()
{
  Student Mounika;
  string name;
  float val;
  cout<<"Enter the name : ";
  getline(cin,name);
  cout<<"Enter the sem percentage : ";
  cin>>val;
  Student Mounika01(name,val);
  return 0;
}
