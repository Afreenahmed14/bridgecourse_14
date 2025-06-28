public class temp {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static void main(String[] args) {
        double c = -2.0;
        double f = -9.0;
        System.out.println(c + "°C = " + celsiusToFahrenheit(c) + "°F");
        System.out.println(f + "°F = " + fahrenheitToCelsius(f) + "°C");
    }
}

    
