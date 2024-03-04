class Class1
{
    public
        void class1()
        {
            System.out.print("Iam a class1"+"\n");
        }
}

class Class2 extends Class1
{
    public
        void class2()
        {
            System.out.print("Iam a class2"+"\n");
        }
}

class Class3 extends Class1
{
    public
        void class3()
        {
            System.out.print("Iam a class3"+"\n");
        }
}

class Class4 extends Class2
{
    public
        void class4()
        {
            System.out.print("Iam a class4"+"\n");
        }
}

class Class5 extends Class1,Class2
{
    
}
/*Java doesnt support Multiple Inheritance and Hybrid Inheritance.*/

public class InheritanceTypes
{
    public static void main(String[] args)
    {
        System.out.print("Simple Inheritance"+"\n");
        Class2 class1=new Class2();
        class1.class1();
        class1.class2();
        System.out.print("Hierarichal Inheritance"+"\n");
        Class3 class2=new Class3();
        class1.class1();
        class1.class2();
        class2.class1();
        class2.class3();
        System.out.print("Multi-Level Inheritance"+"\n");
        Class4 class3=new Class4();
        class3.class1();
        class3.class2();
        class3.class4();
        /*Java does not support multiple inheritances to avoid the diamond problem 
        which causes complexity and ambiguity. Well we can acheive multiple inheritance by the concept of interface.*/
    }
}
