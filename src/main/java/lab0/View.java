package lab0;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class View {
    private final ObjectMapper mapper;

    public View() {
        this.mapper = new ObjectMapper();
    }

    public void writeUniverseToFile(Universe universe, String outputFilePath) {
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputFilePath), universe);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
