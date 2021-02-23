import java.util.Scanner;

public class q_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a value: ");
        int n = scan.nextInt();
//        scan.close();
        int finalA = sumDigits(n);
        System.out.println(finalA);

    }
    public static int sumDigits(int n){
        int sum =0;
        int temp = (n);
        while (temp >=0){
            sum = sum + (temp%10);
            temp = temp/10;
        }
        return sum;
    }

}
