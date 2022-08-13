import java.util.Scanner;


public class UserInp
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
	    System.out.println("Enter a Number plz:");
	    
		int n = keyboard.nextInt();
		
	    System.out.println("2 * " + n + " = " + (n+n));
	}
}
			  