package singleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

import model.Task;

public class TasksFactoryTest {

    @Test
    public void testIsSingleton() {
        assertSame(TasksFactory.getTasksFactory(), TasksFactory.getTasksFactory());
    }

    @Test
    public void testSingletonNotNull() {
        assertNotNull(TasksFactory.getTasksFactory());
    }

    @Test
    public void testGetTask() {
        Task task1 = TasksFactory.getTasksFactory().getTask(1);
        assertEquals(1, task1.getId());
    }

    @Test
    public void testRemoveTask() {
        Task task1 = TasksFactory.getTasksFactory().getTask(1);
        TasksFactory.getTasksFactory().removeTask(task1.getId());

        Task task2 = TasksFactory.getTasksFactory().getTask(1);

        assertEquals(task1.getId(), task2.getId());
    }
}
