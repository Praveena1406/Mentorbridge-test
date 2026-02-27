package org.example.streamapi;

public class Student {
    private String name;
    private int yearOfStudy;
    private int percentage;
    private String dept;

    public String toString(){
        return "name: " +name +
                "| yearOfStudy: " +yearOfStudy +
                "| percentage: " +percentage +
                "| department: " +dept;
    }

    public Student(String name, int yearOfStudy, int percentage, String dept) {
        this.name = name;
        this.yearOfStudy = yearOfStudy;
        this.percentage = percentage;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
