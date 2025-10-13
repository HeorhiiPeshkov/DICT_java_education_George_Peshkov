import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;

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

        Set<Character> guessedLetters = new HashSet<>();

        while (attempts < maxAttempts) {
            System.out.println("HANGMAN" + "\n" + String.valueOf(hiddenWord));

            String input = scanner.nextLine();

            if (input.length() != 1) {
                System.out.println("You should input a single letter");
                continue;
            }

            char guessedLetter = input.charAt(0);

            if (!Character.isLowerCase(guessedLetter) || !Character.isLetter(guessedLetter)) {
                System.out.println("Please enter a lowercase English letter");
                continue;
            }

            if (guessedLetters.contains(guessedLetter)) {
                System.out.println("You've already guessed this letter.");;
                continue;
            }

            guessedLetters.add(guessedLetter);
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
            System.out.println("That letter doesn't appear in the word");
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
