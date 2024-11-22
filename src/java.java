import java.util.Arrays;

enum Priority {
    LOW("Low urgency"),
    MEDIUM("Medium urgency"),
    HIGH("High urgency");

    private String description;

    Priority(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

class Task implements Comparable<Task> {
    private String name;
    private Priority priority;

    public Task(String name, Priority priority) {
        this.name = name;
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }

    public String toString() {
        return name + " (" + priority.getDescription() + ")";
    }

    @Override
    public int compareTo(Task other) {
        return this.priority.ordinal() - other.priority.ordinal();
    }
}

