import java.util.Scanner;

public class q_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("The amount invested: ");
        double investmentAmount = scan.nextDouble();
        System.out.println("Annual interest rate: ");
        double annualInterestRate = scan.nextDouble();
        double monthlyInterestRate = (annualInterestRate/100)/12;
        int years = 2;
        System.out.println("Years" + "\t\t" + "Future Value");
        System.out.println(futureInvestmentValue(investmentAmount,monthlyInterestRate,years));
    }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
        
    }
}
