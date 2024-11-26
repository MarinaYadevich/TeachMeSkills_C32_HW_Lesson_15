package by.teachmeskills.yadevich.lesson15.task3;

import by.teachmeskills.yadevich.lesson15.task3.exceptions.invalidSizeException.InvalidSizeException;
import by.teachmeskills.yadevich.lesson15.task3.operation.calculate.calculationArithmeticMean.CalculateArithmeticMean;
import by.teachmeskills.yadevich.lesson15.task3.operation.validator.validatorSize.ValidatorSize;
import by.teachmeskills.yadevich.lesson15.task3.operation.validator.validatorEnteredNumber.ValidatorEnteredNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** Task 3.
 Create a collection of integers.
 Fill the collection with random numbers.
 Let the collection size be specified from the console.
 Provide a check for the validity of the entered collection size.
 Calculate and display the arithmetic mean of all elements in the collection.
 */

public class ApplicationRunner {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(56);
        numbers.add(1);
        numbers.add(90);
        numbers.add(123);
        numbers.add(85);
        numbers.add(25);

        try {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Set the collection size: ");
            int size = scanner.nextInt();
            ValidatorEnteredNumber.checkEnteredNumber(size);
            ValidatorSize.checkSize(size,numbers);
            CalculateArithmeticMean.findArithmeticMean(numbers);

        } catch (InvalidSizeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}