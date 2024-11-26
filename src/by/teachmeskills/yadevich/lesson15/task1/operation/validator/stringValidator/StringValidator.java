package by.teachmeskills.yadevich.lesson15.task1.operation.validator.stringValidator;

import by.teachmeskills.yadevich.lesson15.task1.exception.invalidStringException.InvalidStringException;

public class StringValidator {

    public static boolean checkString(String number) throws InvalidStringException {

        if (number == null || number.isEmpty()) {
            throw new InvalidStringException("The entered string is null or empty.", 405);
        } else if (!(number.matches("\\d+") || number.equalsIgnoreCase("exit"))) {
            throw new InvalidStringException("Invalid string value.", 606);
        }
        return true;
    }
}
