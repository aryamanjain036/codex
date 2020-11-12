import java.util.Scanner;

public class q_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount : ");
        double savingAmount = scan.nextDouble();
        double interestRateAnnual = 5;
        double interestRateMonthly = 0.05/12;
        double finalInterestRate = 1 + interestRateMonthly;
        double amountTotal = savingAmount * finalInterestRate;
        amountTotal = (amountTotal + savingAmount) * finalInterestRate;
        amountTotal = (amountTotal + savingAmount) * finalInterestRate;
        amountTotal = (amountTotal + savingAmount) * finalInterestRate;
        amountTotal = (amountTotal + savingAmount) * finalInterestRate;
        amountTotal = (amountTotal + savingAmount) * finalInterestRate;
        System.out.println("After the sixth month , the account value is &" + amountTotal);
    }
}
