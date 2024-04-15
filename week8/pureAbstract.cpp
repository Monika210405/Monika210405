#include<iostream>

using namespace std;

class Shapes
{
    private:
    virtual float area()=0;
};
class Triangle: public Shapes
{
    public:
    float b,h;
    Triangle(float base,float height)
    {
        b=base;
        h=height;
    }
    float area()
    {
        return 0.5*b*h;
    }
};
class Circle: public Shapes
{
    public:
    float r;
    Circle(float radius)
    {
        r=radius;
    }
    float area()
    {
        return 3.14*r*r;
    }
};
int main()
{
    Triangle tri(6,4);
    Circle cir(8.5);
    cout<<"The area of Triangle : "<<tri.area()<<endl;
    cout<<"The area of a Circle: "<<cir.area()<<endl;
    return 0;
}
