package CreditCalculator;

import java.util.Scanner;

public class MonthlyPaymentCreditCalculator {
    public static void calculate_monthly_payment(Scanner scanner) {
       System.out.println("Let's calculate how much money it would take you to repay");
       System.out.println("Enter your loan principle");
        int loan_principle = scanner.nextInt();
        System.out.println("Enter the number of months");
        int number_of_months = scanner.nextInt();
        int amount_of_money = loan_principle / number_of_months;
        int last_payment = loan_principle - (number_of_months - 1) *amount_of_money;
        if (last_payment != amount_of_money) {
            System.out.println("You need to pay " + amount_of_money + " and " + last_payment);
        } else {
                System.out.println("You need to pay " + amount_of_money);
        }
    }
}
