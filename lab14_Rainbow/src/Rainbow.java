// ________________________________________________

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Rainbow extends JPanel
{
  // Declare skyColor:
  // ________________________________________________

Color skyColor = Color.CYAN;

  public Rainbow()
  {
    setBackground(skyColor);
  }

  // Draws the rainbow.
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int width = getWidth();    
    int height = getHeight();
    int xCenter = width / 2;
    int yCenter = (height * 3) / 4;
    int largeRadius = width / 2;

    // Declare and initialize local int variables xCenter, yCenter
    // that represent the center of the rainbow rings:
    // ________________________________________________
 
    // Declare and initialize the radius of the large semicircle:
    // ________________________________________________

    //g.setColor(Color.RED);
    // Draw the large semicircle:
    // g.fillArc( ______________ );
    //g.fillArc(xCenter / 2, 5*yCenter / 11, largeRadius * 2, largeRadius * 2, 0, 180);
    g.setColor(Color.BLACK);
    g.fillOval(xCenter, yCenter, 5, 5);
    g.setColor(Color.RED);
    g.fillArc(xCenter - largeRadius/2, yCenter - largeRadius/2, largeRadius, largeRadius, 0, 180);
    g.setColor(Color.ORANGE);
    g.fillArc(xCenter - largeRadius/3, yCenter - largeRadius/3, 2*largeRadius/3, 2*largeRadius/3, 0, 180);
    g.setColor(Color.YELLOW);
    g.fillArc(xCenter - largeRadius/6, yCenter - largeRadius/6, 3*largeRadius/9, 3*largeRadius/9, 0, 180);
    // Declare and initialize the radii of the small and medium
    // semicircles and draw them:
    // ________________________________________________

    // Calculate the radius of the innermost (sky-color) semicircle
    // so that the width of the middle (green) ring is the
    // arithmetic mean of the widths of the red and magenta rings:
    // ________________________________________________

    // Draw the sky-color semicircle:
    // ________________________________________________
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(300, 300, 300, 200);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow());
    w.setVisible(true);
  }
}
