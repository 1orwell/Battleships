import javax.swing.*;

public class GuiUserInterface
{

    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        f.setSize(800, 800);
        for (int row=0; row<11; row++)
        {
            for (int column=0; column<11; column++)
            {
                System.out.println("row: " + row+". column: "+column);
                int xIndex = (column*70)+5;
                int yIndex = (row*70)+5;
                String[] letters = new String[11];
                letters[0] = "A";
                letters[1] = "B";
                letters[2] = "C";
                letters[3] = "D";
                letters[4] = "E";
                letters[5] = "F";
                letters[6] = "G";
                letters[7] = "H";
                letters[8] = "I";
                letters[9] = "J";
                if (column==0 && row==0)
                {
                    JButton b = new JButton("");
                    b.setBounds(5, 5, 50, 50); // x axis, y axis, width, height
                    f.add(b);
                }
                if (column==0 && row != 0)
                {
                    String jString = Integer.toString(row);
                    JButton b = new JButton(jString);
                    b.setBounds(5, yIndex, 50, 50); // x axis, y axis, width, height
                    f.add(b);
                }
                if (row==0 && column != 0)
                {
                    System.out.println("row: "+Integer.toString(row) + ". column: "+Integer.toString(column-1));
                    String letter = letters[column-1];
                    JButton b = new JButton(letter);
                    b.setBounds(xIndex, 5, 50, 50); // x axis, y axis, width, height
                    f.add(b);
                }
                JButton b = new JButton("-");
                b.setBounds(xIndex, yIndex, 50, 50); // x axis, y axis, width, height
                f.add(b);
            }
        }
        f.setLayout(null);
        f.setVisible(true); // make the frame visible
    }

}
