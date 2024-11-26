package by.teachmeskills.yadevich.lesson15.task3.operation.validator.validatorSize;

import by.teachmeskills.yadevich.lesson15.task3.exceptions.invalidSizeException.InvalidSizeException;

import java.util.List;

public class ValidatorSize {

    public static boolean checkSize(int size, List<Integer> numbers) throws InvalidSizeException {

        if(size != numbers.size()) {
            throw new InvalidSizeException("The collection size does not match the entered size.", 303);
        }
        System.out.println("The entered collection size is valid.");
        return true;
    }
}
