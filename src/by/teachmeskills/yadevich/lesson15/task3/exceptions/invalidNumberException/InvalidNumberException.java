package by.teachmeskills.yadevich.lesson15.task3.exceptions.invalidNumberException;

public class InvalidNumberException extends Exception{
    private int exceptionCode;

    public InvalidNumberException(String message, int exceptionCode) {
        super(message);
        this.exceptionCode = exceptionCode;
    }
}
