package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.reports.Reporting;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

/**
 * 
 * @author Viveka
 * @Description To perform the Execution purpose
 * @Date 08-07-2022
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(tags="@Login", snippets = SnippetType.CAMELCASE, plugin = { "pretty",
		"json:target/output.json" }, monochrome = true, features = {
				"src\\test\\resources\\Features" }, glue = { "com.stepdefinition" })

public class TestRunnerClass {

	@AfterClass
	public static void afterClass() {
		Reporting.generateJVMreport("C:\\Users\\Ms\\eclipse-workspace\\OMRBranchAdactinAutomation\\target\\output.json");

	}
}
