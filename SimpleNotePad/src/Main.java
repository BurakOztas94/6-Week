import java.io.IOException;


public class Main {
    public static void main (String[] args) throws IOException
        {
                    NotePad.createFile ();  // this method creates file and writes in it
                    System.out.println ("**********************");
                    NotePad.readFile ();      // this method reads the file we created and prints in console

        }
}
