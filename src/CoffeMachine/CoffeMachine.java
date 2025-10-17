package CoffeMachine;

import java.util.*;

public class CoffeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:" + "\n" + ">");
        int has_water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:" + "\n" + ">");
        int has_milk = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:" + "\n" + ">");
        int has_coffee = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:" + "\n" + ">");
        int caps_coffee = scanner.nextInt();
        int water = caps_coffee * 200;
        int milk = caps_coffee * 50;
        int beans = caps_coffee * 75;
        int cups_coffee_can_make1 = has_water / 200;
        int cups_coffee_can_make2 = has_milk / 50;
        int cups_coffee_can_make3 = has_coffee / 75;
        List<Integer> array_cups_coffee_can_make = new ArrayList<>();
        array_cups_coffee_can_make.add(cups_coffee_can_make1);
        array_cups_coffee_can_make.add(cups_coffee_can_make2);
        array_cups_coffee_can_make.add(cups_coffee_can_make3);
        int max_cups = Collections.min(array_cups_coffee_can_make);
        if (max_cups == caps_coffee) {
            System.out.println("Yes, I can make that amount of coffee");
        } else {
            System.out.println("Sorry, we don't have enough" + "\n" + "I can make only " + max_cups + " cups of coffee");
        }
        scanner.close();
    }
}