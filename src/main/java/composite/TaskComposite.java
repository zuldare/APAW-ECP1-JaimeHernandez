package composite;

import java.util.ArrayList;
import java.util.List;

public class TaskComposite extends TaskComponent {
    private String name;

    private List<TaskComponent> listTaskComponents;

    public TaskComposite(String name) {
        this.name = name;
        this.listTaskComponents = new ArrayList<TaskComponent>();
    }

    @Override
    public String view() {
        return this.toString();
    }

    @Override
    public String viewBranchBrothers() {
        String result = "";
        for (TaskComponent taskComponent : listTaskComponents) {
            result += this.toString() + " tiene " + taskComponent.view() + "; ";
        }
        return result;
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

    @Override
    public int numberOfTaskComponents() {
        return this.listTaskComponents.size();
    }

}
