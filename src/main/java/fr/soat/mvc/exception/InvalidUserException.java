package fr.soat.mvc.exception;

/**
 * Created by formation on 25/03/2014.
 */
public class InvalidUserException extends Exception {
    public InvalidUserException() {
        super();
    }

    public InvalidUserException(String message) {
        super(message);
    }

    public InvalidUserException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidUserException(Throwable cause) {
        super(cause);
    }
}
