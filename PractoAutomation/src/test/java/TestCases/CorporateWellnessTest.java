package TestCases;

import org.testng.annotations.Test;

import PageClasses.CorporateWellnessPage;
import PageClasses.LandingPage;
import baseClasses.BaseTestClass;

public class CorporateWellnessTest extends BaseTestClass {

	@Test(groups = { "smoke" })
	public void corporateWellnessTest() {
		System.out.println("Fill details in corporate wellness page test");
		logger = report.createTest(" Fill valid details in corporate wellness");
		LandingPage landingPage = invokeLandingPage();
		landingPage.scrollDown();
		CorporateWellnessPage corporateWellness = landingPage.goToCorporateWllness();
		corporateWellness.scheduleDemo();
		flushReports();
	}

}