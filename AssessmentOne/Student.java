package AssessmentOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student extends Person {
    private int numCourses;

    private String[] courses = {};
    private int[] grades = {};

//    List<String> courses = new ArrayList<String>();
//    List<Integer> grades = new ArrayList<Integer>();

    public Student(String name, String address) {
        super(name, address);
    }
// using Array
    void addCourseGrade(String course, int grade) {
        courses = Arrays.copyOf(courses, courses.length + 1);
        courses[courses.length - 1] = course;

        grades = Arrays.copyOf(grades, grades.length + 1);
        grades[grades.length - 1] = grade;

    }

    public void printCourses() {
        System.out.println(Arrays.toString(courses));
    }

    public void printGrades() {
        System.out.println(Arrays.toString(grades));
    }
    public double getAverageGrade() {
        double sum = 0;
        for (Integer s: grades) {
            sum += s;
        }
        return sum / grades.length;
    }

// using collection
//    void addCourseGrade(String course, int grade) {
//        courses.add(course);
//        grades.add(grade);
//    }
//
//    public void printCourses() {
//        System.out.println(this.courses);
//    }
//
//    public void printGrades() {
//        System.out.println(this.grades);
//    }
//
//    public double getAverageGrade() {
//        double sum = 0;
//        for (Integer s: grades) {
//            sum += s;
//        }
//        return sum / grades.size();
//    }

    public String toString() {
        return "Student: " + getName() + "(" + getAddress() + ")";
    }
}
