class Immutable{
    private final String a="Battula Mounika";
    Immutable(String a){
        //this.a=a;
    }
    void display(){
        System.out.println("Name : "+a);
    }
}
public class Main {
    public static void main(String[] args) {
      StringBuilder obj=new StringBuilder("Battula");
      obj.append(" ");
      obj.append("Mounika");
      String a=obj.toString();
      System.out.println("The final modified string : "+a);
      Immutable obj1=new Immutable("Vanitha");
      obj1.display();
    }
}
