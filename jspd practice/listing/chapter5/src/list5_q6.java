public class list5_q6 {
    public static void main(String[] args) {
        System.out.println("\t\t Multiplication Table \t\t");
        for (int j=1;j<10;j++){
            System.out.print("\t " + j);
        }
        System.out.println("\n---------------------------------------");
        for (int i=1;i<10;i++){
            System.out.print(i + "|");
            for (int j =1;j<10;j++){
                System.out.print("\t " + i*j);
            }
            System.out.println();
        }
    }
}
