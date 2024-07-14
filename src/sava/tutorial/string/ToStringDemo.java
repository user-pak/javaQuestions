package sava.tutorial.string;

import java.util.Arrays;

public class ToStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number = 615.10;
		String str = String.format("%.2f", number);
		
		int dot = str.indexOf('.');
		
		System.out.println(dot + " is digits before decimal point");
		System.out.println((str.length()-1-dot) + " is digits after decimal point");
		System.out.println(str.length());
		
//        double d = 858.48;
//        String s = Double.toString(d);
//        
//        int dot = s.indexOf('.');
//        
//        System.out.println(dot + " digits " +
//            "before decimal point.");
//        System.out.println( (s.length() - dot - 1) +
//            " digits after decimal point.");
//        System.out.println(s.length());
		
		String palindrome = "\"Niagara. O roar again!\"";
		String[] charSequence = palindrome.split("a");
		System.out.println(Arrays.toString(charSequence));
		System.out.println(palindrome.indexOf("rf", 0));
		
	}

}
