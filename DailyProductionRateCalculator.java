import java.util.Scanner;

public class DailyProductionRateCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values
        System.out.println("Enter the sales forecast (total units): ");
        int salesForecast = scanner.nextInt();

        System.out.println("Enter the buffer stock percentage (e.g., 33 for 33%): ");
        double bufferStockPercentage = scanner.nextDouble() / 100;

        System.out.println("Enter the number of production lines: ");
        int productionLines = scanner.nextInt();

        System.out.println("Enter the number of shifts per day: ");
        int shiftsPerDay = scanner.nextInt();

        System.out.println("Enter the number of working days per year: ");
        int workingDaysPerYear = scanner.nextInt();

        System.out.println("Enter the shift time in hours: ");
        double shiftTimeHours = scanner.nextDouble();

        System.out.println("Enter the break time in minutes: ");
        int breakTimeMinutes = scanner.nextInt();

        // Total available hours per production line (shift time minus break time, converted to hours)
        double effectiveShiftTime = shiftTimeHours - (breakTimeMinutes / 60.0);

        // Calculate total working time per day across all production lines and shifts
        double totalWorkingTimePerDay = effectiveShiftTime * productionLines * shiftsPerDay;

        // Adjust sales forecast with buffer stock
        double adjustedSalesForecast = salesForecast * (1 + bufferStockPercentage);

        // Calculate daily production rate
        double dailyProductionRate = adjustedSalesForecast / workingDaysPerYear;

        // Output the result rounded to the nearest integer
        System.out.printf("The daily production rate is: %d units per day%n", Math.round(dailyProductionRate));
    }
}
