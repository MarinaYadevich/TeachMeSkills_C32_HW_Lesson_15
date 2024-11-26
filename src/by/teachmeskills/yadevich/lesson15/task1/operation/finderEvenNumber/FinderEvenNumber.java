package by.teachmeskills.yadevich.lesson15.task1.operation.finderEvenNumber;

import java.util.ArrayList;

public class FinderEvenNumber {

    public static void printEvenNumbers(ArrayList<Integer> result){

        System.out.println("Even number from collection: ");
        for(int i = 0; i < result.size(); i++){
            if(result.get(i) % 2 == 0 ){
                System.out.print(result.get(i) + " ");
            }
        }
    }
}
