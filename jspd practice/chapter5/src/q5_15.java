public class q5_15 {
    public static void main(String[] args) {
        int count=0;
        final int numberPerLine = 10;
        for (int i=33;i<=126;i++){
            count++;
            if (count % numberPerLine == 0)
            System.out.println((char)(i));
            else
            System.out.print((char)(i) + " ");
        }
    }
}
