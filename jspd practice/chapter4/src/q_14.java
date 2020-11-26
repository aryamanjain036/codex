import java.util.Scanner;

public class q_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a letter grade: ");
        char grade = scan.next().charAt(0);
        int value;
        switch (grade){
            case 'A':
                value=4;
                System.out.println("The numeric value for grade " + grade + " is " + value);
                break;
            case 'B':
                value=3;
                System.out.println("The numeric value for grade " + grade + " is " + value);
                break;
            case 'C':
                value=2;
                System.out.println("The numeric value for grade " + grade + " is " + value);
                break;
            case 'D':
                value=1;
                System.out.println("The numeric value for grade " + grade + " is " + value);
                break;
            case 'F':
                value=0;
                System.out.println("The numeric value for grade " + grade + " is " + value);
                break;
            default:
                System.out.println(grade + " is an invalid grade");
        }
    }
}
