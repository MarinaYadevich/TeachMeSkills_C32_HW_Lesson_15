package by.teachmeskills.yadevich.lesson15.task1.exception.invalidStringException;

public class InvalidStringException extends Exception {
    private int exceptionCode;

    public InvalidStringException(String message, int exceptionCode) {
        super(message);
        this.exceptionCode = exceptionCode;
    }
}

