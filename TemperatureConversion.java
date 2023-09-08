package prodigyInfoTech;

import java.util.Scanner;

public class TemperatureConversion {

    public static void conversion(){
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------Temperature Conversion--------------------");
        System.out.println("1. Celsius --> Fahrenheit , Kelvin");
        System.out.println("2. Fahrenheit --> Celsius , Kelvin");
        System.out.println("3. Kelvin --> Celsius , Fahrenheit");

        System.out.println("Enter your choice: ");
        int num = sc.nextInt();
        switch (num) {
            case 1 -> {
                System.out.println("Enter Celsius(°C) Temperature: ");
                float c = sc.nextFloat();
                float cF = (c * 9 / 5) + 32;
                float cK = c + 273.15f;
                System.out.println("Fahrenheit: " + cF + "°F");
                System.out.println("Kelvin: " + cK + "K");
            }
            case 2 -> {
                System.out.println("Enter Fahrenheit(°F) Temperature: ");
                float f = sc.nextFloat();
                float fC = (f - 32) * 5 / 9;
                float fK = (f - 32) * 5 / 9 + 273.15f;
                System.out.println("Celsius: " + fC + "°C");
                System.out.println("Kelvin: " + fK + "K");
            }
            case 3 -> {
                System.out.println("Enter Kelvin(K) Temperature: ");
                float k = sc.nextFloat();
                float kC = k - 273.15f;
                float kF = (k - 273.15f) * 9 / 5 + 32;
                System.out.println("Celsius: " + kC + "°C");
                System.out.println("Fahrenheit: " + kF + "°F");
            }
            default -> System.out.println("Invalid Choice! Enter valid choice");
        }
    }
    public static void main(String[] args) {
        conversion();
    }
}
