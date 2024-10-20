import java.util.Scanner;

public class TaktTimeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inputs
        System.out.println("Enter the number of production lines: ");
        int productionLines = scanner.nextInt();

        System.out.println("Enter the number of shifts per day: ");
        int shifts = scanner.nextInt();

        System.out.println("Enter the shift time in hours: ");
        double shiftTimeHours = scanner.nextDouble();

        System.out.println("Enter the break time in minutes: ");
        int breakTimeMinutes = scanner.nextInt();

        System.out.println("Enter the daily production rate (units produced per day): ");
        int dailyProductionRate = scanner.nextInt();

        // Calculate total working time per day (in seconds)
        double workingTimePerShiftMinutes = (shiftTimeHours * 60) - breakTimeMinutes;
        double totalWorkingTimeSeconds = (workingTimePerShiftMinutes * shifts * productionLines) * 60;

        // Calculate Takt time (time per unit)
        double taktTime = totalWorkingTimeSeconds / dailyProductionRate;

        // Output the result rounded to the nearest second
        System.out.printf("The Takt time is: %d seconds per unit%n", Math.round(taktTime));
    }
}
