package BlogApplication.blog.exception;

public class DuplicateDateException extends Exception {

	public DuplicateDateException(String msg) {
		super(msg);
	}

}

class DateCurruptExceptoin extends Exception {
	DateCurruptExceptoin(String msg) {
		super(msg);
	}
}

/*
 * class DuplicateDateException extends Exception {
 * DuplicateDateException(String msg) { super(msg); } }
 */
