import java.util.Scanner;

public class q_31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the exchange rage from dollars to RBM :");
        double exchangeRate = scan.nextDouble();
        System.out.println("Enter 0 to convert dollars to RBM and 1 vice versa :");
        int convert = scan.nextInt();

        float finalAmount;
        switch (convert){
            case 0:
                System.out.println("Enter the dollar amount :");
                double amount = scan.nextInt();
                finalAmount = (float) (amount * exchangeRate);
                System.out.println("$" + amount + " is " + finalAmount + " yuan");
                break;
            case 1:
                System.out.println("Enter the RBM amount :");
                amount = scan.nextInt();
                finalAmount = (float) (amount/exchangeRate);
                System.out.println(amount + " yuan is &" + finalAmount);
                break;
            default:
                System.out.println("Incorrect input");
        }
    }
}
