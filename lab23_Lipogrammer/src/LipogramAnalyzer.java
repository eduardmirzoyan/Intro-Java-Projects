
public class LipogramAnalyzer {

	private static String original;

	public LipogramAnalyzer(String text) {
		original = text;
	}

	public static String mark(char letter) {
		String newText = original.replace(letter, '#');
		//newText = newText.replace('E', '#');
		return newText;
	}

	public static String allWordsWith(char letter) {
		original = original.trim();
		original = original + " ";
		String permText = "";
		String testWord = "";
		int start = 0;
		int end = original.indexOf(" ");
		for(int count = 0; count < original.length(); count++) {
			if(start != -1) {
				testWord = original.substring(start, end);
				if(testWord.contains("" + letter) == true) {
					permText += original.substring(start, end) + "\n";

				}
				start = end + 1;
				end = original.indexOf(" ", start + 1);
			}
			if(end == -1) {
				break;
			}	
		}
		return permText;
	}
}
