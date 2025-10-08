import java.util.Scanner;

public class ChatBot{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String BotName = "Khai_Chat_Bot";
        int BirthYear = 2025;
        System.out.println("Hello! My name is " + BotName + "!");
        System.out.println("I was born in " + BirthYear + "!");
        System.out.println("Please, remind me your name.");
        String YourName = scanner.nextLine();
        System.out.println("What a great name you have, " + YourName + "!");

    }
}
