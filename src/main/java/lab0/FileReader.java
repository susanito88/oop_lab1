package lab0;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    public static void main(String[] args) {
        String filePath = "src/main/resources/test-input.json";

        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode rootNode = mapper.readTree(new File(filePath));

            if (rootNode.isObject()) {
                JsonNode dataNode = rootNode.get("data");
                if (dataNode != null && dataNode.isArray()) {
                    for (JsonNode jsonNode : dataNode) {
                        System.out.println(jsonNode.toPrettyString());
                    }
                } else {
                    System.out.println("The 'data' field does not exist or is not an array.");
                }
            } else {
                System.out.println("The JSON file does not contain a valid object.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
