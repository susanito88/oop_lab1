package lab1.task4;

import lab1.task2.FileReader;
import lab1.task2.TextData;


public class Main4 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide at least one file path as a command-line argument.");
            return;
        }

        for (String filePath : args) {
                FileReader fileReader = new FileReader();
                String text = fileReader.readFileIntoString(filePath);

                if (text.isEmpty()) {
                    System.out.println("The file " + filePath + " could not be read or is empty.");
                    continue;
                }

                TextData textData = new TextData(text);

                System.out.println("File: " + filePath);
                System.out.println("Number of Vowels: " + textData.getNumberOfVowels());
                System.out.println("Number of Consonants: " + textData.getNumberOfConsonants());
                System.out.println("Number of Letters: " + textData.getNumberOfLetters());
                System.out.println("Number of Sentences: " + textData.getNumberOfSentences());
                System.out.println("Longest Word: " + textData.getLongestWord());
                System.out.println();


        }
    }
}
