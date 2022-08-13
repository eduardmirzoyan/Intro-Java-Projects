import java.util.Scanner;

public class Stars {

	public static int menuChoice; //Field that initalizes the menu choice
	
	public static void main(String[] args) { //Prints a menu before the loop and allows 
											 //user to choose an option and constantly loops until Quit is choosen
		do {
		Scanner kboard = new Scanner(System.in);
		System.out.print(System.lineSeparator());	
		System.out.println("---MENU---");
		System.out.println("What would you like to see?");
		System.out.println("1) Star Row");
		System.out.println("2) Star Square");
		System.out.println("3) Star Right Triangle");
		System.out.println("4) Star Inverse Triangle");
		System.out.println("5) Star Pyramid");
		System.out.println("6) Star Diamond");
		System.out.println("7) Star Quit");
		System.out.print("----------> ");
		menuChoice = kboard.nextInt();
	
		switch(menuChoice) {
		case 1: 
			System.out.println("Input the amount of stars you would like to see:");
			int input1 = kboard.nextInt();
			printStars(input1);
			break;
		case 2:
			System.out.println("Input the amount of rows you would like to see:");
			int input2 = kboard.nextInt();
			starSquare(input2);
			break;
		case 3:
			System.out.println("Input the amount of rows you would like to see:");
			int input3 = kboard.nextInt();
			starTriangle(input3);
			break;
		case 4:
			System.out.println("Input the amount of rows you would like to see:");
			int input4 = kboard.nextInt();
			invertedTriangle(input4);
			break;
		case 5:
			System.out.println("Input the amount of rows you would like to see:");
			int input5 = kboard.nextInt();
			starPyramid(input5);
			break;
		case 6:
			System.out.println("Input the amount of rows you would like to see:");
			int input6 = kboard.nextInt();
			starDiamond(input6);
			break;
		case 7:
			System.out.println("Thank you for using my Stars lab!");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Option, please try again");
			break;
		}
		}while(menuChoice != 7);
		
	}
	
	//Prints a number of stars equal to the input in a row
	public static void printStars(int x) {
		for(int count = 0; count < x; count++) {
			System.out.print("*");
		}
	}
	
	//Print a square of starts with a length and width equal to the input
	public static void starSquare(int input) {
		int count1 = 0;
		int count2 = 0;
		for(; input > count1; count1++) {
			for(; input > count2; count2++) {
				System.out.print("*");
			}
			System.out.println("");
			count2 = 0;
		}
	}
	
	//Prints a right triangle with a base equal to the input
	public static void starTriangle(int input) {
		int count1 = 0;
		int count2 = 0;
		for(;count1 <= input; count1++) {
			for(;count2 < count1; count2++) {
				System.out.print("*");
			}
			count2 = 0;
			System.out.println("");
		}
	}
	
	//Prints an inverted right triangle with a base equal to the input 
	public static void invertedTriangle(int input) {
		int count1 = 0;
		int count2 = 1;
		int count3 = 0;
		while(count1 < input){
			while(count2 < input - count1) {
				System.out.print(" ");
				count2++;
				count3++;
			}
			while(count3 < input) {
				System.out.print("*");
				count3++;
			}
			System.out.print("\r");
			count1++;
			count2 = 1;
			count3 = 0;
		}
	}
	
	//Prints a pyramid of stars with a base equal to the input
	public static void starPyramid(int input) {
		int count1 = 0;
		int count2 = 1;
		int count3 = 0;
		int count4 = 0;
		while(count1 < input){
			while(count2 < input - count1) {
				System.out.print(" ");
				count2++;
				count3++;
			}
			while(count3 < input) {
				System.out.print("*");
				count3++;
				count4++;
			}
			while(count4 > 1) {
				System.out.print("*");
				count4--;
			}
			System.out.print("\r");
			count1++;
			count2 = 1;
			count3 = 0;
			count4 = 0;
		}
	}
	
	//Prints 2 pyramids, one inverted, or 1 diamond of stars with the middle length equal to the input
	public static void starDiamond(int input){
		int count1 = 0;
		int count2 = 1;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 1;
		int count7 = 0;
		int count8 = 0;
		
		while(count1 < input/2) {
			while(count2 < input - count1) {
				System.out.print(" ");
				count2++;
				count3++;
			}
			while(count3 < input) {
				System.out.print("*");
				count3++;
				count4++;
			}
			while(count4 > 1) {
				System.out.print("*");
				count4--;
			}
			System.out.print("\r");
			count1++;
			count2 = 1;
			count3 = 0;
			count4 = 0;
		}
		count5 = input - count1 - 1;
		while(count5 >= 0) {
			while(count6 < input - count5) {
				System.out.print(" ");
				count6++;
				count7++;
			}
			while(count7 < input) {
				System.out.print("*");
				count7++;
				count8++;
			}
			while(count8 > 1) {
				System.out.print("*");
				count8--;
			}
		System.out.print("\r");
		count5--;
		count6 = 1;
		count7 = 0;
		count8 = 0;
		}
	}
}
	
	//System.out.print("\r"); to start new line

