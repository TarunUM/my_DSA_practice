package OOPS.Cloning;

import java.util.Arrays;

public class Student implements Cloneable{
    public int age;
    public String name;
    int[] arr;

    public Student() {
        System.out.println("No args Constructor");
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1, 2, 3, 4};
}

    public Student(Student obj) {
        this.age = obj.age;
        this.name = obj.name;
    }

    public Object clone() throws CloneNotSupportedException {
        // This is Deep copy
        Student copiedObj = (Student) super.clone();
        copiedObj.arr = new int[copiedObj.arr.length];
        System.arraycopy(this.arr, 0, copiedObj.arr, 0, copiedObj.arr.length);

        return copiedObj;

        // This is shallow copy
//        return super.clone();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
