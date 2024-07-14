package sava.tutorial.clazz.localclass;

public class LocalClassExample {
	
	
	public static void validatePhoneNumber(String... phoneNumbers) {
		
		String regularExpression = "[^0-9]";
		int numberLength = 10;
		
		class PhoneNumber {
			String formattedPhoneNumber = null;
				
			PhoneNumber(String phoneNumber) {			
				
				String currentNumber = phoneNumber.replaceAll(regularExpression, "");
				if(currentNumber.length() == numberLength) {
					formattedPhoneNumber = currentNumber;
				}else {
					formattedPhoneNumber = "invalid";
				}
				
			}
		}
		
		for(int i = 0; i < phoneNumbers.length; i++) {
			
			System.out.println(phoneNumbers[i]+" is " + new PhoneNumber(phoneNumbers[i]).formattedPhoneNumber);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validatePhoneNumber("1234566","123-456-7890", "456-7890", "asfdd--ss11");
	}

}
