public class q5_13 {
    public static void main(String[] args) {
        int n=0;
        int cube=0;
        while (cube<12000){
            n++;
            cube = n*n*n;
        }
        System.out.println(n-1);
    }
}
