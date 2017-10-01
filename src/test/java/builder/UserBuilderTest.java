package builder;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;

import model.User;

public class UserBuilderTest {

    @Test
    public void testIntStringCalendarBoolean() {
        Calendar calendar = Calendar.getInstance();
        User user = new UserBuilder().id(1).name("Juan").birthdate(calendar).active(false).build();
        assertEquals(1, user.getId());
        assertEquals("Juan", user.getName());
        assertEquals(calendar, user.getBirthdate());
        assertEquals(false, user.isActive());
    }
}
