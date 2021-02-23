import java.util.Scanner;

public class q_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int n = scan.nextInt();
        System.out.println(isPalindrome(n)?"is palindrome":"not a palindrome");

    }
    public static int reverse(int n){
        int rev = 0;
        while(n!=0){
            rev = rev *10 + (n%10);
            n = n/10;
        }
        return rev;
    }
    public static boolean isPalindrome(int n){
        return reverse(n) == n;
    }
}
