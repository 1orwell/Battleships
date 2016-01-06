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

    public void displayRow(Row row)
    {
        for (String cell : row.getRowArray())
        {
            System.out.print("|");
            System.out.print(cell);
            System.out.print("| ");
        }
        System.out.println("\n ------------------------------------------");
    }

    public void displayBoard(Row row1, Row row2, Row row3, Row row4, Row row5,
                Row row6, Row row7, Row row8, Row row9, Row row10)
    {
        UserInterface ui = new TextUserInterface();
        System.out.print("    |A| |B| |C| |D| |E| |F| |G| |H| |I| |J|");
        System.out.println("\n ------------------------------------------");
        System.out.print("1 | ");
        ui.displayRow(row1);
        System.out.print("2 | ");
        ui.displayRow(row2);
        System.out.print("3 | ");
        ui.displayRow(row3);
        System.out.print("4 | ");
        ui.displayRow(row4);
        System.out.print("5 | ");
        ui.displayRow(row5);
        System.out.print("6 | ");
        ui.displayRow(row6);
        System.out.print("7 | ");
        ui.displayRow(row7);
        System.out.print("8 | ");
        ui.displayRow(row8);
        System.out.print("9 | ");
        ui.displayRow(row9);
        System.out.print("10| ");
        ui.displayRow(row10);
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
