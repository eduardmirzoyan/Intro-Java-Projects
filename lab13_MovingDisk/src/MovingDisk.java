import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class MovingDisk extends JPanel
  implements ActionListener
{
  private int time;


  public MovingDisk()
  {
    time = 0;
    Timer clock = new Timer(30, this); 
    clock.start();
  }

  public void paintComponent(Graphics g)
  {
    int x = 150 - (int)(100 * Math.cos(0.005 * Math.PI * time));
    int y = 130 - (int)(75 * Math.sin(0.005 * Math.PI * time));
    int r = 20;

    Color sky;
    if (y > 130) sky = Color.BLACK;
    else sky = Color.CYAN;
    setBackground(sky);
    super.paintComponent(g);

    g.setColor(Color.ORANGE);
    g.fillOval(x - r, y - r, 2*r, 2*r);
	ImageIcon icon = new ImageIcon("cloud.png");
	Image i = icon.getImage();
	g.drawImage(i, 120, 50, null);
	g.drawImage(i, 170, 40, null);
	g.drawImage(i, 70, 40, null);
  }

  public void actionPerformed(ActionEvent e)
  {
    time++;
    repaint();
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Moving Disk");
    w.setSize(300, 150);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new MovingDisk());
    w.setResizable(true);
    w.setVisible(true);
  }
}
