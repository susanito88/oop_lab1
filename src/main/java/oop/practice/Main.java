package oop.practice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    File inputFile = new File("src/main/resources/input.json");
    JsonNode data = mapper.readTree(inputFile).get("data");

    Universe starWars = new Universe("Star Wars", new ArrayList<>());
    Universe hitchhikers = new Universe("Hitchhikers", new ArrayList<>());
    Universe marvel = new Universe("Marvel", new ArrayList<>());
    Universe rings = new Universe("Rings", new ArrayList<>());

    int idCounter = 0; // Starts with 0 as per provided data

    for (JsonNode entry : data) {
      classifyEntry(entry, starWars, hitchhikers, marvel, rings, idCounter);
      idCounter++;
    }

    printResults(starWars);
    printResults(hitchhikers);
    printResults(marvel);
    printResults(rings);
  }

  private static void classifyEntry(JsonNode entry, Universe starWars, Universe hitchhikers, Universe marvel, Universe rings, int id) {
    boolean isHuman = entry.has("isHumanoid") && entry.get("isHumanoid").asBoolean();
    String planet = entry.has("planet") ? entry.get("planet").asText() : null;
    Integer age = entry.has("age") ? entry.get("age").asInt() : null;
    HashSet<String> traitsSet = new HashSet<>(); // Use a HashSet to avoid duplicates

    if (entry.has("traits")) {
      for (JsonNode trait : entry.get("traits")) {
        String traitStr = trait.asText();
        traitsSet.add(traitStr); // Add to HashSet for uniqueness
      }
    }
    List<String> traits = new ArrayList<>(traitsSet); // Convert back to List

    Person person = new Person(id, isHuman, planet, age != null ? age : 0, traits);

    System.out.println("Classifying: " + person);

    String classification = classifyPerson(person, starWars, hitchhikers, marvel, rings);
    System.out.println("Classification: " + classification);
  }

  private static String classifyPerson(Person person, Universe starWars, Universe hitchhikers, Universe marvel, Universe rings) {
    String classification = null;

    if ("Earth".equalsIgnoreCase(person.getPlanet())) {
      if (person.getIsHumanoid() && person.hasTrait("BLONDE") && person.hasTrait("POINTY_EARS")) {
        rings.individuals().add(person);
        classification = "Lord of the Rings (Elf)";
      } else if (person.getIsHumanoid() && person.hasTrait("SHORT") && person.hasTrait("BULKY")) {
        rings.individuals().add(person);
        classification = "Lord of the Rings (Dwarf)";
      } else if (person.getIsHumanoid() && person.getAge() > 200) {
        rings.individuals().add(person);
        classification = "Lord of the Rings (Elf - High Age Predicted)";
      } else if (person.hasTrait("BLONDE") && person.hasTrait("TALL")) {
        rings.individuals().add(person);
        classification = "Lord of the Rings (Elf - Predicted)";
      } else {
        rings.individuals().add(person);
        classification = "Lord of the Rings (Dwarf - Predicted)";
      }
    }
    else if (!person.getIsHumanoid() && "Kashyyyk".equalsIgnoreCase(person.getPlanet())) {
      starWars.individuals().add(person);
      classification = "Star Wars (Wookie)";
    } else if (!person.getIsHumanoid() && "Endor".equalsIgnoreCase(person.getPlanet())) {
      starWars.individuals().add(person);
      classification = "Star Wars (Ewok)";
    } else if (person.hasTrait("HAIRY") && person.hasTrait("TALL") && person.getAge() <= 400) {
      starWars.individuals().add(person);
      classification = "Star Wars (Wookie - Predicted)";
    } else if (person.hasTrait("SHORT") && person.hasTrait("HAIRY") && person.getAge() <= 60) {
      starWars.individuals().add(person);
      classification = "Star Wars (Ewok - Predicted)";
    }

    else if (person.getIsHumanoid() && "Asgard".equalsIgnoreCase(person.getPlanet())) {
      marvel.individuals().add(person);
      classification = "Marvel (Asgardian)";
    } else if (person.hasTrait("BLONDE") && person.hasTrait("TALL") && person.getAge() <= 5000) {
      marvel.individuals().add(person);
      classification = "Marvel (Asgardian - Predicted)";
    }

    else if (person.getIsHumanoid() && "Betelgeuse".equalsIgnoreCase(person.getPlanet())) {
      hitchhikers.individuals().add(person);
      classification = "Hitchhiker's (Betelgeusian)";
    } else if (person.hasTrait("EXTRA_ARMS") || person.hasTrait("EXTRA_HEAD")) {
      hitchhikers.individuals().add(person);
      classification = "Hitchhiker's (Betelgeusian - Predicted)";
    } else if (!person.getIsHumanoid() && (person.hasTrait("GREEN") || person.hasTrait("BULKY"))) {
      hitchhikers.individuals().add(person);
      classification = "Hitchhiker's (Vogon - Predicted)";
    }

    else if (person.getIsHumanoid() && person.hasTrait("BULKY")) {
      rings.individuals().add(person);
      classification = "Lord of the Rings (Dwarf - Predicted)";
    }

    else if (person.getIsHumanoid() && person.getAge() > 1000) {
      rings.individuals().add(person);
      classification = "Lord of the Rings (Elf - High Age Predicted)";
    }
    return classification;
  }

  private static void printResults(Universe universe) {
    System.out.println("Universe: " + universe.name());
    System.out.println("Individuals:");
    for (Person person : universe.individuals()) {
      System.out.println(person.toString());
    }
    System.out.println();
  }
}

record Universe(
        String name,
        List<Person> individuals
) { }
