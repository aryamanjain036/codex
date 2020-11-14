import java.util.Scanner;

public class q_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer : ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int n4 = scan.nextInt();
        int n5 = scan.nextInt();
        int n6 = scan.nextInt();
        int n7 = scan.nextInt();
        int n8 = scan.nextInt();
        int n9 = scan.nextInt();
        int n10 = (1*n1 + 2*n2 + 3*n3 + 4*n4 + 5*n5 + 6*n6 + 7*n7 + 8*n8 + 9*n9)%11;
        if (n10 == 10){
            System.out.println("The ISBN-10 number is " + n1+n2+n3+n4+n5+n6+n7+n8+n9+"X");
        }
        else
            System.out.println("The ISBN-10 number is " + n1+n2+n3+n4+n5+n6+n7+n8+n9+n10);


    }
}
