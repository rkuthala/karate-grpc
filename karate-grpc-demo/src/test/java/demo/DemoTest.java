package demo;

import cucumber.api.CucumberOptions;

/**
 * DemoTest
 *
 * @author thinkerou
 */
@CucumberOptions(tags = {"~@ignore"})
public class DemoTest extends TestBase {

    /**
     * This class will automatically pick up all *.feature files in src/test/java/demo
     * and even recurse sub-directories even though the class name ends with 'Test',
     * the maven 'pom.xml' has set 'DemoTestParallel' to be the default 'test suite'
     * for the whole project.
     */

}
