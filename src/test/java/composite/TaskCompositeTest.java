package composite;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TaskCompositeTest {

    private TaskComponent root;

    private TaskComponent sub1;

    private TaskComponent sub11;

    private TaskComponent sub12;

    private TaskComponent leaf;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void ini() {
        this.root = new TaskComposite("raiz");

        this.leaf = new TaskLeaf(1);
        this.root.add(leaf);
        this.sub1 = new TaskComposite("sub1");
        this.root.add(sub1);
        this.root.add(new TaskLeaf(7));

        this.sub11 = new TaskComposite("sub11");
        this.sub1.add(sub11);
        this.sub1.add(new TaskLeaf(4));
        this.sub12 = new TaskComposite("sub12");
        this.sub1.add(sub12);

        this.sub11.add(new TaskLeaf(2));
        this.sub11.add(new TaskLeaf(3));

        this.sub12.add(new TaskLeaf(-5));
        this.sub12.add(new TaskLeaf(6));
    }

    @Test
    public void testNumberOfTaskLeafIfLeaf() {
        assertEquals(1, this.leaf.numberOfTaskComponents());
    }

    @Test
    public void testNumberOfTaskLeafIfComposite() {
        System.out.println(this.sub12.toString());
        System.out.println(this.sub12.numberOfTaskComponents());
        assertEquals(2, this.sub12.numberOfTaskComponents());
    }
}
