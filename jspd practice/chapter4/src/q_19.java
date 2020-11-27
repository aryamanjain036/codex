import java.util.Scanner;

public class q_19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as string: ");
        String isbn = scan.nextLine();
        int n1 = (isbn.charAt(0))-48;
        int n2 = (isbn.charAt(1))-48;
        int n3 = (isbn.charAt(2))-48;
        int n4 = (isbn.charAt(3))-48;
        int n5 = (isbn.charAt(4))-48;
        int n6 = (isbn.charAt(5))-48;
        int n7 = (isbn.charAt(6))-48;
        int n8 = (isbn.charAt(7))-48;
        int n9 = (isbn.charAt(8))-48;
        int n10 = (n1 + n2*2 + n3*3 + n4*4 + n5*5 +
                n6*6 + n7*7 + n8*8 + n9*9)%11;
        if (n10 == 10){
            System.out.println("The ISBN-10 number is " + isbn + 'X');
        }
        else
            System.out.println("The ISBN-10 number is " + isbn + n10);
    }
}
