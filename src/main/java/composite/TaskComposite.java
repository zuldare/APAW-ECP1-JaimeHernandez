package composite;

import java.util.ArrayList;
import java.util.List;

public class TaskComposite extends TaskComponent {
    private String name;

    private List<TaskComponent> listTaskComponents;

    public TaskComposite(String name) {
        this.name = name;
        this.listTaskComponents = new ArrayList<>();
    }

    @Override
    public String view() {
        return this.toString();
    }

    @Override
    public String viewBranchBrothers() {
        StringBuilder result = new StringBuilder("");
        for (TaskComponent taskComponent : listTaskComponents) {
            result.append(this.toString());
            result.append(" tiene ");
            result.append(taskComponent.view());
            result.append("; ");
        }
        return result.toString();
    }

    @Override
    public String toString() {
        return "Nodo[" + this.name + "]";
    }

    @Override
    public void add(TaskComponent taskComponent) {
        assert taskComponent != null;
        this.listTaskComponents.add(taskComponent);
    }

}
