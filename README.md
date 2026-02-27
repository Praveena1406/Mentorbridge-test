# Find Topper Students using Stream API
# Project Description
My task is to find the topper students and display their names. It has (Student class) contains fields such as name, yearOfStudy, percentage, department. It had 5 students in each department. Then group the students based on department and find the toppers in each department. At last, the output looks like department_name -> student_name

# Flow of Task
<img width="580" height="265" alt="image" src="https://github.com/user-attachments/assets/d5d2d487-2247-41bc-96f5-a6ffb07db74b" />

# Functionalities

To store the student as a List 
```
List<Student> studentList = new ArrayList<>();
studentList.add(new Student("Praveena", 4, 90, "CSE"))
```

Then group the students based on dept using groupingBy and find the maximum percentage in each department using maxBy
 ```
Map<String, Optional<Student>> groupingStudents = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept,
                        Collectors.maxBy(Comparator.comparing(Student::getPercentage))));
```
Store into Hashmap and print department_name -> Student_name
```
HashMap<String, String> topperList = new HashMap<>();
groupingStudents.forEach(((s, student) ->topperList.put(s, student.get().getName()) ));
```
