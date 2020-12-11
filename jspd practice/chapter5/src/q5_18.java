public class q5_18 {
    public static void main(String[] args) {
        final int number = 6;
//        --------------Pattern A----------------
//        for (int i =1;i<=number;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println("");
//        }
//        ------------Pattern B-----------------
//        for (int i=number;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println("");
//        }
//        -----------------Pattern C---------------
//        for (int s=1;s<=number;s++){
//            for (int space=number-s;space>=1;space--){
//                System.out.print(" ");
//            }
//            for (int i =s;i>=1;i--){
//                System.out.print(i);
//            }
//            System.out.println();
//        }
//        ------------Pattern D------------------
        for (int row =0;row<number;row++){
            for (int space=0;space<row;space++){
                System.out.print(" ");
            }
            for (int i =0;i<6-row;i++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}
