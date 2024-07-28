import java.util.Scanner;

public class Task_1 {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double CelsiustoKelvin(double celsius) {
        return celsius + 32;
    }
    public static double FahrenheittoCelsius(double Fahrenheit) {
        return (Fahrenheit - 32)*5/9;
    }
    public static double FahrenheittoKelvin(double Fahrenheit) {
        return (Fahrenheit - 32)*5/9 +273.15;
    }
    public static double Kelvintocelsius(double Kelvin) {
        return Kelvin-273.15;
    }
    public static double Kelvintofahrenheit(double Kelvin) {
        return  (Kelvin - 273.15)* 9 / 5 + 32;
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("Choose an option:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Celsius to Kelvin");
        System.out.println("3. Fahrenheit to Celsius");
        System.out.println("4. Fahrenheit to Kelvin");
        System.out.println("5. Kelvin to Celsius");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        double temperature;

        switch (choice) {
                case 1:
                System.out.print("Enter temperature in Celsius: ");
                temperature = scanner.nextDouble();
                System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temperature));
                break;
                case 2 :
                System.out.print("Enter temperature in Celsius: ");
                temperature = scanner.nextDouble();
                System.out.println("Temperature in Kelvin: " + CelsiustoKelvin(temperature));
                break;
                case 3 :
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = scanner.nextDouble();
                System.out.println("Temperature in Celsius: " +FahrenheittoCelsius(temperature));
                break;
                case 4 :
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = scanner.nextDouble();
                System.out.println("Temperature in Celsius: " +FahrenheittoKelvin(temperature));
                break;
                case 5 :
                System.out.print("Enter temperature in Kelvin: ");
                temperature = scanner.nextDouble();
                System.out.println("Temperature in Celsius: " + Kelvintocelsius(temperature));
                break;
                case 6:
                System.out.print("Enter temperature in Kelvin: ");
                temperature = scanner.nextDouble();
                System.out.println("Temperature in Celsius: " +Kelvintofahrenheit(temperature));
                break;

        }

        scanner.close();
    }


}
