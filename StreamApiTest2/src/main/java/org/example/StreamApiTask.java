package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApiTask {
       public static void main(String[] args){
           // Find even numbers
           System.out.println("Find Even numbers");
           List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,32);
           numbers.stream()
                   .filter(number ->number % 2 == 0)
                   .forEach(System.out::println);

           //Find duplicate elements
//           System.out.println();
//           System.out.println("Find duplicate numbers");
//           List<Integer> duplicateNumbers = Arrays.asList(10,15,8,49,25,98,98,32,15);
//           Set<Integer> uniqueItems = new HashSet<>();
//           Set<Integer> findDuplicateNumbers = duplicateNumbers.stream()
//                   .filter(number->!uniqueItems.add(number))
//                   .collect(Collectors.toSet());
//           System.out.println(findDuplicateNumbers);

           //Other approach find duplicate elements
           List<Integer> duplicateNumbers = Arrays.asList(10,15,8,49,25,98,98,32,15);
           List<Integer> uniqueItems = duplicateNumbers.stream()
                   .filter(number->Collections.frequency(duplicateNumbers,number)>1)
                   .distinct()
                   .toList();
           System.out.println(uniqueItems);


           //Remove Duplicate numbers
           System.out.println();
           System.out.println("Remove Duplicate Numbers: ");
           List<Integer> removeDuplicateNumbers = Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5);
           removeDuplicateNumbers.stream()
                   .distinct()
                   .forEach(System.out::println);

           //Mapping
           System.out.println();
           System.out.println("find Length of each string");
           List<String> names = Arrays.asList("John", "Alice", "Bob");
           names.stream()
                   .map(name->name.length())
                   .forEach(System.out::println);

           //Sort in descending order
           System.out.println();
           System.out.println("Sort in descending order");
           List<Integer> num = Arrays.asList(10,15,8,49,25,98,98,32,15);
           num.stream()
                   .sorted(Comparator.reverseOrder())
                   .forEach(System.out::println);

           //Find Duplicate Elements with its count
           System.out.println();
           System.out.println("find Duplicate elements with its count");
           List<String> words = Arrays.asList("AA","BB","CC","AA");
           Map<String, Long> occurenceWords = words.stream()
                   .collect(Collectors.groupingBy(word ->word,Collectors.counting()));
           System.out.println(occurenceWords);
       }

}
