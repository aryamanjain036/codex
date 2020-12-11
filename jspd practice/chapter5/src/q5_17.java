import java.util.Scanner;

public class q5_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int numberOfLines = scan.nextInt();
        for (int row = 1 ; row<=numberOfLines;row++){
            for (int s =numberOfLines-row;s>=1;s--){
                System.out.print(" ");
            }
            for (int d =row;d>=2;d--){
                System.out.print(d);
            }
            for (int i = 1;i<=row;i++){
                System.out.print(i);
            }
            System.out.println();
        }


    }
}
