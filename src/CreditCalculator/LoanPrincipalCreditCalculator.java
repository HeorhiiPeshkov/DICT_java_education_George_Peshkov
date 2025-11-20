package CreditCalculator;

import java.util.Scanner;

public class LoanPrincipalCreditCalculator {
    public static void calculate_Loan_Principal(Scanner scanner) {
        System.out.println("Enter the annuity payment");
        double annuity_payment = scanner.nextDouble();
        System.out.println("Enter the number of periods");
        double number_of_periods = scanner.nextDouble();
        System.out.println("Enter the loan interest");
        double loan_interest = scanner.nextDouble();
        double monthly_interest = (loan_interest / 100.0) / 12.0;
        double pow_periods = Math.pow(1.0 + monthly_interest, number_of_periods);
        double P = annuity_payment / (((monthly_interest * pow_periods)/((pow_periods)-1.0)));
        System.out.println("P = " + P);
    }
}
