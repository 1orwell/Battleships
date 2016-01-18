import javax.swing.*;

public class SwingTest
{

    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        JButton b = new JButton("click");
        b.setBounds(130, 100, 100, 40); // x axis, y axis, width, height
        f.add(b);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true); // make the frame visible
    }

}
