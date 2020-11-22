import java.util.Scanner;

public class q_33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter weight and price for package 1:");
        double weight1 = scan.nextDouble();
        double price1 = scan.nextDouble();
        System.out.println("Enter weight and price for package 2:");
        double weight2 = scan.nextDouble();
        double price2 = scan.nextDouble();
        int finalPrice1;
        int finalPrice2;
        finalPrice1 = (int)(weight1 * price1);
        finalPrice2 = (int)(weight2 * price2);
        if (weight1>weight2){
//            weight2 = weight2 * (weight1/weight2);
            finalPrice2 = (int)(weight1/weight2 * price2);
            finalPrice1 = (int)price1;
        }
        else if (weight1<weight2){
//            weight1 = weight1 * (weight2/weight1);
            finalPrice1 = (int)(weight2/weight1 * price1);
            finalPrice2 = (int)price2;
        }

        System.out.println(finalPrice1);
        System.out.println(finalPrice2);
        if (finalPrice1>finalPrice2){
            System.out.println("Package 2 has a better price");
        }
        else if (finalPrice1<finalPrice2){
            System.out.println("Package 1 has better price");
        }
        else {
            System.out.println("Two packages have the same price");
        }
    }
}
