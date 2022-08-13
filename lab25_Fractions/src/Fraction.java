import java.text.DecimalFormat;


// Represents a fraction with an int numerator and int denominator
// and provides methods for adding and multiplying fractions.

public class Fraction
{
  // *** instance variables ***
  int num;
  int denom;

  // *** Constructors ***

  public Fraction()       // no-args constructor
  {
    num = 0;
    denom = 1;
  }

  public Fraction(int n)
  {
    num = n;
    denom = 1;
  }

  public Fraction(int n, int d)
  {
    if (d != 0)
    {
      num = n;
      denom = d;
      reduce();
    }
    else
    {
      throw new IllegalArgumentException(
           "Fraction construction error: denominator is 0");
    }
  }
  
  //Converts an input decimal thats to the 10th place to a fraction which contains only whole numbers
  public Fraction(double n) {
	  DecimalFormat df = new DecimalFormat(".#########");
	  n = Double.parseDouble(df.format(n));
	  if(n < 1) {
		  StringBuffer number = new StringBuffer("" + n);
		  number.substring(number.indexOf("."));
		  number.deleteCharAt(number.indexOf("."));
		  int zeros = number.length() - 1;
		  num = Integer.parseInt(number.toString());
		  denom = (int) Math.pow(10.0, zeros);
		  reduce();
	  }
	  else {
		  int count = 0;
		  for(; n <= count; count++) {
		  }
		  StringBuffer number = new StringBuffer("" + n);
		  number.substring(number.indexOf("."));
		  number.deleteCharAt(number.indexOf("."));
		  int zeros = number.length() - 1;
		  num = Integer.parseInt(number.toString());
		  denom = (int) Math.pow(10.0, zeros);
		  num += denom * count;
		  reduce();
	  }
  }

  public Fraction(Fraction other)  // copy constructor
  {
    num = other.num;
    denom = other.denom;
  }

  // *** public methods ***

  // Returns the sum of this fraction and other
  public Fraction add(Fraction other)
  {
    int newNum = num * other.denom + denom * other.num;
    int newDenom = denom * other.denom;
    return new Fraction(newNum, newDenom);
  }

  // Returns the sum of this fraction and m
  public Fraction add(int m)
  {
    return new Fraction(num + m * denom, denom);
  }

  // Returns the product of this fraction and other
  public Fraction multiply(Fraction other)
  {
    int newNum = num * other.num;
    int newDenom = denom * other.denom;
    return new Fraction(newNum, newDenom);
  }

  // Returns the product of this fraction and m
  public Fraction multiply(int m)
  {
    return new Fraction(num * m, denom);
  }
  
  public Fraction subtract (Fraction other) {
	  int newNum = num * other.denom - denom * other.num;
	  int newDenom = denom * other.denom;
	  return new Fraction(newNum, newDenom);
  }
  public Fraction subtract (int m) {
	  
	  return new Fraction(num - m * denom, denom);
  }
  public Fraction divide (Fraction other) {
	  	if(other.denom == 0) {
	  		throw new IllegalArgumentException(
	  	           "Fraction construction error: denominator is 0");
	  	}
	    int newNum = num * other.denom;
	    int newDenom = denom * other.num;
	  return new Fraction(newNum, newDenom);
  }
  public Fraction divide (int m) {
	  if(m == 0) {
		  throw new IllegalArgumentException(
		           "Custom Msg: Fraction construction error: denominator is 0");
	  }
	  return new Fraction(num, denom * m);
  }

  //Inverses the denominator and numerator of the fraction
  public Fraction inverse(int m) {
	  int newNum = 1;
	  int newDenom = m;
	  
	  return new Fraction(newNum, newDenom);
  }
  
  public Fraction inverse(Fraction other) {
	  int newNum = denom;
	  int newDenom = num;
	  return new Fraction(newNum, newDenom);
  }
  
  public boolean equal(Fraction other) {
	  if((double) num / (double) denom == (double) other.num / (double) other.denom) {
		  return true;
	  }
	  else {
	  return false;
	  	}
  }
  
  // Returns the value of this fraction as a double
  public double getValue()
  {
    return (double)num / (double)denom;
  }

  // Returns a string representation of this fraction
  public String toString()
  {
    return num + "/" + denom;
  }
 
  // *** private methods ***

  // Reduces this fraction by the gcf and makes denom > 0
  private void reduce()
  {
    if (num == 0)
    {
      denom = 1;
      return;
    }

    if (denom < 0)
    {
      num = -num;
      denom = -denom;
    }

    int q = gcf(Math.abs(num), denom);
    num /= q;
    denom /= q;    
  }

  //  Returns the greatest common factor of two positive integers
  private int gcf(int n, int d)
  {
    if (n <= 0 || d <= 0)
    {
      throw new IllegalArgumentException(
                  "gcf precondition failed: " + n + ", " + d);
    }

    if (n % d == 0)
      return d;
    else if (d % n == 0)
      return n;
    else
      return gcf(n % d, d % n); 
  }
}
