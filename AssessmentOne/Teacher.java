package AssessmentOne;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Teacher extends Person {
    private int numCourses;
    private String[] courses = {};

    public Teacher(String name, String address) {
        super(name, address);
    }

    public boolean addCouse(String course) {
        if(courses.length == 0) {
            courses = Arrays.copyOf(courses, courses.length + 1);
            courses[courses.length - 1] = course;
            return true;
        } else {
            if(Arrays.asList(courses).contains(course)) {
                return false;
            } else {
                courses = Arrays.copyOf(courses, courses.length + 1);
                courses[courses.length - 1] = course;
                return true;
            }
        }
    }

    public boolean removeCourse(String course) {
        String[] newArr = null;
        boolean result = false;

        for(int i = 0; i < courses.length; i++) {
            if(courses[i] == course) {
                newArr = new String[courses.length - 1];

                for(int index = 0; index < i; index++) {
                    newArr[index] = courses[index];
                }

                for(int j = i; j < courses.length - 1; j++) {
                    newArr[j] = courses[j+1];
                }

                result =  true;
                this.courses = newArr;
                break;
            } else {
                result = false;
            }
        }
        return result;
    }

    public String getCourses() {
        return Arrays.toString(this.courses);
    }

    public String toString() {
        return "Teacher: " + getName() + "(" + getAddress() + ")";
    }


}
