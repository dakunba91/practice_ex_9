import java.util.ArrayDeque;
import java.util.Scanner;

public class OrderLogs {
    private ArrayDeque<String> orderLogs;

    public OrderLogs() {
        orderLogs = new ArrayDeque<>();
    }

    public void addOrderLog(String log) {
        orderLogs.push(log);
    }

    private void mostRecentLogEntry() {
        if (!orderLogs.isEmpty()) {
            System.out.println("Most Recent Log: " + orderLogs.peek());
        } else {
            System.out.println("No logs available.");
        }
    }

    private String getOrderLog() {
        return orderLogs.isEmpty() ? "No logs available." : orderLogs.pop();
    }

    private void removeAllLogEntries() {
        orderLogs.clear();
        System.out.println("All logs have been removed.");
    }

    private boolean orderLogsEmpty() {
        return orderLogs.isEmpty();
    }

    public void handleLogs() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose what you want to do with order logs:");
            System.out.println("1. Display all the logs");
            System.out.println("2. Display the most recent log");
            System.out.println("3. Remove a log entry");
            System.out.println("4. Remove all log entries");
            System.out.println("5. Check if the log is completely empty");
            System.out.println("Enter your choice (1 – 5):");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Order Logs:");
                    for (String log : orderLogs) {
                        System.out.println(log);
                    }
                    break;
                case 2:
                    mostRecentLogEntry();
                    break;
                case 3:
                    System.out.println("Removed Log: " + getOrderLog());
                    break;
                case 4:
                    removeAllLogEntries();
                    break;
                case 5:
                    System.out.println(orderLogsEmpty() ? "The log is completely empty." : "The log is not completely empty.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice >= 1 && choice <= 5);
    }
}
