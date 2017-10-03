package builder;

import java.util.Calendar;

import model.User;

public class UserBuilder {

    private User user;

    public UserBuilder id(int id) {
        this.user = new User(id);
        user.setId(id);
        return this;
    }

    public UserBuilder name(String name) {
        assert name != null;
        user.setName(name);
        return this;
    }

    public UserBuilder birthdate(Calendar birthdate) {
        assert birthdate != null;
        user.setBirthdate(birthdate);
        return this;
    }

    public UserBuilder active(boolean active) {
        user.setActive(active);
        return this;
    }

    public User build() {
        return user;
    }
}
