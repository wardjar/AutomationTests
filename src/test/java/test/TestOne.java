package test;




import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestOne {

	@BeforeAll
	public static void CreateDriver() {
		BasicFunctions.Setup();
	}

	@Test
	public void Navigate() {
		GoogleFunctions.ToGoogle();
	}

	@Test
	public void Search() {
		GoogleFunctions.UseKeys(PractiseEnviroment.Search);
	}

	@Test
	public void FindheadingAndVerify() {
		GoogleFunctions.PrintHeadings();
	}

	@AfterAll
	public static void End() {
		GoogleFunctions.CloseBrowser();
	}
}


