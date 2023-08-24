package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\test\\resources\\Features"},
        glue = {"Steps"},
        plugin = {"pretty","html:target/cucumber"},
        tags = "@smoke",
        monochrome = true,
        dryRun = false)



public class TestRunner {
}