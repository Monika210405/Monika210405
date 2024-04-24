import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Main{
  public static void main(String[] args){
    try{
      Class.forName("com.mysql.jdbc.Driver");
      Connection
     connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/moni","root","pass");
      System.out.println("Connection established.");
      connect.close();
      }catch(ClassNotFoundException e){
        System.out.println("Database is not connected.");
      }catch (SQLException e) {
        e.printStackTrace();
      }
      try{
        int a[]={1,2,3,4};
        System.out.println(a[6]);
      }catch(IndexOutOfBoundsException e){
        System.out.println("Index given here is out of range.");
      }
      try{
        Integer num=null;
        System.out.println(num.intValue());
      }catch(NullPointerException e){
        System.out.println("Here the value is not assigned.");
      }
      try{
        int a=29/0;
        System.out.println(a);
      }catch(ArithmeticException e){
        System.out.println("Division by zero is not at all possible.");
      }
   }
}
