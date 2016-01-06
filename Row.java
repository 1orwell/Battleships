import java.util.ArrayList;
import java.util.List;

public class Row
{

    private String A;
    private String B;
    private String C;
    private String D;
    private String E;
    private String F;
    private String G;
    private String H;
    private String I;
    private String J;

    public Row(String A, String B, String C, String D, String E,
            String F, String G, String H, String I, String J)
    {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.E = E;
        this.F = F;
        this.G = G;
        this.H = H;
        this.I = I;
        this.J = J;
    }

    public String getA()
    {
        return this.A;
    }

    public void setA(String newA)
    {
        this.A = newA;
    }

    public String getB()
    {
        return this.B;
    }

    public void setB(String newB)
    {
        this.B = newB;
    }

    public String getC()
    {
        return this.C;
    }

    public void setC(String newC)
    {
        this.C = newC;
    }

    public String getD()
    {
        return this.D;
    }

    public void setD(String newD)
    {
        this.D = newD;
    }

    public String getE()
    {
        return this.E;
    }

    public void setE(String newE)
    {
        this.E = newE;
    }

    public String getF()
    {
        return this.F;
    }

    public void setF(String newF)
    {
        this.F = newF;
    }

    public String getG()
    {
        return this.G;
    }

    public void setG(String newG)
    {
        this.G = newG;
    }

    public String getH()
    {
        return this.H;
    }

    public void setH(String newH)
    {
        this.H = newH;
    }

    public String getI()
    {
        return this.I;
    }

    public void setI(String newI)
    {
        this.I = newI;
    }

    public String getJ()
    {
        return this.J;
    }

    public void setJ(String newJ)
    {
        this.J = newJ;
    }

    public ArrayList<String> getRowArray()
    {
        ArrayList<String> row = new ArrayList<String>();
        row.add(this.A);
        row.add(this.B);
        row.add(this.C);
        row.add(this.D);
        row.add(this.E);
        row.add(this.F);
        row.add(this.G);
        row.add(this.H);
        row.add(this.I);
        row.add(this.J);
        return row;
    }

}
