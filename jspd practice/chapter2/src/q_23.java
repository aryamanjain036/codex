import java.util.Scanner;

public class q_23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the driving distance : ");
        double distance = scan.nextDouble();
        System.out.println("Enter miles per gallon : ");
        double milesPerGallon = scan.nextDouble();
        System.out.println("Enter price per gallon : ");
        double pricePerGallon = scan.nextDouble();
        double cost = (distance/milesPerGallon)*pricePerGallon;
        System.out.println("The cost of driving is &" + cost);
    }
}
