package by.teachmeskills.yadevich.lesson15.task1.operation.creatorCollection;

import by.teachmeskills.yadevich.lesson15.task1.operation.finderEvenNumber.FinderEvenNumber;

import java.util.ArrayList;

public class CreatorCollection {

    public static void createCollection(String result){

        ArrayList<Integer> integers = new ArrayList<>();

        String[] parts = result.split(" ");

        for(String part : parts){
            if(part.matches("\\d+")) {
                int number = Integer.parseInt(part);
                integers.add(number);
            }
        }
        System.out.println(integers);
        FinderEvenNumber.printEvenNumbers(integers);
    }
}
