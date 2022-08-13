// A PollDisplayPanel holds the vote counts and
// displays the numbers and the pie chart for
// the current vote counts.

// Lab: Lab16_Poll
// Author: Ed Mirzoyan
// Period: 03
// Date: 10/31/17

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PollDisplayPanel extends JPanel
{
  private String name1, name2, name3;
  private int count1, count2, count3;
  // STEP 1: Declare the int fields count1, count2, count3:
  

  // Constructor
  public PollDisplayPanel(String nm1, String nm2, String nm3)
  {
    setBackground(Color.WHITE);
    name1 = nm1;
    name2 = nm2;
    name3 = nm3;
    count1 = 0;   // optional
    count2 = 0;   // optional
    count3 = 0;   // optional
  }

  // Increments count1
  public void vote1()
  {
    // STEP 2: Finish vote1(), vote2(), and vote3()
	count1++;
  }

  // Increments count2
  public void vote2()
  {
    // STEP 2: Finish vote1(), vote2(), and vote3()
	count2++;
  }

  // Increments count3
  public void vote3()
  {
    // STEP 2: Finish vote1(), vote2(), and vote3()
	count3++;
  }

  // Returns a string representation of this object
  public String toString(int condition)
  {
  	// STEP 3: Complete the toString() method
  	// This method should return a String in the form:
  	// Tami: 1   Brian: 2   Liz: 0
	String name = null;
	if (condition == 1) {
		 name = "Tami: " + count1;
	}
	else if (condition == 2) {
		name = "Brian: " + count2;
	}
	else if (condition == 3) {
		name = "Liz: " + count3;
	}
    return name;
  }

  // Redefines JPanel's paintComponent to draw this pie chart
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int w = getWidth();
    int h = getHeight();
    int x = w/2;
    int y = h/2;
    int r = Math.min(w, h) / 4;
    drawPieChart(g, x, y, r);
    drawLegend(g, x, y, r);
  }

  // Draws the pie chart.
  // To avoid gaps in the picture, the following algorithm is used:
  // 1. set fromDegree to 0;
  // 2. draw the red sector and increment fromDegree by its size
  // 3. draw the green sector and increment fromDegree by its size
  // 4. set the size of the blue sector to the remaining
  //    area, 360 - fromDegree, but not less than 0:
  //      degrees = Math.max(360 - fromDegree, 0);
  //    (Occasionally, due to rounding errors, fromDegree may become 361,
  //    for example, count1 = 5, count2 = 11, count3 = 0.)
  private void drawPieChart(Graphics g, int x, int y, int r)
  {
    int total = count1 + count2 + count3;
    int fromDegree = 0;
    
    if (total > 0)
    {
      int degrees1;
      g.setColor(Color.RED);
      degrees1 = countToDegrees(count1,total);
      drawSector(g, x, y, r, fromDegree, degrees1);
      fromDegree += degrees1;
      
      int degrees2;
      g.setColor(Color.GREEN);
      degrees2 = countToDegrees(count2, total);
      drawSector(g, x, y, r, fromDegree, degrees2);
      fromDegree += degrees2;
      
      int degrees3;
      g.setColor(Color.BLUE);
      degrees3 = countToDegrees(count3, total);
      drawSector(g, x, y, r, fromDegree, degrees3);
    }
    else {
    	g.setColor(Color.LIGHT_GRAY);
    	drawSector(g, x, y,r, fromDegree, 360);
    	
    }

      // STEP 5: Finish the drawPieChart() method so that it correctly
      // draws all 3 sectors of the pie chart.
   
  }

  // Draws the vote counts and the corresponding color squares.
  private void drawLegend(Graphics g, int x, int y, int r)
  {
    // Display the counts:
    y += (r + 20);
    g.setColor(Color.BLACK);

	// STEP 6: Finish the drawLegend() method by uncommenting and
	// completing the following three lines

    g.drawString(toString(1), x - r, y);

    g.drawString(toString(2), x, y);

    g.drawString(toString(3), x + r, y);


    // Display the color squares:
    y += 5;
    x -= 2;
    g.setColor(Color.RED);
    g.fillRect(x - r, y, 10, 10);
    g.setColor(Color.GREEN);
    g.fillRect(x, y, 10, 10);
    g.setColor(Color.BLUE);
    g.fillRect(x + r, y, 10, 10);
  }

  // Returns the number of degrees in a pie slice that
  // corresponds to count / total, rounded to the nearest integer.
  private int countToDegrees(int count, int total)
  {
	// STEP 4: Complete the countToDegrees method so that it returns
	// the correct number of degrees
	int degrees = Math.round(360 * count/total);
    return degrees;
  }


  // Draws a sector, centered at x, y, of radius r,
  // of angle measure degrees, starting at fromDegree.
  private void drawSector(Graphics g, int x, int y, int r, int fromDegree, int degrees)
  {
    if (degrees > 359)
      g.fillOval(x - r, y - r, 2 * r, 2 * r);
    else
      g.fillArc(x - r, y - r, 2 * r, 2 * r, fromDegree, degrees);
  }
}
