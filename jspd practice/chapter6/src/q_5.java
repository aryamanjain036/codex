import java.util.Scanner;

public class q_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        double num1 = scan.nextInt();
        double num2 = scan.nextInt();
        double num3 = scan.nextInt();
        displaySortedNumbers(num1,num2,num3);
    }
    public static void displaySortedNumbers(double num1 ,double num2,double num3){
        if (num1>num2 && num1>num3){
            System.out.print(num1 + ">");
            if (num2>num3){
                System.out.print(num2 + ">");
                System.out.print(num3);
            }
            else {
                System.out.print(num3 + ">");
                System.out.print(num2);
            }
        }
        if(num2>num1 && num2>num3){
            System.out.print(num2 + ">");
            if(num1>num3){
                System.out.print(num1 + ">");
                System.out.print(num3);
            }
            else {
                System.out.print(num3 + ">");
                System.out.print(num1);
            }
        }
        if (num3>num1 && num3>num2){
            System.out.print(num3 + ">");
            if(num1>num2){
                System.out.print(num1 + ">");
                System.out.print(num2);
            }
            else {
                System.out.print(num2 + ">");
                System.out.print(num1);
            }
        }
    }
}
