import java.util.Scanner;

public class q5_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int numberOfLines = scan.nextInt();
        for(int i=1;i<=numberOfLines;i++){
            for (int j=1;j<=numberOfLines-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i - 1;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
