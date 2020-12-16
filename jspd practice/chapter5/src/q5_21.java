import java.util.Scanner;

public class q5_21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Loan Amount: ");
        int amount = scan.nextInt();
        System.out.println("Number of Years: ");
        int numberOfYears = scan.nextInt();

        System.out.println("Interest Rate\tMonthly Payment\tTotal Payment");
        for (double interestRate = 5; interestRate<=8 ; interestRate+=(1.0/8)){
            double monthlyPayment=0;
            double totalPayment=0;
            monthlyPayment = amount*(interestRate/1200)/(1-1/Math.pow(1+(interestRate/1200),numberOfYears*12));
            totalPayment = monthlyPayment* numberOfYears*12;
            System.out.printf("%.3f\t\t\t%.2f\t\t\t%.2f\n",interestRate,monthlyPayment,totalPayment);

        }
    }
}
