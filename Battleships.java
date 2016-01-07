import java.util.ArrayList;

public class Battleships
{

    private static UserInterface ui = new TextUserInterface();

    private static Board player1Board = new Board();
    private static Board player2Board = new Board();

    private static Row player1Row1 = player1Board.getRow1();
    private static Row player1Row2 = player1Board.getRow2();
    private static Row player1Row3 = player1Board.getRow3();
    private static Row player1Row4 = player1Board.getRow4();
    private static Row player1Row5 = player1Board.getRow5();
    private static Row player1Row6 = player1Board.getRow6();
    private static Row player1Row7 = player1Board.getRow7();
    private static Row player1Row8 = player1Board.getRow8();
    private static Row player1Row9 = player1Board.getRow9();
    private static Row player1Row10 = player1Board.getRow10();

    private static Row player2Row1 = player2Board.getRow1();
    private static Row player2Row2 = player2Board.getRow2();
    private static Row player2Row3 = player2Board.getRow3();
    private static Row player2Row4 = player2Board.getRow4();
    private static Row player2Row5 = player2Board.getRow5();
    private static Row player2Row6 = player2Board.getRow6();
    private static Row player2Row7 = player2Board.getRow7();
    private static Row player2Row8 = player2Board.getRow8();
    private static Row player2Row9 = player2Board.getRow9();
    private static Row player2Row10 = player2Board.getRow10();

    public static void initiatePlayer1()
    {
        ui.clearScreen();
        ui.displayASCII();
        ui.displayPlayer1();
        ui.displayBoard(player1Board);
        ArrayList<String> ship = ui.getBattleship();
        String cell = ship.get(0);
        String length = ship.get(1);
        String orientation = ship.get(2);
        //player1Row3.setG("-");
    }

    public static void main(String args[])
    {
        initiatePlayer1();
    }





}
