public class q_8 {
    public static void main(String[] args) {
        double celsius = 40;
        double fahrenheit = 120;

    }
    public static double celsiusToFahrenheit(double celsius){
        for(double i=celsius;i>=31;i--){
            return (9.0/5)*(i+32);
        }
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0/9)*(fahrenheit-32);
    }
}
