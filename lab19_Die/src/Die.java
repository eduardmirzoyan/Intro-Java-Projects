
public class Die {
	int numDots;
 
	 public void roll() {
		 double x =  Math.random();
		 numDots = (int) (x * 6 + 1);
		 
		 }
	 public int getNumDots() {
	 return numDots;
	 }

	 
}
