// Represents a display panel for a dance group

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class DanceFloor extends JPanel
{
	Image img = Toolkit.getDefaultToolkit().createImage("1.jpg");
  // Constructor
  public DanceFloor()
  {
    setBackground(new Color(230, 245, 255));
  }

  // Called from DanceGroup
  public void update(StudentGroup students)
  {
    this.students = students;
    repaint();
  }

  private StudentGroup students;

  // Called when this panel needs to be repained
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    g.drawImage(img, 0, 0, null);
    if (students != null)
      students.draw(g);
  }
}
