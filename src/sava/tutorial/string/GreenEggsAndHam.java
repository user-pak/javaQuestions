package sava.tutorial.string;

import java.util.Arrays;
import java.util.Iterator;

public class GreenEggsAndHam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		findMe();
		computInitials();
		
	}

	private static void findMe() {
		String searchMe = "Green eggs and ham";
		String findMe = "eggs";

		System.out.println(searchMe.regionMatches(true, 6, findMe, 0, findMe.length()));

		if(searchMe.contains(findMe)) {
			int findMeIdx = searchMe.indexOf(findMe);
			System.out.println(searchMe.substring(findMeIdx, findMeIdx + findMe.length()));

		}
	}
	
	private static void computInitials() {
		
		String myName = "Hyun-Chung Pak";
		String initials = "The Initial is ";
		StringBuilder initialsBuilder = new StringBuilder(initials);
		
		for(int i = 0; i < myName.length(); i++) {
			
			if(Character.isUpperCase(myName.charAt(i))) {
				initials += myName.charAt(i); 
				initialsBuilder.append(myName.charAt(i));
			}
		}
		
		System.out.println(initials);
		System.out.println(initialsBuilder.toString());
	}
	
	

}
