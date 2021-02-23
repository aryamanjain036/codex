import java.util.Scanner;

public class q_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int n = scan.nextInt();
        System.out.println("reverse of " + n + " is: ");
        reverse(n);

    }
    public static void reverse(int n){
        int rev =0;
        while(n!=0){
            rev = rev * 10 + (n%10);
            n = n/10;
        }
        System.out.println(rev);
    }
}
