package test;


import java.util.List;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.annotations.VisibleForTesting;

public class BasicFunctions {

	
	static WebDriver driver;

	
    /**
     * generate a driver instance
     */
    public static void Setup(){
    	SingeltonDriver automation = SingeltonDriver.getInstance();
    	 driver = automation.openBrowser();
    }
	

	static org.apache.logging.log4j.Logger log = LogManager.getLogger(StudentFormTest.class.getName());

	@VisibleForTesting
	public void logging() {
		log.info("information");
		log.debug("Debug Message");
		log.fatal("Debug Message");
		log.error("Debug Message");
		log.warn("Debug Message");
	}

	/**
	 * navigates to the given URL
	 * @param URL link to navigate to
	 */
	public static void NavigateTo(String URL) {
		log.info(">>>>>>>>>>>>>>Starting:BasicFunctions." + new Object() {
		}.getClass().getEnclosingMethod().getName());
		
		driver.get(URL);
		
		log.info(">>>>>>>>>>>>>>Ending:BasicFunctions." + new Object() {
		}.getClass().getEnclosingMethod().getName());
	}

	
	/**Input string in the given location
	 * @param element where to enter the string
	 * @param text string to enter
	 */
	public static void InputKeys(By element, String text) {
		log.info(">>>>>>>>>>>>>>Starting:BasicFunctions." + new Object() {
		}.getClass().getEnclosingMethod().getName());
		
		driver.findElement(element).sendKeys(text);
		
		log.info(">>>>>>>>>>>>>>Ending:BasicFunctions." + new Object() {
		}.getClass().getEnclosingMethod().getName());
	}

	/**
	 * Finds the elements found in the page by the locator given
	 * 
	 * @param locator used to find the elements
	 * @return List<WebElement> the list of elements found
	 */
	public static List<WebElement> FindElementsByXpath(String locator) {
		log.info(">>>>>>>>>>>>>>Starting:BasicFunctions." + new Object() {
		}.getClass().getEnclosingMethod().getName());
		
		List<WebElement> elements = driver.findElements(By.xpath(locator));
		
		log.info(">>>>>>>>>>>>>>Ending:BasicFunctions." + new Object() {
		}.getClass().getEnclosingMethod().getName());
		return elements;
	}

	/**
	 * End the driver instance
	 * 
	 */
	public static void EndDriver() {
		log.info(">>>>>>>>>>>>>>Starting:BasicFunctions." + new Object() {
		}.getClass().getEnclosingMethod().getName());
		
		driver.close();
		
		log.info(">>>>>>>>>>>>>>Ending:BasicFunctions." + new Object() {
		}.getClass().getEnclosingMethod().getName());
	}
	
	/**generates a random string
	 * @param chars the characters used for generating the string
	 * @param length length of the generated string
	 * @return the generated random string
	 */
	public static String randomString(String chars, int length) {
		log.info(">>>>>>>>>>>>>>Starting:BasicFunctions." + new Object() {
		}.getClass().getEnclosingMethod().getName());
		
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<length; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		
		log.info(">>>>>>>>>>>>>>Ending:BasicFunctions." + new Object() {
		}.getClass().getEnclosingMethod().getName());
		return sb.toString();
	}
	
	/**clicks on the given object
	 * @param object to be clicked
	 */
	public static void ClickObject(By object){
		log.info(">>>>>>>>>>>>>>Starting:BasicFunctions." + new Object() {
		}.getClass().getEnclosingMethod().getName());
		
		driver.findElement(object).click();
	
		log.info(">>>>>>>>>>>>>>Ending:BasicFunctions." + new Object() {
		}.getClass().getEnclosingMethod().getName());
	}
	
	/**find an item by its string value and selects it
	 * @param object the object containing the options
	 * @param value the string to find the element by
	 */
	public static void SelectItemByString(By object, String value){
		log.info(">>>>>>>>>>>>>>Starting:BasicFunctions." + new Object() {
		}.getClass().getEnclosingMethod().getName());
		
		WebElement element=driver.findElement(object);
		Select month=new Select(element);
		month.selectByVisibleText(value);
		
		log.info(">>>>>>>>>>>>>>Ending:BasicFunctions." + new Object() {
		}.getClass().getEnclosingMethod().getName());
	}
	
	/**scrolls the page to bottom
	 * 
	 */
	public static void ScrollToButtom(){
		log.info(">>>>>>>>>>>>>>Starting:BasicFunctions." + new Object() {
		}.getClass().getEnclosingMethod().getName());
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
	
		log.info(">>>>>>>>>>>>>>Ending:BasicFunctions." + new Object() {
		}.getClass().getEnclosingMethod().getName());
	}

	

	/**return the visible text in the object
	 * @param object containing the text
	 */
	public static String FindObjectText(By object){
		log.info(">>>>>>>>>>>>>>Starting:BasicFunctions." + new Object() {
		}.getClass().getEnclosingMethod().getName());
		
		String heading = driver.findElement(object).getText();
	
		log.info(">>>>>>>>>>>>>>Ending:BasicFunctions." + new Object() {
		}.getClass().getEnclosingMethod().getName());
		
		return heading;
	}
	
}
