package org.example.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class StudentMain {
    static List<Student> studentList = new ArrayList<>();
    public static void main(String[] args){

        studentList.add(new Student("Praveena",4,90,"CSE"));
        studentList.add(new Student("Jinu",3,85,"CSE"));
        studentList.add(new Student("Pricilla",4,88,"CSE"));
        studentList.add(new Student("Pravin",2,78,"CSE"));
        studentList.add(new Student("Kanisha",3,92,"CSE"));

        studentList.add(new Student("Vinith",4,88,"AIDS"));
        studentList.add(new Student("Priyanga",4,99,"AIDS"));
        studentList.add(new Student("Saleth",2,89,"AIDS"));
        studentList.add(new Student("Mary",4,82,"AIDS"));
        studentList.add(new Student("Mistika",3,68,"AIDS"));

        studentList.add(new Student("Jeyasree",2,59,"ECE"));
        studentList.add(new Student("Baskar",3,89,"ECE"));
        studentList.add(new Student("John",2,99,"ECE"));
        studentList.add(new Student("Balaji",4,98,"ECE"));
        studentList.add(new Student("Dinesh",2,90,"ECE"));

        studentList.add(new Student("Praveen",2,92,"EEE"));
        studentList.add(new Student("Radhika",4,89,"EEE"));
        studentList.add(new Student("Roobi",2,94,"EEE"));
        studentList.add(new Student("Rithika",3,49,"EEE"));
        studentList.add(new Student("Pricilla",2,92,"EEE"));

        studentList.add(new Student("Cibe",2,89,"IT"));
        studentList.add(new Student("Praveena",2,79,"IT"));
        studentList.add(new Student("Lakshaya",2,34,"IT"));
        studentList.add(new Student("Anbu",2,55,"IT"));
        studentList.add(new Student("John",4,74,"IT"));

        studentList.stream().forEach(System.out::println);

        Map<String, Optional<Student>> groupingStudents = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept,
                        Collectors.maxBy(Comparator.comparing(Student::getPercentage))));



        HashMap<String, String> topperList = new HashMap<>();

        groupingStudents.forEach(((s, student) ->topperList.put(s, student.get().getName()) ));


        System.out.println("Highest Percentage scored in each Department Student Name:" +topperList);


    }
}
