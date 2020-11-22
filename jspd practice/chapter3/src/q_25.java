import java.util.Scanner;

public class q_25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double x3 = scan.nextDouble();
        double y3 = scan.nextDouble();
        double x4 = scan.nextDouble();
        double y4 = scan.nextDouble();
        double x = (((y1 - y2)*x1 - (x1 - x2)*y1)*(-1*(x3 - x4)) - ((-1*(x1 - x2))*((y3 - y4)*x3 - (x3 - x4)*y3)))/(((y1 - y2)*(-1*(x1 - x2)))-((-1*(x1 - x2))*((y3 - y4))));
        double y = (((y1 - y2)*((y3 - y4)*x3 - (x3 - x4)*y3)) - (((y1 - y2)*x1 - (x1 - x2)*y1)*((y3 - y4))))/(((y1 - y2)*(-1*(x1 - x2)))-((-1*(x1 - x2))*((y3 - y4))));
        System.out.println(x);
        System.out.println(y);
    }
}
