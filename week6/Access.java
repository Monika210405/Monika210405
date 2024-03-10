import java.util.Scanner;
class AccessSpecifierDemo
{
    private
        int privateVar;
    protected
        int protectedVar;
    public
        int publicVar;
    public
        void setVar(int priv,int protect,int pub)
        {
            privateVar=priv;
            protectedVar=protect;
            publicVar=pub;
        }
        void getVar()
        {
            System.out.print("Public : "+publicVar+"\n");
            System.out.print("Protected : "+protectedVar+"\n");
            System.out.print("Private : "+privateVar+"\n");
        }
}

public class Main
{
    public static void main(String[] args)
    {
        int private1,public1,protected1;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the values of Public, Protected and Private : ");
        public1=input.nextInt();
        protected1=input.nextInt();
        private1=input.nextInt();
        input.close();
        AccessSpecifierDemo obj=new AccessSpecifierDemo();
        obj.setVar(private1,protected1,public1);
        System.out.print("The values"+"\n");
        obj.getVar();
    }
}
