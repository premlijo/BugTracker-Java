import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BugTracker bugTracker = new BugTracker();
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Program menu
        do {
            System.out.println("Bug Tracker System");
            System.out.println("1. Add Bug");
            System.out.println("2. Update Bug Status");
            System.out.println("3. Display All Bugs");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Bug Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Bug Description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter Bug to be Assigned: ");
                    String assignTo = scanner.nextLine();
                    bugTracker.addBug(title, description, assignTo);
                    break;
                case 2:
                    System.out.print("Enter Bug ID to update: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new Status (Open, In Progress, Closed): ");
                    String status = scanner.nextLine();
                    bugTracker.updateBugStatus(id, status);
                    break;
                case 3:
                    bugTracker.displayBugs();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}