package oop.practice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    //read file
    ObjectMapper mapper = new ObjectMapper();
    File inputFile = new File("src/main/resources/test-input.json");
    JsonNode data = mapper.readTree(inputFile).get("data");

    List<Person> people = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    //json to classes
    for (JsonNode entry : data) {
      String name = entry.has("name") ? entry.get("name").asText() : "Unknown";
      int id = entry.has("id") ? entry.get("id").asInt() : 0;
      int age = entry.has("age") ? entry.get("age").asInt() : 0;  // Default age 0

      Person person = new Person(name, id, age);
      people.add(person);

      System.out.println(person);
      System.out.println("Assign to Universe: 1 - StarWars, 2 - Hitchhiker, 3 - Marvel, 4 - Rings");
      String userInput = scanner.nextLine();

      switch (userInput) {
        case "1":
          break;
        case "2":
          break;
        case "3":
          break;
        case "4":
          break;
        default:
          System.out.println("Invalid input, skipping...");
      }
    }

    scanner.close();

    System.out.println("People with even IDs:");
    people.stream().filter(p -> p.getId() % 2 == 0).forEach(System.out::println);
  }
}
