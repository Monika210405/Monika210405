abstract class Shape
{
    abstract float area();
    void display()
    {
        System.out.println("These are the shapes");
    }
}
class Rectangle extends Shape
{
    float a,b;
    Rectangle(float base,float height)
    {
        a=base;
        b=height;
    }
    public float area()
    {
        return a*b;
    }
}
class Triangle extends Shape
{
    float a,b;
    Triangle(float base,float height)
    {
        a=base;
        b=height;
    }
    public float area()
    {
        return (float)0.50*a*b;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Rectangle obj=new Rectangle(16,25);
        Triangle obj1=new Triangle(10,6);
        System.out.println("The area of a Rectangle : "+obj.area());
        System.out.println("The area of a Triangle : "+obj1.area());
    }
}
