import java.util.Scanner;

public class q_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a,b,c,d,e,f : ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = scan.nextDouble();
        double e = scan.nextDouble();
        double f = scan.nextDouble();
        double equation = a*d - b*c;
        if (equation==0)
            System.out.println("The equation has no solution");
        else {
            double x = (e*d - b*f)/(a*d - b*c);
            double y = (a*f - e*c)/(a*d -b*c);
            System.out.println("x is " + x + " and y is " + y);
        }
    }
}
