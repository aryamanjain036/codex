public class q5_7 {
    public static void main(String[] args) {
        double fees = 10000;
        final double increment = .05;
        int i=1,j=1;
        while (i<=10) {
            fees = fees + (fees * increment);
            i++;
        }
        double sum=0;
        while (j<=4){
            fees = fees + (fees * increment);
            j++;
            sum+=fees;
        }
        System.out.printf("%6.2f",sum);
    }
}