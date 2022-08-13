import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SpinnerGroup implements StudentGroup
{
  private Spinner maleSpinner;
  private Image leftMansShoe, rightMansShoe;
  private DanceFloor danceFloor;
  private enum State {READY, MOVING, STOPPED}
  private State currentState;

  // Constructor
  public SpinnerGroup(DanceFloor df)
  {
    danceFloor = df;
    leftMansShoe = (new ImageIcon("leftshoe.gif")).getImage();
    rightMansShoe = (new ImageIcon("rightshoe.gif")).getImage();
  }

  // Sets up this group of participants
  public void setup(int floorDir, Dance steps1, Dance steps2)
  {
    int x = danceFloor.getWidth() / 2;
    int y = danceFloor.getHeight() / 2;
    if (floorDir == 0)
    {
      maleSpinner = new Spinner(x, y + Dancer.PIXELS_PER_INCH * 12, leftMansShoe, rightMansShoe);
      maleSpinner.turnLeft();    }
    else
    {
      maleSpinner = new Spinner(x, y - Dancer.PIXELS_PER_INCH * 12, leftMansShoe, rightMansShoe);
      maleSpinner.turnRight();
    }
    currentState = State.READY;
    danceFloor.update(this);
  }

  // Moves the group by one step
  public void makeNextStep()
  {
    if (currentState == State.READY)
    {
      maleSpinner.firstStep();
      currentState = State.MOVING;
    }
    else if (currentState == State.MOVING)
    {
      maleSpinner.nextStep();
    }
    else if (currentState == State.STOPPED) // never happens
    {
      maleSpinner.turnAround();
      currentState = State.READY;
    }
    danceFloor.update(this);
  }

  // Draws this group
  public void draw(Graphics g)
  {
    maleSpinner.draw(g);
  }
}
