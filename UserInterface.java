import java.util.ArrayList;

public interface UserInterface {

    public void displayASCII();
    public void displayRow(Row row);
    public void displayBoard(String[][] board);
    public void clearScreen();
    public ArrayList<String> getPossibleLetters();
    public ArrayList<String> getPossibleNumbers();
    public ArrayList<String> getBattleship();
    public void displayOutOfRange();
    public void isReady();
    public void greetPlayer(int player);
    public String getGuess();
    public void displayCorrectGuess();
    public void displayWrongGuess();
    public void displayWinner(String winner);

}
