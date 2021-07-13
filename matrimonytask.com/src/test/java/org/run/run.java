package org.run;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvmrep.JVMreportGeneration;
import org.testng.annotations.BeforeClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
        "html:C:\\Users\\Aravindthanika-54029\\git\\matrimony172\\matrimonytask.com\\Report\\HtmlReport",
        "junit:C:\\Users\\Aravindthanika-54029\\git\\matrimony172\\matrimonytask.com\\Report\\junit\\matri.xml",
        "json:C:\\Users\\Aravindthanika-54029\\git\\matrimony172\\matrimonytask.com\\Report\\cucumber.json"},features ="src\\test\\resources", glue="org.community",dryRun=false,tags= {"@login"})


public class run {
	@AfterClass
public static void generateAll() {
	JVMreportGeneration.Jvmreport("C:\\Users\\Aravindthanika-54029\\git\\matrimony172\\matrimonytask.com\\Report\\cucumber.json");
}
}
