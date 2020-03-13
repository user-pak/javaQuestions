package clazz.model.vo;

public class Period {

	private Day start;
	private Day end;
	
	public Period(Day start, Day end) {
		this.start = new Day(start);
		this.end = new Day(end);
	}
	
	public Day getStart() {
		return this.start;
	}
	public Day getEnd() {
		return this.end;
	}
	@Override
	public String toString() {
		return "from " + this.start + " to " + this.end;
	}
}
