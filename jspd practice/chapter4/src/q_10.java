import java.util.Scanner;

public class q_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Is the birthday in Set1? ");
        String set1 =  (" 1  3  5  7\n" +
                " 9 11 13 15\n" +
                "17 19 21 23\n" +
                "25 27 29 31" );
        System.out.println(set1);
        System.out.println("Enter N for No and Y for Yes: ");
        char set1Reply = scan.next().charAt(0);
        System.out.println("Is the birthday in Set2? ");
        String set2 =  (" 2  3  6  7\n" +
                "10 11 14 15\n" +
                "18 19 22 23\n" +
                "26 27 30 31" );
        System.out.println(set2);
        System.out.println("Enter N for No and 1Y for Yes: ");
        char set2Reply = scan.next().charAt(0);
        System.out.println("Is the birthday in Set3? ");
        String set3 =  (" 4  5  6  7\n" +
                "12 13 14 15\n" +
                "20 21 22 23\n" +
                "28 29 30 31");
        System.out.println(set3);
        System.out.println("Enter N for No and Y for Yes: ");
        char set3Reply = scan.next().charAt(0);
        System.out.println("Is the birthday in Set4? ");
        String set4 =  (" 8  9 10 11\n" +
                "12 13 14 15\n" +
                "24 25 26 27\n" +
                "28 29 30 31");
        System.out.println(set4);
        System.out.println("Enter N for No and Y for Yes: ");
        char set4Reply = scan.next().charAt(0);
        System.out.println("Is the birthday in Set5? ");
        String set5 =  ("16 17 18 19\n" +
                "20 21 22 23\n" +
                "24 25 26 27\n" +
                "28 29 30 31");
        System.out.println(set5);
        System.out.println("Enter N for No and Y for Yes: ");
        char set5Reply = scan.next().charAt(0);
        int finalR = 0;
        if (set1Reply == 'Y'){
            finalR+=1;
        }
        if (set2Reply == 'Y'){
            finalR+=2;
        }
        if (set3Reply == 'Y'){
            finalR+=4;
        }
        if (set4Reply == 'Y'){
            finalR+=8;
        }
        if (set5Reply == 'Y'){
            finalR+=16;
        }
        System.out.println("Your birthday is " + finalR + "!");
    }
}
