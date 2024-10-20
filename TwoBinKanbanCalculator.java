import java.util.Scanner;

public class TwoBinKanbanCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values
        System.out.println("Enter the daily production rate (units): ");
        int dailyProductionRate = scanner.nextInt();

        System.out.println("Enter the lead time in days: ");
        int leadTimeDays = scanner.nextInt();

        System.out.println("Enter the safety stock percentage (e.g., 33 for 33%): ");
        double safetyStockPercentage = scanner.nextDouble() / 100;

        // Calculate safety stock
        int safetyStock = (int) Math.round(dailyProductionRate * leadTimeDays * safetyStockPercentage);

        // Calculate 2-bin Kanban quantity
        int twoBinKanbanQuantity = (dailyProductionRate * leadTimeDays) + safetyStock;

        // Output the result
        System.out.printf("The 2-bin Kanban quantity is: %d units%n", twoBinKanbanQuantity);
    }
}
