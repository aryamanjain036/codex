import java.util.Scanner;

public class q_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter an integer: ");
        int n = scan.nextInt();
        getPentagonalNumber(n);
    }
    public static void getPentagonalNumber(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            int pentagonalNumber = (i*(3*i - 1)/2);
            count++;
            if (count%10==0){
                System.out.println(pentagonalNumber);
            }
            else
                System.out.print(pentagonalNumber + " ");
        }
    }
}
