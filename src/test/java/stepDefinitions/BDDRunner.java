package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.platform.engine.Cucumber;

public class BDDRunner {

	@RunWith(Cucumber.class)
	@Cucumber(features = "src/test/resources/features", glue = {
			"stepdefinitions" }, monochrome = true, plugin = { "pretty",
					"html:target/HtmlReports" }, tags = "@DataDrivenTest")
	public class TestRunner {

		/* plugin = {"pretty", "html:target/HtmlReports/report.html"} */

		/* Need to create 'JSONReports' folder in target */
		/* plugin = {"pretty", "json:target/JSONReports/report.json"}) */

		/* Need to create 'JUnitReports' folder in target */
		/* plugin = {"pretty", "json:target/JUnitReports/report.xml"}) */
	}

}
