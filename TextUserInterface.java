import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


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

    public void displayBoard(Board board)
    {
        UserInterface ui = new TextUserInterface();
        System.out.print("\n    |A| |B| |C| |D| |E| |F| |G| |H| |I| |J|");
        System.out.println("\n ------------------------------------------");
        System.out.print("1 | ");
        ui.displayRow(board.getRow1());
        System.out.print("2 | ");
        ui.displayRow(board.getRow2());
        System.out.print("3 | ");
        ui.displayRow(board.getRow3());
        System.out.print("4 | ");
        ui.displayRow(board.getRow4());
        System.out.print("5 | ");
        ui.displayRow(board.getRow5());
        System.out.print("6 | ");
        ui.displayRow(board.getRow6());
        System.out.print("7 | ");
        ui.displayRow(board.getRow7());
        System.out.print("8 | ");
        ui.displayRow(board.getRow8());
        System.out.print("9 | ");
        ui.displayRow(board.getRow9());
        System.out.print("10| ");
        ui.displayRow(board.getRow10());
    }

    public void clearScreen()
    {
        System.out.print(Constants.ANSI_CLS + Constants.ANSI_HOME);
        System.out.flush();
    }

    public void displayPlayer1()
    {
        System.out.println("Hello player1, this is your board.");
    }

    public void displayPlayer2()
    {
        System.out.println("Hello player2, this is your board.");
    }

    public String getStringInput() {
        Scanner user_input = new Scanner(System.in);
        String input = user_input.next();
        return input;
    }

    public int getIntInput() {
        Scanner user_input = new Scanner(System.in);
        String strInput = user_input.next();
        int input = Integer.parseInt(strInput);
        return input;
    }

    public ArrayList<String> getBattleship()
    {
        System.out.println("Which cell would you like one of your battleships to start in?");
        System.out.println("Write it like 'row2 F'");
        String cell = getStringInput();
        System.out.println("Would you like it to fill 2, 3 or 4 cells?");
        int length = getIntInput();
        String lengthStr = Integer.toString(length);
        System.out.println("Would you like it to be verical(v) or horizontal(h)?");
        String orientation = getStringInput();
        ArrayList<String> ship = new ArrayList<String>();
        ship.add(cell);
        ship.add(lengthStr);
        ship.add(orientation);
        return ship;
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
