import java.util.Scanner;

public class RecallCostCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inputs
        System.out.println("Enter the total number of products in the market: ");
        int totalProducts = scanner.nextInt();

        System.out.println("Enter the cost of the product: ");
        double productCost = scanner.nextDouble();

        System.out.println("Enter the business interruption cost percentage (e.g., 30 for 30%): ");
        double interruptionPercentage = scanner.nextDouble();

        System.out.println("Enter the liability cost percentage (e.g., 1 for 1%): ");
        double liabilityPercentage = scanner.nextDouble();

        System.out.println("Enter the cost per liability (e.g., 100000): ");
        double liabilityCostPerProduct = scanner.nextDouble();

        System.out.println("Enter the recall costs per product for collection, storage, transportation, and destruction: ");
        double recallCostCollection = scanner.nextDouble();
        double recallCostStorage = scanner.nextDouble();
        double recallCostTransportation = scanner.nextDouble();
        double recallCostDestruction = scanner.nextDouble();

        // Calculations
        // Business interruption cost
        double interruptionCost = (interruptionPercentage / 100) * productCost * totalProducts;

        // Liability cost
        double liabilityCost = (liabilityPercentage / 100) * totalProducts * liabilityCostPerProduct;

        // Recall costs
        double totalRecallCostPerProduct = recallCostCollection + recallCostStorage + recallCostTransportation + recallCostDestruction;
        double totalRecallCost = totalRecallCostPerProduct * totalProducts;

        // Total cost
        double totalCost = interruptionCost + liabilityCost + totalRecallCost;
        System.out.printf("The total cost incurred by the organization is: $%.2f million%n", totalCost / 1_000_000);
    }
}
