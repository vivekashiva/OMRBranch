package com.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

/**
 * 
 * @author Viveka 
 *Description: JVM report generation
 *Date: 08-07-2022
 */
public class Reporting {
	public static void generateJVMreport(String jsonFile) {
		File file = new File("C:\\Users\\Ms\\eclipse-workspace\\OMRBranchAdactinAutomation\\target");
		Configuration configuration = new Configuration(file, "Adactin Automation");
		configuration.addClassifications("Browser", "chrome");
		configuration.addClassifications("Version", "103");
		configuration.addClassifications("OS", "Win10");

		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);

		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		reportBuilder.generateReports();
	}
}
