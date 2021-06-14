package oop.assignment2.ex26;

//n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
// n is the number of months.
// i is the daily rate (APR divided by 365).
// b is the balance.
// p is the monthly payment.

// Prompt for the card’s APR. Do the division internally.
// Prompt for the APR as a percentage, not a decimal.
// Use a class called PaymentCalculator with a public method called calculateMonthsUntilPaidOff, which returns the number of months.
// Round fractions of a cent up to the next cent.

public class PaymentCalculator {
    public double payCalculator(double bal, double apr, double monPay) {

        //decimal form
        double monPayDec = monPay * .01;

        //APR divide
        double apr1 = apr / 365;
        double form1 = bal / monPayDec;

        //The equation
        double form2 = Math.log(1 + form1 * (1 - Math.pow(1 + apr1, 30) ) );
        form2 = form2 * (1/30) * -1;
        double total = form2 / Math.log(1 + apr1);

        total = Math.ceil(total);

        return total;
    }
}
