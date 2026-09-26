package lesson5;

public class BadEmailException extends RuntimeException {
    public BadEmailException(String message) {
        super(message);
    }
}
