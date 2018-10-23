public class LeetSpeak {
	
	public static String toLeet(String s){
		for(int i=0; i < alphabetLength; i++){
			 s = s.replace(norm[i].toLowerCase(), leet[i]);
			 s = s.replace(norm[i], leet[i]);
		}
		return s;
	}

	public static String toNorm(String s){
		for(int i=0; i < alphabetLength; i++){
			s = s.replace(leet[i], norm[i]);
			s = s.replace(leet[i], norm[i].toLowerCase());
		}
		return s;
	}
	public static void main(String args[]){
		String[] testWords = {"I am elite.", "Da pain!", "Eye need help!"};
		String[] testLeets = {"3|337", "570R(\\/)"};
            for (String testWord : testWords) {
                System.out.println(testWord + " -> " + toLeet(testWord));
            }
            for (String testLeet : testLeets) {
                System.out.println(testLeet + " -> " + toNorm(testLeet));
            }
	}
	private static final String[] 	norm = {"A","B","E","I","L","M","N","O","S","T","V","W"};
	private static final String[] 	leet = {"4","6","3","1","|","(\\/)","(\\)","0","5","7","/\\","´//"};
	private static final int alphabetLength = 12;
}