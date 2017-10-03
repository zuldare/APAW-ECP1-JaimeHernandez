package singleton;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class TasksFactoryTest {

    @Test
    public void testIsSingleton() {
        assertSame(TasksFactory.getTasksFactory(), TasksFactory.getTasksFactory());
    }

    @Test
    public void testSingletonNotNull() {
        assertNotNull(TasksFactory.getTasksFactory());
    }
}
