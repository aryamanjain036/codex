public class q_25 {
    public static void main(String[] args) {
        char c1 = (char)(Math.random()*(90-65)+65);
        char c2 = (char)(Math.random()*(90-65)+65);
        char c3 = (char)(Math.random()*(90-65)+65);
        int n1 = (int)(Math.random()*10);
        int n2 = (int)(Math.random()*10);
        int n3 = (int)(Math.random()*10);
        int n4 = (int)(Math.random()*10);
        System.out.println("The vehicle plate number is " + c1+c2+c3+n1+n2+n3+n4);
    }
}
