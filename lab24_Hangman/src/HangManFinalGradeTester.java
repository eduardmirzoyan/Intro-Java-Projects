
// Hangman lab final grade tester
// Mr. Taylor
// v1.0
// 03/07/2018
//
// HangManFinalGradeTester.java class tests HangmanGame.java class
// Add this class to HangMan project and run for test results

// Assumptions for tester:
// 1) Hangman.java class was not to be modified (i.e., -'s used for guessed string)
// 2) no spaces or punctuation in return strings

// Note: this version contains possible HangmanGame.java solutions


public class HangManFinalGradeTester {
	
	// list of test words and letters
	// lower case only
	//private static String[] words = {"inheritance", "abstraction", "encapsulation", "polymorphism"};
	//private static String letters = "abcdefghijklmnopqrstuvwxyz";
	
	// fields for answer, partial answer, and letters tried
	private String answer;
	private StringBuffer partialAnswer;
	private StringBuffer lettersTried;


	public static void main(String[] args) {
		
		//String testWord;
		//char testLetter;
		
		//set random testing word
	    //String testWord = words[(int)(Math.random() * words.length)];
				
		//set random test letter
		//testLetter = testWord.charAt((int)Math.random() * testWord.length());
		
		//initialize score variables
	    int testCount = 0;
	    int failCount = 0;
	    double percentPass = 0;
	    double earnedPoints = 0;
	      
		//set test word and test characters
		final String TEST_WORD = "accoutrements";
		final char   VALID_TEST_LTR01 = 'c';
		final char   VALID_TEST_LTR02 = 'c';
		final char   INVAL_TEST_LTR01 = 'z';
		final char   INVAL_TEST_LTR02 = 'l';
		
		// points
	    final int TOTALPOINTS = 10;
		
		//instantiate hangman game
	    HangmanGame game = new HangmanGame(TEST_WORD);
	    
	    //instantiate hangman tester
	    HangManFinalGradeTester tester = new HangManFinalGradeTester(TEST_WORD);
	    
	    //test constructor initialized guessed string properly
	    testCount ++;
	    System.out.println("Constructor initialization sanity check");
	    System.out.println("tester: " + tester.getGuessed() + "\ngame  : " + game.getGuessed());
	    if (!tester.getGuessed().equals(game.getGuessed())){
	    		failCount ++;
	    		System.out.println("FAIL");
	    } 
	    else
	    		System.out.println("PASS");
	    
	    //test int tryLetter(char letter)
	    	//test for letter that is there
	    System.out.println("tryLetter(" + VALID_TEST_LTR01 + ")");
	    testCount ++;
	    System.out.println("tester: " + tester.tryLetter(VALID_TEST_LTR01) + "\ngame  : " + game.tryLetter(VALID_TEST_LTR01));
	    if (tester.tryLetter(VALID_TEST_LTR01) != game.tryLetter(VALID_TEST_LTR01)) {
	    		failCount ++;
	    		System.out.println("FAIL");
	    } 
	    else
	    		System.out.println("PASS");
	    		
	    	//test for letter that is not there
	    System.out.println("tryLetter(" + INVAL_TEST_LTR01 + ")");
	    testCount ++;
	    System.out.println("tester: " + tester.tryLetter(INVAL_TEST_LTR01) + "\ngame  : " + game.tryLetter(INVAL_TEST_LTR01));
	    if (tester.tryLetter(INVAL_TEST_LTR01) != game.tryLetter(INVAL_TEST_LTR01)) {
	    		failCount ++;
	    		System.out.println("FAIL");
	    } 
	    else
	    		System.out.println("PASS");
	    
	    	//test a letter that is already tried
	    testCount ++;
	    System.out.println("tryLetter(" + VALID_TEST_LTR01 + ")");
	    System.out.println("tester: " + tester.tryLetter(VALID_TEST_LTR01) + "\ngame  : " + game.tryLetter(VALID_TEST_LTR01));
	    if (tester.tryLetter(VALID_TEST_LTR01) != game.tryLetter(VALID_TEST_LTR01)) {
	    		failCount ++;
	    		System.out.println("FAIL");
	    } 
	    else
	    		System.out.println("PASS");
	    
	    
	    //test getTried() 
	    testCount ++;
	    System.out.println("getTried()");
	    System.out.println("tester: " + tester.getTried() + "\ngame  : " + game.getTried());
	    if (!tester.getTried().equals(game.getTried())){
	    		failCount ++;
	    		System.out.println("FAIL");
	    } 
	    else
	    		System.out.println("PASS");
	    
	    //test getGuessed()
	    testCount ++;
	    System.out.println("getGuessed()");
	    System.out.println("tester: " + tester.getGuessed() + "\ngame  : " + game.getGuessed());
	    if (!tester.getGuessed().equals(game.getGuessed())){
	    		failCount ++;
	    		System.out.println("FAIL");
	    } 
	    else
	    		System.out.println("PASS");
	    
	    // test summary
	 	System.out.println();
	 	System.out.println("*****   TEST SUMMARY     *****");
		System.out.println("Tests:          " + testCount);
	 	System.out.println("Failed:         " + failCount);
	 	System.out.println("Total points:   " + TOTALPOINTS);
	 	
	 	percentPass = (double) (testCount - failCount) / testCount * 100;
	 	earnedPoints = percentPass * TOTALPOINTS / 100;
	 	System.out.println("Percent passed: " + Math.round(percentPass) + "%");
	 	System.out.println("Points earned:  " + Math.round(earnedPoints));
	    
	}    
	  
		
    // initialize the answer to the given string and fill 
	// the partial answer buffer with dashes
	public HangManFinalGradeTester(String word){
			
		answer = word;
		partialAnswer = new StringBuffer();
		lettersTried = new StringBuffer();
			
		// print the word
		System.out.println("test word: " + answer);
			
		// initialize the partial answer buffer with '-'
		// same number as the number of characters in the answer
		for (int i = 0; i < word.length(); i++) {
			partialAnswer.append('-');
		}
		
	}
		
	// get the letters tried 
	public String getTried(){
			
		return lettersTried.toString();
			
	}
		
	// get the letters guessed
	public String getGuessed(){
			
		return partialAnswer.toString();
			
	}
		
	int tryLetter(char letter) {
		
		int matchCount = 0;
			
		// scan the letters tried list 
		for (int i = 0; i < lettersTried.length(); i++) {
		
			// if letter matches the list, then set result to 0 and return
			if (lettersTried.charAt(i) == letter)
				return 0;
		}
		// if not in the tried list already, add the letter to the list
		lettersTried.append(letter);
			
		// scan the answer
		for (int i = 0; i < answer.length(); i++) {
				
		    //if the letter matches
			if (answer.charAt(i) == letter) {
				// replace the - in the partial answer buffer with the letter
				partialAnswer.setCharAt(i, letter);
				// up the match count
				matchCount++;	
			}
		}
					
		// if the match count is >0 set result to 1	
		if (matchCount > 0)	
			return 1;
		else 
			return -1;
			
	}


}
