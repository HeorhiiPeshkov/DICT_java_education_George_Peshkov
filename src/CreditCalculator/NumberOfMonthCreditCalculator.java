package CreditCalculator;

import java.util.Scanner;

public class NumberOfMonthCreditCalculator {
    public static void calculate_number_of_month(Scanner scanner) {
        System.out.println("Lets calculate how many months it would take you to repay");
        System.out.println("Enter your loan principle");
        int loan_principle = scanner.nextInt();
        System.out.println("Enter the monthly payment:");
        int monthly_payment = scanner.nextInt();
        int number_of_months = loan_principle / monthly_payment;
        int number_of_years = number_of_months / 12;
        int number_of_month_s = number_of_months % 12;
        if (number_of_month_s == 0) {
            System.out.println("You need " + number_of_years + " years to repay");
        } else if (number_of_years == 0) {
            System.out.println("You need " + number_of_months + " months to repay");
        } else {
            System.out.println("You need " + number_of_years + " years and " + number_of_month_s + " months to repay");
        }
    }
}
