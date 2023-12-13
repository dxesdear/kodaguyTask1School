package test;

import big.School;
import big.Student;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Dear","Dear");
        Student s2 = new Student("pp","pp");
        Student s3 = new Student("tt","tt");
        Student s4 = new Student("ss","ss");
        Student s5 = new Student("bb","bb");
        System.out.println(s5);
        School school = new School("Doi kum",6);
        System.out.println(school.addStudent(s1));
        school.addStudent(s2);
        school.addStudent(s3);
        school.addStudent(s4);
        school.addStudent(s5);
        System.out.println(Arrays.toString(school.getAllStudent()));
        System.out.println(school.all());


        // removeStudent
        school.removeStudent(3);
        school.removeStudent(1);

        System.out.println(school.all());
    }
}