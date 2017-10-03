package composite;

public abstract class TaskComponent {

    public abstract String view();

    public abstract String viewBranchBrothers();

    public abstract void add(TaskComponent taskComponent);

}
