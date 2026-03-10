package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApiTask {
    public static void main(String[] args) {
        //Find Second Highest Number
        System.out.println("Second highest number");
        List<Integer> numbers = Arrays.asList(10,45,67,23,89,54,89);
        Optional<Integer> secondHighestNum = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(secondHighestNum.orElse(null));

        //Find First Non-Repeated Number
        System.out.println();
        System.out.println("Find first non-repeated numbers");
        List<Integer> numbers1 = Arrays.asList(4,5,1,2,0,4,5,2);
        Map<Integer,Long> countOfNum = numbers1.stream()
                .collect(Collectors.groupingBy(num->num,Collectors.counting()));

        Optional<Integer> nonRepeatedNum = numbers1.stream()
                .filter(num->countOfNum.get(num)==1)
                .findFirst();
        System.out.println(nonRepeatedNum.orElse(null));

        //Find Duplicate Numbers
        System.out.println();
        System.out.println("Find duplicate numbers");
        List<Integer> numbers2 = Arrays.asList(10,20,30,20,40,10,50,30);
        Set<Integer> findDuplicates = new HashSet<>();
        numbers2.stream()
                .filter(num->!findDuplicates.add(num))
                .forEach(System.out::println);

        //Count Frequency of Each Number
        System.out.println();
        System.out.println("Count Frequency of Each Number");
        List<Integer> numbers3 = Arrays.asList(1,2,3,2,4,1,5,1);
        Map<Integer, Long> frequencyOfNum = numbers3.stream()
                .collect(Collectors.groupingBy(num->num,Collectors.counting()));
        System.out.println(frequencyOfNum);
        frequencyOfNum.forEach((key,value)-> System.out.println(+key+ ":" +value));

        //Find Top 3 Highest Numbers
        System.out.println();
        System.out.println("Find Top 3 Highest Numbers");
        List<Integer> numbers4 = Arrays.asList(10,80,45,60,30,90,20);
        numbers4.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);

        //Partition Numbers into Even and Odd
        System.out.println();
        System.out.println("Partition Numbers into Even and Odd");
        List<Integer> numbers5 = Arrays.asList(10,15,20,25,30,35,40);
        Map<Boolean,List<Integer>> partitionNum = numbers5.stream()
                .collect(Collectors.partitioningBy(num->num%2==0));
        System.out.println("Even Numbers: " +partitionNum.get(true));
        System.out.println("Odd Numbers: " +partitionNum.get(false));

        //Find Numbers Starting With Digit 1
        System.out.println();
        System.out.println("Find Numbers Starting With Digit 1");
        List<Integer> numbers6 = Arrays.asList(10,15,23,11,45,19,30);
        List<String> stringOfNum = numbers6.stream()
                .map(String::valueOf)
                .toList();

        stringOfNum.stream()
                .filter(num->num.startsWith("1"))
                .forEach(System.out::println);

        //Find Common Elements Between Two Lists
        System.out.println();
        System.out.println("Find Common Elements Between Two Lists");
        List<Integer> listNo1 = Arrays.asList(10,20,30,40,50);
        List<Integer> listNo2 = Arrays.asList(30,40,60,70);

        List<Integer> commonElements = listNo1.stream()
                .filter(listNo2::contains)
                .toList();
        System.out.println(commonElements);

        //Group Numbers by Even and Odd
        System.out.println();
        System.out.println("Group Numbers by Even and Odd");
        List<Integer> numbers7 = Arrays.asList(5,10,15,20,25,30);
        Map<Boolean,List<Integer>> evenOrOdd = numbers.stream()
                .collect(Collectors.groupingBy(num->num%2==0));
        System.out.println("Even Numbers: "+evenOrOdd.get(true));
        System.out.println("Odd Numbers: "+evenOrOdd.get(false));

        //Find Sum of Squares of Even Numbers
        System.out.println();
        System.out.println("Find Sum of Squares of Even Numbers");
        List<Integer> numbers8 = Arrays.asList(1,2,3,4,5,6);
        int sumOfNum = numbers8.stream()
                .filter(num->num%2==0)
                .mapToInt(num->num*num)
                .sum();
        System.out.println(sumOfNum);

    }
}
