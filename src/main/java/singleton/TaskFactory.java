package singleton;

import java.util.HashMap;
import java.util.Map;

import model.Task;

public class TaskFactory {
    private Map<Integer, Task> tasks;

    private Task task;

    public TaskFactory() {
        this.tasks = new HashMap<Integer, Task>();
        this.task = new Task(0);
    }

    public Task getTask(int id) {
        return tasks.computeIfAbsent(id, k -> new Task(k));
    }

    public void removeTask(int id) {
        this.tasks.remove(id);
    }
}
