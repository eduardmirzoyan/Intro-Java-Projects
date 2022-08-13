
/*
 * Name: Eduard Mirzoyan
 * Period: 3
 * Description: A lab about the different uses of Strings.
 */


public class StringToolBox {
	
	//Rewrites input strings but with caps
	public static String nameEcho(String s) {
		s = s.trim();
		int loc = s.indexOf(" ");
		s = s.replace(s.substring(loc + 1), s.substring(loc + 1).toUpperCase());
		return s;
	}
	
	//Checks if the input ends with exactly one star
	public static boolean endsWithStar(String s) {
		boolean result;
		s = s.trim();
	if(s.equals("")) {
			result = false;
	}
	else {
		int word = s.length() - 1;
		int end = s.indexOf("*");
		if(word == end) {
			result = true;
		}
		else {
			result = false;
		}
	}
		return result;
	}

	//Checks if the input ends with exactly two stars
	public static boolean endsWithTwoStars(String s) {
		boolean result;
		int word = s.length() - 2;
		int end = s.indexOf("**");
		if(s.length() >= 2) {
			if(word == end) {
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
 
	//Returns the last 4 characters of a credit card # string
	public static String last4(String s) {
		s = s.trim();
		int start = s.length() - 4;
		String result = s.substring(start);
		return result;
	}

	//Returns the last 5 characters of a credit card # string excluding spaces
	public static String last5(String s) {
		s = s.trim();
		int space = s.lastIndexOf(" ");
		StringBuilder sb = new StringBuilder(s);
		sb.deleteCharAt(space);
		s = sb.toString();
		int start = s.length() - 5;
		String result = s.substring(start);
		return result;
	}

	//Scrolls the last character of a string to the front of the string
	public static String scroll(String s) {
		s = s.trim();
		char a = s.charAt(0);
		s = s.substring(1, s.length());
		return s + a;
	}

	//Swaps the first and last name of an input name
	public static String convertName(String s) {
		s = s.trim();
		int last = s.indexOf(",");
		String lastName = s.substring(0, last);
		String firstName = s.substring(last + 2, s.length());
		return firstName + " " + lastName;
	}
	
	//Removes the dashes from an input
	public static String removeDashes(String s) {
		s = s.trim();
		s = s.replace("-", "");
		return s;
	}

	//Rewrites the date in formal format replacing slashes with dashes
	public static String dateStr (String s) {
		s = s.trim();
		String s1, s2, s3;
		int slash1 = s.indexOf("/");
		int slash2 = s.lastIndexOf("/");
		s1 = s.substring(0, slash1);
		s2 = s.substring(slash1+1, slash2);
		s3 = s.substring(slash2+1, s.length());
		if(s1.length() < 2) {
			s1 = "0" + s1;
		}
		else {}
		if(s2.length() < 2) {
			s2 = "0" + s2;
		}
		else {}
		return s2 + "-" + s1 + "-" + s3;
	}
	
	//Replaces all 0s with 1s and 1s with 0s
	public static String negativeBits(String s) {
		s = s.trim();
		s = s.replaceAll("0", "a");
		s = s.replaceAll("1", "b");
		s = s.replaceAll("a", "1");
		s = s.replaceAll("b", "0");
		return s;
	}
	
	//Checks if all the characters in an input string are the same
	public static boolean containsSameChar(String s) {
		s = s.trim();
		boolean result;
		char a = s.charAt(0);
		String s1 = s.substring(1, s.length());
		if((s1+a).equals(s)){
			result = true;
		}
		else {
			result = false;
		}
		return result;
	}
	
	//removes any string in between /* and */
	public static String removeComments(String s) {
		s = s.trim();
		String s1 = null, s2 = null;
		int start1 = s.indexOf("/*");
		int end1 = s.indexOf("*/");
		for(int count = 0; count < s.length(); count++) {
			if(start1 != -1) {
				s1 = s.substring(0, start1);
				s2 = s.substring(end1 + 2, s.length());
				s = s1 + s2;
				start1 = s.indexOf("/*");
				end1 = s.indexOf("*/");
				if(end1 == -1) {
					return s;
				}
			}
		}
		return s;

	}
	
	//Used to encrypt or decrypt a caesar cipher, by moving characters over an 'n' amount
	public static String caesar(String s, int n){
		s = s.trim();
		for(int count = 0; count < s.length(); count++) {
			char ch = s.charAt(count);
			int num = (int)ch;
			int newNum = num + n;
				if(Character.isUpperCase(ch)) {
					if(newNum > 90) {
						newNum = ((num + n) - 90) + 64;
						char newChar = (char)newNum;
						StringBuilder s1 = new StringBuilder(s);
						s1.setCharAt(count, newChar);
						s = s1.toString();
						
					}
					else if(newNum < 65) {
						newNum = ((num + n) + 26);
						char newChar = (char)newNum;
						StringBuilder s1 = new StringBuilder(s);
						s1.setCharAt(count, newChar);
						s = s1.toString();	
					}
					else {
						newNum = num + n;
						char newChar = (char)newNum;
						StringBuilder s1 = new StringBuilder(s);
						s1.setCharAt(count, newChar);
						s = s1.toString();
					}
				}
				
				if(Character.isLowerCase(ch)) {
					if(num + n > 122) {
						newNum = ((num + n) -  122) + 96;
						char newChar = (char)newNum;
						StringBuilder s1 = new StringBuilder(s);
						s1.setCharAt(count, newChar);
						s = s1.toString();	
					}
					else if(num + n < 97) {
						newNum = ((num + n) + 26);
						char newChar = (char)newNum;
						StringBuilder s1 = new StringBuilder(s);
						s1.setCharAt(count, newChar);
						s = s1.toString();	
					}
					else {
						newNum = num + n;
						char newChar = (char)newNum;
						StringBuilder s1 = new StringBuilder(s);
						s1.setCharAt(count, newChar);
						s = s1.toString();
					}

				}
				
			}
	    return s;
	}
	
	//Checks if input string is a Palindrome or not
	public static boolean isPalindrome(String s) {
		s = s.trim();
		s = s.toUpperCase();
		String newWord = "";
		for(int count = 0; count < s.length(); count++) {
			char ch = s.charAt(count);
			if(Character.isLetter(ch)) {
			newWord += ch;
			}
		}
		for(int count = 0; count < s.length() / 2; count++) {
			if(newWord.charAt(count) != (newWord.charAt(newWord.length() - 1 - count))) {
				return false;
				}
			}
			
		return true;
		//This also works:
		//return s.equals(new StringBuilder(s).reverse().toString());
	}
	
	//Checks if input string is a valid password containing all requirements listed on lab instructions
	public static boolean validPassword(String s) {
		s = s.trim();
		boolean resultUpper = false;
		boolean resultLower = false;
		boolean resultDidgit = false;
		for(int count = 0; count < s.length(); count++) {
			if(s.length() < 7) {
				return false;
			}
			if(Character.isDigit(s.charAt(count))) {
				resultDidgit = true;
			}
			if(Character.isWhitespace(s.charAt(count))) {
				return false;
			}
			if(Character.isUpperCase(s.charAt(count))) {
				resultUpper = true;
			}
			if(Character.isLowerCase(s.charAt(count))) {
				resultLower = true;
			}
		}
		if(resultDidgit == resultUpper == resultLower) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Personal tester I used to try different parts of labs :)
	public static String test(String s) {
		s = s.replaceFirst("0", "a");
		return s;
	}
}