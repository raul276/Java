
public class NoStudentException extends Exception {
	@Override
	public String getMessage() {
		return "No such student";
	}
}
