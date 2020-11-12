import java.util.Scanner;

public class q_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenhiet between -58'F anf 41'F :");
        double temperature = scan.nextDouble();
        System.out.println("Enter the wind speed (>=2) in miles per hour : ");
        double windSpeed = scan.nextDouble();
        double windChill = 35.74 + 0.6215 *temperature - 35.75*Math.pow(windSpeed,0.16) + 0.4275*temperature*Math.pow(windSpeed,0.16);
        System.out.println("The wind chill index is " + windChill);
    }
}
