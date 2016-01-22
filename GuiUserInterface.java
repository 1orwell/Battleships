import javax.swing.*;

public class GuiUserInterface
{

    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setSize(1400, 800);
        for (int row=0; row<11; row++)
        {
            for (int column=0; column<23; column++)
            {
                int xIndex = (column*60)+5;
                int yIndex = (row*60)+5;
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
                if (column == 11)
                {

                }
                else if (column==0 && row==0 || column==12 && row==0)
                {
                    JButton b = new JButton("");
                    b.setBounds(5, 5, 50, 50); // x axis, y axis, width, height
                    f.add(b);
                }
                else if (column==0 && row != 0 || column==12 && row!=0)
                {
                    String jString = Integer.toString(row);
                    JButton b = new JButton(jString);
                    b.setBounds(5, yIndex, 50, 50); // x axis, y axis, width, height
                    f.add(b);
                }
                else if (row==0 && column != 0)
                {
                    String letter = "";
                    if (column<11)
                    {
                        letter = letters[column-1];
                    }
                    else
                    {
                        letter = letters[column-12];
                    }
                    JButton b = new JButton(letter);
                    b.setBounds(xIndex, 5, 50, 50); // x axis, y axis, width, height
                    f.add(b);
                }
                else
                {
                    JButton b = new JButton("-");
                    b.setBounds(xIndex, yIndex, 50, 50); // x axis, y axis, width, height
                    f.add(b);
                }
            }
        }
        f.setLayout(null);
        f.setVisible(true); // make the frame visible
    }

}
