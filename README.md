# Stream API Practice Task

## Task 1: Find Second Highest Number
#### Question 1 :-
Find the second highest number from the given list.<br>
Input: 10 45 67 23 89 54 89<br>
Expected Output: 67<br>
#### Explanation :-
- Convert list to stream
- sort into descending order
- Use **'skip'** to skip first highest number
- Then print second largest number

## Task 2: Find Duplicate Numbers
#### Question 2 :-
Print all duplicate numbers from the list.<br>
Input: 10 20 30 20 40 10 50 30<br>
Expected Output: 10 20 30
#### Explanation :-
- Use a Set to store unique elements.
- If add() returns false, the element is a duplicate.
- Collect duplicates into a new set.

## Task 3:  Find Top 3 Highest Numbers
#### Question 3:-
Find the top 3 highest numbers.<br>
Input: 10 80 45 60 30 90 20<br>
Expected Output:  90 80 60
#### Explanation:-
- Use sorted() method.
- Use limit() method

## Task 4: Find Numbers Starting With Digit 1
#### Question 4:-
ind numbers whose first digit is 1.<br>
Input: 10 15 23 11 45 19 30<br>
Expected Output: 10 15 11 19
#### Explanation:-
- Number converts into String
- Use filter() to check number startsWith 1

## Task 5: Partition Numbers into Even and Odd
#### Question 5:-
Partition the numbers into even and odd groups.<br>
Input: 10 15 20 25 30 35 40<br>
Expected Output:<br>
Even : 10 20 30 40<br>
Odd : 15 25 35
#### Explanation:-
- Use partitioningBy(num -> num % 2 == 0) to check the condition.
- Store the result in Map<Boolean, List<Integer>>
- true key contains even numbers.
- false key contains odd numbers.

## Task 6: Group Numbers by Even and Odd
#### Question 6:-
Group numbers into even and odd using grouping.<br>
Input: 5 10 15 20 25 30<br>
Expected Output:<br>
Even : 10 20 30<br>
Odd : 5 15 25
#### Explanation:-
- Use groupingBy(num -> num % 2 == 0) to check the condition.
- Store the result in Map<Boolean, List<Integer>>
- true key contains even numbers.
- false key contains odd numbers.

## Task 7: Find Sum of Squares of Even Numbers
#### Question 7:-
Find the sum of squares of even numbers.<br>
Input: 1 2 3 4 5 6<br>
Expected Output: 56
#### Explanation:-
- Use filter() to find the even number.
- Use maptoInt() to square the number.
- Sum of all numbers

## Task 8: Find Common Elements Between Two Lists
#### Question 8:-
Find common numbers between two lists.<br>
Input:<br>
List1: 10 20 30 40 50<br>
List2: 30 40 60 70<br>
Expected Output: 30 40
#### Explanation:-
- Convert the first list into a stream using stream().
- Use filter(list2::contains) to check if elements exist in the second list.
- Collect the filtered elements using toList().
- Store the result in a new list called commonElements.

## Task 9 : Find First Non-Repeated Number
#### Question 9:-
Find the first number that appears only once in the list.<br>
Input: 4 5 1 2 0 4 5 2<br>
Expected Output: 1<br>
#### Explanation:-
- Convert the list into a stream.
- Use groupingBy(num -> num, counting()) to count how many times each number appears.
- Store the result in Map<Integer, Long>.
- Convert the list into a stream again.
- Use filter(num -> count == 1) to find numbers that appear only once.
- Use findFirst() to get the first non-repeated number.
- Use orElse(null) to return null.

## Task 10 : Count Frequency of Each Number
#### Question 10:-
Count how many times each number appears.<br>
Input:1 2 3 2 4 1 5 1<br>
Expected Output:<br>
1 : 3<br>
2 : 2<br>
3 : 1<br>
4 : 1<br>
5 : 1<br>
#### Explanation:-
- Convert the list into a stream.
- Use groupingBy(num -> num, counting()) to count how many times each number appears.
