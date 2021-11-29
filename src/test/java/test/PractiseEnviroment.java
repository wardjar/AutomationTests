package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class PractiseEnviroment {

	public static final String GoogleURL = "https://google.com";

	public static final String Search = "QA Tests" + Keys.ENTER;

	public static final String[] headings = { "Best Practices for QA Testing",
			"Quality Assurance (QA), Quality Control and Testing | ...", "test IO: QA Testing as a Service",
			"Software Testing - QA, QC & Testing - Tutorialspoint",
			"Quality Assurance (QA) in Software Testing: QA Views & ...",
			"What is QA in Software Testing? - Tiempo Development",
			"What is Quality Assurance(QA)? Process, Methods, Examples", "??? QA Tests",
			"Software Testing Tutorial: Free QA Course - Guru99", "QA testing - MoodleDocs" };

	public static final String FormURL = "https://demoqa.com/automation-practice-form";

	public static By searchBar = By.name("q");

	public static By firstNameEl = By.id("firstName");

	public static By lastNameEl = By.id("lastName");

	public static By userEmailEl = By.id("userEmail");

	public static By genderMaleEl = By.xpath("//div[@id='genterWrapper']/div[2]/div/label");

	public static By phoneNumberEl = By.id("userNumber");

	public static By dateOfBirthInputEl = By.id("dateOfBirthInput");

	public static By monthEl = By.xpath("//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div/div[2]/div/select");

	public static By yearEl = By
			.xpath("//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/select");

	public static By dayEl = By.className("react-datepicker__day--024");

	public static By subjectBarEl = By.id("subjectsInput");

	public static By hobbiesSportEl = By.xpath("//div[@id='hobbiesWrapper']/div[2]/div/label");

	public static By hobbiesReadingEl = By.xpath("//div[@id='hobbiesWrapper']/div[2]/div[2]/label");

	public static By hobbiesMusicEl = By.xpath("//div[@id='hobbiesWrapper']/div[2]/div[3]/label");

	public static By subjectEl = By.id("react-select-2-option-0");

	public static By stateEl = By.id("state");

	public static By certainStateEl = By.id("react-select-3-option-1");

	public static By cityEl = By.id("city");

	public static By certainCityEl = By.id("react-select-4-option-1");

	public static By addressEl = By.id("currentAddress");
	
	public static By subButtonEl = By.id("submit");
	
	public static By submittedEmailEl = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Student Email'])[1]/following::td[1]");
	
	public static final String firstName = "ward";

	public static final String lastName = "Jaradat";

	public static final String phoneNumber = "010101010101";

	public static final String mothOfBirth = "April";

	public static final String yearOfBirth = "1994";

	public static final String subject = "art";
	
	public static final String address = "21 Jump Street";

}