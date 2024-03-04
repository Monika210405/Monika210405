#include<iostream>
using namespace std;

class Class1
{
    public:
        void class1()
        {
            cout<<"Iam Class1\n";
        }
};

class Class2: public Class1
{
    public:
        void class2()
        {
            cout<<"Iam Class2\n";
        }
};

class Class3: public Class1
{
    public:
        void class3()
        {
            cout<<"Iam Class3\n";
        }
};

class Class4: public Class3,public Class2
{
    public:
        void class4()
        {
            cout<<"Iam Class4\n";
        }
};

int main()
{
    Class4 obj1;
    //obj1.class1();
    //class1() method becomes ambiguous here
    obj1.class2();
    obj1.class3();
    obj1.class4();
    return 0;
}
