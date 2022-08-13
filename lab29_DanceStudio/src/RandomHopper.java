import java.awt.Image;

public class RandomHopper extends Hopper {
	  private int stepLength;
	  private int stepsCount;
	  
	  // Constructor
	  public RandomHopper(int x, int y, Image leftPic, Image rightPic)
	  {
	    super(x, y, leftPic, rightPic);  // must be the first statement
	    stepLength = PIXELS_PER_INCH * 12;
	  }
	  
	  public void firstStep() {
		  // Do nothing
	  }
	  
	  public void nextStep()
	  {
		int random = (int) (4*(Math.random())+1);
		switch(random) {
		case 1:
			//Do nothing
		    break;
		case 2:
			turnRight();
			break;
		case 3:
			turnLeft();
			break;
		case 4:
			turnAround();
			break;
		}
		getLeftFoot().moveForward(stepLength);  
	    getRightFoot().moveForward(stepLength);
	    stepsCount++;
	  }

	  // Stops this walker (brings its feet together)
	  public void stop()
	  {
		  // Do nothing
	  }

	  // Returns the distance walked
	  public int distanceTraveled()
	  {
	    return stepsCount * stepLength;
	  }
	}
