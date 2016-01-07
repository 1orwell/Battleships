public class Board
{

    private Row row1;
    private Row row2;
    private Row row3;
    private Row row4;
    private Row row5;
    private Row row6;
    private Row row7;
    private Row row8;
    private Row row9;
    private Row row10;

    public Board()
    {
        this.row1 = new Row("X","X","X","X","X","X","X","X","X","X");
        this.row2 = new Row("X","X","X","X","X","X","X","X","X","X");
        this.row3 = new Row("X","X","X","X","X","X","X","X","X","X");
        this.row4 = new Row("X","X","X","X","X","X","X","X","X","X");
        this.row5 = new Row("X","X","X","X","X","X","X","X","X","X");
        this.row6 = new Row("X","X","X","X","X","X","X","X","X","X");
        this.row7 = new Row("X","X","X","X","X","X","X","X","X","X");
        this.row8 = new Row("X","X","X","X","X","X","X","X","X","X");
        this.row9 = new Row("X","X","X","X","X","X","X","X","X","X");
        this.row10 = new Row("X","X","X","X","X","X","X","X","X","X");
    }

    public Row getRow1()
    {
        return this.row1;
    }

    public Row getRow2()
    {
        return this.row2;
    }

    public Row getRow3()
    {
        return this.row3;
    }

    public Row getRow4()
    {
        return this.row4;
    }

    public Row getRow5()
    {
        return this.row5;
    }

    public Row getRow6()
    {
        return this.row6;
    }

    public Row getRow7()
    {
        return this.row7;
    }

    public Row getRow8()
    {
        return this.row8;
    }

    public Row getRow9()
    {
        return this.row9;
    }

    public Row getRow10()
    {
        return this.row10;
    }

}

