import java.util.Scanner;

public class q_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the subtotal and gratuity rate: ");
        double subtotal = scan.nextDouble();
        double gratuityRate = scan.nextDouble();
        gratuityRate = (double)gratuityRate/ 100;
        double gratuity = subtotal*gratuityRate;
        subtotal+= gratuity;
        System.out.println("The gratuity is &" + gratuity + " and total is &" + subtotal);


    }
}
