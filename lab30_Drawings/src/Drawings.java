import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawings extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int w = getWidth();
    int h = getHeight();
    g.setColor(Color.RED);
    g.drawRect(50, 50, 100, 75);
    g.drawOval(75, 0, 50, 50);
    
    g.fillRect(500, 50, 100, 100);
    g.setColor(Color.WHITE);
    g.fillOval(500, 50, 50, 50);
    g.fillOval(550, 50, 50, 50);
    g.fillOval(500, 100, 50, 50);
    g.fillOval(550, 100, 50, 50);
    g.fillOval(475, 25, 50, 50);
    g.fillOval(575, 25, 50, 50);
    g.fillOval(475, 125, 50, 50);
    g.fillOval(575, 125, 50, 50);
    
    
    Graphics2D g2d = (Graphics2D)g;
    Rectangle rect1 = new Rectangle(250, 50, 50, 50);
    g2d.setColor(Color.BLUE);
    g2d.translate(150, -150);
    g2d.rotate(Math.toRadians(45));
    g2d.draw(rect1);
    g2d.fill(rect1);
    
   
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Drawings");
    window.setBounds(100, 100, 800, 200);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel canvas = new Drawings();
    canvas.setBackground(Color.WHITE);
    window.getContentPane().add(canvas);
    window.setVisible(true);
  }
}

