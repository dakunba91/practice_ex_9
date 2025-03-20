import java.util.ArrayDeque;
import java.util.Scanner;

public class OrderQueue {
    private ArrayDeque<String> orderQueue;

    public OrderQueue() {
        orderQueue = new ArrayDeque<>();
    }

    public void addOrder(String order) {
        orderQueue.add(order);
    }

    private void displayOrders() {
        if (orderQueue.isEmpty()) {
            System.out.println("No orders in the queue.");
        } else {
            System.out.println("Orders in Queue:");
            for (String order : orderQueue) {
                System.out.println(order);
            }
        }
    }

    private String processOrder() {
        return orderQueue.isEmpty() ? "No orders to process." : orderQueue.poll();
    }

    private void clearOrders() {
        orderQueue.clear();
        System.out.println("All orders have been cleared.");
    }

    private boolean isQueueEmpty() {
        return orderQueue.isEmpty();
    }

    public void handleQueue() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose what you want to do with the order queue:");
            System.out.println("1. Display all orders");
            System.out.println("2. Process an order");
            System.out.println("3. Clear all orders");
            System.out.println("4. Check if the queue is empty");
            System.out.println("Enter your choice (1 – 4):");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayOrders();
                    break;
                case 2:
                    System.out.println("Processed Order: " + processOrder());
                    break;
                case 3:
                    clearOrders();
                    break;
                case 4:
                    System.out.println(isQueueEmpty() ? "The queue is empty." : "The queue is not empty.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice >= 1 && choice <= 4);
    }
}
