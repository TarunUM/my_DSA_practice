package OOPS.generics.comparision;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student(15, "Tarun");
        Student s2 = new Student(156, "Rahul");
        Student s3 = new Student(16, "Rahul");
        Student s4 = new Student(176, "Rahul");
        Student s5 = new Student(26, "Rahul");

        Student[] studentList = {s1,s2,s3,s4,s5};
        Student[] studentList2 = {s3,s5,s1,s2,s4};

        System.out.println(Arrays.toString(studentList2));
        Arrays.sort(studentList2);
        System.out.println(Arrays.toString(studentList2));
        System.out.println(Arrays.toString(studentList));
        Arrays.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getRollNo() - o2.getRollNo();
            }
        });
        System.out.println(Arrays.toString(studentList));
    }
}
