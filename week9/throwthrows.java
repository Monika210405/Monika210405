class GroceryException extends Exception{
  GroceryException(){
    System.out.println("The quality of the groceries is not good\nVery disappointed.");
  }
}
public class Main {
  public static void main(String[] args) throws GroceryException{
    int groceryQuality=50;
    if(groceryQuality>70){
      System.out.println("Quality of the groceries are very nice:");
    }
    else{
      try{
        throw new GroceryException();
      }catch(GroceryException e){
      }
    }
  }
}
