import java.util.Scanner;

public class q_19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a1 = scan.nextDouble();
        double b1 = scan.nextDouble();
        double a2 = scan.nextDouble();
        double b2 = scan.nextDouble();
        double a3 = scan.nextDouble();
        double b3 = scan.nextDouble();
        double a = Math.pow(Math.pow(a1-a2,2)+Math.pow(b1-b2,2),0.5);
        double b = Math.pow(Math.pow(a2-a3,2)+Math.pow(b2-b3,2),0.5);
        double c = Math.pow(Math.pow(a3-a1,2)+Math.pow(b3-b1,2),0.5);
        if (a+b<=c || b+c<=a || c+a<=b){
            System.out.println("Invalid input");
        }
        else {
            double perimeter = a+b+c;
            System.out.println("The perimeter is " + perimeter);
        }
    }
}
