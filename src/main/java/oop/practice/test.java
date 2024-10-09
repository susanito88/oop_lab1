package oop.practice;

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
}
