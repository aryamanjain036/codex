import java.util.Scanner;

public class q_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter today's day : ");
        int day = scan.nextInt();
        System.out.println("Enter the number of days elapsed since today : ");
        int elapsedDay = scan.nextInt();
        int tempDate;
        if (day+elapsedDay<=6)
            tempDate = day+elapsedDay;
        else tempDate = (day+elapsedDay)%7;
        System.out.print("Today is ");
        switch (day){
            case 0:
                System.out.print("Sunday");
                break;
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
        }
        System.out.print(" and the future day is ");
        switch (tempDate){
            case 0:
                System.out.print("Sunday");
                break;
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
        }
    }
}
