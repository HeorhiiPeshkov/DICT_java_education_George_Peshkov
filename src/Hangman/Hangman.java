import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Random;

public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int attempts = 0;
        int maxAttempts = 8;

        List<String> programming_languages = new ArrayList<>();
        programming_languages.add("java");
        programming_languages.add("python");
        programming_languages.add("javascript");
        programming_languages.add("kotlin");


        int randomIndex = random.nextInt(programming_languages.size());
        String rightWord = programming_languages.get(randomIndex);

        char[] hiddenWord = new char[rightWord.length()];
        for (int i = 0; i < hiddenWord.length; i++) {
            hiddenWord[i] = '-';
        }

        while (attempts < maxAttempts) {
            System.out.println("HANGMAN" + "\n" + String.valueOf(hiddenWord));
            String input = scanner.nextLine();
            char guessedLetter = input.charAt(0);
            boolean found = false;
            for (int i = 0; i < hiddenWord.length; i++) {
                if (rightWord.charAt(i) == guessedLetter && hiddenWord[i] == '-') {
                    hiddenWord[i] = guessedLetter;
                    found = true;
            }
        }
        if (found) {
            System.out.println("Right!");
        } else {
            System.out.println("Wrong!");
            attempts++;
        }
        if (String.valueOf(hiddenWord).equals(rightWord)) {
            System.out.println("You win!");
            break;
        }
    }
    if (attempts == maxAttempts) {
        System.out.println("You lost!");
    }
    scanner.close();
    }
}
