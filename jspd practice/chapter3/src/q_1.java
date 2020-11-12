import java.util.Scanner;

public class q_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a,b,c :");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double discriminant = Math.pow(Math.pow(b,2)-(4*a*c),.5);
        if (discriminant>0){
            float r1 = (float) ((-b + discriminant) / 2*a);
            float r2 = (float) ((-b - discriminant) / 2*a);
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        }
        else if(discriminant==0){
            float r1 = (float)(-b/2*a);
            System.out.println("The equation has one root " + r1);
        }
        else System.out.println("The equation has no roots");
    }
}
