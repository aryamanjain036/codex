import java.util.Scanner;

public class q_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a three-digit integer : ");
        int number = scan.nextInt();
        int originalNumber3 = number%10;
        int tempNumber = number/10;
        int originalNumber2 = tempNumber%10;
        int originalNumber1 = tempNumber/10;
        int palindromeNumber1 = number%10;
        int tempNumber2 = number/10;
        int palindromeNumber2 = tempNumber2%10;
        int palindromeNumber3 = tempNumber2/10;
        if (originalNumber1==palindromeNumber1 && originalNumber2==palindromeNumber2 && originalNumber3==palindromeNumber3){
            System.out.println(number + " is a palindrome");
        }
        else
            System.out.println(number + " is not a palindrome");

    }
}
