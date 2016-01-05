import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;


public class TextUserInterface implements UserInterface
{

    public void displayASCII()
    {
        String fileName = "ASCII.txt";

        String line = null;
        ArrayList<String> arrayList = new ArrayList<String>();
        try
        {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fileReader);
            while ((line = br.readLine()) != null)
            {
                arrayList.add(line);
            }
            br.close();
        }

        catch (FileNotFoundException ex)
        {
            //ui.displayException("a FileNotFoundException");
            System.exit(0);
        }

        catch (IOException e)
        {
            //ui.displayException("an IOException");
            System.exit(0);
        }

        for (int i=0; i<arrayList.size(); i++)
        {
            System.out.println(arrayList.get(i));
        }

    }

    public void displayCell(String cell)
    {
        System.out.print(cell);
    }

}


//Imports that will be needed later.
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.Writer;
//import java.io.PrintWriter;
//import java.io.OutputStreamWriter;
//import java.io.FileOutputStream;
//import java.io.FileWriter;
//import java.io.InputStreamReader;
//import java.util.List;
//import java.util.Scanner;
