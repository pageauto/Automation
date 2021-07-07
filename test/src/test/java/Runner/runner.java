
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "test\src\main\feature"
 ,glue={"src\test\java\stepdef"}
 )
 
public class TestRunner {
 
}