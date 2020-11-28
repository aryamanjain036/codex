import java.util.Scanner;

public class q_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter point 1 (latitude and longitude) in degrees(Atlanta): ");
        String point1Atlanta = scan.nextLine();
        System.out.println("Enter point 2 (latitude and longitude) in degrees(Georgia): ");
        String point2Georgia = scan.nextLine();
        int indexOfComma1 = point1Atlanta.indexOf(',');
        double x1Atlanta = Double.parseDouble(point1Atlanta.substring(0,indexOfComma1));
        double y1Atlanta = Double.parseDouble(point1Atlanta.substring(indexOfComma1+2));
        int indexOfComma2 = point2Georgia.indexOf(',');
        double x2Georgia = Double.parseDouble(point2Georgia.substring(0,indexOfComma2));
        double y2Georgia = Double.parseDouble(point2Georgia.substring(indexOfComma2+2));
        x1Atlanta = Math.toRadians(x1Atlanta);
        y1Atlanta = Math.toRadians(y1Atlanta);
        x2Georgia = Math.toRadians(x2Georgia);
        y2Georgia = Math.toRadians(y2Georgia);
        double radius = 6371.01;
        double distance1 = radius*Math.acos((Math.sin(x1Atlanta)*Math.sin(x2Georgia) + (Math.cos(x1Atlanta)*Math.cos(x2Georgia)*Math.cos(y1Atlanta-y2Georgia))));
        System.out.println("The distance between Atlanta and georgia is " + distance1 + " km");
        //---------******------
        System.out.println("Enter point 1 (latitude and longitude) in degrees(Orlando): ");
        String point1Orlando = scan.nextLine();
        System.out.println("Enter point 2 (latitude and longitude) in degrees(Florida): ");
        String point2Florida = scan.nextLine();
        indexOfComma1 = point1Orlando.indexOf(',');
        double x1Orlando = Double.parseDouble(point1Orlando.substring(0,indexOfComma1));
        double y1Orlando = Double.parseDouble(point1Orlando.substring(indexOfComma1+2));
        indexOfComma2 = point2Florida.indexOf(',');
        double x2Florida = Double.parseDouble(point2Florida.substring(0,indexOfComma2));
        double y2Florida = Double.parseDouble(point2Florida.substring(indexOfComma2+2));
        x1Orlando = Math.toRadians(x1Orlando);
        y1Orlando = Math.toRadians(y1Orlando);
        x2Florida = Math.toRadians(x2Florida);
        y2Florida = Math.toRadians(y2Florida);
        double radius = 6371.01;
        double distance2 = radius*Math.acos((Math.sin(x1Orlando)*Math.sin(x2Florida) + (Math.cos(x1Orlando)*Math.cos(x2Florida)*Math.cos(y1Orlando-y2Florida))));
        System.out.println("The distance between orlando and florida is " + distance2 + " km");
        //---------******------
        System.out.println("Enter point 1 (latitude and longitude) in degrees(Savannah): ");
        String point1Savannah = scan.nextLine();
        System.out.println("Enter point 2 (latitude and longitude) in degrees(Georgia): ");
        String point2Georgia2 = scan.nextLine();
        indexOfComma1 = point1Savannah.indexOf(',');
        double x1Savannah = Double.parseDouble(point1Savannah.substring(0,indexOfComma1));
        double y1Savannah = Double.parseDouble(point1Savannah.substring(indexOfComma1+2));
        indexOfComma2 = point2Georgia2.indexOf(',');
        double x2Georgia = Double.parseDouble(point2Georgia2.substring(0,indexOfComma2));
        double y2Georgia = Double.parseDouble(point2Georgia2.substring(indexOfComma2+2));
        x1Savannah = Math.toRadians(x1Savannah);
        y1Savannah = Math.toRadians(y1Savannah);
        x2Georgia = Math.toRadians(x2Georgia);
        y2Georgia = Math.toRadians(y2Georgia);
        double radius = 6371.01;
        double distance3 = radius*Math.acos((Math.sin(x1Savannah)*Math.sin(x2Georgia) + (Math.cos(x1Savannah)*Math.cos(x2Georgia)*Math.cos(y1Savannah-y2Georgia))));
        System.out.println("The distance between Savannah and georgia is " + distance3 + " km");
        //---------******------
        System.out.println("Enter point 1 (latitude and longitude) in degrees(Charlotte): ");
        String point1Charlotte = scan.nextLine();
        System.out.println("Enter point 2 (latitude and longitude) in degrees(NorthCarolina): ");
        String point2NorthCarolina = scan.nextLine();
        indexOfComma1 = point1Charlotte.indexOf(',');
        double x1Chrlotte = Double.parseDouble(point1Charlotte.substring(0,indexOfComma1));
        double y1Chrlotte = Double.parseDouble(point1Charlotte.substring(indexOfComma1+2));
        indexOfComma2 = point2NorthCarolina.indexOf(',');
        double x2NorthCarolina = Double.parseDouble(point2NorthCarolina.substring(0,indexOfComma2));
        double y2NorthCarolina = Double.parseDouble(point2NorthCarolina.substring(indexOfComma2+2));
        x1Chrlotte = Math.toRadians(x1Chrlotte);
        y1Chrlotte = Math.toRadians(y1Chrlotte);
        x2NorthCarolina = Math.toRadians(x2NorthCarolina);
        y2NorthCarolina = Math.toRadians(y2NorthCarolina);
        double radius = 6371.01;
        double distance4 = radius*Math.acos((Math.sin(x1Chrlotte)*Math.sin(x2NorthCarolina) + (Math.cos(x1Chrlotte)*Math.cos(x2NorthCarolina)*Math.cos(y1Chrlotte-y2NorthCarolina))));
        System.out.println("The distance between Atlanta and georgia is " + distance4 + " km");

    }
}
