import java.util.Scanner;

public class q5_22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double withdraw = scan.nextInt();
        double balance = scan.nextDouble();
        if (withdraw%5==0){
            withdraw = withdraw + 0.50;
            balance = balance - withdraw;
        }
        System.out.println(balance);
    }
}
