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

    public void displayBoard(String[][] board)
    {
        UserInterface ui = new TextUserInterface();
        System.out.print("\n   |A| |B| |C| |D| |E| |F| |G| |H| |I| |J|");
        System.out.println("\n ------------------------------------------");
        System.out.print("\n1 |");
        for (int a=0; a<10; a++)
        {
            System.out.print(board[a][0]);
            System.out.print("|");
        }
        System.out.print("\n2 |");
        for (int b=0; b<10; b++)
        {
            System.out.print(board[b][1]);
            System.out.print("|");
        }
        System.out.print("\n3 |");
        for (int c=0; c<10; c++)
        {
            System.out.print(board[c][2]);
            System.out.print("|");
        }
        System.out.print("\n4 |");
        for (int d=0; d<10; d++)
        {
            System.out.print(board[d][3]);
            System.out.print("|");
        }
        System.out.print("\n5 |");
        for (int e=0; e<10; e++)
        {
            System.out.print(board[e][4]);
            System.out.print("|");
        }
        System.out.print("\n6 |");
        for (int f=0; f<10; f++)
        {
            System.out.print(board[f][5]);
            System.out.print("|");
        }
        System.out.print("\n7 |");
        for (int g=0; g<10; g++)
        {
            System.out.print(board[g][6]);
            System.out.print("|");
        }
        System.out.print("\n8 |");
        for (int h=0; h<10; h++)
        {
            System.out.print(board[h][7]);
            System.out.print("|");
        }
        System.out.print("\n9 |");
        for (int i=0; i<10; i++)
        {
            System.out.print(board[i][8]);
            System.out.print("|");
        }
        System.out.print("\n10|");
        for (int j=0; j<10; j++)
        {
            System.out.print(board[j][9]);
            System.out.print("|");
        }
        System.out.println("\n");
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
        System.out.println("Write it like '2F' if you want to fill cell 2F");
        String cell = getStringInput();
        System.out.println("Would you like it to fill 2, 3 or 4 cells?");
        int length = getIntInput();
        String lengthStr = Integer.toString(length);
        boolean validInput = false;
        String orientation = "";
        while (!validInput)
        {
            System.out.println("Would you like it to be verical(v) or horizontal(h)?");
            orientation = getStringInput();
            if (orientation.equals("v") || orientation.equals("h"))
            {
                validInput = true;
            }
        }
        ArrayList<String> ship = new ArrayList<String>();
        ship.add(cell); // first cell of ship
        ship.add(lengthStr); // length of ship
        ship.add(orientation); // whether ship is vertical or horizontal
        return ship;
    }

    public void displayOutOfRange()
    {
        System.out.println("The ship you entered would not fit on the board. Please try again.");
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
