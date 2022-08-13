/**
 * @(#)DogYears.java
 *

  For testing purposes:
  Dog age of 1 = Human age 13
  Dog age of 2 = Human age 18
  Dog age of 5 = Human age 34
  Dog age of 8 = Human age 50
  Dog age of 12 = Human age 72

 *
 * @author
 * @version
 */

import java.util.Scanner;

public class DogYears {

    public double convertToHumanYears(int dog) {
    	double human = 5.85;
    	return human;
    }


    public double convertToDogYears(int human) {
    	// Work on this once you have finished convertToHumanYears()!
    	double dog = 5.86;
    	return dog;
    }
 

	public static void main (String[] args) {
		// TAKE IN USER INPUT
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many years? ");
		int year = keyboard.nextInt();

		DogYears converter1 = new DogYears();
		double human = converter1.convertToHumanYears(year);
		
		DogYears converter2 = new DogYears();
		double dog = converter2.convertToDogYears(year);

		// PRINT OUT THE RESULT
		System.out.println("Human to Dog years = " + (int)(year/human));
		System.out.println("Dog to Human years = " + (int)(year*dog));
	}

}