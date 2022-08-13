// This applet displays a message moving horizontally
// across the screen.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BannerO extends JApplet
  implements ActionListener
{
  private int xPos, yPos;  // hold the coordinates of the banner

  public void init()
  {
    Container c = getContentPane();
    c.setBackground(Color.WHITE);
    xPos = c.getWidth();
    yPos = c.getHeight() / 2;
    Timer clock = new Timer(30, this);  // fires every 30 milliseconds 
    clock.start();
  }

  // Called automatically after a repaint request
  public void paint(Graphics g)
  {
    super.paint(g);
    g.fillRect(100, 50, 10, 10);
    g.setColor(Color.blue);
  }

  // Called automatically when the timer fires
  public void actionPerformed(ActionEvent e)
  {
    Container c = getContentPane();

    // Adjust the horizontal position of the banner:
    xPos--;
    if (xPos < -100)
    {
      xPos = c.getWidth();
    }

    // Set the vertical position of the banner:
    yPos = c.getHeight() / 2;

    repaint();
  }
  
  public static void main(String[] args)
  {
    JFrame window = new JFrame("Action Demo");

    // Set this window's location and size:
    // upper-left corner at 300, 300; width 300, height 100
    window.setBounds(300, 300, 300, 100);

    //  Create panel, a Banner object, which is a kind of JPanel:
    BannerO panel = new BannerO();
    panel.setBackground(Color.CYAN);  // the default color is light gray

    // Add panel to window:
    Container c = window.getContentPane();
    c.add(panel);

    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);

    // Set the initial position of the message:
    panel.xPos = panel.getWidth();
    panel.yPos = panel.getHeight() / 2;

    // Create a Timer object that fires every 30 milliseconds;
    // attach it to panel so that panel "listens to" and
    // processes the timer events; start the timer:
    Timer clock = new Timer(30, panel);
    clock.start();
  }
}


