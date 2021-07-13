package org.jvmrep;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMreportGeneration {

	public static void Jvmreport(String json) {
		File f = new File("C:\\Users\\Aravindthanika-54029\\git\\matrimony172\\matrimonytask.com\\Report");
		
		Configuration c = new Configuration(f, "Matrimony Pi");
		c.addClassifications("Platform", "Windows");
		c.addClassifications("Version", "10");
		c.addClassifications("Browser", "Chrome");
		c.addClassifications("Driver Version", "90");
		List<String> list = new ArrayList<String>();
		
	list.add(json);
	
		ReportBuilder r = new ReportBuilder(list, c);
		r.generateReports();
	}
}
