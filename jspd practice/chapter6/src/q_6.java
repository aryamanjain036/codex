import java.util.Scanner;

public class q_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scan.nextInt();
        displayPattern(n);
    }
    public static void displayPattern(int n){
        for (int i=1;i<=n;i++){ //new line
            for (int j=1;j<=n-i;j++){ //spaces
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--){ //prints  number
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
