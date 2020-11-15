import java.util.Scanner;

public class q_18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the weight of the packages : ");
        double weight = scan.nextDouble();
        if (weight > 50){
            System.out.println("the package cannot be shipped");
        }
        else {
            double cost;
            if (weight>0 && weight<=1){
                cost = 3.5;
                System.out.println("the shipping cost is " + cost);
            }
            else if (weight>1 && weight<=3){
                cost = 5.5;
                System.out.println("the shipping cost is " + cost);
            }
            else if (weight>3 && weight <=10){
                cost = 8.5;
                System.out.println("the shipping cost is " + cost);
            }
            else if (weight>10 && weight <=20){
                cost = 10.5;
                System.out.println("the shipping cost is " + cost);
            }
        }
    }
}
