package composite;

public abstract class TaskComponent {

    public abstract String view();

    public abstract void add(TaskComponent taskComponent);

    public abstract int numberOfTaskComponents();
}
