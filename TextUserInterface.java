import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;


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

    public ArrayList<String> getPossibleLetters()
    {
        ArrayList<String> possibleLetters = new ArrayList<String>();
        possibleLetters.add("A");
        possibleLetters.add("B");
        possibleLetters.add("C");
        possibleLetters.add("D");
        possibleLetters.add("E");
        possibleLetters.add("F");
        possibleLetters.add("G");
        possibleLetters.add("H");
        possibleLetters.add("I");
        possibleLetters.add("J");
        return possibleLetters;
    }

    public ArrayList<String> getPossibleNumbers()
    {
        ArrayList<String> possibleNumbers = new ArrayList<String>();
        possibleNumbers.add("1");
        possibleNumbers.add("2");
        possibleNumbers.add("3");
        possibleNumbers.add("4");
        possibleNumbers.add("5");
        possibleNumbers.add("6");
        possibleNumbers.add("7");
        possibleNumbers.add("8");
        possibleNumbers.add("9");
        possibleNumbers.add("10");
        return possibleNumbers;
    }

    public ArrayList<String> getBattleship()
    {
        boolean validInput = false;
        ArrayList<String> possibleLetters = getPossibleLetters();
        ArrayList<String> possibleNumbers = getPossibleNumbers();
        String cell = "";
        System.out.println("Which cell would you like one of your battleships to start in?");
        while (!validInput)
        {
            System.out.println("Write it like '2F' if you want to fill cell 2F");
            cell = getStringInput();
            cell = cell.toUpperCase();
            String[] cellArray = cell.split("(?!^)");
            if (cellArray.length == 3 && cellArray[0].equals("1") && cellArray[1].equals("0"))
            {
                if (possibleLetters.contains(cellArray[2]))
                {
                    validInput = true;
                }
            }
            else if (cellArray.length == 2)
            {
                if (possibleNumbers.contains(cellArray[0]) && possibleLetters.contains(cellArray[1]))
                {
                    validInput = true;
                }
            }
            if (!validInput)
            {
                System.out.println("You did not enter a valid input, please try again.");
            }
        }
        validInput = false;
        ArrayList<Integer> possibleLengths = new ArrayList<Integer>();
        possibleLengths.add(2);
        possibleLengths.add(3);
        possibleLengths.add(4);
        String lengthStr = "";
        while (!validInput)
        {
            System.out.println("Would you like it to fill 2, 3 or 4 cells?");
            int length = getIntInput();
            if (possibleLengths.contains(length))
            {
                validInput = true;
                lengthStr = Integer.toString(length);
            }
            if (!validInput)
            {
                System.out.println("You did not enter a valid input, please try again.");
            }
        }
        validInput = false;
        String orientation = "";
        while (!validInput)
        {
            System.out.println("Would you like it to be verical(v) or horizontal(h)?");
            orientation = getStringInput();
            if (orientation.equals("v") || orientation.equals("h"))
            {
                validInput = true;
            }
            if (!validInput)
            {
                System.out.println("You did not enter a valid input, please try again.");
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

    public void isReady()
    {
        boolean isReady = false;
        while (!isReady)
        {
            System.out.println("Are you ready for the screen to be cleared?");
            String ready = "";
            ready = getStringInput();
            System.out.println("ready: "+ready);
            if (ready.equals("yes") || ready.equals("y"))
            {
                isReady = true;
            }
        }

    }

    public void greatPlayer(int player)
    {
        if (player == 1)
        {
            System.out.println("Hello player1. This is your board: ");
        }
        else
        {
            System.out.println("Hello player2. This is your board: ");
        }
    }


    public String getGuess()
    {
        ArrayList<String> possibleLetters = getPossibleLetters();
        ArrayList<String> possibleNumbers = getPossibleNumbers();
        boolean validInput = false;
        String guess = "";
        while (!validInput)
        {
            System.out.println("What guess would you like to make? You guess should be of the form 2F.");
            guess = getStringInput();
            guess = guess.toUpperCase();
            String[] guessArray = guess.split("(?!^)");
            if (guessArray.length == 3 && guessArray[0].equals("1") && guessArray[1].equals("0"))
            {
                if (possibleLetters.contains(guessArray[2]))
                {
                    validInput = true;
                }
            }
            else if (guessArray.length == 2)
            {
                if (possibleNumbers.contains(guessArray[0]) && possibleLetters.contains(guessArray[1]))
                {
                    validInput = true;
                }
            }
            if (!validInput)
            {
                System.out.println("You did not enter a valid input, please try again.");
            }
        }
        return guess;
    }

    public void displayCorrectGuess()
    {
        System.out.println("Well done! You hit a ship!");
    }

    public void displayWrongGuess()
    {
        System.out.println("Unlucky. You didn't hit a ship this time.");
    }

    public void displayWinner(String winner)
    {
        System.out.println("Congratulations "+winner+". You won!");
    }

}
