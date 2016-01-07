import java.util.ArrayList;

public interface UserInterface {

    public void displayASCII();
    public void displayRow(Row row);
    public void displayBoard(Board board);
    public void clearScreen();
    public void displayPlayer1();
    public void displayPlayer2();
    public ArrayList<String> getBattleship();

}
