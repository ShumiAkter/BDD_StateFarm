package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(	
				tags = " not @smoke and @regression",
				features = "./src/test/java/features",
				glue = {"base","stepdefenition"},
				plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber-json.json"},
				snippets = SnippetType.CAMELCASE,
				dryRun = false,
				monochrome = false
						)
public class TestRunner {
}
