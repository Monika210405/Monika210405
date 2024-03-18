#include<iostream>

using namespace std;

class complex{
    public:
        int real;
        int imag;
    public:
        complex(){}
        complex(int r,int i)
        {
            real=r;
            imag=i;
        }
    complex operator+(complex obj)
    {
        complex temp;
        temp.real = real + obj.real;
        temp.imag = imag + obj.imag;
        return temp;
    }
    void print() { cout << real << " + i" << imag << '\n'; }
};
 
int main()
{
    complex c1(13,32), c2(11,45);
    complex c3 = c1 + c2;
    c3.print();
}
