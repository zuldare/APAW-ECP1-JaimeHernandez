package composite;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import builder.TaskBuilder;
import model.Task;
import model.User;

public class TaskCompositeTest {

    private TaskComponent root;

    private TaskComponent sub1;

    private TaskComponent sub2;

    private TaskComponent leaf;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void init() {
        Task task = new TaskBuilder(1).user(new User(12)).build();
        Task task2 = new TaskBuilder(2).user(new User(12)).build();

        this.root = new TaskComposite("raiz");

        this.leaf = new TaskLeaf(task);
        this.root.add(leaf);

        this.sub1 = new TaskComposite("sub1");
        this.root.add(sub1);
        this.sub1.add(new TaskLeaf(task2));

        this.sub2 = new TaskComposite("sub2");
        this.root.add(sub2);
    }

    @Test
    public void testNumberOfTaskLeafIfComposite() {
        assertEquals("Nodo[raiz]", this.root.view());
        assertEquals("Hoja[Task(1)]", this.leaf.view());
        assertEquals("Nodo[raiz] tiene Hoja[Task(1)]; Nodo[raiz] tiene Nodo[sub1]; Nodo[raiz] tiene Nodo[sub2]; ",
                this.root.viewBranchBrothers());
    }
}
