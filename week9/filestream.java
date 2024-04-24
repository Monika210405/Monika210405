import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        FileInputStream filein =null;
        FileOutputStream fileout=null;
        try{
            filein =new FileInputStream("fileIn.txt");
            fileout=new FileOutputStream("fileOut.txt");
            try {
                System.out.println("Total Number of Bytes : "+filein.available());
                int i;
                while ((i=filein.read())!=-1) {
                    fileout.write(i);
                }
                filein.close();
                fileout.close();
            } catch (IOException e) {
                System.out.println("An error occurred while performing input/output operations.");
            }
        }catch(FileNotFoundException e){
            System.out.println("The File is not found here");
        }
    }
}
