package lab1.task2;

public class TextData {
    private String text;
    private int numberOfVowels;
    private int numberOfConsonants;
    private int numberOfLetters;
    private int numberOfSentences;
    private String longestWord;

    public TextData(String text) {
        this.text = text;
        this.numberOfVowels = getNumberOfVowels();
        this.numberOfConsonants = getNumberOfConsonants();
        this.numberOfLetters = getNumberOfLetters();
        this.numberOfSentences = getNumberOfSentences();
        this.longestWord = getLongestWord();
    }

    public int getNumberOfVowels() {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char ch : text.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    public int getNumberOfConsonants() {
        int count = 0;
        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch) && "aeiouAEIOU".indexOf(ch) == -1) {
                count++;
            }
        }
        return count;
    }

    public int getNumberOfLetters() {
        int count = 0;
        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                count++;
            }
        }
        return count;
    }

    public int getNumberOfSentences() {
        int count = 0;
        String[] sentences = text.split("[.!?]");
        for (String sentence : sentences) {
            if (!sentence.trim().isEmpty()) {
                count++;
            }
        }
        return count;
    }

    public String getLongestWord() {
        String longestWord = "";
        String[] words = text.split("\\s+");

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", ""); // Remove punctuation
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public int getNumberOfVowelsResult() {
        return numberOfVowels;
    }

    public int getNumberOfConsonantsResult() {
        return numberOfConsonants;
    }

    public int getNumberOfLettersResult() {
        return numberOfLetters;
    }

    public int getNumberOfSentencesResult() {
        return numberOfSentences;
    }

    public String getLongestWordResult() {
        return longestWord;
    }
}
