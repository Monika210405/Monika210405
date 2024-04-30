class TDemo extends Thread{
  String name;
  TDemo(String name){
    this.name=name;
  }
  public void run(){
    System.out.println("My Name is "+name);
  }
}
public class Main{
  public static void main(String[] args){
    TDemo obj=new TDemo("B.Mounika");
    obj.start();
  }
}
