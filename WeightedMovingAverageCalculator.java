import java.util.Scanner;

public class WeightedMovingAverageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inputs for sales data
        System.out.println("Enter the sales for the year 2021: ");
        int sales2021 = scanner.nextInt();

        System.out.println("Enter the sales for the year 2022: ");
        int sales2022 = scanner.nextInt();

        System.out.println("Enter the sales for the year 2023: ");
        int sales2023 = scanner.nextInt();

        System.out.println("Enter the sales for the year 2024: ");
        int sales2024 = scanner.nextInt();

        // Inputs for weights
        System.out.println("Enter the weight for the year 2021 (e.g., 0.4): ");
        double weight2021 = scanner.nextDouble();

        System.out.println("Enter the weight for the year 2022 (e.g., 0.3): ");
        double weight2022 = scanner.nextDouble();

        System.out.println("Enter the weight for the year 2023 (e.g., 0.2): ");
        double weight2023 = scanner.nextDouble();

        System.out.println("Enter the weight for the year 2024 (e.g., 0.1): ");
        double weight2024 = scanner.nextDouble();

        // Weighted moving average formula
        double weightedAverage = (sales2021 * weight2021) +
                                 (sales2022 * weight2022) +
                                 (sales2023 * weight2023) +
                                 (sales2024 * weight2024);

        // Output the result rounded to the nearest integer
        System.out.printf("The sales forecast (rounded) is: %d%n", Math.round(weightedAverage));
    }
}
