package exception.error;

public class RangeError extends RuntimeException{

	public RangeError(int range) {
		super("beyond the range: " + range);
	}
}
