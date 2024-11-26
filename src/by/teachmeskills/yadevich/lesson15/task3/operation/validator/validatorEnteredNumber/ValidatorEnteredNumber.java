package by.teachmeskills.yadevich.lesson15.task3.operation.validator.validatorEnteredNumber;

import by.teachmeskills.yadevich.lesson15.task3.exceptions.invalidNumberException.InvalidNumberException;

public class ValidatorEnteredNumber {

    public static void checkEnteredNumber(int enteredNumber) throws InvalidNumberException {
        if(enteredNumber < 0){
            throw new InvalidNumberException("The size must be positive.", 606);
        }else if(enteredNumber ==0){
            throw new InvalidNumberException ("Collection size cannot be 0.", 303);
        }
    }
}
