package Tasks;
import java.io.Serializable;

public class Task implements Serializable {
    private boolean completed = false;
    private String description;

    public Task(String description) {
        this.description = description;
    }

    public void setCompleted(boolean status) {
        this.completed = status;
    }

    @Override
    public String toString() {
        return (completed ? "[X] " : "[ ] ") + description;
    }

    static String format() {
        return "task <description>";
    }
}
