package singleton;

import java.util.HashMap;
import java.util.Map;

import model.Task;

public class TasksFactory {

    private static final TasksFactory tasksFactory = new TasksFactory();

    private Map<Integer, Task> tasks;

    private Task task;

    private TasksFactory() {
        this.tasks = new HashMap<Integer, Task>();
        this.task = new Task(0);
    }

    public static TasksFactory getTasksFactory() {
        return tasksFactory;
    }

    public Task getTask(int id) {
        this.task = tasks.computeIfAbsent(id, k -> new Task(k));
        return this.task; 
    }

    public void removeTask(int id) {
        this.tasks.remove(id);
    }
}
