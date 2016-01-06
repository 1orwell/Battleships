import java.util.ArrayList;

public class Battleships
{

    private static UserInterface ui = new TextUserInterface();

    public static void main(String args[])
    {
        ui.displayASCII();
        Row player1Row1 = new Row("X","X","X","X","X","X","X","X","X","X");
        Row player1Row2 = new Row("X","X","X","X","X","X","X","X","X","X");
        Row player1Row3 = new Row("X","X","X","X","X","X","X","X","X","X");
        Row player1Row4 = new Row("X","X","X","X","X","X","X","X","X","X");
        Row player1Row5 = new Row("X","X","X","X","X","X","X","X","X","X");
        Row player1Row6 = new Row("X","X","X","X","X","X","X","X","X","X");
        Row player1Row7 = new Row("X","X","X","X","X","X","X","X","X","X");
        Row player1Row8 = new Row("X","X","X","X","X","X","X","X","X","X");
        Row player1Row9 = new Row("X","X","X","X","X","X","X","X","X","X");
        Row player1Row10 = new Row("X","X","X","X","X","X","X","X","X","X");
        ui.displayBoard(player1Row1,player1Row2,player1Row3, player1Row4,
                player1Row5, player1Row6, player1Row7, player1Row8,
                player1Row9, player1Row10);
        System.out.println();
        player1Row3.setG("-");
        System.out.println();
        ui.displayBoard(player1Row1,player1Row2,player1Row3, player1Row4,
                player1Row5, player1Row6, player1Row7, player1Row8,
                player1Row9, player1Row10);
    }





}
