import java.util.ArrayList;
import java.util.List;

public class Row
{

    private ArrayList<String> row;

    public Row(ArrayList<String> row)
    {
        this.row = row;
    }

    public ArrayList<String> getRow()
    {
        return this.row;
    }

    public int size()
    {
        int size = this.row.size();
        return size;
    }

    public String get(int i)
    {
        String str = this.row.get(i);
        return str;
    }

    public void add(String str)
    {
        this.row.add(str);
    }


}
