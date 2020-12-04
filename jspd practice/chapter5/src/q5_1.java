import java.util.Scanner;

public class q5_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer, the input ends if it is 0: ");
        int number;
        double sum=0;
        double average;
        double count=0;
        int numberOfPositiveIntegers=0;
        int numberOfNegativeIntegers=0;
        number = scan.nextInt();
        sum += number;
        count++;
        if (number<0){
            numberOfNegativeIntegers++;
        }
        if (number>0){
            numberOfPositiveIntegers++;
        }
        if (number==0){
            System.out.println("No numbers are entered except 0");
        }
        else {
            do {
                number = scan.nextInt();
                if (number<0){
                    numberOfNegativeIntegers++;
                }
                if (number>0){
                    numberOfPositiveIntegers++;
                }
                count++;
                sum += number;
                average = sum/(count-1);
            }while (number!=0);
            System.out.println("The number of positives is " + numberOfPositiveIntegers);
            System.out.println("The number of negatives is " + numberOfNegativeIntegers);
            System.out.println("The total is " + sum);
            System.out.println("The average is " + average);
        }

    }
}
