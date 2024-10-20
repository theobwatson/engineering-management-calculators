import java.util.Scanner;

public class OEECaculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inputs
        System.out.println("Enter the total operating time in hours: ");
        double operatingTimeHours = scanner.nextDouble();

        System.out.println("Enter the break time in hours: ");
        double breakTimeHours = scanner.nextDouble();

        System.out.println("Enter the cycle time in seconds per part: ");
        double cycleTimeSeconds = scanner.nextDouble();

        System.out.println("Enter the total number of parts produced: ");
        int totalParts = scanner.nextInt();

        System.out.println("Enter the number of defective parts: ");
        int defectiveParts = scanner.nextInt();

        // Availability calculation
        double plannedProductionTime = operatingTimeHours - breakTimeHours;
        double availability = plannedProductionTime / operatingTimeHours;

        // Performance calculation
        double idealTimeForTotalParts = totalParts * cycleTimeSeconds;
        double performance = idealTimeForTotalParts / (plannedProductionTime * 3600); // converting hours to seconds

        // Quality calculation
        double quality = (double) (totalParts - defectiveParts) / totalParts;

        // Overall Equipment Effectiveness (OEE)
        double OEE = availability * performance * quality * 100; // Multiply by 100 for percentage

        // Output the result
        System.out.printf("The Overall Equipment Effectiveness (OEE) is: %.2f%%\n", OEE);
    }
}
