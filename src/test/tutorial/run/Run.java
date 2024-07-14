package test.tutorial.run;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] copyFrom = {
	            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
	            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
	            "Marocchino", "Ristretto" };
	        
	        String[] copyTo = new String[7];
	        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
	        for (String coffee : copyTo) {
	            System.out.print(coffee + " ");           
	        }
        String[] copyCopy = new String[copyFrom.length];
        System.arraycopy(copyFrom, 0, copyCopy, 0, copyFrom.length);
        System.out.println(copyFrom.equals(copyCopy));
        java.util.Arrays.stream(copyTo).map(coffee -> "coffee").forEach(System.out::print);  
        
        System.out.println();
        int count = 1;
        do {
        	
        	System.out.print(++count);
        	
        }while(count< 11);
        
        System.out.println();
        int num = 1;
        while(num<11) {
        	
        	System.out.print(++num);
        }
        
        String searchMe = "Look for a substring in me";
        String substring = "sub";
        boolean foundIt = false;

        int max = searchMe.length() - 
                  substring.length();

    test:
        for (int i = 0; i <= max; i++) {
            int n = substring.length();
            int j = i;
            int k = 0;
            while (n-- != 0) {
                if (searchMe.charAt(j++) != substring.charAt(k++)) {
                    continue test;
                }
            }
            foundIt = true;
                break test;
        }
        System.out.println(foundIt ? "Found it" : "Didn't find it");
        
        String[] strings = new String[10];
        System.out.println(strings);
        String studentName = "Peter Smith";
        System.out.println(studentName);
        strings[0] = studentName;
        System.out.println(strings[0]);
        studentName = null;
        System.out.println(strings[0]);
        System.out.println(studentName);
        

        
	}
	

}
