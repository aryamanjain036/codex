public class q5_3 {
    public static void main(String[] args) {
        final double poundValue = 2.2;
        double pounds;
        System.out.println("Kilogram       Pounds");
        for (int i=1;i<200;i+=2){
            pounds = i*poundValue;
            System.out.printf("%-15d%6.1f\n", i,pounds);
        }
    }
}
