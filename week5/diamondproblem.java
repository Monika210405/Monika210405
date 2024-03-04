class Class1
{
    public
        void class1()
        {
            System.out.print("Iam Class1\n");
        }
};

class Class2 extends Class1
{
    public
        void class2()
        {
            System.out.print("Iam Class2\n");
        }
};

class Class3 extends Class1
{
    public
        void class3()
        {
            System.out.print("Iam Class3\n");
        }
};

/*class Class4 extends Class2,Class3
{
    public
        void class4()
        {
            System.out.print("Iam Class4\n");
        }
};*/

public class DiamondProblem
{
    
    public static void main(String[] args)
    {
        System.out.print("Diamond Problem\n");
        Class2 obj=new Class2();
        Class3 obj1=new Class3();
        obj.class1();
        obj.class2();
        obj1.class1();
        obj1.class3();
    }
}
