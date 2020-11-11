import java.util.Scanner;

public class q_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of minutes : ");
        int minutes = scan.nextInt();
        int years = minutes/(60*24*365);
        int days = minutes%(60*24*365);
        days = days/(60*24);
        System.out.println(minutes + " minutes is approximately " +
                years + " years and " + days + " days");
    }
}
