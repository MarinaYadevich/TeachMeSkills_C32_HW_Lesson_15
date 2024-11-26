package by.teachmeskills.yadevich.lesson15.task3.operation.calculate.calculationArithmeticMean;

import java.util.List;

public class CalculateArithmeticMean {

    public static void findArithmeticMean(List<Integer> numbers){

        double sumNumbers = 0;
        for(Integer number : numbers){
            sumNumbers += number;
        }

        double arithmeticMean = sumNumbers / numbers.size();
        arithmeticMean = Math.round(arithmeticMean * 100);
        arithmeticMean = arithmeticMean / 100;
        System.out.println(arithmeticMean);
    }
}
