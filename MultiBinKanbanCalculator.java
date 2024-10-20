import java.util.Scanner;

public class MultiBinKanbanCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values
        System.out.println("Enter the 2-bin Kanban quantity: ");
        int twoBinKanbanQuantity = scanner.nextInt();

        System.out.println("Enter the container quantity (units per container): ");
        int containerQuantity = scanner.nextInt();

        // Calculate number of multi-bin Kanban cards
        int multiBinKanbanCards = (int) Math.round((double) twoBinKanbanQuantity / containerQuantity);

        // Output the result
        System.out.printf("The multi-bin Kanban card quantity is: %d cards%n", multiBinKanbanCards);
    }
}
