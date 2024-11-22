import java.util.Arrays;

public class TaskManager {
    public static void main(String[] args) {
        Task[] tasks = {
                new Task("Do homework", Priority.HIGH),
                new Task("Clean room", Priority.MEDIUM),
                new Task("Watch TV", Priority.LOW)
        };

        Arrays.sort(tasks);

        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}
