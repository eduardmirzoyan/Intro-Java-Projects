import java.text.DecimalFormat;

public class TestFractions
{
	private final static String F1 = "0/1";
	private final static String F2 = "7/1";
	private final static String F3 = "-3/5";
	private final static String F4 = F3;
	private final static String F5 = "9/8";
	
	private final static String A1 = "5/6";
	private final static String A2 = "5/2";
	private final static String M1 = "1/6";
	private final static String M2 = "1/1";
	private final static String S1 = "1/6";
	private final static String S2 = "-3/2";
	private final static String D1 = "3/2";
	private final static String D2 = "1/4";
	
	private static int pointCounter = 0;
	
  public static void testConstructors()
  {
	
	System.out.println("~~Welcome to Ed's Fraction Tester~~");
	System.out.println();
	System.out.println("~~Fractions~~");
    Fraction f1 = new Fraction();
    Fraction f2 = new Fraction(7);
    Fraction f3 = new Fraction(12, -20);
    Fraction f4 = new Fraction(f3);
    Fraction f5 = new Fraction(1.125);

    System.out.println(result(f1.toString(), F1) + " 0 -> 0/1 Your Answer: " + f1);
    System.out.println(result(f2.toString(), F2) + " 7 -> 7/1 Your Answer: " + f2);
    System.out.println(result(f3.toString(), F3) + " 12, -20 -> -3/5 Your Answer: " + f3);
    System.out.println(result(f4.toString(), F4) + " #3 -> -3/5 Your Answer: " + f4);
    System.out.println(result(f5.toString(), F5) + " 1.125 -> 9/8 Your Answer: " + f5);
    System.out.println();
  }

  public static void testArithmetic()
  {
    Fraction f1 = new Fraction(1, 2);
    Fraction f2 = new Fraction(1, 3);
    Fraction f3 = new Fraction(2);
    Fraction f4 = new Fraction(2, 4);

    System.out.println("~~Fraction Operations~~");
    Fraction sum1 = f1.add(f2);
    System.out.println(result(sum1.toString(), A1) + " 1/2 + 1/3 = 5/6 Your Answer: " + sum1);
    
    Fraction sum2 = f1.add(f3);
    System.out.println(result(sum2.toString(), A2) + " 1/2 + 2/1 = 5/2 Your Answer: " + sum2);

    Fraction product1 = f1.multiply(f2);
    System.out.println(result(product1.toString(), M1) + " 1/2 * 1/3 = 1/6 Your Answer: " + product1);
    
    Fraction product2 = f1.multiply(f3);
    System.out.println(result(product2.toString(), M2) + " 1/2 * 2/1 = 1/1 Your Answer: " + product2);
    
    Fraction difference1 = f1.subtract(f2);
    System.out.println(result(difference1.toString(), S1) + " 1/2 - 1/3 = 1/6 Your Answer: " + difference1);
    
    Fraction difference2 = f1.subtract(f3);
    System.out.println(result(difference2.toString(), S2) + " 1/2 - 2/1 = -3/2 Your Answer: " + difference2);

    Fraction quotient1 = f1.divide(f2);
    System.out.println(result(quotient1.toString(), D1) + " 1/2 / 1/3 = 3/2 Your Answer: " + quotient1);
    
    Fraction quotient2 = f1.divide(f3);
    System.out.println(result(quotient2.toString(), D2) + " 1/2 / 2/1 = 1/4 Your Answer: " + quotient2);
    System.out.println();
    
    System.out.println("~~Choice Fractions~~");
    Fraction inverse = f2.inverse(f2);
    System.out.println("Inverse: " + f2 + " -> " + inverse);
    
    boolean equal = f1.equal(f4);
    System.out.println("Does it Equal? 1/2 = 2/4? " + equal);

    System.out.println();
  }

  public static void testValues()
  {
    Fraction f = new Fraction(2, 3);
    System.out.println("~~Fraction To Decimal Test~~");
    System.out.println(f + " = 0.6666666666666666 Your Answer: " + f.getValue());
    System.out.println();
  }

  public static void main(String[] args)
  {
    testConstructors();
    testArithmetic();
    testValues();
    
    System.out.println("~~Your results are:~~");
    System.out.println("Score = " + pointCounter + "/13");
    double percent = (double) pointCounter / 13;
    DecimalFormat df = new DecimalFormat(".##");
    percent = Double.parseDouble(df.format(percent));
    percent = (percent * 100);
    if(pointCounter == 13) {
    	System.out.println("Percent = 100%");
    }
    else {
    System.out.println("Percent = " + percent + "%");
    }
  }
  
  public static String result(String input, String answer) {
	if(input.equals(answer)) {
		pointCounter++;
		return "\u2713 ";
	}
	else {
	return "\u2716 ";
	}
  }
  
}
