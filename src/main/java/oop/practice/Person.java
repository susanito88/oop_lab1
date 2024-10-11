package oop.practice;

import java.util.List;

public class Person {
    private int id;
    private Boolean isHumanoid;
    private String planet;
    private int age;
    private List<String> traits;

    // Constructor
    public Person(int id, Boolean isHumanoid, String planet, int age, List<String> traits) {
        this.id = id;
        this.isHumanoid = isHumanoid;
        this.planet = planet;
        this.age = age;
        this.traits = traits;
    }

    // Getters
    public int getId() {
        return id;
    }

    public Boolean getIsHumanoid() {
        return isHumanoid;
    }

    public String getPlanet() {
        return planet;
    }

    public int getAge() {
        return age;
    }

    public List<String> getTraits() {
        return traits;
    }

    // Method to check if the person has a specific trait
    public boolean hasTrait(String trait) {
        return traits.contains(trait);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", isHumanoid=" + isHumanoid +
                ", planet='" + planet + '\'' +
                ", age=" + age +
                ", traits=" + traits +
                '}';
    }

}
