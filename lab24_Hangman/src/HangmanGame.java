public class HangmanGame {

   private String answer;
   private StringBuffer guessed;
   private StringBuffer tried = new StringBuffer("");
   
   //The main constructor that transfers the answer to this class and shows the itial word
   public HangmanGame(String word) {
      answer = word;
      guessed = new StringBuffer(word);
      for(int i = 0; i < guessed.length(); i++) {
         guessed.setCharAt(i, '-');
      }
      String hidden = "";
      for(int count = 0; count < answer.length(); count++) {
			hidden += '-';
		}
      System.out.println("WORD: " + hidden);
   }
   
   //returns the answer to the game
   public String getWord() {
      return answer;
   }
   
   //converts the stringbuffer into a inmutable string
   public String getGuessed() {
      return guessed.toString();
   } 
   
   //converts the tried letters into an imutable string
   public String getTried() {
      return tried.toString();
   }
   
   //tries the input letter to see if it exists in the answer and returns a number
   public int tryLetter(char letter) {
      if(tried.toString().indexOf(letter) >= 0) {
         return 0;
      }   
      tried.append(letter);
      if(answer.indexOf(letter) >= 0) {
         for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == letter) {
               guessed.setCharAt(i, letter);
            }
         }             
         return 1;
      }
      return -1;
   }
}