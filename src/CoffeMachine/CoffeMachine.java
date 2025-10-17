package CoffeMachine;

import java.util.Scanner;

public class CoffeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:" + "\n" + ">");
        int cups = scanner.nextInt();
        System.out.println("For " + cups + " cups of coffee you will need");
        int water = 200;
        int milk = 50;
        int beans = 75;
        System.out.println(water * cups + " ml of water");
        System.out.println(milk * cups + " ml of milk");
        System.out.println(beans * cups + " ml of beans");
        scanner.close();
    }
}