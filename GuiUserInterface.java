import javax.swing.*;

public class GuiUserInterface
{

    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        f.setSize(800, 800);
        for (int j=0; j<10; j++)
        {
            for (int i=0; i<11; i++)
            {
                int xIndex = (i*80)+10;
                int yIndex = (j*80)+10;
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
