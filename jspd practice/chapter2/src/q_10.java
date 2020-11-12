import java.util.Scanner;

public class q_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms : ");
        double massOfWater = scan.nextDouble();
        System.out.println("Enter the initial temperature : ");
        double initialTemperature = scan.nextDouble();
        System.out.println("Enter the final temperature : ");
        double finalTemperature = scan.nextDouble();
        double energy = massOfWater * (finalTemperature - initialTemperature) * 4184;
        System.out.println("The energy needed is " + energy);
    }
}
