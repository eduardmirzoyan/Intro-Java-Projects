
public class DieTester {

	public static void main(String[] args) {
		Die die = new Die();
		die.roll();
		System.out.println("Answer:" + die.getNumDots());
	}
}
