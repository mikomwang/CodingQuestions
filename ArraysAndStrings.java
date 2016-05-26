
public class ArraysAndStrings {

	/** Implement an algorithm to determine if a string has
	 * all unique characters (not just alphabet letters)
	 * without using additional data structures (like a HashSet). */
	public static boolean isUnique(String word) {
		// there are 128 unique characters in ASCII format
		if (word.length() > 128) {
			return false;
		}
		boolean[] char_set = new boolean[128];
		for (int i = 0; i < word.length(); i += 1) {
			int val = (int) word.charAt(i);
			if (char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}
	
	//Time complexity: O(N)
	//Space complexity: O(1)
	
	
	/** Given two character strings, determine if one is a 
	 * permutation of the other. */
	public static boolean checkPermutation(String word1, String word2){
		if (word1.length() != word2.length()) {
			return false;
		}
		String newWord1 = sort(word1); //note: pseudofunction
		String newWord2 = sort(word2);
		return newWord1.equals(newWord2);
	}
	
	
	/** Write a method to replace all spaces in a string with
	 * "%20". Assume there is sufficient space at the end to 
	 * hold all the additional characters, and that you are given
	 * the "true" length of the string. */
	public static void URLify(String[] string, int length) {
		
	}
	
}
