package CreditCalculator;

import java.util.Scanner;

public class AnnuityMonthlyPaymentCreditCalculator {
    public static void calculate_Annuity_Monthly_Payment(Scanner scanner) {
        System.out.print("Enter your loan principal");
        double loan_principle = scanner.nextDouble();
        System.out.println("Enter number of periods");
        double periods = scanner.nextDouble();
        System.out.println("Enter the loan interest");
        double interest = scanner.nextDouble();
        double monthly_interest = (interest / 100.0) / 12.0;
        double pow_periods = Math.pow(1.0 + monthly_interest, periods);
        double A = loan_principle * ((monthly_interest * pow_periods)/((pow_periods)-1.0));
        A = Math.round(A * 100.0) / 100.0;
        System.out.println("Your loan principal is " + A);
    }
}
