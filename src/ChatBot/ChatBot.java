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
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int reminder3 = scanner.nextInt();
        int reminder5 = scanner.nextInt();
        int reminder7 = scanner.nextInt();
        int age = (reminder3 * 70 + reminder5 * 21 + reminder7 * 15) % 105;
        System.out.println("Your age is " + age + ". What a good time to start programming!");
        scanner.close();
    }
}
