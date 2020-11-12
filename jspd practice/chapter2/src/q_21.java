import java.util.Scanner;

public class q_21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the investment amount : ");
        double investmentAmount =  scan.nextDouble();
        System.out.println("Enter annual interest rate in percentage : ");
        double interestRateAnnual = scan.nextDouble();
        double interestRateMonthly = interestRateAnnual/1200;
        System.out.println("Enter number of years : ");
        double years = scan.nextDouble();
        double futureInvestmentValues = investmentAmount * Math.pow(1+interestRateMonthly,years*12);
        System.out.println("Accumulated value is &" + futureInvestmentValues);
    }
}
