# Stream API Practice Task
## Task 1: Find Even Numbers from a List

#### Question 1 :-
Given a list of integers, find out all the even numbers that exist in the list using Stream functions ?
10,15,8,49,25,98,32
#### Explanation :-
- Convert the list into a stream.
- Use filter() to check numbers divisible by 2.
- Print the filtered values.
  
## Task 2: Find Duplicate Elements in a List

#### Question 2:-
How to find duplicate elements in a given integers list in java using Stream functions?
10,15,8,49,25,98,98,32,15
#### Explanation :-
- Use a Set to store unique elements.
- If add() returns false, the element is a duplicate.
- Collect duplicates into a new set.

## Task 3: Sort List in Descending Order

#### Question 3 :-
Given a list of integers, sort all the values present in it in descending order using Stream functions?
10,15,8,49,25,98,98,32,15
#### Explanation :-
- Use sorted() method.
- Comparator.reverseOrder() to sort in descending order.

## Task 4: Find Duplicate Strings with Count

#### Question 4 :-
How to find only duplicate elements with its count from the String ArrayList in Java8?
[“AA", "BB", "AA", "CC”]

#### Explanation :-
- Use Collectors.groupingBy() to group elements.
- Use Collectors.counting() to count frequency.
- 
## Task 5: Map Names to its Length

#### Question 5 :-
Question: Given a list of strings representing names, map each name to its length and collect the lengths into a new list.
Input: ["John", "Alice", "Bob"]
Expected Output: [4, 5, 3]

#### Explanation :-
- Use map() to transform each name.
- Use length() method.



## Task 6: Remove Duplicates from List
#### Question 6 :-
 Given a list of integers with duplicates, remove duplicates and collect the unique elements into a new list.
 Input: [1, 2, 2, 3, 4, 4, 4, 5]
 Expected Output: [1, 2, 3, 4, 5]

#### Description :-
- Use distinct() method.
- Collect unique values into a new list.
