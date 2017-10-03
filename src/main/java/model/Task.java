package model;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private int id;

    private State state;

    private List<User> users = new ArrayList<User>();

    public Task(int id) {
        this.id = id;
        this.state = State.CREATED;
        this.users = new ArrayList<User>();
    }

    public Task(int id, State state, List<User> users) {
        assert state != null;
        assert users != null;
        this.id = id;
        this.state = state;
        this.users = users;
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
