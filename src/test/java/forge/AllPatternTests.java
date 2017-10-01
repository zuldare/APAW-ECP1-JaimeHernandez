package forge;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import builder.TaskBuilderTest;
import builder.UserBuilderTest;

@RunWith(Suite.class)
@SuiteClasses({
    TaskBuilderTest.class,
    UserBuilderTest.class
})
public class AllPatternTests {

}
