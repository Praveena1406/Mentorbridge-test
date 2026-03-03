package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiTask {
    public static void main(String[] args){
        //Find Second Highest Number
        System.out.println("Second Highest Number in a List");
        List<Integer> numbers = Arrays.asList(10,45,67,23,89,54,89);
        Optional<Integer> secondHighestNum = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst();
        System.out.println(secondHighestNum.orElse(null));

        //Print Duplicate Numbers
        System.out.println();
        System.out.println("Duplicate number in a List");
        List<Integer> numbers2 = Arrays.asList(10, 20, 30, 20, 40, 10, 50, 30);
        Set<Integer> uniqueItems = new HashSet<>();
        numbers2.stream()
                .filter(num->!uniqueItems.add(num))
                .forEach(System.out::println);

        //Find Top 3 Highest Numbers
        System.out.println();
        System.out.println("Find Top 3 Highest Numbers");
        List<Integer> number4 = Arrays.asList(10,80,45,60,30,90,20);
        List<Integer> topHighestNum = number4.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();
        System.out.println(topHighestNum);

        //Find Numbers starting with 1
        System.out.println();
        System.out.println("Find numbers starting with 1");
        List<Integer> number5 = Arrays.asList(10,15,23,11,45,19,30);
        number5.stream()
                .filter(num->String.valueOf(num).startsWith("1"))
                .forEach(System.out::println);

        //Partition Numbers into Even and Odd
        System.out.println();
        System.out.println("Partition Numbers into Even and Odd");
        List<Integer> numbers5 = Arrays.asList(10,15,20,25,30,35,40);
        Map<Boolean,List<Integer>> oddOrEven = numbers5.stream()
                .collect(Collectors.partitioningBy(num->num % 2 == 0,Collectors.toList()));
        System.out.println("Even Numbers: " +oddOrEven.get(true));
        System.out.println("Odd Numbers: " +oddOrEven.get(false));

        //Group Numbers by Even and Odd
        System.out.println();
        System.out.println("Group Numbers by Even and odd");
        List<Integer> number6 = Arrays.asList(5,10,15,20,25,30);
        Map<Boolean,List<Integer>> evenAndOdd = number6.stream()
                .collect(Collectors.groupingBy(num ->num % 2 == 0));

        System.out.println("Even Numbers");
        evenAndOdd.get(true).forEach(num->System.out.println(num + " "));

        System.out.println("Odd Numbers: " +evenAndOdd.get(false));

        //Find Sum of Squares of Even Numbers
        System.out.println();
        System.out.println("Sum of Squares of Even Numbers");
        List<Integer> number7 = Arrays.asList(1,2,3,4,5,6);
        int sumOfSquare = number7.stream()
                .filter(num->num % 2 == 0)
                        .mapToInt(num ->num*num)
                                .sum();
        System.out.println(sumOfSquare);

        //Find Common Elements Between Two Lists
        System.out.println();
        System.out.println("Common Elements Between two lists");
        List<Integer> list1 = Arrays.asList(10,20,30,40,50);
        List<Integer> list2 = Arrays.asList(30,40,60,70);

        List<Integer> commonElements = list1.stream()
                                            .filter(list2::contains)
                                            .toList();
        System.out.println(commonElements);

        // First Non-Repeated Numbers
        System.out.println();
        System.out.println("First Non-Repeated Numbers");
        List<Integer> number8 = Arrays.asList(4,5,1,2,0,4,5,2);
        Map<Integer,Long>nonRepeatedNum = number8.stream()
                .collect(Collectors.groupingBy(num->num,Collectors.counting()));

        Integer firstNonRepeatedNum = number8.stream()
                .filter(num->nonRepeatedNum.get(num)==1)
                .findFirst()
                .orElse(null);

        System.out.println(firstNonRepeatedNum);


        //Count Frequency of Each Number
        System.out.println();
        System.out.println("Count Frequency of Each Number");
        List<Integer> numbers3 = Arrays.asList(1,2,3,2,4,1,5,1);
        Map<Integer,Long> frequencyOfElements = numbers3.stream()
                .collect(Collectors.groupingBy(num->num,Collectors.counting()));


//        System.out.println(frequencyOfElements);
        frequencyOfElements.forEach((key,value)-> System.out.println(+key +"->" +value));


    }
}
