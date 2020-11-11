import java.util.Scanner;

public class q_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value for feet: ");
        double feet = scan.nextDouble();
        double meters = feet*0.305;
        System.out.println(feet + " feet is " + meters + " meters");
    }
}
