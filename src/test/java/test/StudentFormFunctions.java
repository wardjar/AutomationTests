package test;


import org.openqa.selenium.By;

public class StudentFormFunctions {
	
	
	
	/**
	 * Navigates browser to form page
	 * 
	 */
	public static void ToForm() {	
		BasicFunctions.NavigateTo(PractiseEnviroment.FormURL);
		
	}
	
	/**
	 * write in text field
	* @param element the text field
	 * @param text text to write
	 */
	public static void Write(By element,String text){
		BasicFunctions.InputKeys(element,text);
	}

	/**
	 * Input Email
	 * @param text Email address
	 */
	public static String WriteEmail(){
		String chars = "abcdefghijklmnopqrstuvwxyz0123456789";
		String randomEmail=BasicFunctions.randomString(chars, 10)+"@gmail.com";
		BasicFunctions.InputKeys(PractiseEnviroment.userEmailEl,randomEmail);
		return randomEmail;
	}

	/**
	 * select student gender
	 */
	public static void SelectGender(){
		BasicFunctions.ClickObject(PractiseEnviroment.genderMaleEl);
	}

	/**
	 * Input phone number
	 */
	public static void WritePhone(){
		BasicFunctions.InputKeys(PractiseEnviroment.phoneNumberEl, PractiseEnviroment.phoneNumber);
	}

	/**
	 * select date of birth
	 */
	public static void SelectDateOfBirth(){

		BasicFunctions.ClickObject(PractiseEnviroment.dateOfBirthInputEl);

		BasicFunctions.SelectItemByString(PractiseEnviroment.monthEl,PractiseEnviroment.mothOfBirth);

		BasicFunctions.SelectItemByString(PractiseEnviroment.yearEl,PractiseEnviroment.yearOfBirth);

		BasicFunctions.ClickObject(PractiseEnviroment.dayEl);
	}

	/**
	 * select student subject
	 * 
	 */
	public static void SelectSubject(){
		BasicFunctions.ClickObject(PractiseEnviroment.subjectBarEl);

		BasicFunctions.InputKeys(PractiseEnviroment.subjectBarEl, PractiseEnviroment.subject);

		BasicFunctions.ClickObject(PractiseEnviroment.subjectEl);
	}

	/**
	 * select hobbies
	 */
	public static void SelectHobbies(){
		BasicFunctions.ClickObject(PractiseEnviroment.hobbiesSportEl);

		BasicFunctions.ClickObject(PractiseEnviroment.hobbiesReadingEl);

		BasicFunctions.ClickObject(PractiseEnviroment.hobbiesMusicEl);
	}

	/**
	 * select state
	 */
	public static void SelectState(){
		
		BasicFunctions.ScrollToButtom();
		
		BasicFunctions.ClickObject(PractiseEnviroment.stateEl);

		BasicFunctions.ClickObject(PractiseEnviroment.certainStateEl);
	}

	/**
	 * select city
	 */
	public static void SelectCity(){
		BasicFunctions.ScrollToButtom();
		BasicFunctions.ClickObject(PractiseEnviroment.cityEl);
		BasicFunctions.ClickObject(PractiseEnviroment.certainCityEl);
	}

	

	/**
	 * click submit
	 */
	public static void Submit(){
		BasicFunctions.ClickObject(PractiseEnviroment.subButtonEl);
	}

	/**Find email field and return the saved email
	 *@returns the saved email in the form
	 */
	public static String VerifyEmailSaved(){
		
		return BasicFunctions.FindObjectText(PractiseEnviroment.submittedEmailEl);
	}
}
