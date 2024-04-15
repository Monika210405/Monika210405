#include<iostream>

using namespace std;

template <typename Digit> Digit add(Digit n1,Digit n2)
{
    return n1+n2;
}

template <typename Temp>
class Report
{
    Temp val;
    public:
    Report(Temp n1)
    {
        val=n1;
    }
    void displayValue()
    {
        cout<<"The value is "<<val<<endl;
    }
};
int main()
{
    int intResult=add(5,9);
    float floatResult=add(9.5,8.7);
    cout<<"Sum of the values : "<<intResult<<endl;
    cout<<"Sum of the values : "<<floatResult<<endl;
    Report <int>obj(2);
    Report <double>obj2(8.34535353);
    obj.displayValue();
    obj2.displayValue();
    return 0;
}
