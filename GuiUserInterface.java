import javax.swing.*;

public class GuiUserInterface
{

    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        f.setSize(800, 800);
        for (int j=0; j<11; j++)
        {
            for (int i=0; i<11; i++)
            {
                int xIndex = (i*80)+10;
                int yIndex = (j*80)+10;
                String[] letters = new String[10];
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
                if (j==0 && i != 0)
                {
                    System.out.println("j: "+Integer.toString(j) + ". i: "+Integer.toString(i-1));
                    String letter = letters[i-1];
                    JButton b = new JButton(letter);
                    b.setBounds(xIndex, 10, 60, 60); // x axis, y axis, width, height
                    f.add(b);
                }
                if (i==0)
                {
                    String jString = Integer.toString(j+1);
                    JButton b = new JButton(jString);
                    b.setBounds(10, yIndex, 60, 60); // x axis, y axis, width, height
                    f.add(b);
                }
                JButton b = new JButton("-");
                b.setBounds(xIndex, yIndex, 60, 60); // x axis, y axis, width, height
                f.add(b);
            }
        }
        f.setLayout(null);
        f.setVisible(true); // make the frame visible
    }

}
