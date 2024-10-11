package oop.practice;

public class Person {
    private String name;
    private int id;
    private int age;
    private Boolean minor;

    // Constructor
    public Person(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.minor = age < 18;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", minor=" + minor +
                '}';
    }
}
