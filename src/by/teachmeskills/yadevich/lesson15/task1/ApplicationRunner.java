package by.teachmeskills.yadevich.lesson15.task1;

import by.teachmeskills.yadevich.lesson15.task1.operation.creatorCollection.CreatorCollection;
import by.teachmeskills.yadevich.lesson15.task1.operation.validator.stringValidator.StringValidator;

import java.nio.file.InvalidPathException;
import java.util.Scanner;

/** Task 1.
 Create a collection of integers and fill it with values entered from the console.
 When filling the collection with numbers from the console, you should do type casts.
 The code for casting a string to a number can be used as follows:
 int i = Integer.parseInt(str);
 or
 int val = Integer.valueOf(str);
 To finish entering, enter the word "exit".
 When casting a string to a number, you should consider the possibility of exceptions.
 Some useful examples of code for casting a string to a number can be found at the link
 https://www.geeksforgeeks.org/how-to-convert-a-string-to-an-int-in-java/
 Display even numbers from the collection on the screen.
 */

public class ApplicationRunner {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter one digit at a time to add to collection." +
                    "(to finish entering, enter the word 'exit'.): ");
            String number;

            StringBuilder result = new StringBuilder();
            while (true) {
                number = scanner.nextLine();
                StringValidator.checkString(number);
                result.append(number);
                result.append(" ");

                if (number.equalsIgnoreCase("exit")) {
                    System.out.println("Input complete...");
                    break;
                }
            }
            scanner.close();

            CreatorCollection.createCollection(result.toString());

        } catch (InvalidPathException e) {
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

