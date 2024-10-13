package oop.practice;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Person {
    private int id;

    @JsonProperty("isHumanoid") // Jackson will use this name in the JSON output
    private Boolean isHumanoid;

    private String planet;
    private int age;
    private List<String> traits;

    public Person(int id, Boolean isHumanoid, String planet, int age, List<String> traits) {
        this.id = id;
        this.isHumanoid = isHumanoid;
        this.planet = planet;
        this.age = age;
        this.traits = traits;
    }

    // Getters
    public int getId() { return id; }
    public Boolean getIsHumanoid() { return isHumanoid; }
    public String getPlanet() { return planet; }
    public int getAge() { return age; }
    public List<String> getTraits() { return traits; }
    public boolean hasTrait(String trait) { return traits.contains(trait); }
}
