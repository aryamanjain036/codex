import java.util.Scanner;

public class q_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius: ");
        double celsius = scan.nextDouble();
        double fahrenheit = (9.0/5)*celsius+32;
        System.out.println(celsius + "Celsius" + " is " + fahrenheit + " fahrenheit");

    }

}
