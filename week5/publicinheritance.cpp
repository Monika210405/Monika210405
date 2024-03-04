#include<iostream>
using namespace std;

class SuperClass
{
    public:
        int publicVar=1;

    private:
        int privateVar=2;

    protected:
        int protectedVar=3;

    public:
        int getValprivate()
        {
            return privateVar;
        }
};

class SubClass: public SuperClass
{
    public:
        int var1=publicVar;
        int var2=protectedVar;
        int var3=getValprivate();
};


int main()
{
    SuperClass obj;
    SubClass obj1;
    /*cout<<"Public : "<<obj.publicVar<<endl;
    cout<<"Protected : "<<obj.privateVar<<endl;
    cout<<"Private : "<<obj.protectedVar<<endl;*/
    cout<<"Public Inheritance\n";
    cout<<"Public : "<<obj1.var1<<endl;
    cout<<"Protected : "<<obj1.var2<<endl;
    cout<<"Private : "<<obj1.var3<<endl;
    return 0;
}
