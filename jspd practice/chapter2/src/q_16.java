import java.util.Scanner;

public class q_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side : ");
        double side = scan.nextDouble();
        double area = 3*Math.pow(3,.5)*Math.pow(side,2)/2;
        System.out.println("The area of the hexagon is " + area);
    }
}
