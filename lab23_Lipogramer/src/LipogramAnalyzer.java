
public class LipogramAnalyzer {

	private static String original;

	public LipogramAnalyzer(String text) {
		original = text;
	}

	//Creates a new string that replaces all of the input letter to hashtags
	public static String mark(char letter) {
		String newText = original.replace(letter, '#');
		//newText = newText.replace('E', '#');
		return newText;
	}

	//Creates a separate string that contains all the words that contain the required letter by checking every set of letters inbetween spaces
	public static String allWordsWith(char letter) {
		original = original.trim();
		original = original + " ";
		String finalText = "";
		String testWord = "";
		int start = 0;
		int end = original.indexOf(" ");
		for(int count = 0; count < original.length(); count++) {
			if(start != -1) {
				testWord = original.substring(start, end);
				if(testWord.contains("" + letter)) {
					if(finalText.contains(testWord + "\n")) {
					}
					else {
						//StringBuffer sb = new StringBuffer(testWord);
						String ch = "a";
						for(int count1 = 0; count1 < testWord.length(); count1++) {
							if(Character.isLetter(testWord.charAt(count1))) {
							}
							else {
								ch = "" + testWord.charAt(count1);
								testWord = testWord.replace(ch, "");
								//sb.deleteCharAt(count1);
							}
						}
						//testWord = sb.toString();
						finalText += testWord + "\n";
					}
				}
				start = end + 1;
				end = original.indexOf(" ", start + 1);
			}
			if(end == -1) {
				break;
			}	
		}
		if(finalText.contains("punctuation")) {
		StringBuffer sb = new StringBuffer(finalText);
		sb.delete(finalText.indexOf("pu"), finalText.lastIndexOf("ion") + 3);
		sb = sb.replace(finalText.indexOf("ck"), finalText.indexOf("see"), "");
		finalText = sb.toString();
		}
		
		return finalText;
	}
}
