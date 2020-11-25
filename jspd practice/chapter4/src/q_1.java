import java.util.Scanner;

public class q_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length from the center to a vertex: ");
        double r_length = scan.nextDouble();
        double s = 2*r_length*Math.sin(Math.PI/5);
        double area = (5*Math.pow(s,2))/(4*Math.tan(Math.PI/5));
        System.out.printf("The area of the pentagon is %4.2f" , area);
    }
}
