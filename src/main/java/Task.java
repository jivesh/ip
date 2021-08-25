public class Task {

    private final String description;
    private boolean done;

    public Task(String description) {
        this.description = description;
        this.done = false;
    }

    public void markAsDone() {
        this.done = true;
    }

    public String getTaskStatus() {
        return this.done ? "[X] " : "[ ] ";
    }

    @Override
    public String toString() {
        return this.getTaskStatus() + "TTT " + this.description;
    }
}
