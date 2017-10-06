package testMain;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import builder.TaskBuilderTest;
import builder.UserBuilderTest;
import composite.TaskCompositeTest;
import singleton.TasksFactoryTest;
import strategy.StrategyTest;

@RunWith(Suite.class)
@SuiteClasses({TasksFactoryTest.class, StrategyTest.class, TaskBuilderTest.class, UserBuilderTest.class, TaskCompositeTest.class})
public class AllPatternTests {

}
