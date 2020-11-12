import java.util.Scanner;

public class q_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter v0 , v1 , t : ");
        float v0 = scan.nextFloat();
        float v1 = scan.nextFloat();
        float t = scan.nextFloat();
        float acceleration = (v1 - v0)/t;
        System.out.println("The average acceleration is " + acceleration);
    }
}
