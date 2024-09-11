package testRunner;

import javax.swing.text.html.HTML;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features= {"src/test/java/features"},
//		dryRun = true,
		monochrome = true,
		glue = "steps",
		snippets = SnippetType.CAMELCASE,
		plugin = {"pretty",
		"html:reports",
		"json:reports/reports.json",
		"junit:reports/reports.xml"
		},
		tags= {"@smoke and @reg" }
//		tags= {"@smoke or @reg" }
//		tags= {"@dev" }
//		tags= {"not @test"}
//		tags= {"not @reg"}
//		tags= {"@E2E, @sanity"}  //we can add tag in scenario, feature, scenario outline, examples(except background) 
		
		
		)
class Runner extends AbstractTestNGCucumberTests{
	//Alt+up arrow to shift code lines from bottom to top
	
}

