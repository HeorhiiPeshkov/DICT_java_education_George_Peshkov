package CoffeMachine;

import java.util.Scanner;

public class CoffeMachine {
    enum CoffeState {
        WAITING_FOR_COMMAND,
        WAITING_FOR_CHOOSING_COFFEE_TYPE,
        ADDING_WATER,
        ADDING_MILK,
        ADDING_BEANS,
        ADDING_CUPS
    }
    private int water = 400;
    private int milk = 540;
    private int beans = 120;
    private int cups = 9;
    private int money = 550;
    private void printState() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " of beans");
        System.out.println(cups + " of coffee cups");
        System.out.println(money + " of money");
    }
    private void promtAction() {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        coffeState = CoffeState.WAITING_FOR_COMMAND;
    }
    private CoffeState coffeState = CoffeState.WAITING_FOR_COMMAND;
    public void process(String input) {
        switch (coffeState) {
            case WAITING_FOR_COMMAND:
                handleCommand(input);
                break;
            case WAITING_FOR_CHOOSING_COFFEE_TYPE:
                chooseCooffeeType(input);
                break;
            case ADDING_WATER:
                add_Water(input);
                break;
            case ADDING_MILK:
                add_Milk(input);
                break;
            case ADDING_BEANS:
                add_Beans(input);
                break;
            case ADDING_CUPS:
                add_Cups(input);
                break;
        }
    }
    private void handleCommand(String input) {
        switch (input) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                coffeState = CoffeState.WAITING_FOR_CHOOSING_COFFEE_TYPE;
                break;
            case "fill":
                System.out.println("Write how many ml of water you want to add:");
                coffeState = CoffeState.ADDING_WATER;
                break;
            case "take":
                System.out.println("I gave you " + money);
                money = 0;
                break;
            case "remaining":
                printState();
                promtAction();
                break;
            case "exit":
                System.exit(0);
                break;
        }
    }
    private void chooseCooffeeType(String input) {
        int waterNeed = 0;
        int milkNeed = 0;
        int beansNeed = 0;
        int cupsNeed = 0;
        int moneyNeed = 0;
        switch (input) {
            case "1":
                waterNeed = 250;
                milkNeed = 0;
                beansNeed = 16;
                cupsNeed = 1;
                moneyNeed = 5;
                break;
            case "2":
                waterNeed = 350;
                milkNeed = 75;
                beansNeed = 20;
                cupsNeed = 1;
                moneyNeed = 7;
                break;
            case "3":
                waterNeed = 200;
                milkNeed = 100;
                beansNeed = 12;
                cupsNeed = 1;
                moneyNeed = 6;
                break;
        }
        if (water > waterNeed && milk > milkNeed && beans > beansNeed && cups > cupsNeed) {
            water -= waterNeed;
            milk -= milkNeed;
            beans -= beansNeed;
            cups--;
            money += moneyNeed;
            promtAction();
        }
    }
    private void add_Water(String input) {
        water += Integer.parseInt(input);
        System.out.println("Write how many ml of water do you want to add:");
        coffeState = CoffeState.ADDING_MILK;
    }
    private void add_Milk(String input) {
        milk += Integer.parseInt(input);
        System.out.println("Write how many ml of milk do you want to add:");
        coffeState = CoffeState.ADDING_BEANS;
    }
    private void add_Beans(String input) {
        beans += Integer.parseInt(input);
        System.out.println("Write how many beans do you want to add:");
        coffeState = CoffeState.ADDING_CUPS;
    }
    private void add_Cups(String input) {
        cups += Integer.parseInt(input);
        promtAction();
    }
    public static void main(String[] args) {
        CoffeMachine coffeMachine = new CoffeMachine();
        Scanner scanner = new Scanner(System.in);
        coffeMachine.promtAction();

        while (scanner.hasNext()) {
            String input = scanner.next();
            coffeMachine.process(input);
        }
    }
}