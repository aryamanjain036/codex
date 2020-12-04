public class q5_5 {
    public static void main(String[] args) {
        final double poundValue = 2.2;
        double pounds;
        double kilograms;
        System.out.println("Kilograms     Pounds\t|\tPounds     Kilograms");
        for (int i=1,j=20;i<200;i+=2,j+=5){
            pounds = i*poundValue;
            kilograms = j/poundValue;
            System.out.printf("%-14d%6.1f\t|\t%-14d%6.2f",i,pounds,j,kilograms);
            System.out.print("\n");
        }
    }
}
