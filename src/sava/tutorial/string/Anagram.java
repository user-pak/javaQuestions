package sava.tutorial.string;

import java.util.Arrays;

public class Anagram {

	private static boolean areAnagrams(String string1, String string2) {
		
		String letters1 = removeJunk(string1.toLowerCase());
		String letters2 = removeJunk(string2.toLowerCase());

		return sort(letters1).equals(sort(letters2));
	}

	private static String sort(String letters) {
		// TODO Auto-generated method stub
		char[] arrayToSort = letters.toCharArray();
		Arrays.sort(arrayToSort);
		System.out.println(arrayToSort.toString());
		System.out.println(Arrays.toString(arrayToSort));
//		return Arrays.toString(arrayToSort);
		return new String(arrayToSort);
		
	}

	private static String removeJunk(String string) {
		// TODO Auto-generated method stub
		char[] charArray = string.toCharArray();
		String letters = "";
		
		for(char ch :charArray) {
			if(Character.isLetter(ch)) {
				letters += ch;
			}
		}

		return letters.toString();
	}
	
	public static void main(String[] args) {
		
		System.out.println(areAnagrams("Cosmo and Laine:", "Maid, clean soon!"));
	}
}
