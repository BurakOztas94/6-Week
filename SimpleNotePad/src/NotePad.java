import java.io.*;
import java.util.Scanner;

public class NotePad {
    public static String fileName = "Your text.txt";

    public static StringBuilder notePadCreator ()                // this method takes all inputs lines until you press -1
    {
        Scanner scan = new Scanner (System.in);
        System.out.println ("You can write until you press -1, in the last line alone");
        System.out.println ("Please enter a text : ");

        StringBuilder text = new StringBuilder ();

        while (true)
            {
                String input = scan.nextLine ();

                if ( input.equals ("-1") )
                    {
                        break;
                    }
                text.append (input).append ("\n");

            }

        scan.close ();
        return text;
    }

    public static void createFile () throws IOException         //file creater
        {

            FileWriter fileWriter = new FileWriter (fileName);       //function that  creates and writes on file writer
            PrintWriter printWriter = new PrintWriter (fileWriter);
            printWriter.print (notePadCreator ());
            printWriter.close ();


        }

    public static void readFile () throws IOException
        {
            FileReader fileReader = new FileReader (fileName);
            BufferedReader bufferedReader = new BufferedReader (fileReader);

            String readText;
            while (( readText = bufferedReader.readLine () ) != null)
                {
                    if ( readText.isEmpty () )
                        {
                            break;
                        }
                    System.out.println (readText);

                }

            bufferedReader.close ();
        }


}
