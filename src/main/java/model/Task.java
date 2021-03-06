package model;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private int id;

    private State state;

    private List<User> users;

    public Task(int id) {
        this.id = id;
        this.state = State.CREATED;
        this.users = new ArrayList<>();
    }

    public Task(int id, State state, List<User> users) {
        assert state != null;
        this.id = id;
        this.state = state;
        if (users == null) {
            this.users = new ArrayList<>();
        } else {
            this.users = users;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

}
