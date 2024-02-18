#include<iostream>
using namespace std;

inline void displayWelcomeMessage()
{
    cout<<"Wlcome to oops!!"<<endl;
}

class Box
{
    private:
        float l;
        float w;
        float h;
    public:
        void boxArea(float l,float w,float h)
        {
            cout<<"The area of the box : "<<2*((l*w)+(w*h)+(h*l))<<endl;
        }
        void boxVolume(float l,float b,float h);
        friend void displayBoxDimensions(Box d);
        void set(float length,float width,float height)
        {
            l=length;
            w=width;
            h=height;
        }
};

void displayBoxDimensions(Box d)
{
    cout<<"The dimensions of the box : "<<d.l<<" X "<<d.w<<" X "<<d.h<<endl;
}

void Box::boxVolume(float l,float b,float h)
{
    cout<<"The volume of the box : "<<l*b*h<<endl;
}

int main()
{
    Box b;
    float length,width,height;
    cout<<"Enter the length, width, and height : ";
    cin>>length>>width>>height;
    b.set(length,width,height);
    b.boxArea(length,width,height);
    b.boxVolume(length,width,height);
    displayBoxDimensions(b);
    displayWelcomeMessage();
    return 0;
}
