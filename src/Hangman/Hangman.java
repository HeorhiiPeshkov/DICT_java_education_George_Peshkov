import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        System.out.println("HANGMAN"+ "\n" + "Guess the word:>");
        Scanner scanner = new Scanner(System.in);
        String python = "Python";
        String userChoice = scanner.nextLine();
        if (userChoice.equalsIgnoreCase(python)) {
            System.out.println("You Won");
        } else {
            System.out.println("You Lost");
        }
        scanner.close();
    }
}
