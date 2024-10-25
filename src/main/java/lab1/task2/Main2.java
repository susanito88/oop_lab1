package lab1.task2;

public class Main2 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide the file path as a command-line argument.");
            return;
        }

        String filePath = args[0];
        FileReader fileReader = new FileReader();

        String text = fileReader.readFileIntoString(filePath);

        if (text.isEmpty()) {
            System.out.println("The file could not be read or is empty.");
            return;
        }

        TextData textData = new TextData(text);

        System.out.println("File: " + filePath);
        System.out.println("Number of Vowels: " + textData.getNumberOfVowels());
        System.out.println("Number of Consonants: " + textData.getNumberOfConsonants());
        System.out.println("Number of Letters: " + textData.getNumberOfLetters());
        System.out.println("Number of Sentences: " + textData.getNumberOfSentences());
        System.out.println("Longest Word: " + textData.getLongestWord());
    }
}

