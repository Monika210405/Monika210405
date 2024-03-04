class HumanParent
{
    public
        void displayBreed()
        {
            System.out.println("I belong to the omnivore type.\nI belong to genus Homo.");
        }
        void eat()
        {
            System.out.println("I eat both plants and meat.");
        }

}

class HumanChild extends HumanParent
{
    public
        void play()
        {
            System.out.println("I play a lot.\nIt helps me to relax my body and sharpen my brain.");
        }
        void skills()
        {
            System.out.println("With skills I learn, I can do whatever I want legally.");
        }
}

class SimpleInheritance
{
    public static void main(String[] args)
    {
        //HumanParent obj=new HumanParent();
        HumanChild obj=new HumanChild();
        obj.displayBreed();
        obj.eat();
        obj.play();
        obj.skills();
    }
}
