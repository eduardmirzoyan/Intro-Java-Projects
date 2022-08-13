
public class Die {
	int numDots;
 
	 public void roll() {
		 double x =  Math.random();
		 numDots = (int) (6*x+1);
		 
		 }
	 public int getNumDots() {
	 return numDots;
	 }

	 
}
