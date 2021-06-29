package runner.com;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources", glue="comunity.com",dryRun=false,tags= {"@login"},
plugin = {"pretty", "html:target/cucumber-reports",
        "json:target/cucumber.json",
        "rerun:target/rerun.txt"} 
)

public class Runnerclsmatrimony {

}

