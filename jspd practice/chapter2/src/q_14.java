import java.util.Scanner;

public class q_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter weight in pounds :");
        double pounds = scan.nextDouble();
        System.out.println("Enter height in inches : ");
        double height = scan.nextDouble();
        double kilo = pounds*0.45359237;
        double meters = height*0.0254;
        double BMI = kilo/Math.pow(meters,2);
        System.out.println("BMI is " + BMI);

    }
}
