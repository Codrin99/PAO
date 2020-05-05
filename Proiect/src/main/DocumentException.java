package main;

public class DocumentException extends Exception {
    public DocumentException(String message, Throwable cause) {
        super(message, cause);
    }

    public DocumentException(String message) {
        super(message);
    }
}