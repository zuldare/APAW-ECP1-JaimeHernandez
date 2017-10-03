package composite;

import model.Task;

public class TaskLeaf extends TaskComponent {
    private Task task;

    public TaskLeaf(Task task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Hoja[Task(" + this.task.getId() + ")]";
    }

    @Override
    public String view() {
        return toString();
    }

    @Override
    public String viewBranchBrothers() {
        return "";
    }

    @Override
    public void add(TaskComponent taskComponent) {
        throw new UnsupportedOperationException("Operación no soportada");
    }

    @Override
    public int numberOfTaskComponents() {
        return 1;
    }

}
