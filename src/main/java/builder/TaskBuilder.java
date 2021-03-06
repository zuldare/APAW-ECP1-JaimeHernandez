package builder;

import java.util.List;

import model.State;
import model.Task;
import model.User;

public class TaskBuilder {

    private Task task;

    public TaskBuilder(int id) {
        task = new Task(id);
        task.setId(id);
    }

    public TaskBuilder id(int id) {
        task.setId(id);
        return this;
    }

    public TaskBuilder state(State state) {
        assert state != null;
        task.setState(state);
        return this;
    }

    public TaskBuilder users(List<User> users) {
        assert users != null;
        task.setUsers(users);
        return this;
    }

    public TaskBuilder user(User user) {
        assert user != null;
        List<User> users = task.getUsers();
        users.add(user);
        task.setUsers(users);
        return this;
    }

    public Task build() {
        return task;
    }
}
