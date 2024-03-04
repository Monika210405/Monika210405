#include<iostream>
using namespace std;

class Class1
{
    public:
        void class1()
        {
            cout<<"Iam a Class1\n";
        }
};

class Class2
{
    public:
        void class2()
        {
            cout<<"Iam a Class2\n";
        }
};

class Class3: public Class1,public Class2
{
    public:
        void class3()
        {
            cout<<"Iam a Class3\n";
        }
};

class Class4: public Class1
{
    public:
        void class4()
        {
            cout<<"Iam a Class4\n";
        }
};

class Class5: public Class3,public Class4
{
    public:
        void class5()
        {
            cout<<"Iam a Class5\n";
        }
};

class Class6: public Class4
{
    public:
        void class6()
        {
            cout<<"Iam a Class6\n";
        }
};

class Class7:public Class1
{
    public:
        void class7()
        {
            cout<<"Iam a Class7\n";
        }
};
class Class8:public Class1
{
    public:
        void class8()
        {
            cout<<"Iam a Class8\n";
        }
};

int main()
{
    cout<<"Simple Inheritance\n";
    Class4 obj1;
    obj1.class1();
    obj1.class4();
    cout<<"Multiple Inheritance\n";
    Class3 obj2;
    obj2.class1();
    obj2.class2();
    obj2.class3();
    cout<<"Multi-Level Inheritance\n";
    Class6 obj3;
    obj3.class1();
    obj3.class4();
    obj3.class6();
    cout<<"Hierarichal Inheritance\n";
    Class7 obj4;
    Class8 obj5;
    obj4.class1();
    obj4.class7();
    obj5.class1();
    obj5.class8();
    cout<<"Hybrid Inheritance\n";
    Class5 obj6;
    obj6.class1();
    //class1() method is ambiguous here.
    obj6.class2();
    obj6.class3();
    obj6.class4();
    obj6.class5();
    return 0;
}
