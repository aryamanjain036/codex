public class q5_6 {
    public static void main(String[] args) {
        final double kilometerValue = 1.609;
        double kilometers;
        double miles;
        System.out.println("Miles     Kilometers\t|\tKilometers     Miles");
        for (int i=1,j=20;i<=10;i++,j+=5){
            kilometers = i*kilometerValue;
            miles = j/kilometerValue;
            System.out.printf("%-14d%6.3f\t|\t%-15d%6.3f",i,kilometers,j,miles);
            System.out.print("\n");
        }
    }
}
