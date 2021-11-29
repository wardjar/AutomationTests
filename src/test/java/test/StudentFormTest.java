package test;




import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
class StudentFormTest {

	static String generatedEmail = "";
	
	@BeforeAll
	public static void CreateDriver() {
		BasicFunctions.Setup();
	}

	@Test
	@Order(1)    
	public void Navigate() {
		StudentFormFunctions.ToForm();
	}

	@Test
	@Order(2)    
	public void WriteFirstName() {
		StudentFormFunctions.Write(PractiseEnviroment.firstNameEl,PractiseEnviroment.firstName);
	}


	@Test
	@Order(3)    
	public void WriteLastName() {
		StudentFormFunctions.Write(PractiseEnviroment.lastNameEl,PractiseEnviroment.lastName);
	}
	
	@Test
	@Order(4)    
	public void WriteEmail() {
		generatedEmail=StudentFormFunctions.WriteEmail();
		
	}
	
	@Test
	@Order(5)    
	public void WritePhone(){
		StudentFormFunctions.Write(PractiseEnviroment.phoneNumberEl, PractiseEnviroment.phoneNumber);
	}
	
	@Test
	@Order(6)    
	public void GenderSelector(){
		StudentFormFunctions.SelectGender();
	}
	
	@Test
	@Order(7)    
	public void Phone(){
		StudentFormFunctions.WritePhone();
	}
	
	@Test
	@Order(8)    
	public void DateOfBirth(){
		StudentFormFunctions.SelectDateOfBirth();
	}
	
	@Test
	@Order(9)    
	public void SelectStudySubject(){
		StudentFormFunctions.SelectSubject();
	}
	
	@Test
	@Order(10)    
	public void SelectHobbies(){
		StudentFormFunctions.SelectHobbies();
	}

	@Test
	@Order(11)    
	public void SelectState(){
		StudentFormFunctions.SelectState();
	}
	
	@Test
	@Order(12)    
	public void SelectCity(){
		StudentFormFunctions.SelectCity();
	}
	
	@Test
	@Order(13)    
	public void WriteAddress() {
		StudentFormFunctions.Write(PractiseEnviroment.addressEl, PractiseEnviroment.address);
	}
	
	@Test
	@Order(14)    
	public void SubmitForm() {
		StudentFormFunctions.Submit();
	}
	
	@Test
	@Order(15)    
	public void VerifyEmail() {
		Assertions.assertEquals(StudentFormFunctions.VerifyEmailSaved(),generatedEmail);
	}
	
	@AfterAll
	public static void End() {
		GoogleFunctions.CloseBrowser();
	}

}
