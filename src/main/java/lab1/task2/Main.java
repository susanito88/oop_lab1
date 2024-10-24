package lab1.task2;

public class Main {
    public static void main(String[] args) {
        // Check if a file path is provided as a command-line argument
        if (args.length < 1) {
            System.out.println("Please provide the file path as a command-line argument.");
            return;
        }

        // Get the file path from the command-line argument
        String filePath = args[0];
        FileReader fileReader = new FileReader();

        // Read the content of the file into a string
        String text = fileReader.readFileIntoString(filePath);

        // Check if the file was successfully read
        if (text.isEmpty()) {
            System.out.println("The file could not be read or is empty.");
            return;
        }

        // Create a TextData object and pass the text from the file
        TextData textData = new TextData(text);

        // Print the statistics from the TextData object
        System.out.println("File: " + filePath);
        System.out.println("Number of Vowels: " + textData.getNumberOfVowels());
        System.out.println("Number of Consonants: " + textData.getNumberOfConsonants());
        System.out.println("Number of Letters: " + textData.getNumberOfLetters());
        System.out.println("Number of Sentences: " + textData.getNumberOfSentences());
        System.out.println("Longest Word: " + textData.getLongestWord());
    }
}

