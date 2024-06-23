import java.util.ArrayList;
import java.util.Scanner;

public class PartThreeOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] partsOfSentence = sentence.split(" ");
        ArrayList<String> words = new ArrayList<>();

        for (String parts : partsOfSentence) {
            System.out.println(parts);
            words.add(parts);
        }
                
        if (words.contains("java")) {
            System.out.println("Java found!");
        } else {
            System.out.println("Ooops! Java not seen!");
        }

        String longestWord = "";
        for(String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Longest word: " + longestWord);

    }
}
