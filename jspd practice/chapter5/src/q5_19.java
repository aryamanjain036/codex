public class q5_19 {
    public static void main(String[] args) {
        final int number =7;
        for (int row =0; row <=number ; row ++){
            for (int spaces = number ; spaces>=1 ; spaces--){
                System.out.print(" ");
            }
            for (int i=0;i<=row;i++){
                System.out.print((int)(Math.pow(2,i)));
            }
            System.out.println();
        }
    }
}
