import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Random;



public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        List<String> programming_languages = new ArrayList<>();
        programming_languages.add("java");
        programming_languages.add("python");
        programming_languages.add("javascript");
        programming_languages.add("kotlin");
        String random_word = programming_languages.get(random.nextInt(programming_languages.size()));
        System.out.println("HANGMAN"+ "\n" + "Guess the word:>" + "(" + random_word + ")");
        String userChoice = scanner.nextLine();
        if (userChoice.equalsIgnoreCase(random_word)) {
            System.out.println("You Won");
        } else {
            System.out.println("You Lost");
        }
        scanner.close();
    }
}
