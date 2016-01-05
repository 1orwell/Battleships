import java.util.ArrayList;

public class Battleships
{

    private static UserInterface ui = new TextUserInterface();

    public static void main(String args[])
    {
        ui.displayASCII();
        ArrayList<String> rowArray1 = new ArrayList<String>();
        rowArray1.add("|");
        rowArray1.add("X");
        rowArray1.add("|");
        rowArray1.add("X");
        rowArray1.add("|");
        rowArray1.add("X");
        rowArray1.add("|");
        rowArray1.add("X");
        rowArray1.add("|");
        rowArray1.add("X");
        rowArray1.add("|");
        Row row1 = new Row(rowArray1);

        ArrayList<String> rowArray2 = new ArrayList<String>();
        rowArray2.add("|");
        rowArray2.add("X");
        rowArray2.add("|");
        rowArray2.add("X");
        rowArray2.add("|");
        rowArray2.add("X");
        rowArray2.add("|");
        rowArray2.add("X");
        rowArray2.add("|");
        rowArray2.add("X");
        rowArray2.add("|");
        Row row2 = new Row(rowArray2);
        ArrayList<Row> rows = new ArrayList<Row>();
        rows.add(row1);
        rows.add(row2);
        Board board = new Board(rows);
        board.displayBoard();
    }



}
