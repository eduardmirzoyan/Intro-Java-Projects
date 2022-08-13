/*
	This is the ConditionTester template. Use this class to test simple boolean methods!

	Coded by: Eduard Mirzoyan
	Date: 11/13/17
*/

import java.awt.Color;
import java.util.Scanner;

public class ConditionTester
{
	
  public static void main(String[ ] args)
  {
//Instructions that print at the beginning of the program
	    System.out.println("Enter 1 for Point test.");
	    System.out.println("Enter 2 for Leap year test.");
	    System.out.println("Enter 3 for Ending in 2 zeros test.");
	    System.out.println("Enter 4 for Date comparison test.");
	    System.out.println("Enter 5 for Color Mixing!");
	    
//code that allows the program to read user input from keyboard.
    Scanner kboard = new Scanner(System.in);
    int k = kboard.nextInt( );
    

//k stands for key. switch statement that allows the menu style format
    switch(k) {
    case 1:
    	//enters the 2 points to test on a 100 x 100 rectangle starting on the point (50, 50)
        System.out.print("Enter the first point --> ");
        int x = kboard.nextInt( );

        System.out.print("Enter the second point --> ");
        int y = kboard.nextInt( );
        
        //Calls rectangle method
        ConditionTester tester = new ConditionTester();
        boolean result = tester.isPointInRectangle(x, y);
        
        // Printing out the result of the Practice test!
        System.out.println("Is this point in the rectangle? " + result);
        
        
    	break;
    case 2:
    	//enter the number you want to test
        System.out.print("Enter the year you want to test --> ");
        int year = kboard.nextInt( );
        
        //Calls Leap year method
        ConditionTester tester1 = new ConditionTester();
        boolean result1 = tester1.isLeapYear(year);
        
        // Printing out the result of the first test!
        System.out.println("Is this year a leap year? " + result1);
    	break;
    case 3:
    	//enter the number you want to test
        System.out.print("Enter the number you want to test --> ");
        int x1 = kboard.nextInt( );
        
        //Calls Two Ending Zeros
        ConditionTester tester2 = new ConditionTester();
        boolean result2 = tester2.hasTwoEndingZeros(x1);
        
        // Printing out the result of the second test!
        System.out.println("Does this number end in EXACTLY 2 zeros? " + result2);
    	break;
    case 4:
    	//first enter the first date, then type the second date you want to compare
        System.out.print("Enter the first date, then second date --> ");
        int year1 = kboard.nextInt( );
        int month1 = kboard.nextInt();
        int day1 = kboard.nextInt( );
        int year2 = kboard.nextInt();
        int month2 = kboard.nextInt( );
        int day2 = kboard.nextInt();
        
        //Calls isLater
        ConditionTester tester3 = new ConditionTester();
        boolean result3 = tester3.isLater(month1, day1, year1, month2, day2, year2);
        
        // Printing out the result of the third test!
        System.out.println("Is the first year later than the second year? " + result3);
    	break;
    case 5:
    	//mixes the quantity of colors to give the outcome
        System.out.print("Enter the amount of color for Red, Green and Blue. --> ");
        int r = kboard.nextInt( );
        int g = kboard.nextInt( );
        int b = kboard.nextInt( );
        
        //Calls bestMatch
        ConditionTester tester4 = new ConditionTester();
        String color = tester4.bestMatch(r, g, b);
        
        // Printing out the result of the fourth test!
        System.out.println("The resulting color is " + color);
    	break;
    	
    	default:
    		System.out.println("Not accecptable input, please restart program and try again");
    		break;
    }	
  }
  
 //This method tests if point is inside the drawn rectangle
 public boolean isPointInRectangle(int x, int y)
	{
	 //tests if the point is in a 100 x 100 box at point 50,50
	 boolean result;
		if(x >= 50 && x <= 150) {
			
			if(y >= 50 && x <= 150) {
				result = true;
				}
			else { 
				result = false; 
				}
		}
		else {
			result = false;
		}
		
	return result;
	}
 
 //This method tests if given year is a leap year.
 public boolean isLeapYear(int year) 
 	{
	 boolean result1;
	 	if(year % 4 == 0) { //Test if year is divisible by 4
	 		if(year % 400 == 0 || year % 100 != 0) { //Test if divisible by 400 or not by 100
	 		result1 = true;
	 		}
	 		else {
	 			result1 = false; 
	 			}
	 		}
	 	else {
	 		result1 = false;
	 		}
		return result1;
 	}
 
 //Method tests if the given number has exactly 2 zeros.
 public boolean hasTwoEndingZeros(int x1)
 	{
	 boolean result2;
	 if(x1 % 100 == 0 && x1 % 1000 != 0) { //test if given number ends with exactly 2 zeros.
		 result2 = true;
	 }
	 else {
		 result2 = false;
	 }
	 
	 return result2;
 	}
 
 //Tests if first year input is later than the second date. int month1, int day1, int year1, int month2, int day2, int year2
 public boolean isLater(int month1, int day1, int year1, int month2, int day2, int year2)
 	{
	 //compares each year, month and day to each other
	 boolean result3;
	 if(year2 > year1){
			 result3 = true;
		 }
		 else {
			 if(month2 > month1) {
				 result3 = true;
				 }
				 else {
					 if(day2 > day1) {
						 result3 = true;
			 }
					 else {
				 result3 = false;
			 }
		 }
		 }
	return result3; 
 	
 	}
 //A method that compares an entered amount of each color (blue, red, and green) and gives out the outcome if they were to be mixed together
 public String bestMatch(int r, int g, int b) {
	 String color;
	 //if-else nesting that has each possible outcome
	 if(r > (g + b)) {
		 color = "Red";
	 }
	 	else {
	 	if((r + b + g) / b == 3) {
	 	color = "Gray";
	 	}
	 		else {
	 		if(g > (r + b)) {
	 		color = "Green";
	 		}
			 	else {
				if(b > (g + r)) {
				color = "Blue";
				}
					else {
					if((b = g) > r) {
					color = "Cyan";
					}
					 	else {
						if((r / g) == 1) {
						color = "Yellow";
						}
						 	else {
						 	if((r / b) > 1) {
						 	color = "Magenta";
						 	}
						 		 else {
						 		 color = "White";
						 		 }
	 }
	 }
	 }
	 }
	 }
	 }
	 
	 return color;
 }
}

