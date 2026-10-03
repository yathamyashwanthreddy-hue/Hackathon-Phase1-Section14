import java.util.Scanner;

public class SolarEnergyMonitor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading energy generated from user
        System.out.print("Enter energy generated in kWh: ");
        double energyGenerated = scanner.nextDouble();

        // Checking generation level using if-else
        if (energyGenerated >= 10.0) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }

        scanner.close();
    }
}