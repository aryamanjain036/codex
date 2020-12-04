public class q5_4 {
    public static void main(String[] args) {
        final double kilometerValue = 1.609;
        double kilometers;
        System.out.println("Miles     Kilometers");
        for (int i=1;i<=10;i++){
            kilometers = i*kilometerValue;
            System.out.printf("%-9d%6.3f\n",i,kilometers);
        }
    }
}
