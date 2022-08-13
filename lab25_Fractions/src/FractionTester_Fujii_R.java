//Name: Ryan Fujii
//Period: 1
//Notes: Tests a variety of fractions into the methods of the Fraction.java program
public class FractionTester_Fujii_R {
	
	public static void testChoice() {
	    Fraction f01 = new Fraction(1);
	    Fraction f02 = new Fraction(1,2);
	    Fraction f03 = new Fraction(1,3);
	    Fraction f04 = new Fraction(1,4);

	    Fraction f05 = new Fraction(2,3);
	    Fraction f06 = new Fraction(4,5);
	    Fraction f07 = new Fraction(8,9);
	    Fraction f08 = new Fraction(11,34);
	    
	    Fraction f09 = new Fraction(23,24);
	    Fraction f10 = new Fraction(99,100);
	    Fraction f11 = new Fraction(5,7);
	    Fraction f12 = new Fraction(8,11);
	    
	    Fraction f13 = new Fraction(33);
	    Fraction f14 = new Fraction(1.5);
	    Fraction f15 = new Fraction(1.23);
	    Fraction f16 = new Fraction(0.5);
	    
	    Fraction totalGrade = new Fraction(1,13);
	    
	    Fraction sum1 = f01.add(f02);
	    System.out.println("sum: f01 + f02 = 3/2 = " + sum1);
	    if (sum1.num == 3 && sum1.denom == 2) {
	    	System.out.println("PASS");
	    	totalGrade.num += 1;
	    }
	    else {
	    	System.out.println("FAIL");
	    }
	    
	    Fraction sum2 = f05.add(f11);
	    System.out.println("sum: f05 + f11 = 29/21 = " + sum2);
	    if (sum2.num == 29 && sum2.denom == 21) {
	    	System.out.println("PASS");
	    	totalGrade.num += 1;
	    }
	    else {
	    	System.out.println("FAIL");
	    }
	    
	    Fraction sum3 = f09.add(f15);
	    System.out.println("sum: f09 + f15 = 1313/600 = " + sum3);
	    if (sum3.num == 1313 && sum3.denom == 600) {
	    	System.out.println("PASS");
	    	totalGrade.num += 1;
	    }
	    else {
	    	System.out.println("FAIL");
	    }
	    
	    System.out.println("");
	    
	    Fraction sub1 = f10.subtract(f07);
	    System.out.println("difference: f10 - f07 = 91/900 = " + sub1);
	    if (sub1.num == 91 && sub1.denom == 900) {
	    	System.out.println("PASS");
	    	totalGrade.num += 1;
	    }
	    else {
	    	System.out.println("FAIL");
	    }
	    
	    Fraction sub2 = f15.subtract(f09);
	    System.out.println("difference: f15 - f09 = 163/600 = " + sub2);
	    if (sub2.num == 163 && sub2.denom == 600) {
	    	System.out.println("PASS");
	    	totalGrade.num += 1;
	    }
	    else {
	    	System.out.println("FAIL");
	    }
	    
	    Fraction sub3 = f16.subtract(f06);
	    System.out.println("difference: f16 - f06 = -3/10 = " + sub3);	    
	    if (sub3.num == -3 && sub3.denom == 10) {
	    	System.out.println("PASS");
	    	totalGrade.num += 1;
	    }
	    else {
	    	System.out.println("FAIL");
	    }
	    
	    System.out.println("");
	    
	    Fraction pro1 = f14.multiply(f03);
	    System.out.println("product: f14 * f03 = 1/2 = " + pro1);	
	    if (pro1.num == 1 && pro1.denom == 2) {
	    	System.out.println("PASS");
	    	totalGrade.num += 1;
	    }
	    else {
	    	System.out.println("FAIL");
	    }
	    
	    Fraction pro2 = f04.multiply(f15);
	    System.out.println("product: f04 * f15 = 123/400 = " + pro2);
	    if (pro2.num == 123 && pro2.denom == 400) {
	    	System.out.println("PASS");
	    	totalGrade.num += 1;
	    }
	    else {
	    	System.out.println("FAIL");
	    }
	    
	    Fraction pro3 = f11.multiply(f10);
	    System.out.println("product: f11 * f10 = 99/140 = " + pro3);
	    if (pro3.num == 99 && pro3.denom == 140) {
	    	System.out.println("PASS");
	    	totalGrade.num += 1;
	    }
	    else {
	    	System.out.println("FAIL");
	    }
	    
	    System.out.println("");
	    
	    Fraction quo1 = f16.divide(f12);
	    System.out.println("quotient: f16 / f12 = 11/16 = " + quo1);   
	    if (quo1.num == 11 && quo1.denom == 16) {
	    	System.out.println("PASS");
	    	totalGrade.num += 1;
	    }
	    else {
	    	System.out.println("FAIL");
	    }
	    Fraction quo2 = f10.divide(f13);
	    System.out.println("quotient: f10 / f13 = 3/100 = " + quo2);	  
	    if (quo2.num == 3 && quo2.denom == 100) {
	    	System.out.println("PASS");
	    	totalGrade.num += 1;
	    }
	    else {
	    	System.out.println("FAIL");
	    }
	    
	    Fraction quo3 = f09.divide(f06);
	    System.out.println("quotient: f09 / f06 = 115/96 = " + quo3);
	    if (quo3.num == 115 && quo3.denom == 96) {
	    	System.out.println("PASS");
	    	totalGrade.num += 1;
	    }
	    else {
	    	System.out.println("FAIL");
	    }
	    
	    System.out.println("");
	    System.out.println("Total score: " + totalGrade);
	}
	public static void main(String[] args) {
		testChoice();
	}
	
}
