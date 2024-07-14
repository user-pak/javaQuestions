package test.tutorial.run;

public class EnumTest {
	
	//Day day;
	
	enum Day {
		
		MONDAY("월요일"), TUESDAY("화요일"), WENDESDAY("수요일"), THURSDAY("목요일"), FRIDAY("금요일"), SATURDAY("토요일"), SUNDAY("일요일");
		
		private String korean;
		
		Day (String korean) {
			this.korean = korean;
		}
		
		private String getKorean() {
			return this.korean;
		}
		void printKorean() {
				
			System.out.println(getKorean());
				
		}
		
	}
	void printEnglish(String korean) {
		
		for(Day day : Day.values()) {
			if(korean.equals(day.getKorean())) {
				System.out.println(day);
				break;
			}
		}

	}
		
	void tellItLikeItIs(Day day) {
		
		switch(day) {
		
		case MONDAY : System.out.println("Mondays is bad"); break;
		case FRIDAY : System.out.println("Fridays are better "); break;
		case SATURDAY : 
		case SUNDAY : System.out.println("Weekends are best"); break;
		default : System.out.println("Midweek days ar so-so");
		
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumTest enumTest = new EnumTest();
		enumTest.tellItLikeItIs(Day.FRIDAY);
		Day.FRIDAY.printKorean();
		enumTest.printEnglish("금요일");
		
	}

}
