package by.teachmeskills.yadevich.lesson15.task3.exceptions.invalidSizeException;

public class InvalidSizeException extends Exception {
    private int exceptionCode;

    public InvalidSizeException(String message, int exceptionCode) {
        super(message);
        this.exceptionCode = exceptionCode;
    }
}
