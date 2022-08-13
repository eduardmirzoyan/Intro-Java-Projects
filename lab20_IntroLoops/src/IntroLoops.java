/*Name: Eduard Mirzoyan
 * Period: 3
 * Teacher: Mr. Taylor
*/

import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class IntroLoops {

//Fields
static String menuChoice;
static Scanner kboard = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException {

		do {
			//Creates Menu that requires a keyboard input
			Scanner kboard = new Scanner(System.in);
			System.out.print(System.lineSeparator());	
			System.out.println("---MENU---");
			System.out.println("What would you like to see?");
			System.out.println("1) Division");
			System.out.println("2) Counting Numbers");
			System.out.println("3) Word Repetition");
			System.out.println("4) Index Line");
			System.out.println("5) Adding up integers");
			System.out.println("6) Triangle Numbers");
			System.out.println("7) Adding Odd Integers");
			System.out.println("8) Number staircase(Self made bonus)");
			System.out.println("9) Quit");
			System.out.print("-----> ");
			menuChoice = kboard.next();
	
			//Creates an easy to access menu to select options, each option takes the user's input and runs the method
			switch(menuChoice) {
			case "1":
			case "Division":
				System.out.println("Input numerator:");
				int m = kboard.nextInt();
				System.out.println("Input denominator:");
				int n = kboard.nextInt();
		        divide(m, n);
				break;
			case "2":
			case "Exercise 1":
				System.out.println("Input starting value:");
				int start = kboard.nextInt();
				System.out.println("Input ending value:");
				int end = kboard.nextInt();
				printSeries(start, end);
				break;
			case "3":
			case "Exercise 2":
				System.out.println("Input word:");
				String word = kboard.next();
				repeatWord(word);
				break;
			case "4":
			case "Exercise 3":
				System.out.println("Input first word:");
				String word1 = kboard.next();
				System.out.println("Input second word:");
				String word2 = kboard.next();
				printIndexLine(word1, word2);
				break;
			case "5":
				System.out.println("Input the number of integers you want to calculate:");
				int num1 = kboard.nextInt();
		        addingUpIntegers(num1);
				break;
			case "6":
				System.out.println("Input the base of the triangle:");
				int dots = kboard.nextInt();
		        triangleNumbers(dots);
				break;
			case "7":
				System.out.println("Input the number of integers you want to calculate:");
				int integer = kboard.nextInt();
		        addOdds(integer);
				break;
			case "8":
				System.out.println("Input the number for the base of the staircase:");
				int base = kboard.nextInt();
		        pascalsTriangle(base);
				break;
			case "9":
				System.out.println("Thank you for using IntroLoops and have a good day.");
				TimeUnit.SECONDS.sleep(1);
				System.exit(0);
				break;
			default:
				System.out.println("Invalid input, please restart and try again");
				TimeUnit.SECONDS.sleep(2);
				break;
			}
		TimeUnit.SECONDS.sleep(1);
		} while (menuChoice != "8");
	}

	//This method the subracts input until remaining number is less than 0
	public static void divide(int m, int n) {
		int result = 0;
		while(m >= n) {
			m -= n;
			result ++;
		}

		System.out.println("The answer is " + result + " with a remander of " + m);
	}
	
	//Code that prints the input the amount of times
	public static void printSeries(int start, int end) {
		while(start != end) {
			System.out.println(start);
			start++;
		}
		System.out.println(end);
	}

	//Code that repeats the input an amount of times equal to the length of the word
	public static void repeatWord(String word) {
		int repeat = word.length();
		int start = 0;
		while(start != repeat) {
			System.out.println(word);
			start++;
		}
	}

	//Creates dots inbetween the 2 inputs so that the entire line is equal to 30 characters by comparing the length of both words to 30
	public static void printIndexLine(String word1, String word2) {
		int length = (word1.length() + word2.length());
		System.out.print(word1);
		while(length != 30) {
			System.out.print(".");
			length++;
		}
		System.out.println(word2);
	}
	
	//Adds up all the inputed integers to a total which it displays at the end
	public static void addingUpIntegers(int num1) {
		int count = 0, num = 0, total = 0;
		while(num1 != count) {
			System.out.println("Enter an integer");
			num = kboard.nextInt();
			total += num;
			count++;
		}
		System.out.println("The sum of the integer(s) is "+ total);
	}

	//creates a staircase of the input that is as tall and wide as the numerical quantity (made up by me)
	public static void pascalsTriangle(int base) {
		int count = 0;
		int count2 = 0;
		while(count != base) {
			count++;
			while(count2 != count) {
				System.out.print(base);	
				count2++;
			}
			System.out.print(System.lineSeparator());	
			count2 = 0;
		}
	}
	
	//finds the amount of dots that would be in a created dot triangle
	public static void triangleNumbers (int base)
	{
        int total = 0;
		for(int f = 1; base > 0; base -= 1) {
			total = total + base;
		}
	System.out.println("The total number of dots are "+ total);	
	}
	
	//calculates the sum of all the odd integers given, makes sure the number is odd to see if it is divisable by 2
	public static void addOdds(int integer)
	{
		int total = 0, num = 0;
		for(int count = 0; integer != count; count++) {
			System.out.println("Enter an integer");
			num = kboard.nextInt();
			if(num % 2 == 0) {}
			else {
				total += num;
			}
		}
		System.out.println("The sum of the odd integer(s) is "+ total);
	}


}