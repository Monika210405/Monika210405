class main{
    public void displaymsg()
    {
        System.out.println("welcome to mainclass");
    }
}
class subclass extends main{
    public void displaymsg()
    {
        System.out.println("welcome to subclass");
    }
}
public class methodoverride{
    public static void main(String[] args) {
        subclass obj = new subclass();
        obj.displaymsg();
    }
}
