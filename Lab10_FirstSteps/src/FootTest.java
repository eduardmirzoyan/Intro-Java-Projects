import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class FootTest extends JPanel
{
  private Image shoe1;

  // Constructor
  public FootTest()
  {
    shoe1 = (new ImageIcon("leftshoe.gif")).getImage();
  }

  // Called automatically when the panel needs repainting
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int x = 300;
    int y = 100;
    int stepLength = 200;

    Foot foot1 = new Foot(x, y+50, shoe1);
    Foot foot2 = new Foot(x, y, shoe1);

    for (int count = 1; count <= 4; count++)
    {
      foot1.draw(g);
      foot1.turn(0);
      foot1.moveForward(stepLength);
    }
    
    for (int count = 1; count <= 4; count++)
    {
      foot2.draw(g);
      foot2.turn(0);
      foot2.moveForward(stepLength);
    }

    // Draw a cursor at the expected center of the first "shoe":
    g.drawLine(x - 50, y, x + 50, y);
    g.drawLine(x, y - 50, x, y + 50);
    g.setColor(Color.white);
    g.fillRect(x+350, y-30, 100, 100);
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("FootTest");
    window.setBounds(200, 200, 1000, 480);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    FootTest panel = new FootTest();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);

    window.setVisible(true);
  }
}