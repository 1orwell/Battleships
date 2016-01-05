import java.util.ArrayList;
import java.util.List;

public class Board
{
    private ArrayList<Row> rows;
    UserInterface ui = new TextUserInterface();

    public Board(ArrayList<Row> rows)
    {
        this.rows = rows;
    }

    public void displayBoard()
    {
        for (int i=0; i<this.rows.size(); i++)
        {
            Row row = this.rows.get(i);
            for (int j=0; j<row.size(); j++)
            {
                String cell = row.get(j);
                ui.displayCell(cell);
            }
            System.out.println();
        }
    }
}
