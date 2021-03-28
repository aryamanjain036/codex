import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers =  new int[10];
        for(int i=0;i<numbers.length;i++){
            numbers[i] = scan.nextInt();
        }
        int temp=0;
        for(int i=0;i<numbers.length/2;i++){
                temp = numbers[i];
                numbers[i] = numbers[numbers.length-i-1];
                numbers[numbers.length-i-1] = temp;

        }
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+ " ");
        }
    }
}
