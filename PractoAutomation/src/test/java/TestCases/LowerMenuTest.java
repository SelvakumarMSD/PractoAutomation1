package TestCases;

import org.testng.annotations.Test;

import PageClasses.ConsultantPage;
import PageClasses.DiagnosticsPage;
import PageClasses.DoctorPage;
import PageClasses.LandingPage;
import PageClasses.PatientSearch;
import PageClasses.PharmacyPage;
import baseClasses.BaseTestClass;

public class LowerMenuTest extends BaseTestClass {
	@Test(groups = { "smoke" })
	public void searchfordoctorsTest() {
		System.out.println("Search for doctor page test");
		logger = report.createTest("search for doctor");
		LandingPage landingPage = invokeLandingPage();
		landingPage.scrollDown();
		PatientSearch patient = landingPage.searchfordoctors();
		patient.getTitle("Best Doctors In Chennai - Book Appointment Online, View Fees, Recommendations | Practo");
		patient.takeScreenShotOnFailure();
		flushReports();

	}

	@Test(groups = { "smoke" })
	public void searchforhospitalsTest() {
		System.out.println("Search for hospitals test");
		logger = report.createTest("search for hospitals");
		LandingPage landingPage = invokeLandingPage();
		landingPage.scrollDown();
		PatientSearch hospitalsSearch = landingPage.searchforhospitals();
		hospitalsSearch.getTitle("Best Hospitals in Chennai - Book Appointment Online, View Fees, Reviews | Practo");
		hospitalsSearch.takeScreenShotOnFailure();
		flushReports();

	}

	@Test(groups = { "smoke" })
	public void searchforclinicTest() {
		System.out.println("Search for clinic Page Test");
		logger = report.createTest("search for clinic");
		LandingPage landingPage = invokeLandingPage();
		landingPage.scrollDown();
		PatientSearch clinicSearch = landingPage.searchforclinic();
		clinicSearch.getTitle("Best Clinics in Chennai - Book Appointment, View Reviews, Address, Timings | Practo");
		clinicSearch.takeScreenShotOnFailure();
		flushReports();

	}

	@Test(groups = { "smoke" })
	public void BookDiagnosticTest() {
		System.out.println("Search for Book Diagnostic Test");
		logger = report.createTest("search for BookDiagnosticTest");
		LandingPage landingPage = invokeLandingPage();
		landingPage.scrollDown();
		PatientSearch bookdiagnosticsearch = landingPage.searchforbookDiagnostic();
		bookdiagnosticsearch.getTitle("Blood Tests | Book Diagnostic Tests from Home at Best Prices | Practo");
		bookdiagnosticsearch.takeScreenShotOnFailure();
		flushReports();

	}

	@Test(groups = { "smoke" })
	public void BookfullbodyCheckups() {
		System.out.println("Search for Bookfullbody Checkup Test");
		logger = report.createTest("search for BookDiagnosticTest");
		LandingPage landingPage = invokeLandingPage();
		landingPage.scrollDown();
		PatientSearch bookfullbodycheckups = landingPage.searchforbookDiagnostic();
		bookfullbodycheckups.getTitle("Blood Tests | Book Diagnostic Tests from Home at Best Prices | Practo");
		bookfullbodycheckups.takeScreenShotOnFailure();
		flushReports();

	}

}
