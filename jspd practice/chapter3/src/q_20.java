import java.util.Scanner;

public class q_20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature and wind-speed: ");
        double temperature = scan.nextDouble();
        double windSpeed = scan.nextDouble();
        if ((temperature>41 || temperature<-58)){
            System.out.println("temperature is invalid");
        }
        else if (windSpeed<2){
            System.out.println("wind speed is invalid");
        }
        else {
            float windChillTemp = (float)(35.74 + 0.6215*temperature - 35.75*Math.pow(windSpeed,0.16) + 0.4275*temperature*Math.pow(windSpeed,0.16));
            System.out.println("The wind-chill temperature is " + windChillTemp);
        }


    }
}
//twc = 35.74 + 0.6215ta - 35.75v0.16 + 0.4275tav0.16