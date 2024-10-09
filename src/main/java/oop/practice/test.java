package oop.practice;

import java.io.IOException;

public class test {
    private String name;
    private int age;
    private Boolean minor;

    // Constructor
    public test(String name, int age) {
        this.name = name;
        this.age = age;
        this.minor = age < 18;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        this.minor = age < 18;
    }

    public Boolean isMinor() {
        return minor;
    }

    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", minor=" + minor +
                '}';
    }


        public static void main(String[] args) throws IOException {


            test person1 = new test("John Doe", 16);
            System.out.println(person1);

            person1.setAge(20);
            System.out.println("After modification: " + person1);

            System.out.println("Name: " + person1.getName());
            System.out.println("Age: " + person1.getAge());
            System.out.println("Is Minor: " + person1.isMinor());
        }
    }

