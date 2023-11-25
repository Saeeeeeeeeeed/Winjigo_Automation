package Runner;

import Tests.TestBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Features",
glue={"Steps"},
plugin={"pretty","html:target/cucumber_report"})
public class TestRunner extends TestBase {
}
