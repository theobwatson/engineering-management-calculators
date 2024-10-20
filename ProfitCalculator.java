import java.util.Scanner;

public class ProfitCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables for each process
        int operatorsP1, operatorsP2, operatorsP5;
        double costPerOperatorP1, costPerOperatorP2, costPerOperatorP5;
        double machineCostP2, machineCostP4;
        double outsourcedP3;
        double batchesPerHourP1, batchesPerHourP2, batchesPerHourP5;
        double rawMaterialCost, overheadPercentage, productPrice;
        double totalCost, profit;

        // Input for parts per batch
        System.out.println("Enter the parts per batch: ");
        double partsPerBatch = scanner.nextDouble(); // parts per batch, used across processes

        // Inputs for Process 1
        System.out.println("Enter the number of operators for Process 1: ");
        operatorsP1 = scanner.nextInt();
        System.out.println("Enter the cost per operator for Process 1: ");
        costPerOperatorP1 = scanner.nextDouble();
        System.out.println("Enter the number of batches per hour for Process 1: ");
        batchesPerHourP1 = scanner.nextDouble();
        
        // Calculate Activity cost per part for Process 1
        double activityCostP1 = (operatorsP1 * costPerOperatorP1) / (partsPerBatch * batchesPerHourP1);
        System.out.println("Activity cost per part for Process 1: " + activityCostP1);

        // Inputs for Process 2
        System.out.println("Enter the number of operators for Process 2: ");
        operatorsP2 = scanner.nextInt();
        System.out.println("Enter the cost per operator for Process 2: ");
        costPerOperatorP2 = scanner.nextDouble();
        System.out.println("Enter the machine cost for Process 2: ");
        machineCostP2 = scanner.nextDouble();
        System.out.println("Enter the number of batches per hour for Process 2: ");
        batchesPerHourP2 = scanner.nextDouble();

        // Calculate Activity cost per part for Process 2
        double activityCostP2 = ((operatorsP2 * costPerOperatorP2) + (machineCostP2 / batchesPerHourP2)) / (partsPerBatch * batchesPerHourP2);
        System.out.println("Activity cost per part for Process 2: " + activityCostP2);

        // Inputs for Process 3 (outsourced cost)
        System.out.println("Enter the outsourced cost per part for Process 3: ");
        outsourcedP3 = scanner.nextDouble();
        System.out.println("Activity cost per part for Process 3: " + outsourcedP3);

        // Inputs for Process 4
        System.out.println("Enter the machine cost for Process 4: ");
        machineCostP4 = scanner.nextDouble();

        // Calculate Activity cost per part for Process 4
        double activityCostP4 = machineCostP4 / (partsPerBatch * 1); // Number of batches is 1 as per the table
        System.out.println("Activity cost per part for Process 4: " + activityCostP4);

        // Inputs for Process 5
        System.out.println("Enter the number of operators for Process 5: ");
        operatorsP5 = scanner.nextInt();
        System.out.println("Enter the cost per operator for Process 5: ");
        costPerOperatorP5 = scanner.nextDouble();
        System.out.println("Enter the number of batches per hour for Process 5: ");
        batchesPerHourP5 = scanner.nextDouble();

        // Calculate Activity cost per part for Process 5
        double activityCostP5 = (operatorsP5 * costPerOperatorP5) / (partsPerBatch * batchesPerHourP5);
        System.out.println("Activity cost per part for Process 5: " + activityCostP5);

        // Inputs for raw material and overhead
        System.out.println("Enter the raw material cost per part: ");
        rawMaterialCost = scanner.nextDouble();

        System.out.println("Enter the overhead percentage: ");
        overheadPercentage = scanner.nextDouble();

        // Calculate total cost
        double totalActivityCost = activityCostP1 + activityCostP2 + outsourcedP3 + activityCostP4 + activityCostP5;
        double overheadCost = (totalActivityCost + rawMaterialCost) * (overheadPercentage / 100);
        totalCost = totalActivityCost + rawMaterialCost + overheadCost;
        System.out.println("Total cost per part: " + totalCost);

        // Input for product price
        System.out.println("Enter the product price: ");
        productPrice = scanner.nextDouble();

        // Calculate profit
        profit = productPrice - totalCost;
        System.out.println("Profit (product price - total cost): " + profit);
    }
}
