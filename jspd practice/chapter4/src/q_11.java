import java.util.Scanner;

public class q_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a decimal value (0 to 15): ");
        int value = scan.nextInt();
        char ch;
        if (value<=9 && value>=0){
            System.out.println("The hex value is " + value);
        }
        else if (value<=15 && value>=10){
            ch = (char) ('A'-10+value);
            System.out.println("The hex value is " + ch);
        }
        else System.out.println(value + " is an invalid input");
    }
}
