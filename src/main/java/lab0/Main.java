package lab0;

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

    int idCounter = 0;

    for (JsonNode entry : data) {
      classifyEntry(entry, starWars, hitchhikers, marvel, rings, idCounter);
      idCounter++;
    }



    File outputDir = new File("src/main/resources/output");
    if (!outputDir.exists()) {
      outputDir.mkdirs();
    }

    View view = new View();
    view.writeUniverseToFile(starWars, "src/main/resources/output/starWars.json");
    view.writeUniverseToFile(hitchhikers, "src/main/resources/output/hitchhikers.json");
    view.writeUniverseToFile(marvel, "src/main/resources/output/marvel.json");
    view.writeUniverseToFile(rings, "src/main/resources/output/rings.json");
  }

  private static void classifyEntry(JsonNode entry, Universe starWars, Universe hitchhikers, Universe marvel, Universe rings, int id) {
    boolean isHuman = entry.has("isHumanoid") && entry.get("isHumanoid").asBoolean();
    String planet = entry.has("planet") ? entry.get("planet").asText() : null;
    Integer age = entry.has("age") ? entry.get("age").asInt() : null;
    HashSet<String> traitsSet = new HashSet<>();

    if (entry.has("traits")) {
      for (JsonNode trait : entry.get("traits")) {
        String traitStr = trait.asText();
        traitsSet.add(traitStr); // H
      }
    }
    List<String> traits = new ArrayList<>(traitsSet); 

    Person person = new Person(id, isHuman, planet, age != null ? age : 0, traits);


    classifyPerson(person, starWars, hitchhikers, marvel, rings);
  }

  private static void classifyPerson(Person person, Universe starWars, Universe hitchhikers, Universe marvel, Universe rings) {
    if ("Earth".equalsIgnoreCase(person.getPlanet())) {
      if (person.getIsHumanoid() && person.hasTrait("BLONDE") && person.hasTrait("POINTY_EARS")) {
        rings.individuals().add(person);
      } else if (person.getIsHumanoid() && person.hasTrait("SHORT") && person.hasTrait("BULKY")) {
        rings.individuals().add(person);
      } else if (person.getIsHumanoid() && person.getAge() > 200) {
        rings.individuals().add(person);
      } else if (person.hasTrait("BLONDE") && person.hasTrait("TALL")) {
        rings.individuals().add(person);
      } else {
        rings.individuals().add(person);
      }
    }

    else if (!person.getIsHumanoid() && "Kashyyyk".equalsIgnoreCase(person.getPlanet())) {
      starWars.individuals().add(person);
    } else if (!person.getIsHumanoid() && "Endor".equalsIgnoreCase(person.getPlanet())) {
      starWars.individuals().add(person);
    } else if (person.hasTrait("HAIRY") && person.hasTrait("TALL") && person.getAge() <= 400) {
      starWars.individuals().add(person);
    } else if (person.hasTrait("SHORT") && person.hasTrait("HAIRY") && person.getAge() <= 60) {
      starWars.individuals().add(person);
    }

    else if (person.getIsHumanoid() && "Asgard".equalsIgnoreCase(person.getPlanet())) {
      marvel.individuals().add(person);
    } else if (person.hasTrait("BLONDE") && person.hasTrait("TALL") && person.getAge() <= 5000) {
      marvel.individuals().add(person);
    }

    else if (person.getIsHumanoid() && "Betelgeuse".equalsIgnoreCase(person.getPlanet())) {
      hitchhikers.individuals().add(person);
    } else if (person.hasTrait("EXTRA_ARMS") || person.hasTrait("EXTRA_HEAD")) {
      hitchhikers.individuals().add(person);
    } else if (!person.getIsHumanoid() && (person.hasTrait("GREEN") || person.hasTrait("BULKY"))) {
      hitchhikers.individuals().add(person);
    }

    else if (person.getIsHumanoid() && person.hasTrait("BULKY")) {
      rings.individuals().add(person);
    }

    else if (person.getIsHumanoid() && person.getAge() > 1000) {
      rings.individuals().add(person);
    }
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
