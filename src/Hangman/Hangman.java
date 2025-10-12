import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Random;

public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        List<String> programming_languages = new ArrayList<>();
        programming_languages.add("ja--");
        programming_languages.add("py----");
        programming_languages.add("ja--------");
        programming_languages.add("ko----");
        List<String> unhidden_programming_languages = new ArrayList<>();
        unhidden_programming_languages.add("java");
        unhidden_programming_languages.add("python");
        unhidden_programming_languages.add("javascript");
        unhidden_programming_languages.add("kotlin");
        int randomIndex = random.nextInt(programming_languages.size());
        String targetWord = unhidden_programming_languages.get(randomIndex);
        String currentWord = programming_languages.get(randomIndex);
        System.out.println("HANGMAN"+ "\n" + "Guess the word:>" + currentWord);
        String userChoice = scanner.nextLine();
        if (userChoice.equalsIgnoreCase(targetWord)) {
            System.out.println("You Won");
        } else {
            System.out.println("You Lost");
        }
        scanner.close();
    }
}
