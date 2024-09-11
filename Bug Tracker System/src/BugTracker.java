import java.util.ArrayList;
import java.util.List;

class BugTracker {
    private List<Bug> bugs;
    private int nextId;


    public BugTracker() {
        bugs = new ArrayList<>();
        nextId = 1;
    }

    public void addBug(String title, String description, String assignTo) {
        Bug bug = new Bug(nextId++, title, description, assignTo);
        bugs.add(bug);
        System.out.println("Bug added successfully.");
    }

    public void updateBugStatus(int id, String newStatus) {
        for (Bug bug : bugs) {
            if (bug.getId() == id) {
                bug.setStatus(newStatus);
                System.out.println("Bug status updated successfully.");
                return;
            }
        }
        System.out.println("Bug not found.");
    }

    public void displayBugs() {
        if (bugs.isEmpty()) {
            System.out.println("No bugs found.");
        } else {
            for (Bug bug : bugs) {
                System.out.println(bug);
                System.out.println("-------------------------");
            }
        }
    }
}