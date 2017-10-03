package patterns;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import builder.TaskBuilderTest;
import builder.UserBuilderTest;
import composite.TaskCompositeTest;

@RunWith(Suite.class)
@SuiteClasses({
    TaskBuilderTest.class,
    UserBuilderTest.class,
    TaskCompositeTest.class
})
public class AllPatternTests {

}
