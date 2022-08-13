// Represents a Biped that moves alternating the left and right foot

import java.awt.Image;

public class Hopper extends Biped
{
  private int stepLength;
  private int stepsCount;
  
  // Constructor
  public Hopper(int x, int y, Image leftPic, Image rightPic)
  {
    super(x, y, leftPic, rightPic);  // must be the first statement
    stepLength = PIXELS_PER_INCH * 12;
  }
  
  public void firstStep()
  {
	  
  }
  
  public void nextStep()
  {
    getLeftFoot().moveForward(2 * stepLength);  
    getRightFoot().moveForward(2 * stepLength);
    stepsCount++;
  }

//   Stops this walker (brings its feet together)
  public void stop()
  {
	  
  }

  // Returns the distance walked
  public int distanceTraveled()
  {
    return stepsCount * stepLength;
  }
}
