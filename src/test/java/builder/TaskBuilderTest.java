package builder;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.Test;

import model.State;
import model.Task;
import model.User;

public class TaskBuilderTest {

    @Test
    public void testIntStringCalendarBoolean() {
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        User user1 = new UserBuilder().id(1).name("Juan").birthdate(calendar1).active(false).build();
        User user2 = new UserBuilder().id(2).name("Ana").birthdate(calendar2).active(false).build();

        List<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);

        Task task1 = new TaskBuilder(1).state(State.CREATED).user(user1).build();
        Task task2 = new TaskBuilder(2).state(State.CREATED).users(users).build();

        assertEquals(1, task1.getId());
        assertEquals(State.CREATED, task1.getState());
        assertEquals("Juan", task1.getUsers().get(0).getName());

        assertEquals(2, task2.getUsers().size());
        assertEquals("Ana", task2.getUsers().get(1).getName());

    }

    @Test
    public void testConstructorIntStateList() {
        Task task = new Task(2, State.CREATED, null);
        assertEquals(2, task.getId());
        assertEquals(State.CREATED, task.getState());
        assertEquals(0, task.getUsers().size());

        Task task2 = new TaskBuilder(2).state(State.CREATED).build();
        assertEquals(task.getId(), task2.getId());
        assertEquals(task.getState(), task2.getState());
        assertEquals(task.getUsers().size(), task2.getUsers().size());
    }

    @Test
    public void testConstructorInt() {
        TaskBuilder taskBuilderTest = new TaskBuilder(1);
        assertEquals(1, taskBuilderTest.build().getId());
    }

}
