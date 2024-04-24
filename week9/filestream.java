import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile
{
  public static void main(String[] args)
  {
    try
    {
      FileInputStream fin=new FileInputStream("source") ;
      FileOutputStream fout=new FileOutputStream("Destination");
      while(fin.available()!=0)
      {
        fout.write(fin.read());
      }
      fin.close();
      fout.close();
    }
    catch(FileNotFoundException obj)
    {
      System.out.println(“Invalid file name”);
    }
    catch(IOException obj)
    {
      System.out.println(“Invalid input or output”);
    }
  }
}
