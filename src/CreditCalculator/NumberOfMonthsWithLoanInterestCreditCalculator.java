package CreditCalculator;

import java.util.Scanner;

public class MonthlyPaymentWithLoanInterestCreditCalculator {
    public static void calculate_Monthly_Payment_With_Loan_Interest(Scanner scanner) {
        System.out.println("Lets calculate how many months it would take you to repay with loan interest");
        System.out.println("Enter your loan principle");
        double loan_principle = scanner.nextDouble();
        System.out.println("Enter the monthly payment");
        double monthly_payment = scanner.nextInt();
        System.out.println("Enter your loan interest (%)");
        double loan_interest = scanner.nextDouble();
        double i = loan_interest/(12 * 100);
        double number_of_month = Math.log(monthly_payment / (monthly_payment - i*loan_principle)) / Math.log(1 + i);
        int final_months = (int)Math.ceil(number_of_month);
        if  (final_months > 12) {
            int years = final_months / 12;
        }
    }
}
