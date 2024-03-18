#include<iostream>
using namespace std;

class multiplication{
    public:
        int multi(int a,int b)
        {
            //return a*b;
        }
        float multi(float a,float b,float c)
        {
            return a*b*c;
        }
        double multi(double a,double b,double c,double d)
        {
            return a*b*c*d;
        }
};

int main()
{
    multiplication obj;
    cout<<obj.multi(1,2)<<endl;
    cout<<obj.multi(0.2,0.5,0.23)<<endl;
    cout<<obj.multi(12.33,1.456672,23.458836,0.3476)<<endl;
}
