package CoffeMachine;

import java.util.*;

public class CoffeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int beans = 120;
        int disposable_cups = 9;
        int money = 550;
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(disposable_cups + " of disposable cups");
        System.out.println(money + " of money");
//        class Cappuccino {
//            int cappuccino_water = 200;
//            int cappuccino_milk = 100;
//            int cappuccino_beans = 20;
//            int cappuccino_disposable_cups = 1;
//            int cappuccino_money = 6;
//        }
//        class Latte {
//            int latte_water = 350;
//            int latte_milk = 75;
//            int latte_beans = 20;
//            int latte_disposable_cups = 1;
//            int latte_money = 7;
//        }
//        class Espresso {
//            int espresso_water = 250;
//            int espresso_milk = 0;
//            int espresso_beans = 16;
//            int espresso_disposable_cups = 1;
//            int espresso_money = 4;
//        }
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            switch (input) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    System.out.print("> ");
                    String choice = scanner.nextLine();
                    int water_need = 0;
                    int milk_need = 0;
                    int beans_need = 0;
                    int cups_need = 0;
                    int money_need = 0;
                    switch (choice.toLowerCase()) {
                        case "1":
                            water_need = 250;
                            milk_need = 0;
                            beans_need = 16;
                            cups_need = 1;
                            money_need = 4;
                            break;
                        case "2":
                            water_need = 350;
                            milk_need = 75;
                            beans_need = 20;
                            cups_need = 1;
                            money_need = 7;
                            break;
                        case "3":
                            water_need = 200;
                            milk_need = 100;
                            beans_need = 20;
                            cups_need = 1;
                            money_need = 6;
                            break;
                    }
                    if (water >= water_need && milk >= milk_need && beans >= beans_need && disposable_cups >= cups_need && money >= money_need) {
                        water -= water_need;
                        milk -= milk_need;
                        beans -= beans_need;
                        disposable_cups -= cups_need;
                        money += money_need;
                        System.out.println("The coffee machine has:");
                        System.out.println(water + " of water");
                        System.out.println(milk + " of milk");
                        System.out.println(beans + " of coffee beans");
                        System.out.println(disposable_cups + " of disposable cups");
                        System.out.println(money + " of money");
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    System.out.print("> ");
                    int add_water = scanner.nextInt();
                    water += add_water;
                    System.out.println("Write how many ml of milk you want to add:");
                    System.out.print("> ");
                    int add_milk = scanner.nextInt();
                    milk += add_milk;
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    System.out.print("> ");
                    int add_beans = scanner.nextInt();
                    beans += add_beans;
                    System.out.println("Write how many disposable coffee cups you want to add:");
                    System.out.print("> ");
                    int add_cups = scanner.nextInt();
                    disposable_cups += add_cups;
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(beans + " of coffee beans");
                    System.out.println(disposable_cups + " of disposable cups");
                    System.out.println(money + " of money");
                    break;
                case "take":
                    System.out.println("I gave you " + money);
                    money -= money;
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(beans + " of coffee beans");
                    System.out.println(disposable_cups + " of disposable cups");
                    System.out.println(money + " of money");
                    break;
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(beans + " of coffee beans");
                    System.out.println(disposable_cups + " of disposable cups");
                    System.out.println(money + " of money");
            }
        }
        scanner.close();
    }
}