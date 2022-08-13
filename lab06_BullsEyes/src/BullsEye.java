// Question 2-13-a
import java.awt.*;
import javax.swing.*;

public class BullsEye extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              //   to paint the background
    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
    g.setColor(Color.RED);
    g.fillOval(xCenter, yCenter, 100, 100);
    g.setColor(Color.white);
    g.fillOval(xCenter+20, yCenter+20, 60, 60);
    g.setColor(Color.red);
    g.fillOval(xCenter+38, yCenter+38, 25, 25);
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Bull's Eye!");
    window.setBounds(600, 600, 400, 400);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    BullsEye panel = new BullsEye();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);
    window.setVisible(true);
  }
}

