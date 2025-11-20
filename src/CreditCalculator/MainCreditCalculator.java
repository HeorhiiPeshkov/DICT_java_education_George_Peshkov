package CreditCalculator;

import java.util.Scanner;

public class MainCreditCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to calculate?");
        String choice = scanner.next();
        EnumCalculations enumCalculations = switch (choice) {
            case "m" -> EnumCalculations.MONTHLY_PAYMENT;
            case "n" -> EnumCalculations.NUMBER_OF_PAYMENTS;
            case "p" -> EnumCalculations.LOAN_PRINCIPAL;
            case "i" -> EnumCalculations.NUMBER_OF_MONTHS_WITH_LOAN_INTEREST;
            case "a" -> EnumCalculations.ANNUITY_MONTHLY_PAYMENT;
            default -> null;
        };
        switch (enumCalculations) {
            case MONTHLY_PAYMENT -> MonthlyPaymentCreditCalculator.calculate_monthly_payment(scanner);
            case NUMBER_OF_PAYMENTS -> NumberOfMonthCreditCalculator.calculate_number_of_month(scanner);
            case LOAN_PRINCIPAL -> LoanPrincipalCreditCalculator.calculate_Loan_Principal(scanner);
            case NUMBER_OF_MONTHS_WITH_LOAN_INTEREST -> NumberOfMonthsWithLoanInterestCreditCalculator.calculate_Number_Of_Months_With_Loan_Interest(scanner);
            case ANNUITY_MONTHLY_PAYMENT -> AnnuityMonthlyPaymentCreditCalculator.calculate_Annuity_Monthly_Payment(scanner);
        }
    }
}