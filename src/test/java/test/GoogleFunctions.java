package test;

import static org.junit.Assert.assertTrue;

//import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;


import org.openqa.selenium.WebElement;

public class GoogleFunctions {
	
	/**
	 * Navigates browser to web page
	 * 
	 */
	public static void ToGoogle() {	
		BasicFunctions.NavigateTo(PractiseEnviroment.GoogleURL);
	}

	/**
	 * Input the text into the search bar and starts search
	 * 
	 * @param text      search text and Enter key
	 */
	public static void UseKeys( String text) {
		BasicFunctions.InputKeys(PractiseEnviroment.searchBar,text);
	}

	/**
	 * prints all the heading in the search page
	 * and compares with set titles beforehand 
	 * prints number of matching titles on console
	 */
	public static void PrintHeadings() {
		List<WebElement> elements=BasicFunctions.FindElementsByXpath("//*/h3");
		for (WebElement e : elements) {
			System.out.println(e.getText());
		}

		int count = 0;
		for (int i = 0; i < PractiseEnviroment.headings.length; i++) {
			boolean exist = false;
			for (WebElement e : elements) {
				String text = e.getText();
				if (text.equals(PractiseEnviroment.headings[i])) {
					exist = true;
				}
			}
			if (exist == true)
				count++;
			System.out.println(exist);
		}
		assertTrue(count>0);
		System.out.println("number of correctly expected headings in the page:" + count + " out of:"
				+ PractiseEnviroment.headings.length);
	}
	
	/**closes driver instance
	 * 
	 */
	public static void CloseBrowser() {
		BasicFunctions.EndDriver();
	}
}
