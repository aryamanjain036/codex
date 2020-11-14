import java.util.Scanner;

public class q_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter today's day : ");
        int day = scan.nextInt();
        System.out.println("Enter the number of days elapsed since today : ");
        int elapsedDay = scan.nextInt();
        String futureDay;
        int tempDate;
        if (day+elapsedDay<=6)
            tempDate = day+elapsedDay;
        else tempDate = (day+elapsedDay)%7;
        switch (tempDate){
            case 0: futureDay = "Sunday";break;
            case 1: futureDay = "Monday";break;
            case 2: futureDay = "Tuesday";break;
            case 3: futureDay = "Wednesday";break;
            case 4: futureDay = "Thursday";break;
            case 5: futureDay = "Friday";break;
            case 6: futureDay = "Saturday";break;
        }
//        System.out.println("Today is " + day + " and the future day is " + futureDay);
    }
}
