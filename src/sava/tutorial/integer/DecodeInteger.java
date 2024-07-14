package sava.tutorial.integer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DecodeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int primitiveInt = 65;
		String strInt = "101";
		System.out.println(Integer.decode(strInt));
//		System.out.println(Integer.parseInt(strInt));
		System.out.println(Integer.parseInt(strInt, 2));
		String ch = Integer.toString(primitiveInt,10);
		System.out.println(Integer.toString(primitiveInt,10));
		System.out.println(ch);
		System.out.format(Locale.KOREAN,
			    "The value of the float " + "variable is %f, while the " +
			    "value of the integer variable " + "is %d, and the string is %s%n", 
			    011f, 10000, "13203");

		System.out.println(Calendar.getInstance());
	      long n = 461012;
	      System.out.format("%d%n", Long.valueOf(n));      //  -->  "461012"
	      System.out.format("%08d%n", n);    //  -->  "00461012"
	      System.out.format("%+8d%n", n);    //  -->  " +461012"
	      System.out.format("%,8d%n", n);    // -->  " 461,012"
	      System.out.format("%+,8d%n%n", n); //  -->  "+461,012"
	      
	      double pi = Math.PI;

	      System.out.format("%f%n", pi);       // -->  "3.141593"
	      System.out.format("%.3f%n", pi);     // -->  "3.142"
	      System.out.format("%10.3f%n", pi);   // -->  "     3.142"
	      System.out.format("%-10.3f%n", pi);  // -->  "3.142"
	      System.out.format(Locale.FRANCE,
	                        "%-10.4f%n%n", pi); // -->  "3,1416"

	      Calendar c = Calendar.getInstance();
	      System.out.format("%tB %te, %tY%n", c, c, c); // -->  "May 29, 2006"

	      System.out.format("%tl:%tM %tp%n", c, c, c);  // -->  "2:34 am"

	      System.out.format("%tD%n", c);    // -->  "05/29/06"
	    
	      String[] str = "2024,07,15".split(",");
	      c.set(Integer.parseInt(str[0]),Integer.parseInt(str[1]),Integer.parseInt(str[2]));
	      System.out.println(Integer.toString(1));
	      
	      System.out.format("%tB %te, %tY%n", c, c, c);
		
	}

}
