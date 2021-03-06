package TestCases;

import org.testng.annotations.Test;

import PageClasses.ConsultantPage;
import PageClasses.DiagnosticsPage;
import PageClasses.DoctorPage;
import PageClasses.LandingPage;
import PageClasses.PharmacyPage;
import baseClasses.BaseTestClass;

public class TopMenuTest extends BaseTestClass {

	@Test(groups = { "smoke" })
	public void homeButtontest() {
		System.out.println("Home button Test");
		logger = report.createTest("Click on practo icon");
		LandingPage landingPage = invokeLandingPage();
		landingPage = landingPage.goToHomePage();
		landingPage.getTitle(
				"Practo | Video Consultation with Doctors, Book Doctor Appointments, Order Medicine, Diagnostic Tests");
		landingPage.takeScreenShotOnFailure();
		flushReports();
	}

	@Test(groups = "regression")
	public void doctorsButtontest() {
		System.out.println("Doctors button test");
		logger = report.createTest("Click on Doctor icon");
		LandingPage landingPage = invokeLandingPage();
		DoctorPage doctorpage = landingPage.goToDoctorPage();
		doctorpage.getTitle("Practo | Book Doctor Appointments Online, Order Medicine, Diagnostic Tests, Consult");
		doctorpage.takeScreenShotOnFailure();
		flushReports();
	}

	@Test(groups = "regression")
	public void consultButtontest() {
		System.out.println("Consult button test");
		logger = report.createTest("Click on consult icon");
		LandingPage landingPage = invokeLandingPage();
		ConsultantPage consultPage = landingPage.goToConsultantPage();
		consultPage.getTitle("Online Doctor Consultation | Ask Top Doctor's Advice 24*7 | Practo");
		consultPage.takeScreenShotOnFailure();
		flushReports();
	}

	@Test(groups = "regression")
	public void pharmacyButtontest() {
		System.out.println("Pharmacy Button test");
		logger = report.createTest("Click on pharmacy icon");
		LandingPage landingPage = invokeLandingPage();
		PharmacyPage pharmacyPage = landingPage.goToPharmacyPage();
		pharmacyPage
				.getTitle("Buy Medicines,Health Products Online | India's Most Reliable Online Medical Store | Practo");
		pharmacyPage.takeScreenShotOnFailure();
		flushReports();
	}

	@Test(groups = "regression")
	public void diagnosticsButtontest() {
		System.out.println("DIagnostic button Test");
		logger = report.createTest("Click on diagnostics icon");
		LandingPage landingPage = invokeLandingPage();
		DiagnosticsPage diagnosticsPage = landingPage.goToDiagnosticPage();
		diagnosticsPage.getTitle("Blood Tests | Book Diagnostic Tests from Home at Best Prices | Practo");
		diagnosticsPage.takeScreenShotOnFailure();
		flushReports();
	}
}
