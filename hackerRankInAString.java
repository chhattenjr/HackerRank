/**
 * 
 */

/**
 * @author hatte
 *
 */
public class hackerRankInAString {
	private static final double stringLimit = Math.pow(10, 4);
	private static final double queryLimit = Math.pow(10, 2);
	
	static String hackerrankInString(String s) {
		int stringHackerRankCount = 0;
        
        String hasString = null;
        String mayContainHackerRank = "";
        String stringHackerRank = "hackerrank";
        
        System.out.println("Length of String " + s + ": " + s.length());
        
        System.out.println("Length of String Limit: " + stringLimit);
        
        if(Math.abs(s.length()) < 10 || Math.abs(s.length()) > stringLimit) {
            System.out.println("Invalid String: " + s);
            System.exit(0);
        }

        mayContainHackerRank = s;
        
		System.out.println("String: " + mayContainHackerRank);
		
		for(int i = 0; i < mayContainHackerRank.length(); i++) {
			System.out.println("Character at index " + i + ": " + mayContainHackerRank.charAt(i));
			
			if(mayContainHackerRank.charAt(i) == stringHackerRank.charAt(stringHackerRankCount)) {
				stringHackerRankCount++;
			}
			
			if(stringHackerRankCount == 10) {
				break;
			}
		}
		
		System.out.println("Length of String HackerRank: " + stringHackerRankCount);
		
		if(stringHackerRankCount == 10) {
			hasString = "YES";
		} else {
			hasString = "NO";
		}
		
		System.out.println(hasString);
		
		return hasString;
	}
	
	static String[] splitString(String s) {
		String[] listOfWords = null;
		
		listOfWords = s.split("\\s+");
		
		return listOfWords;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "ahankercka";
		String string2 = "hacakaeararanaka";
		String string3 = "hhhhaaaaackkkkerrrrrrrrank";
		String string4 = "crackerhackerknar";
		String string5 = "hhhackkerbanker";
		String string6 = "rhackerank";
		String string7 = "abcdefghijklmnopqrstuvwxyz";
		String string8 = "hackeronek";
		String string9 = "hackerrank";
		String string10 = "knarrekcah";
		
		hackerrankInString(string1);
		System.out.println();
		hackerrankInString(string2);
		System.out.println();
		hackerrankInString(string3);
		System.out.println();
		hackerrankInString(string4);
		System.out.println();
		hackerrankInString(string5);
		System.out.println();
		hackerrankInString(string6);
		System.out.println();
		hackerrankInString(string7);
		System.out.println();
		hackerrankInString(string8);
		System.out.println();
		hackerrankInString(string9);
		System.out.println();
		hackerrankInString(string10);
	}

}
