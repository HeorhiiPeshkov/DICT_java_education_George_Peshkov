package CreditCalculator;

public class ForthStageCreditCalculator {
    public static void main(String[] args) {

        String type = System.getProperty("type");
        String principalStr = System.getProperty("principal");
        String paymentStr = System.getProperty("payment");
        String periodsStr = System.getProperty("periods");
        String interestStr = System.getProperty("interest");

        if (type == null || interestStr == null) {
            System.out.println("Incorrect parameters");
            return;
        }

        double principal = principalStr == null ? 0.0 : Double.parseDouble(principalStr);
        double payment = paymentStr == null ? 0.0 : Double.parseDouble(paymentStr);
        int periods = periodsStr == null ? 0 : Integer.parseInt(periodsStr);
        double interest = Double.parseDouble(interestStr);

        if (principal < 0 || payment < 0 || periods < 0 || interest < 0) {
            System.out.println("Incorrect parameters");
        return;
        }

        double i = (interest / 100.0) / 12.0;

        if (type.equals("diff")) {
            if (paymentStr != null) {
                System.out.println("Incorrect parameters");
                return;
            }

            if (principal == 0 || periods == 0 || interest == 0) {
                System.out.println("Incorrect parameters");
                return;
            }
            double totalPayment = 0;
            for (int m = 1; m <= periods; m++) {
                double Dm = (principal / periods) + i * (principal - (principal * (m - 1) / periods));
                int paymentMonth = (int) Math.ceil(Dm);
                totalPayment += paymentMonth;
                System.out.println("Month " + m + " payment is " + paymentMonth);
            }
            int overPayment = (int) Math.round(totalPayment - principal);
            System.out.println("Over payment is " + overPayment);
        } else if (type.equals("annuity")) {
            if (principalStr != null && periodsStr != null && paymentStr == null) {
                double A = principal * ((i * Math.pow(1 + i, periods)) / (Math.pow(1 + i, periods) - 1));
                int annuityPayment = (int) Math.ceil(A);
                System.out.println("Annuity payment is " + annuityPayment);
                int overpayment = (int) Math.round(annuityPayment * periods - principal);
                System.out.println("Overpayment is " + overpayment);
            } else if (paymentStr != null && periodsStr != null && principalStr == null) {
                double P = payment / ((i * Math.pow(1 + i, periods)) / (Math.pow(1 + i, periods) - 1));
                System.out.println("Your loan principal " + P);
                int overpayment = (int) Math.round(payment * periods - P);
                System.out.println("Overpayment is " + overpayment);
            } else if (principalStr != null && paymentStr != null && periodsStr == null) {
                double n = Math.log(payment / (payment - i*principal)) / Math.log(1 + i);
                int months = (int) Math.ceil(n);
                int years = months / 12;
                int finalMonths = months % 12;
                StringBuilder output = new StringBuilder("It will take ");
                if (years > 0) {
                    output.append(years).append(years == 1 ? " year" : " years");
                }
                if (finalMonths > 0) {
                    if (years > 0) output.append("and");
                    output.append(finalMonths).append(finalMonths == 1 ? " month" : " months");
                }
                output.append(" to repay this loan");
                System.out.println(output);
                int overpayment = (int) Math.round(payment * months - principal);
                System.out.println("Overpayment = " + overpayment);
            }

            else {
                System.out.println("Incorrect parameters");
            }
        }

        else {
            System.out.println("Incorrect parameters");
        }
    }
}