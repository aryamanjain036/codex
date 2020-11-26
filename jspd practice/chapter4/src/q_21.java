import java.util.Scanner;

public class q_21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a SSN: ");
        String ssn = scan.nextLine();
        if ((ssn.charAt(3) != '-') || (ssn.charAt(6) != '-')){
            System.out.println(ssn + " is an invalid social security number");
        }
        else System.out.println(ssn + " is a valid social security number");
    }
}
