import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class Battleships
{

    private static UserInterface ui = new TextUserInterface();
    private static String[][] player1Board = new String[10][10];
    private static String[][] player2Board = new String[10][10];

    public static void getShipPosition(int player)
    {
        ArrayList<String> ship = ui.getBattleship();
        String cellNotUsuable = ship.get(0);
        String length = ship.get(1);
        String orientation = ship.get(2);
        String[] splited = cellNotUsuable.split("\\s+");
        String row = splited[0];
        String column = splited[1];
    }

    public static void initiateGame()
    {
        ui.clearScreen();
        ui.displayASCII();
    }

    public static void initiatePlayer(String[][] playerBoard, int player)
    {
        for (int i=0; i<10; i++)
        {
            for (int j=0; j<10; j++)
            {
                playerBoard[i][j] = " - ";
            }
        }
        if (player == 1)
        {
            ui.displayPlayer1();
        }
        else
        {
            ui.displayPlayer2();
        }
        ui.displayBoard(playerBoard);
    }

    public static Map<String, String> getMap()
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1A", "0 0");
        map.put("1B", "1 0");
        map.put("1C", "2 0");
        map.put("1D", "3 0");
        map.put("1E", "4 0");
        map.put("1F", "5 0");
        map.put("1G", "6 0");
        map.put("1H", "7 0");
        map.put("1I", "8 0");
        map.put("1J", "9 0");

        map.put("2A", "0 1");
        map.put("2B", "1 1");
        map.put("2C", "2 1");
        map.put("2D", "3 1");
        map.put("2E", "4 1");
        map.put("2F", "5 1");
        map.put("2G", "6 1");
        map.put("2H", "7 1");
        map.put("2I", "8 1");
        map.put("2J", "9 1");

        map.put("3A", "0 2");
        map.put("3B", "1 2");
        map.put("3C", "2 2");
        map.put("3D", "3 2");
        map.put("3E", "4 2");
        map.put("3F", "5 2");
        map.put("3G", "6 2");
        map.put("3H", "7 2");
        map.put("3I", "8 2");
        map.put("3J", "9 2");

        map.put("4A", "0 3");
        map.put("4B", "1 3");
        map.put("4C", "2 3");
        map.put("4D", "3 3");
        map.put("4E", "4 3");
        map.put("4F", "5 3");
        map.put("4G", "6 3");
        map.put("4H", "7 3");
        map.put("4I", "8 3");
        map.put("4J", "9 3");

        map.put("5A", "0 4");
        map.put("5B", "1 4");
        map.put("5C", "2 4");
        map.put("5D", "3 4");
        map.put("5E", "4 4");
        map.put("5F", "5 4");
        map.put("5G", "6 4");
        map.put("5H", "7 4");
        map.put("5I", "8 4");
        map.put("5J", "9 4");

        map.put("6A", "0 5");
        map.put("6B", "1 5");
        map.put("6C", "2 5");
        map.put("6D", "3 5");
        map.put("6E", "4 5");
        map.put("6F", "5 5");
        map.put("6G", "6 5");
        map.put("6H", "7 5");
        map.put("6I", "8 5");
        map.put("6J", "9 5");

        map.put("7A", "0 6");
        map.put("7B", "1 6");
        map.put("7C", "2 6");
        map.put("7D", "3 6");
        map.put("7E", "4 6");
        map.put("7F", "5 6");
        map.put("7G", "6 6");
        map.put("7H", "7 6");
        map.put("7I", "8 6");
        map.put("7J", "9 6");

        map.put("8A", "0 7");
        map.put("8B", "1 7");
        map.put("8C", "2 7");
        map.put("8D", "3 7");
        map.put("8E", "4 7");
        map.put("8F", "5 7");
        map.put("8G", "6 7");
        map.put("8H", "7 7");
        map.put("8I", "8 7");
        map.put("8J", "9 7");

        map.put("9A", "0 8");
        map.put("9B", "1 8");
        map.put("9C", "2 8");
        map.put("9D", "3 8");
        map.put("9E", "4 8");
        map.put("9F", "5 8");
        map.put("9G", "6 8");
        map.put("9H", "7 8");
        map.put("9I", "8 8");
        map.put("9J", "9 8");

        map.put("10A", "0 9");
        map.put("10B", "1 9");
        map.put("10C", "2 9");
        map.put("10D", "3 9");
        map.put("10E", "4 9");
        map.put("10F", "5 9");
        map.put("10G", "6 9");
        map.put("10H", "7 9");
        map.put("10I", "8 9");
        map.put("10J", "9 9");


        return map;
    }

    public static void getPlayersShips(String[][] playerBoard)
    {
        Map<String, String> map = getMap();
        boolean validShip = false;
        while (!validShip)
        {
            for (int i=0; i<1; i++)
            {
                boolean validInput = false;
                while (!validInput)
                {
                    ArrayList<String> ship = ui.getBattleship();
                    String cell = ship.get(0);
                    int length = Integer.parseInt(ship.get(1));
                    String oritentation = ship.get(2);
                    String[] position = map.get(cell).split("\\s+");
                    int columnInt = Integer.parseInt(position[0]);
                    int rowInt = Integer.parseInt(position[1]);
                    int[] validCells = new int[10];
                    int validCellsIndex = 0;
                    for (int j=0; j<length; j++)
                    {
                        if (oritentation.equals("h"))
                        {
                            validInput = true;
                            if (columnInt+length > 11)
                            {
                                int num = columnInt+length;
                                ui.displayOutOfRange();
                                i--;
                                break;
                            }
                            else
                            {
                                validShip = true;
                                playerBoard[columnInt][rowInt] = " X ";
                            }
                            columnInt++;
                        }
                        else
                        {
                            validInput = true;
                            if (rowInt+length > 11)
                            {
                                int num = rowInt+length;
                                ui.displayOutOfRange();
                                i--;
                                break;
                            }
                            else
                            {
                                validShip = true;
                                playerBoard[columnInt][rowInt] = " X ";
                            }
                            rowInt++;
                        }
                    }
                }
            }
        }
        ui.displayBoard(playerBoard);
    }

    public static void isReadyToClear()
    {
        ui.isReady();
    }

    public static boolean contains(String[][] board)
    {
        boolean gameOver = false;
        for (int i=0; i<10; i++)
        {
            String[] row = board[i];
            if (Arrays.asList(row).contains(" X "))
            {
                gameOver = false;
                return gameOver;
            }
            else
            {
                gameOver = true;
            }
        }
        return gameOver;
    }

    public static String playGame()
    {
        Map<String, String> map = getMap();
        int turns = 1;
        boolean gameOver = false;
        String winner = "";
        while (!gameOver)
        {
            ui.clearScreen();
            if (turns%2 == 1)
            {
                ui.greatPlayer(1);
                ui.displayBoard(player1Board);
                String guess = ui.getGuess();
                String[] guessArray = map.get(guess).split("\\s+");
                int columnInt = Integer.parseInt(guessArray[0]);
                int rowInt = Integer.parseInt(guessArray[1]);
                if (player2Board[columnInt][rowInt].equals(" X "))
                {
                    player2Board[columnInt][rowInt] = " O ";
                    ui.displayCorrectGuess();
                }
                else
                {
                    ui.displayWrongGuess();
                }
                turns++;
                if (contains(player2Board))
                {
                    //System.out.println("game over");
                    gameOver = true;
                    winner = "Player1";
                    return winner;
                }
                ui.isReady();
                ui.clearScreen();
            }
            else
            {
                ui.greatPlayer(2);
                ui.displayBoard(player2Board);
                String guess = ui.getGuess();
                String[] guessArray = map.get(guess).split("\\s+");
                int columnInt = Integer.parseInt(guessArray[0]);
                int rowInt = Integer.parseInt(guessArray[1]);
                if (guess.equals("exit"))
                {
                    gameOver = true;
                }
                if (player1Board[columnInt][rowInt].equals(" X "))
                {
                    player1Board[columnInt][rowInt] = " O ";
                    ui.displayCorrectGuess();
                }
                else
                {
                    ui.displayWrongGuess();
                }
                turns++;
                if (contains(player1Board))
                {
                    gameOver = true;
                    winner = "Player2";
                    return winner;
                    //System.out.println("game over");
                }
                ui.isReady();
                ui.clearScreen();
            }
        }
        return winner;
    }

    public static void main(String args[])
    {
        initiateGame();
        initiatePlayer(player1Board, 1);
        getPlayersShips(player1Board);
        isReadyToClear();
        initiateGame();
        initiatePlayer(player2Board, 2);
        getPlayersShips(player2Board);
        isReadyToClear();
        String winner = playGame();
        ui.displayWinner(winner);
    }





}
