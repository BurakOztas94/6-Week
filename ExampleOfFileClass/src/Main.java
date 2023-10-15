import java.io.*;

public class Main {
    public static void main (String[] args)
        {

            String text =" OutputStream learning .\nPatika Dev";
            try
                {
                    FileOutputStream output= new FileOutputStream ("patika.txt",false);
                   byte [] textByte= text.getBytes ();
                   output.write (textByte);
                   output.close ();
                } catch (IOException e)
                {
                    System.out.println (e.getMessage ());
                }


        }

}
