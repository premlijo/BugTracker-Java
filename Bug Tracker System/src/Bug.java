class Bug {
    private int id;
    private String title;
    private String description;
    private String status;
    private String assignTo;

    public Bug(int id, String title, String description, String assignTo) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.assignTo = assignTo;
        this.status = "Open";
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public String getAssignTo() {
        return assignTo;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Bug ID: " + id + "\nTitle: " + title + "\nDescription: " + description + "\nStatus: " + status + "\nAssigned To: " + assignTo;
    }
}