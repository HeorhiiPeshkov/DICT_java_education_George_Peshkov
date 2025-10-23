package CoffeMachine;

import java.util.Scanner;

public class CoffeeMachine {
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
