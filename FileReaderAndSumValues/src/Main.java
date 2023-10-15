import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException
        {
            String str = "5\n10\n20\n12\n33";       //created string which will put in the file
            String path = "src/file.txt";           //where file will be created
            File file = new File (path);            //file path created

            try
                {
                    if ( !file.exists () )              //controls if file exists or not
                        {
                            FileWriter fileWriter = new FileWriter (file , true);           //Writes inside file
                            BufferedWriter bufferedWriter = new BufferedWriter (fileWriter);
                            bufferedWriter.write (str);
                            bufferedWriter.close ();
                        }
                } catch (IOException e)
                {
                    System.out.println (e.getMessage ());
                }


            FileReader fReader = new FileReader (file);                                     //reads file
            BufferedReader bufferedReader = new BufferedReader (fReader);
            String line;

            int sum = 0;

            while (( line = bufferedReader.readLine () ) != null)   //loop checks all filled line until hits null
                {
                    int a = Integer.parseInt (line);            //converts string to integer
                    sum += a;                                   //adds read numbers


                }
            System.out.println ("The sum of the values which are  inside of the created text is : " + sum);     // prints sum


        }
}
