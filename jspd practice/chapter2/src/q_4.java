import java.util.Scanner;

public class q_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number in pounds : ");
        double pounds = scan.nextDouble();
        double kilograms = pounds*0.454;
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
}
