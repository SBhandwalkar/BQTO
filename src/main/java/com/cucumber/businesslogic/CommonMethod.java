package com.cucumber.businesslogic;

import static io.restassured.RestAssured.given;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//import com.cucumber.listener.*;

import com.cucumber.steps.ParentStep;
import com.cucumber.utility.BrowserFactory;
import com.cucumber.utility.ExcelHandler;
import com.google.common.io.Files;
import com.vimalselvam.cucumber.listener.Reporter;

import io.restassured.response.Response;

/**
 */
@SuppressWarnings("unused")
public class CommonMethod extends BrowserFactory {
	WebElement webelement;

	Accessors accessor = new Accessors();
	public static int parentStepNo;
	public static int childStepNo;
	

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: close the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	public By getElement(String elementId) {
		By el = By.id(elementId);
		try {

			if (elementId.contains("|||")) {
				String descriptor = elementId.split("\\|\\|\\|")[0];
				String value = elementId.split("\\|\\|\\|")[1];
				switch (descriptor.toUpperCase()) {
				case "XPATH":
					el = By.xpath(value);
					break;
				case "NAME":
					el = By.name(value);
					break;
				case "ID":
					el = By.id(value);
					break;
				case "CSS":
					el = By.cssSelector(value);
					break;
				case "CLASS":
					el = By.className(value);
				case "LINKTEXT":
					el = By.linkText(value);
				case "PARTIALLINKTEXT":
					el = By.partialLinkText(value);
				case "TAGNAME":
					el = By.tagName(value);
					break;
				default:// default is id
					el = By.id(value);
					break;
				}
			}
		} catch (Exception e) {
			String lines[] = e.getMessage().split("\\r?\\n");
			reportStep("*#* " + lines[0]);
			log.info(e.getMessage());
			return null;
		}
		return el;
	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: check if element is selected
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	public boolean checkIfSelected(String elementLocator, String destription) {
		try {
			WebElement element = getWebElementUsingBy(getElement(elementLocator));
			if (element.isSelected()) {
				log.info("Element is selected");
				return true;
			} else {
				log.info("Element is not selected");
				return false;
			}
		} catch (Exception e) {
			Assert.assertFalse(true, e.getMessage());
			String lines[] = e.getMessage().split("\\r?\\n");
			reportStep("*#* " + lines[0]);
			accessor.setStatus("FAILED");
			takeScreenShot_reporter();
			log.info(e.getMessage());
			return false;
		}
	}
	
	
	public boolean checkIfSelectedanSelect(String elementLocator) {
		try {
			WebElement element = getWebElementUsingBy(getElement(elementLocator));
			if (element.isSelected()) {
				log.info("Element is selected");
				element.click();
				return true;
			} else {
				log.info("Element is not selected");
				return false;
			}
		} catch (Exception e) {
			Assert.assertFalse(true, e.getMessage());
			String lines[] = e.getMessage().split("\\r?\\n");
			reportStep("*#* " + lines[0]);
			accessor.setStatus("FAILED");
			takeScreenShot_reporter();
			log.info(e.getMessage());
			return false;
		}
	}


	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: close the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	public Map<String, String> getElementsAttribute(String ElementText, String attribute, String destription) {
		Map<String, String> elementList = new HashMap<>();
		try {
			List<WebElement> elements = getWebElementsUsingBy(getElement(ElementText));
			for (WebElement element : elements) {
				elementList.put(attribute, element.getAttribute(attribute));
			}
		} catch (Exception e) {
			Assert.assertFalse(true, e.getMessage());
			String lines[] = e.getMessage().split("\\r?\\n");
			reportStep("*#* " + lines[0]);
			accessor.setStatus("FAILED");
			takeScreenShot_reporter();
			log.info(e.getMessage());
		}
		return elementList;
	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: close the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	public void scrollToElement(String elementLocator, String destription) {
		try {
			WebElement element = getWebElementUsingBy(getElement(elementLocator));
			Actions actions = new Actions(driver);
			Action action = actions.moveToElement(element).build();
			action.perform();
		} catch (Exception e) {
			Assert.assertFalse(true, e.getMessage());
			String lines[] = e.getMessage().split("\\r?\\n");
			reportStep("*#* " + lines[0]);
			accessor.setStatus("FAILED");
			takeScreenShot_reporter();
			log.info(e.getMessage());
		}
	}

	public WebElement getWebElementUsingBy(By el) {
		return driver.findElement(el);
	}

	public List<WebElement> getWebElementsUsingBy(By el) {
		return driver.findElements(el);
	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: close the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	protected void fillInputValue(String strwebElement, String strValue, String destription) {
		try {
			WebElement webElement = getWebElementUsingBy(getElement(strwebElement));
			webElement.clear();
			webElement.sendKeys(strValue);
			reportStep(strValue + " Entered in " + strwebElement);
		} catch (Exception e) {
			Assert.assertFalse(true, e.getMessage());
			String lines[] = e.getMessage().split("\\r?\\n");
			reportStep("*#* " + lines[0]);
			accessor.setStatus("FAILED");
			takeScreenShot_reporter();
			log.info(e.getMessage());
		}

	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: close the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	protected void userLeftclick(String strwebElement, String destription) {
		try {
			WebElement webElement = getWebElementUsingBy(getElement(strwebElement));
			webElement.click();
			reportStep(strwebElement + " - " + destription);
		} catch (Exception e) {
			Assert.assertFalse(true, e.getMessage());
			String lines[] = e.getMessage().split("\\r?\\n");
			reportStep("*#* " + lines[0]);
			accessor.setStatus("FAILED");
			takeScreenShot_reporter();
			log.info(e.getMessage());
		}
	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: close the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	protected String getPageTitle() {
		try {
			String title = driver.getTitle();
			reportStep("Page title is : " + title);
			return title;
		} catch (Exception e) {
			Assert.assertFalse(true, e.getMessage());
			accessor.setStatus("FAILED");
			String lines[] = e.getMessage().split("\\r?\\n");
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			log.info(e.getMessage());
			return "";
		}
	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: close the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	public void takeScreenShot() {

		try {
			// This takes a screenshot from the driver at save it to the specified location
			File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			// Building up the destination path for the screenshot to save
			// Also make sure to create a folder 'screenshots' with in the cucumber-report
			parentStepNo = accessor.getParentStepNumber();
			childStepNo = accessor.getChildStepNumber();
			File ScreenShotPath = new File(System.getProperty("ReportPath") + "\\" + System.getProperty("TestID") + "\\"
					+ ParentStep.getProperty("Browser"));
			File destinationPath = new File(System.getProperty("ReportPath") + "\\" + System.getProperty("TestID")
					+ "\\" + ParentStep.getProperty("Browser") + "\\" + "\\Step_" + parentStepNo + "." + childStepNo
					+ ".png"); // new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()) + ".png");
			childStepNo++;
			accessor.setChildStepno(childStepNo);
			if (!ScreenShotPath.exists()) {
				ScreenShotPath.mkdirs();
			}
			// Copy taken screenshot from source location to destination location
			Files.copy(sourcePath, destinationPath);

		} catch (IOException e) {
			String lines[] = e.getMessage().split("\\r?\\n");
			reportStep("*#* " + lines[0]);
			log.info(e.getMessage());
		}
	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: close the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	public void takeScreenShot_reporter() {

		try {
			// This takes a screenshot from the driver at save it to the specified location
			File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			// Building up the destination path for the screenshot to save
			// Also make sure to create a folder 'screenshots' with in the cucumber-report
			parentStepNo = accessor.getParentStepNumber();
			childStepNo = accessor.getChildStepNumber();

			File ScreenShotPath = new File(System.getProperty("ReportPath") + "\\" + System.getProperty("TestID") + "\\"
					+ ParentStep.getProperty("Browser"));
			File destinationPath = new File(System.getProperty("ReportPath") + "\\" + System.getProperty("TestID")
					+ "\\" + ParentStep.getProperty("Browser") + "\\Step_" + parentStepNo + "." + childStepNo + ".png"); // new
																															// SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
																															// Date())
																															// +
																															// //
																															// ".png");
			parentStepNo++;
			accessor.setParentStepNo(parentStepNo);
			// re initialize child step count as parent step changed
			accessor.setChildStepno(1);
			if (!ScreenShotPath.exists()) {
				ScreenShotPath.mkdirs();
			}
			// Copy taken screenshot from source location to destination location
			Files.copy(sourcePath, destinationPath);

			// This attach the specified screenshot to the test
			Reporter.addScreenCaptureFromPath(destinationPath.toString());

		} catch (Exception e) {
			String lines[] = e.getMessage().split("\\r?\\n");
			reportStep("*#* " + lines[0]);
			log.info(e.getMessage());
		}
	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: close the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	public void reportStep(String string) {
		try {
			takeScreenShot();
			accessor.setStepId(parentStepNo + "." + childStepNo);
			log.info(string);
			Reporter.addStepLog(string);
		} catch (Exception e) {
			log.info(e.getMessage());
		}
	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: close the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	public boolean clickElementUsingJavascript(String strwebElement, String destription) {
		try {
			WebElement element = getWebElementUsingBy(getElement(strwebElement));
			this.waitForElementToAppear(strwebElement);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			reportStep(element.getText() + " clicked ");
			executor.executeScript("arguments[0].click();", element);
			Thread.sleep(2500);
			reportStep(element + " element clicked ");
			return true;
		} catch (Exception e) {
			String lines[] = e.getMessage().split("\\r?\\n");
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			log.info(e.getMessage());
			Assert.assertFalse(true, e.getMessage());
			return false;
		}
	}

	public void Highlight_Element(String elementId) {
		// WebElement element = getWebElementUsingBy(getElement(elementId));
		WebElement element = getWebElementUsingBy(getElement(elementId));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
				elementId);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", elementId);
	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: close the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	public String getCurrentDate(String format, String destription) {
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
			LocalDateTime now = LocalDateTime.now();
			reportStep("current date " + formatter.format(now) + " entered");
			return formatter.format(now);
		} catch (Exception e) {
			String lines[] = e.getMessage().split("\\r?\\n");
			log.info(e.getMessage());
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
			return null;
		}
	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: close the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	public boolean selectFromDropDownListIfExists(String strwebElement, String valueToSelect, String destription) {
		boolean status = false;
		try {
			WebElement element = getWebElementUsingBy(getElement(strwebElement));
			// List<WebElement> drop =
			// String source=driver.getPageSource();
			if (element.isDisplayed()) // if(!drop.isEmpty())
			{
				Select dropDownList = new Select(element);
				// Thread.sleep(1000);
				element.click();
				dropDownList.selectByVisibleText(valueToSelect);
				// Narrator.logDebug("Selected Text of: " + valueToSelect + " from: " +
				// elementXpath);
				System.out.println(valueToSelect + " Selected.");
				reportStep(valueToSelect + " selected ");
				status = true;
			} else if (!element.isDisplayed()) {
				System.out.println(valueToSelect + " No Dropdown exists");
				reportStep(valueToSelect + " selected ");
				status = true;
			}
		} catch (Exception e) {
			log.info(e.getMessage());
			reportStep(valueToSelect + " selected ");
			status = true;
		}
		return status;
	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: close the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	public void waitForElementToAppear(String strwebElement) {
		try {
			WebElement element = getWebElementUsingBy(getElement(strwebElement));
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
			//wait.until(ExpectedConditions.visibilityOf(element));
			reportStep(element + " appeared ");
		} catch (Exception e) {
			String lines[] = e.getMessage().split("\\r?\\n");
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			log.info(e.getMessage());
			Assert.assertFalse(true, e.getMessage());
		}
	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: close the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	public void waitForElementNoLongerPresent(String elementText) {
		try {
			WebElement element = getWebElementUsingBy(getElement(elementText));
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.invisibilityOf(element));
			reportStep(element + " no longer present ");
		} catch (Exception e) {
			String lines[] = e.getMessage().split("\\r?\\n");
			reportStep("*#* " + lines[0]);
			log.info(e.getMessage());
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}
	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: close the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	public static String generateRandomDate(Integer StartYear, Integer EndYear) throws ParseException {

		GregorianCalendar gc = new GregorianCalendar();

		int year = StartYear + (int) Math.round(Math.random() * (EndYear - StartYear));

		gc.set(gc.YEAR, year);

		int dayOfYear = 1 + (int) Math.round(Math.random() * (gc.getActualMaximum(gc.DAY_OF_YEAR) - 1));

		gc.set(gc.DAY_OF_YEAR, dayOfYear);

		System.out.println(gc.get(gc.DAY_OF_MONTH) + "/" + (gc.get(gc.MONTH) + 1) + "/" + gc.get(gc.YEAR));

		return String.format("%02d", gc.get(gc.DAY_OF_MONTH)) + "/" + String.format("%02d", (gc.get(gc.MONTH) + 1))
				+ "/" + gc.get(gc.YEAR);

	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: close the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	 public void HealthCheckUrl(String Url)  {
//	       
	        driver.manage().window().maximize();
	
	        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        driver.get(Url);
//	 driver.navigate(Url);
	 }

	
	public void enterText(String strwebElement, String textToEnter, String destription) {
		try {
			WebElement elementToTypeIn = getWebElementUsingBy(getElement(strwebElement));
			this.waitForElementToAppear(strwebElement);
			if (elementToTypeIn.isEnabled() || elementToTypeIn.equals("")
					|| !elementToTypeIn.getAttribute("readonly").equals("readonly")) {
				elementToTypeIn.clear();
				elementToTypeIn.click();
				
				elementToTypeIn.sendKeys(textToEnter);
			}
			
			
			
			
			/*
			 * if(driver.findElement(By.xpath("//*[@id='"
			 * +elementToTypeIn.getAttribute("id") +
			 * "']/parent::td/preceding-sibling::td")).isDisplayed()){ reportStep("Text '" +
			 * textToEnter + "' Entered'"); }else{
			 */
			String elementName = elementToTypeIn.getAttribute("id");
			if (elementName.isEmpty()) {
				elementName = elementToTypeIn.getAttribute("name");
			}

			reportStep("Text '" + textToEnter + "' Entered in '" + elementName + "'");
			// }
		} catch (Exception e) {

			String lines[] = e.getMessage().split("\\r?\\n");
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			log.info(e.getMessage());
			Assert.assertFalse(true, e.getMessage());
		}
	}

	public void enterValidationText(String strwebElement, String textToEnter, String destription) {
		try {
			WebElement elementToTypeIn = getWebElementUsingBy(getElement(strwebElement));
			this.waitForElementToAppear(strwebElement);
			if (elementToTypeIn.isEnabled() || elementToTypeIn.equals("")
					|| !elementToTypeIn.getAttribute("readonly").equals("readonly")) {
//				elementToTypeIn.clear();
				elementToTypeIn.click();
				
				elementToTypeIn.sendKeys(textToEnter);
				elementToTypeIn.sendKeys(Keys.ARROW_LEFT);
				elementToTypeIn.sendKeys(Keys.RETURN);
			}
			
			
			
			
			/*
			 * if(driver.findElement(By.xpath("//*[@id='"
			 * +elementToTypeIn.getAttribute("id") +
			 * "']/parent::td/preceding-sibling::td")).isDisplayed()){ reportStep("Text '" +
			 * textToEnter + "' Entered'"); }else{
			 */
			String elementName = elementToTypeIn.getAttribute("id");
			if (elementName.isEmpty()) {
				elementName = elementToTypeIn.getAttribute("name");
			}

			reportStep("Text '" + textToEnter + "' Entered in '" + elementName + "'");
			// }
		} catch (Exception e) {

			String lines[] = e.getMessage().split("\\r?\\n");
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			log.info(e.getMessage());
			Assert.assertFalse(true, e.getMessage());
		}
	}

	
	public void enterTextInvalidIDNumber(String strwebElement, String textToEnter) {
		try {
			WebElement elementToTypeIn = getWebElementUsingBy(getElement(strwebElement));
			this.waitForElementToAppear(strwebElement);
			if (elementToTypeIn.isEnabled() || elementToTypeIn.equals("")
					|| !elementToTypeIn.getAttribute("readonly").equals("readonly")) {
				elementToTypeIn.clear();
				elementToTypeIn.click();
				elementToTypeIn.sendKeys(textToEnter);

				Integer Length = textToEnter.length();

				if (Length.equals(13)) {
					reportStep("RSA ID Number - " + textToEnter + ": Length - " + Length);
					System.out.println("RSA ID Number - " + textToEnter + ": Length - " + Length);
					// elementToTypeIn.clear();
					// elementToTypeIn.click();
					// elementToTypeIn.sendKeys(textToEnter);
				} else {
					reportStep("RSA ID Number - " + textToEnter + ": Length - " + Length);
					System.out.println("RSA ID Number - " + textToEnter + ": Length - " + Length);
				}

			}

			// reportStep("Text '" + textToEnter + "' Entered in '" + pattern + "'");
		} catch (Exception e) {

			String lines[] = e.getMessage().split("\\r?\\n");
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			log.info(e.getMessage());
			Assert.assertFalse(true, e.getMessage());
		}
	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: close the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	public void clickOnElement(String strwebElement) {
		try {
			WebElement element = getWebElementUsingBy(getElement(strwebElement));
			waitForElementToAppear(strwebElement);
			reportStep(element.getText() + " clicked ");
			element.click();
			reportStep(element + " clicked ");
		} catch (Exception e) {
			String lines[] = e.getMessage().split("\\r?\\n");
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			log.info(e.getMessage());
			Assert.assertFalse(true, e.getMessage());
		}
		
	}

	/**
	 * 
	 * /**
	 * 
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: selectValueFromDropdown
	 * @purpose: Selecting value from drop-down
	 * @param :dropDown and selectValue
	 * @author sansayed
	 * @return: void
	 * @throws InterruptedException
	 * 
	 ***/

	public boolean selectValueFromDropdown(String strwebElement, String selectValue) throws InterruptedException {
		try {
			WebElement dropDown = getWebElementUsingBy(getElement(strwebElement));
			waitForElementToAppear(strwebElement);
			if (dropDown.isEnabled()) {

				Select value = new Select(dropDown);
				value.selectByValue(selectValue);
			}
			reportStep("Option " + selectValue + " selected ");
			return true;
		} catch (Exception e) {
			String lines[] = e.getMessage().split("\\r?\\n");
			System.out.println("lines " + lines[0]);
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
			return false;
		}

	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: close the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	public void closeBrowser() {
		// try {
		reportStep("Browser closed");
		BrowserFactory.getDriver().quit();
		/*
		 * } catch (Exception e) { String lines[] = e.getMessage().split("\\r?\\n");
		 * log.info(e.getMessage()); reportStep("*#* " + lines[0]);
		 * takeScreenShot_reporter(); Assert.assertFalse(true, e.getMessage()); }
		 */
	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: minimize
	 * @purpose: minimize the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	public void minimize() throws AWTException {

		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ALT);
			robot.keyPress(KeyEvent.VK_SPACE);
			robot.keyPress(KeyEvent.VK_N);
			robot.keyRelease(KeyEvent.VK_ALT);
			robot.keyRelease(KeyEvent.VK_SPACE);
			robot.keyRelease(KeyEvent.VK_N);
			reportStep("Browser minimized");
		} catch (Exception e) {
			String lines[] = e.getMessage().split("\\r?\\n");
			log.info(e.getMessage());
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}

	}
	
	public void sendText(String strwebElement, String textToEnter, String destription){
		
		WebElement userNameTxt = getWebElementUsingBy(getElement(strwebElement));
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].value=textToEnter", userNameTxt);
		 
	}
	
	
	public void pressEnterKey() throws AWTException {
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			String lines[] = e.getMessage().split("\\r?\\n");
			log.info(e.getMessage());
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}
	}
	
	public void pressKeyTab() throws AWTException {
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		} catch (Exception e) {
			String lines[] = e.getMessage().split("\\r?\\n");
			log.info(e.getMessage());
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}
	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: maximize
	 * @purpose: maximize the browser
	 * @param :
	 * @author kuabhis5
	 * @return: void
	 * 
	 * 
	 ***/
	public void maximize() throws AWTException {

		try {
			driver.manage().window().maximize();
			reportStep(" Browser Maximized ");
		} catch (Exception e) {
			String lines[] = e.getMessage().split("\\r?\\n");
			log.info(e.getMessage());
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}
	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: close the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	public void keyboardKeys(String keyToPress) {
		try {
			Actions a = new Actions(driver);
			a.sendKeys(keyToPress);
			reportStep(keyToPress + "key is Pressed");

		} catch (Exception e) {
			String lines[] = e.getMessage().split("\\r?\\n");
			log.info(e.getMessage());
			reportStep("" + lines[0]);
			takeScreenShot();
			Assert.assertFalse(true, e.getMessage());
		}

	}

	public void pressKey(Keys key) throws InterruptedException {
		try {
			Actions a = new Actions(driver);
			a.keyDown(key).perform();
			reportStep(key + " key pressed");
		} catch (Exception e) {
			String lines[] = e.getMessage().split("\\r?\\n");
			log.info(e.getMessage());
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}
	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: close the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	public void pressMultipleKeys(Keys key1, Keys key2) {
		try {
			Actions action = new Actions(driver);
			action.keyDown(key1).keyDown(key2).keyUp(key1).keyUp(key2).perform();

			reportStep(key1 + "+" + key2 + "key pressed");
		} catch (Exception e) {
			String lines[] = e.getMessage().split("\\r?\\n");
			log.info(e.getMessage());
			reportStep("Unable to press keys " + key1 + "+" + key2);
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}

	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: close the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	public void pressKeys(String elementLocator, Keys key1, Keys key2) {
		try {
			WebElement element = getWebElementUsingBy(getElement(elementLocator));
			String keysPressed = Keys.chord(key1, key2);
			element.sendKeys(keysPressed);
			reportStep(key1 + "+" + key2 + "key pressed");
		} catch (Exception e) {
			String lines[] = e.getMessage().split("\\r?\\n");
			reportStep("Unable to press keys " + key1 + "+" + key2);
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			log.info(e.getMessage());
			Assert.assertFalse(true, e.getMessage());
		}

	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: close the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	public void accept_Alert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
			reportStep("Switched to alert");
		} catch (Exception e) {
			String lines[] = e.getMessage().split("\\r?\\n");
			log.info(e.getMessage());
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}
	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: close the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	public void switch_to_new_Window() {
		try {
			for (String winHandle : driver.getWindowHandles()) {
				driver.switchTo().window(winHandle);
			}
			reportStep("Switched to new Window");
		} catch (Exception e) {
			String lines[] = e.getMessage().split("\\r?\\n");
			log.info(e.getMessage());
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}
	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: close the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	public void SelectFromDropdown(String strwebElement, String value) {
		try {
			WebElement element = getWebElementUsingBy(getElement(strwebElement));
			this.waitForElementToAppear(strwebElement);
			Select select = new Select(element);
			select.selectByVisibleText(value);
			reportStep("Option " + value + " Selected from " + " dropdown");
		} catch (Exception e) {
			String lines[] = e.getMessage().split("\\r?\\n");
			log.info(e.getMessage());
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}
	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: close the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	public boolean checkBoxSelection(String strwebElement, String mustBeSelected) {
		try {
			// Thread.sleep(2000);
			WebElement element = getWebElementUsingBy(getElement(strwebElement));
			this.waitForElementToAppear(strwebElement);
			WebDriverWait wait = new WebDriverWait(driver, 600);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			if (element.isSelected() != Boolean.valueOf(mustBeSelected)) {
				element.click();
			}
			reportStep("Checkbox " + element.getText() + " checked");
			return true;
		} catch (Exception e) {
			String lines[] = e.getMessage().split("\\r?\\n");
			log.info(e.getMessage());
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
			return false;
		}
	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: close the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	public void switchToFramebyElementPresence(By byControlIdentifier) {
		try {
			driver.switchTo().defaultContent();
			int size = driver.findElements(By.tagName("iframe")).size();
			for (int i = 0; i < size; i++) {
				driver.switchTo().defaultContent();
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(i));
				int total = driver.findElements(byControlIdentifier).size();
				if (total > 0) {
					System.out.println("Element found in frame index : " + i);
					break;
				}
			}
			reportStep("Switched to frame");
		} catch (Exception e) {
			String lines[] = e.getMessage().split("\\r?\\n");
			log.info(e.getMessage());
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}
	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: close the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	public void doubleClick(String strwebElement) {
		try {
			WebElement element = getWebElementUsingBy(getElement(strwebElement));
			this.waitForElementToAppear(strwebElement);
			Actions action = new Actions(driver);
			reportStep("Doubleclick Performed for " + element.getText());
			action.moveToElement(element).doubleClick().perform();
		} catch (Exception e) {
			String lines[] = e.getMessage().split("\\r?\\n");
			log.info(e.getMessage());
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}
	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: close the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	public void navigateTo(String direction) {
		try {
			switch (direction.split(":", 2)[0]) {
			case "FORWARD":
				driver.navigate().forward();
				break;
			case "BACK":
				driver.navigate().back();
				break;
			case "REFRESH":
				driver.navigate().refresh();
				break;
			case "URL":
				driver.navigate().to(direction.split(":", 2)[1]);
				break;
			}
		} catch (Exception e) {
			String lines[] = e.getMessage().split("\\r?\\n");
			log.info(e.getMessage());
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}
	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: close the browser
	 * @param :
	 * @author Rahul Tiwari
	 * @return: void
	 * 
	 * 
	 ***/
	public static String GenerateChecksumLuhnAlgorithm(String num) {
		try {
			Long number = Long.parseLong(num);
			Long digits[] = new Long[20];
			long newNumber = 0;

			for (int i = 0; i < num.length(); i++) {
				digits[i] = number % 10;
				number = number / 10;
			}
			for (int j = 0; j < num.length(); j += 2) {
				if (digits[j] * 2 > 9) {
					digits[j] = (((digits[j] * 2) % 10) + ((digits[j] * 2) / 10) % 10);
				} else {
					digits[j] = digits[j] * 2;
				}
			}
			for (int k = 0; k < num.length(); k++) {
				newNumber = newNumber + digits[k];

			}
			return String.valueOf((newNumber * 9) % 10);
		} catch (Exception e) {
			String lines[] = e.getMessage().split("\\r?\\n");
			System.out.println("lines " + lines[0]);
			return null;
		}

	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: retrieve text
	 * @param :
	 * @author Abongile Maso
	 * @return: void
	 * 
	 * 
	 ***/
	public String retrieveTextAttribute(String strwebElement) {
		String retrievedText = "";
		
		
		
		try {
			
			WebElement element = getWebElementUsingBy(getElement(strwebElement));
			waitForElementToAppear(strwebElement);
			
//			driver.navigate().refresh();
			retrievedText = element.getText();
			reportStep("Text retrieved successfully from element - " + retrievedText);
			System.out.println("Text retrieved successfully from element - " + retrievedText);

			// System.out.println("hidden text retrived "+ retrievedText);
			return retrievedText;

		} catch (Exception e) {
//			driver.navigate().refresh();
			System.out.println("id number text retrived :" + retrievedText);
//			driver.navigate().refresh();
			String lines[] = e.getMessage().split("\\r?\\n");
			log.info(e.getMessage());
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}
		
		return retrievedText;

	}

//	gjfgff
//	public void generateRendomName(String strwebElement)
//	{
//		String uuid = UUID.randomUUID().toString();
//
//		//Now this uuid enter to your text box
//		driver.findElement(By.id("text box id")).sendKeys(uuid);
//	}
	public void generateRendomName(String strwebElement, String textToEnter) {
		try {

			textToEnter = UUID.randomUUID().toString();

			WebElement elementToTypeIn = getWebElementUsingBy(getElement(strwebElement));
			this.waitForElementToAppear(strwebElement);
			if (elementToTypeIn.isEnabled() || elementToTypeIn.equals("")
					|| !elementToTypeIn.getAttribute("readonly").equals("readonly")) {
				elementToTypeIn.clear();
				elementToTypeIn.click();
				elementToTypeIn.sendKeys(textToEnter);

				Integer Length = textToEnter.length();

				if (Length.equals(13)) {
					reportStep("RSA ID Number - " + textToEnter + ": Length - " + Length);
					System.out.println("RSA ID Number - " + textToEnter + ": Length - " + Length);
					// elementToTypeIn.clear();
					// elementToTypeIn.click();
					// elementToTypeIn.sendKeys(textToEnter);
				} else {
					reportStep("RSA ID Number - " + textToEnter + ": Length - " + Length);
					System.out.println("RSA ID Number - " + textToEnter + ": Length - " + Length);
				}

			}

			// reportStep("Text '" + textToEnter + "' Entered in '" + pattern + "'");
		} catch (Exception e) {

			String lines[] = e.getMessage().split("\\r?\\n");
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			log.info(e.getMessage());
			Assert.assertFalse(true, e.getMessage());
		}
	}

	public String retrieveTextAttributeLooping(String strwebElement) {

		String retrievedText = retrieveTextAttribute("xpath|||//*[@class='badge badge-notify pull-right']");

		try {
			WebElement element = getWebElementUsingBy(getElement(strwebElement));
			retrievedText = element.getText();

			// int AproveCounter = Integer.parseInt(retrievedText);
			int AproveCounter = 2;
			for (int i = 2; i <= AproveCounter; i++) {
				System.out.println("loop counter :" + AproveCounter);
				String stringInterger = String.valueOf(i);

				System.out.println("Loop interger value:" + i);
				userLeftclick("xpath|||//*[@class='jumbotron-section panel-box']/div[2]/div/div[" + i + "]/div/div[3]",
						"Click specific details found");
				// clickOnElement("xpath|||//*[@class='jumbotron-section
				// panel-box']/div[2]/div/div[2]/div/div[3]");
				System.out.println("xpath value:" + i);

				AproveCounter = AproveCounter - 1;
				reportStep("Text retrieved successfully from element - " + retrievedText);
			}
//			reportStep("Text retrieved successfully from element - " + retrievedText);
//			System.out.println("id number text retrived :"+ retrievedText);
//			
//			System.out.println("hidden text retrived "+ retrievedText);
			return retrievedText;

		} catch (Exception e) {
			System.out.println("id number text retrived :" + retrievedText);
			String lines[] = e.getMessage().split("\\r?\\n");
			log.info(e.getMessage());
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}
		return retrievedText;

	}

	public String retrieveTextAttributeAndClickReject(String strwebElement) {

		String retrievedText = retrieveTextAttribute("xpath|||//*[@class='badge badge-notify pull-right']");

		try {
			WebElement element = getWebElementUsingBy(getElement(strwebElement));
			retrievedText = element.getText();

			// int AproveCounter = Integer.parseInt(retrievedText);
			int AproveCounter = 2;
			for (int i = 2; i <= AproveCounter; i++) {
				System.out.println("loop counter :" + AproveCounter);
				String stringInterger = String.valueOf(i);

				System.out.println("Loop interger value:" + i);
				clickOnElement("xpath|||//app-authorize-impairment-list//*[@class='row panel-group custom-panel']//div["
						+ i + "]//div[1]//div[4]//button[1]");
				System.out.println("xpath value:" + i);

				AproveCounter = AproveCounter - 1;
				reportStep("Text retrieved successfully from element - " + retrievedText);
			}

			return retrievedText;

		} catch (Exception e) {
			System.out.println("id number text retrived :" + retrievedText);
			String lines[] = e.getMessage().split("\\r?\\n");
			log.info(e.getMessage());
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}
		return retrievedText;

	}

	public String UpdateLooping(String strwebElement) {

		String retrievedText = retrieveTextAttribute("xpath|||//*[@class='badge badge-notify pull-right']");

		try {
			WebElement element = getWebElementUsingBy(getElement(strwebElement));
			retrievedText = element.getText();

			// int AproveCounter = Integer.parseInt(retrievedText);
			int AproveCounter = 3;
			for (int i = 2; i <= AproveCounter; i++) {
				System.out.println("loop counter :" + AproveCounter);
				String stringInterger = String.valueOf(i);

				System.out.println("Loop interger value:" + i);

				// clickOnElement("xpath|||//*[text() = 'Authorise
				// Claims']/../../../div[2]/div[1]/div["+i+"]//*[@class='row']");
				clickOnElement(
						"xpath|||//body/app-root/app-authorise/div[@class='jumbotron mt-45']/div[@class='container-fluid']/app-authorize-claim-list/div[@class='jumbotron-section panel-box']/div[@class='row panel-group custom-panel']/div[@class='panel panel-default custom-panel-auth']/div[2]/div[1]");
				System.out.println("xpath value:" + i);

				AproveCounter = AproveCounter - 1;
				reportStep("Text retrieved successfully from element - " + retrievedText);
				break;
			}

			return retrievedText;

		} catch (Exception e) {
			System.out.println("id number text retrived :" + retrievedText);
			String lines[] = e.getMessage().split("\\r?\\n");
			log.info(e.getMessage());
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}
		return retrievedText;

	}

	public String ClickRecordOfDelete(String strwebElement) {

		String retrievedText = retrieveTextAttribute("xpath|||//*[@class='badge badge-notify pull-right']");

		try {
			WebElement element = getWebElementUsingBy(getElement(strwebElement));
			retrievedText = element.getText();

			int AproveCounter = Integer.parseInt(retrievedText);
			// int AproveCounter = 92;
			for (int i = 2; i <= AproveCounter; i++) {
				System.out.println("Loop interger value:" + i);
				boolean isPresent = driver
						.findElements(By.xpath("//*[text() = 'Authorise Impairments']/../../../div[2]/div[1]/div[" + i
								+ "]/div[1]/div[1]/span[@class= 'glyphicon glyphicon-trash']"))
						.size() > 0;
				// boolean isPresentRejectButton = driver.findElements(By.xpath("//*[text() =
				// 'Authorise
				// Impairments']/../../../div[2]/div[1]/div["+i+"]//*[@class='row']/div[4]//*[text()
				// = 'Reject']")).size() > 0;

				if (isPresent) {
					// *[text() = 'Authorise
					// Impairments']/../../../div[2]/div[1]/div[92]//*[@class='row']
					clickOnElement(
							"xpath|||//*[text() = 'Authorise Impairments']/../../..//*[@class='row panel-group custom-panel']/div[@class='panel panel-default custom-panel-auth']/div["
									+ i + "]/div[1]/div[1]");
					reportStep("Button Reject is successfully clicked - " + isPresent);
					System.out.println("Button Reject is successfully clicked - " + i + " = " + isPresent);

					break;

				} else {
					reportStep("Button Delete is NOT successfully clicked - " + retrievedText);
					System.out.println("Button Delete is NOT successfully clicked - " + i + " = " + isPresent);
				}
				System.out.println("xpath value:" + i);

				AproveCounter = AproveCounter - 1;
				reportStep("Text retrieved successfully from element - " + retrievedText);
			}

			return retrievedText;

		} catch (Exception e) {
			System.out.println("id number text retrived :" + retrievedText);
			String lines[] = e.getMessage().split("\\r?\\n");
			log.info(e.getMessage());
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}
		return retrievedText;

	}

	public String ClickRecordOfDeleteAndReject(String strwebElement) {

		String retrievedText = retrieveTextAttribute("xpath|||//*[@class='badge badge-notify pull-right']");

		try {
			WebElement element = getWebElementUsingBy(getElement(strwebElement));
			retrievedText = element.getText();

			int AproveCounter = Integer.parseInt(retrievedText);
			// int AproveCounter = 92;
			for (int i = 2; i <= AproveCounter; i++) {
				System.out.println("Loop interger value:" + i);
				boolean isPresent = driver
						.findElements(By.xpath("//*[text() = 'Authorise Impairments']/../../../div[2]/div[1]/div[" + i
								+ "]/div[1]/div[1]/span[@class= 'glyphicon glyphicon-trash']"))
						.size() > 0;
				// boolean isPresentRejectButton = driver.findElements(By.xpath("//*[text() =
				// 'Authorise
				// Impairments']/../../../div[2]/div[1]/div["+i+"]//*[@class='row']/div[4]//*[text()
				// = 'Reject']")).size() > 0;

				if (isPresent) {
					// *[text() = 'Authorise
					// Impairments']/../../../div[2]/div[1]/div[92]//*[@class='row']
					clickOnElement("xpath|||//*[text() = 'Authorise Impairments']/../../../div[2]/div[1]/div[" + i
							+ "]//*[@class='row']/div[4]//*[text() = 'Reject']");
					reportStep("Button Reject is successfully clicked - " + isPresent);
					System.out.println("Button Reject is successfully clicked - " + i + " = " + isPresent);

					break;

				} else {
					reportStep("Button Delete is NOT successfully clicked - " + retrievedText);
					System.out.println("Button Delete is NOT successfully clicked - " + i + " = " + isPresent);
				}
				System.out.println("xpath value:" + i);

				AproveCounter = AproveCounter - 1;
				reportStep("Text retrieved successfully from element - " + retrievedText);
			}

			return retrievedText;

		} catch (Exception e) {
			System.out.println("id number text retrived :" + retrievedText);
			String lines[] = e.getMessage().split("\\r?\\n");
			log.info(e.getMessage());
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}
		return retrievedText;

	}

	public String ClickClaimRecordOfDelete(String strwebElement) {

		String retrievedText = retrieveTextAttribute("xpath|||//*[@class='badge badge-notify pull-right']");

		try {
			WebElement element = getWebElementUsingBy(getElement(strwebElement));
			retrievedText = element.getText();

			int AproveCounter = Integer.parseInt(retrievedText);
			// int AproveCounter = 92;
			for (int i = 2; i <= AproveCounter; i++) {
				System.out.println("Loop interger value:" + i);
				boolean isPresent = driver
						.findElements(By.xpath("//*[text() = 'Authorise Claims']/../../../div[2]/div[1]/div[" + i
								+ "]/div[1]/div[1]/span[@class='glyphicon glyphicon-pencil']"))
						.size() > 0;
				// boolean isPresentRejectButton = driver.findElements(By.xpath("//*[text() =
				// 'Authorise
				// Impairments']/../../../div[2]/div[1]/div["+i+"]//*[@class='row']/div[4]//*[text()
				// = 'Reject']")).size() > 0;

				if (isPresent) {
					// *[text() = 'Authorise
					// Impairments']/../../../div[2]/div[1]/div[92]//*[@class='row']
					clickOnElement("xpath|||//*[text() = 'Authorise Claims']/../../../div[2]/div[1]/div[" + i
							+ "]//*[@class='row']/div[4]//*[text() = 'Approve']");
					reportStep("Button Reject is successfully clicked - " + isPresent);
					System.out.println("Button Reject is successfully clicked - " + i + " = " + isPresent);

					break;

				} else {
					reportStep("Button Delete is NOT successfully clicked - " + retrievedText);
					System.out.println("Button Delete is NOT successfully clicked - " + i + " = " + isPresent);
				}
				System.out.println("xpath value:" + i);

				AproveCounter = AproveCounter - 1;
				reportStep("Text retrieved successfully from element - " + retrievedText);
			}

			return retrievedText;

		} catch (Exception e) {
			System.out.println("id number text retrived :" + retrievedText);
			String lines[] = e.getMessage().split("\\r?\\n");
			log.info(e.getMessage());
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}
		return retrievedText;

	}

	public String ClickOnButtonOfDelete(String strwebElement) {
		String retrievedText = retrieveTextAttribute("xpath|||//*[@class='badge badge-notify pull-right']");
		try {
			WebElement element = getWebElementUsingBy(getElement(strwebElement));
			retrievedText = element.getText();
			// int AproveCounter = Integer.parseInt(retrievedText);
			int AproveCounter = 376;
			for (int j = 176; j < AproveCounter; j++) {
				waitForElementToAppear(
						"xpath|||//app-authorize-claim-list//div[@class='row panel-group custom-panel']//div[" + j
								+ "]//div[1]//div[2]//a[1]//div[1]");
				clickOnElement("xpath|||//app-authorize-claim-list//div[@class='row panel-group custom-panel']//div["
						+ j + "]//div[1]//div[2]//a[1]//div[1]");
				System.out.println("loop counter :" + AproveCounter + " =============================");
				boolean checkDeleteValue = driver.findElements(By.xpath("//span[contains(text(),'Deleted')]"))
						.size() != 0;
				if (checkDeleteValue = false) {
					System.out.println("Authorise Impairments - Delete button successfully found");
					reportStep("Authorise Impairments - Delete button successfully found - " + checkDeleteValue);
					clickOnElement("xpath|||//button[@class='btn btn-default btn-block btn-cancel']");
					break;
				} else {
					System.out.println("Authorise Impairments - Delete button Not successfully found");
					reportStep("Authorise Impairments - Delete button Not successfully found - " + checkDeleteValue);
					clickOnElement("xpath|||//div[@class='section-header-main']//img[@class='img-fluid']");
				}
				AproveCounter = AproveCounter - 1;
			}
		} catch (Exception e) {
			System.out.println("id number text retrived :" + retrievedText);
			String lines[] = e.getMessage().split("\\r?\\n");
			log.info(e.getMessage());
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}
		return retrievedText;
	}

	public String VerifyAuthoriseImpairmentsSection(String strwebElement) {

		String retrievedText = retrieveTextAttribute("xpath|||//*[@class='badge badge-notify pull-right']");

		try {
			WebElement element = getWebElementUsingBy(getElement(strwebElement));
			retrievedText = element.getText();

			// int AproveCounter = Integer.parseInt(retrievedText);
			int AproveCounter = 2;
			for (int i = 2; i <= AproveCounter; i++) {
				System.out.println("loop counter :" + AproveCounter + " =============================");

				driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);

				boolean delete_btn = driver
						.findElements(By.xpath("//*[text() = 'Authorise Impairments']/../../../div[2]/div[1]/div[" + i
								+ "]//*[@class='row']//*[@class='glyphicon glyphicon-trash']"))
						.size() != 0;
				boolean Edit_btn = driver
						.findElements(By.xpath("//*[text() = 'Authorise Impairments']/../../../div[2]/div[1]/div[" + i
								+ "]//*[@class='row']//*[@class = 'glyphicon glyphicon-pencil']"))
						.size() != 0;
				boolean Approve_btn = driver
						.findElements(By.xpath("//*[text() = 'Authorise Impairments']/../../../div[2]/div[1]/div[" + i
								+ "]//*[@class='row']//*[text()= 'Approve']"))
						.size() != 0;
				boolean Reject_btn = driver
						.findElements(By.xpath("//*[text() = 'Authorise Impairments']/../../../div[2]/div[1]/div[" + i
								+ "]//*[@class='row']//*[text()= 'Reject']"))
						.size() != 0;

				if (delete_btn = true) {
					System.out.println("Authorise Impairments - Delete button successfully found");
					reportStep("Authorise Impairments - Delete button successfully found - " + delete_btn);
				}
				if (Edit_btn = true) {
					System.out.println("Authorise Impairments - Edit button successfully found");
					reportStep("Authorise Impairments - Edit button successfully found - " + Edit_btn);
				}

				if (Approve_btn = true) {
					System.out.println("Authorise Impairments - Approve button successfully found");
					reportStep("Authorise Impairments - Approve button successfully found - " + Approve_btn);
				}
				if (Reject_btn = true) {
					System.out.println("Authorise Impairments - Reject button successfully found");
					reportStep("Authorise Impairments - Reject button successfully found - " + Reject_btn);
				} else {
					System.out.println("Authorise Impairments - No Impairments Found");
				}
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

				AproveCounter = AproveCounter - 1;
				reportStep("Text retrieved successfully from element - " + retrievedText);
				// clickOnElement("xpath|||//*[text() = 'Authorise
				// Impairments']/../../../div[2]/div[1]/div[2]//*[@class='row']//*[text()=
				// 'Approve']");
			}

			return retrievedText;

		} catch (Exception e) {
			System.out.println("id number text retrived :" + retrievedText);
			String lines[] = e.getMessage().split("\\r?\\n");
			log.info(e.getMessage());
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}
		return retrievedText;
	}

	public String VerifyAuthoriseClaimSection(String strwebElement) {

		String retrievedText = retrieveTextAttribute("xpath|||//*[@class='badge badge-notify pull-right']");

		try {
			WebElement element = getWebElementUsingBy(getElement(strwebElement));
			retrievedText = element.getText();

			// int AproveCounter = Integer.parseInt(retrievedText);
			int AproveCounter = 2;
			for (int i = 2; i <= AproveCounter; i++) {
				System.out.println("loop counter :" + AproveCounter);

				driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);

				boolean delete_btn = driver
						.findElements(By.xpath("//*[text() = 'Authorise Claims']/../../../div[2]/div[1]/div[" + i
								+ "]//*[@class='row']//*[@class='glyphicon glyphicon-trash']"))
						.size() != 0;
				boolean Edit_btn = driver
						.findElements(By.xpath("//*[text() = 'Authorise Claims']/../../../div[2]/div[1]/div[" + i
								+ "]//*[@class='row']//*[@class = 'glyphicon glyphicon-pencil']"))
						.size() != 0;
				boolean Approve_btn = driver
						.findElements(By.xpath("//*[text() = 'Authorise Claims']/../../../div[2]/div[1]/div[" + i
								+ "]//*[@class='row']//*[text()= 'Approve']"))
						.size() != 0;
				boolean Reject_btn = driver
						.findElements(By.xpath("//*[text() = 'Authorise Claims']/../../../div[2]/div[1]/div[" + i
								+ "]//*[@class='row']//*[text()= 'Reject']"))
						.size() != 0;

				if (delete_btn = true) {
					System.out.println("Authorise Claims - Delete button successfully found");
					reportStep("Authorise Claims - Delete button successfully found - " + delete_btn);
				}
				if (Edit_btn = true) {
					System.out.println("Authorise Claims - Edit button successfully found");
					reportStep("Authorise Claims - Edit button successfully found - " + Edit_btn);
				}

				if (Approve_btn = true) {
					System.out.println("Authorise Claims - Approve button successfully found");
					reportStep("Authorise Claims - Approve button successfully found - " + Approve_btn);
				}
				if (Reject_btn = true) {
					System.out.println("Authorise Claims - Reject button successfully found");
					reportStep("Authorise Claims - Reject button successfully found - " + Reject_btn);
				} else {
					System.out.println("Authorise Claims - No Claims record found");
				}
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				AproveCounter = AproveCounter - 1;
				reportStep("Text retrieved successfully from element - " + retrievedText);
				// clickOnElement("xpath|||//*[text() = 'Authorise
				// Claims']/../../../div[2]/div[1]/div[2]//*[@class='row']//*[text()=
				// 'Approve']");
			}

			return retrievedText;

		} catch (Exception e) {
			System.out.println("id number text retrived :" + retrievedText);
			String lines[] = e.getMessage().split("\\r?\\n");
			log.info(e.getMessage());
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}
		return retrievedText;

	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: retrieve attribute
	 * @param :
	 * @author Abongile Maso
	 * @return: void
	 * 
	 * 
	 ***/
	public String retrieveAttribute(String strwebElement) {
		String retrievedText = "";
		try {
			WebElement element = getWebElementUsingBy(getElement(strwebElement));
			retrievedText = element.getAttribute("value");

			System.out.println("retrivied attribute " + retrievedText);
			if (retrievedText.equals("null")) {
				reportStep(" Failed to retrieve attribute  - " + retrievedText);
				Assert.assertFalse(true, "Text ");
				// return false;
			}
			reportStep("Text retrieved successfully from element - " + retrievedText);
			return retrievedText;
		} catch (Exception e) {
			String lines[] = e.getMessage().split("\\r?\\n");
			log.info(e.getMessage());
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}
		return retrievedText;

	}

	public String checkApprovalExist(String strwebElement) {
		String retrievedText = retrieveTextAttribute("xpath|||//*[@class='badge badge-notify pull-right']");
		try {
			WebElement element = getWebElementUsingBy(getElement(strwebElement));
			retrievedText = element.getText();

			driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
			boolean delete_btn = driver.findElements(By.xpath(
					"//*[text() = 'Reason for Change ']/../../../div[2]//*[@class=\"glyphicon glyphicon-trash\"]"))
					.size() != 0;

			if (delete_btn = true) {
				System.out.println("Authorise Impairments - Approval button successfully Not found");
				reportStep("Authorise Impairments - Approval button successfully Not found - " + delete_btn);
			} else {
				reportStep("Authorise Impairments - Approval button successfully found - " + delete_btn);
				System.out.println("Authorise Impairments - Approval button successfully found");
			}

			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

			return retrievedText;

		} catch (Exception e) {
			System.out.println("id number text retrived :");
			String lines[] = e.getMessage().split("\\r?\\n");
			log.info(e.getMessage());
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}
		return retrievedText;
	}

	public String checkRejectedExist(String strwebElement) {
		String retrievedText = retrieveTextAttribute("xpath|||//*[@class='badge badge-notify pull-right']");
		try {
			WebElement element = getWebElementUsingBy(getElement(strwebElement));
			retrievedText = element.getText();

			driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
			boolean delete_btn = driver.findElements(By.xpath(
					"//*[text() = 'Reason for Change ']/../../../div[2]//*[@class=\"glyphicon glyphicon-trash\"]"))
					.size() != 0;

			if (delete_btn = true) {
				System.out.println("Authorise Impairments - Approval button successfully Not found");
				reportStep("Authorise Impairments - Approval button successfully Not found - " + delete_btn);
			} else {
				reportStep("Authorise Impairments - Approval button successfully found - " + delete_btn);
				System.out.println("Authorise Impairments - Approval button successfully found");
			}

			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

			return retrievedText;

		} catch (Exception e) {
			System.out.println("id number text retrived :");
			String lines[] = e.getMessage().split("\\r?\\n");
			log.info(e.getMessage());
			reportStep("*#* " + lines[0]);
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}
		return retrievedText;
	}

	/**
	 * @FUNCTION_HEADER*****************************************************************************
	 * @name: closeBrowser
	 * @purpose: retrieve text and compare it with datasheet value
	 * @param :
	 * @author Abongile Maso
	 * @return: void
	 * 
	 * 
	 ***/
	public boolean retrieveTextAndCompare(String strwebElement, String Attribute) {
		String retrievedAttribute = "";
		String retrievedText = "";
		try {
			waitForElementToAppear(strwebElement);
			WebElement element = getWebElementUsingBy(getElement(strwebElement));
			
			retrievedText = element.getText();

			if (!retrievedText.equals(Attribute)) {
				reportStep("Failed to validate: " + retrievedText + " Againts: " + Attribute);
				Assert.assertFalse(true, "Text ");
				return false;
			}
			reportStep("Text retrieved successfully validate text - " + retrievedText + " with: " + Attribute);
			return true;
		} catch (Exception e) {
			log.info(" Failed to retrieve attribute from element Xpath - " + e.getMessage());
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
			return false;
		}

	}

	public boolean retrievedAttributeAndCompare(String strwebElement, String Attribute) {
		String retrievedAttribute = "";
		String retrievedText = "";
		try {
			WebElement element = getWebElementUsingBy(getElement(strwebElement));
			retrievedText = element.getAttribute("value");

			// this.waitForElementToAppear(strwebElement);
			System.out.println("reteived value :" + retrievedText);

			if (!retrievedText.equals(Attribute)) {
				System.out.println("Failed to validate: " + retrievedText + " Againts: " + Attribute);
				reportStep("Failed to validate: " + retrievedText + " Againts: " + Attribute);
				Assert.assertFalse(true, "Text ");
				return false;
			}
			reportStep("Text retrieved successfully validate text - " + retrievedText + " with: " + Attribute);
			return true;
		} catch (Exception e) {
			log.info(" Failed to retrieve attribute from element Xpath - " + e.getMessage());
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
			return false;
		}
	}

	public boolean retrievedFromDropDownAndCompare(String strwebElement, String Attribute) {
		String retrievedAttribute = "";
		String retrievedText = "";
		try {
			WebElement element = getWebElementUsingBy(getElement(strwebElement));
			retrievedText = element.getText();

			this.waitForElementToAppear(strwebElement);
			System.out.println("reteived value :" + retrievedText);

			if (retrievedText.equals(Attribute)) {
				System.out.println(
						"Text retrieved successfully validate text " + retrievedText + " Againts: " + Attribute);
				reportStep("Text retrieved successfully validate text - " + retrievedText + " with: " + Attribute);
				Assert.assertEquals(retrievedText, Attribute);
				return false;
			}
			reportStep("Text retrieved successfully validate text - " + retrievedText + " with: " + Attribute);
			return true;
		} catch (Exception e) {
			log.info(" Failed to retrieve attribute from element Xpath - " + e.getMessage());
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
			return false;
		}
	}

	public void checkIfElementIsDisabled(String strwebElement) {
		try {
			WebElement element = getWebElementUsingBy(getElement(strwebElement));
			if (!element.isEnabled()) {
				System.out.println("Failed to validate: " + strwebElement + ":  is disabled");
				reportStep("Failed to validate: " + strwebElement);
				Assert.assertFalse(true, "Text ");
			}

			System.out.println("step passed " + strwebElement + ": is disabled");
			reportStep("step passed " + strwebElement + ": is disabled");

		} catch (Exception e) {
			log.info(" Failed to retrieve attribute from element Xpath - " + e.getMessage());
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}
	}

	public void checkIfElementIsDisabledCheck(String strwebElement) {
		try {
			WebElement element = getWebElementUsingBy(getElement(strwebElement));
			if (element.isEnabled()) {
				System.out.println("Failed to validate: " + strwebElement + ":  is disabled");
				reportStep("Failed to validate: " + strwebElement);
				Assert.assertFalse(true, "Text ");
			}

			System.out.println("step passed " + strwebElement + ": is disabled");
			reportStep("step passed " + strwebElement + ": is disabled");

		} catch (Exception e) {
			log.info(" Failed to retrieve attribute from element Xpath - " + e.getMessage());
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}
	}

	public void checkIfElementIsEnabled(String strwebElement) {
		try {
			WebElement element = getWebElementUsingBy(getElement(strwebElement));
			if (!element.isEnabled()) {
				System.out.println("Failed to validate: " + strwebElement + ": is disabled");
				reportStep("Failed to validate: " + strwebElement + ": is disabled");
				Assert.assertFalse(true, "Text ");
			}
			System.out.println("step passed " + strwebElement + ": is enabled");
			reportStep("step passed" + strwebElement + ": is enabled");

		} catch (Exception e) {
			log.info(" Failed to retrieve attribute from element Xpath - " + e.getMessage());
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}
	}

	public void isElementEnabled(String strwebElement) {
//		WebElement element = getWebElementUsingBy(getElement(strwebElement));
//		if(element.click() == true)
//		{
//			System.out.println("step passed "+strwebElement+": is enabled");
//			reportStep("step passed"+strwebElement+": is enabled");
//		}
//		else
//		{
//			System.out.println("Failed to validate: " + strwebElement+": is disabled");
//			reportStep("Failed to validate: " + strwebElement) ;
//			Assert.assertFalse(true, "Text ");
//		}

		// verify that the Search button is displayed and enabled
		boolean searchIconPresence = driver.findElement(By.xpath(strwebElement)).isDisplayed();
		boolean searchIconEnabled = driver.findElement(By.xpath(strwebElement)).isEnabled();
		if (searchIconPresence == true && searchIconEnabled == true) {
			// click on the search button
			WebElement searchIcon = driver.findElement(By.id(strwebElement));
			System.out.println("step passed " + strwebElement + ": is enabled");
			reportStep("step passed" + strwebElement + ": is enabled");
			// searchIcon.click();
		} else {
			System.out.println("Failed to validate: " + strwebElement + ": is disabled");
			reportStep("Failed to validate: " + strwebElement);
			Assert.assertFalse(true, "Text ");
		}

//		IwebElement e1 = driver.FindElement(By.XPath("Your Xpath"));
//
//		// the button's Enabled property
//
//		if (e1.Enabled)
//		Console.WriteLine("Button is enabled");
//		else
//		Console.WriteLine("Button is disabled");

//	    String className = element.getAttribute("disabled");
//	    return className.matches(".+(x-.+-disabled)+");
	}

	public void CheckElementEditable(String strwebElement) {
		try {
			WebElement element = getWebElementUsingBy(
					(By.xpath("//*[text() = 'Claim Type(s)']/..//*[@class=\\\"c-btn disabled\\\"]")));
			element.sendKeys("abc");
			String fieldNameVal = element.getAttribute("value");

			if (fieldNameVal.contentEquals("abc")) {
				System.out.println("Field is editable");
			} else {
				System.out.println("Field is non editable" + fieldNameVal);
			}

		} catch (Exception e) {
			log.info(" Failed to retrieve attribute from element Xpath - " + e.getMessage());
			takeScreenShot_reporter();
			Assert.assertFalse(true, e.getMessage());
		}
	}
	
	
	public boolean checkBrokenURL(int iRowCounter) throws Exception
	{
		boolean flag =true;
		String strUrl=ExcelHandler.getCellData(iRowCounter, 1);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		Date date = new Date();
        date.getTime();
        String lastChecked = sdf.format(date.getTime());

		System.out.println(strUrl);
		try {
	
			
			Response res=given().relaxedHTTPSValidation().when().get(strUrl).then().extract().response();
			System.out.println(res.statusCode());
			


			if(res.statusCode()==200 || res.statusCode()==401)
			{
				ExcelHandler.setCellData( "Pass",iRowCounter,2);
				ExcelHandler.setCellData( lastChecked,iRowCounter,3);
				//testLogger.pass(sUrl);
				reportStep("Url " + strUrl + ": is Working Fine");
				flag=true;
				
			}
			else
			{
				//testLogger.fail(sUrl);
				ExcelHandler.setCellData( "Fail",iRowCounter,2);
				ExcelHandler.setCellData( lastChecked,iRowCounter,3);
				reportStep("Url " + strUrl + ": is not Working Fine");
				flag=false;
			}

		}

		catch(Exception e){
			
			e.printStackTrace();
			//testLogger.fail("Exception Occured for URL:"+sUrl);
			reportStep("Url " + strUrl + ": is not Working Fine");
			ExcelHandler.setCellData( "Fail",iRowCounter,2);
			ExcelHandler.setCellData( lastChecked,iRowCounter,3);
			
			
		}
		return flag;
	}
	
	public boolean checkSQLdatabase(int iRowCounter) throws Exception
	{
		String name="";
		boolean flag =true;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		Date date = new Date();
        date.getTime();
        String lastChecked = sdf.format(date.getTime());
		
		try {



			String connectionstr=ExcelHandler.getCellData(iRowCounter, 1);
			name =ExcelHandler.getCellData(iRowCounter, 0);
			String user="X473215";
			String password="Lesedi@2021";
			//Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection con=DriverManager.getConnection(connectionstr,user,password);

			System.out.println("Database Login");

			Statement sqlStatement = con.createStatement();
			String sqlQuery = ExcelHandler.getCellData(iRowCounter, 2);
			ResultSet resSet = sqlStatement.executeQuery(sqlQuery);
			

			if(name.equalsIgnoreCase("last create"))
			{
				resSet.next();
				int count =resSet.getRow();
				System.out.println(count);

				if(count==1)
				{
					ExcelHandler.setCellData( "Pass",iRowCounter,3);
					ExcelHandler.setCellData( lastChecked,iRowCounter,4);
					//testLogger.fail("Database Passed"+name);
					System.out.println("Pass");
					reportStep("Database  " + name + ": is Working Fine");
					flag=true;
					
				}
				else

				{
					ExcelHandler.setCellData( "Fail",iRowCounter,3);
					ExcelHandler.setCellData( lastChecked,iRowCounter,4);
					//testLogger.fail("Database failed"+name);
					System.out.println("Fail");
					reportStep("Database  " + name + ": is Not Working Fine");
					flag=false;
				}

			}
			else if(name.equalsIgnoreCase("retry asynch"))
			{

			}
			else if (name.equalsIgnoreCase("GCS Val errors"))
			{
				resSet.next();
				int count =resSet.getRow();
				System.out.println(count);

				if(count<1)
				{
					ExcelHandler.setCellData( "Pass",iRowCounter,3);
					ExcelHandler.setCellData( lastChecked,iRowCounter,4);
					//testLogger.fail("Database Passed"+name);
					System.out.println("Pass");
					reportStep("Database  " + name + ": is Working Fine");
					flag=true;
				}
				else

				{
					ExcelHandler.setCellData( "Fail",iRowCounter,3);
					ExcelHandler.setCellData( lastChecked,iRowCounter,4);
					//testLogger.fail("Database failed"+name);
					System.out.println("Fail");
					reportStep("Database  " + name + ": is Not Working Fine");
					flag=false;
					
				}

			}

		}

		catch(Exception e)
		{
			e.printStackTrace();
			ExcelHandler.setCellData( "Fail",iRowCounter,3);
			ExcelHandler.setCellData( lastChecked,iRowCounter,4);
			//testLogger.fail("Database failed"+name);
			System.out.println("Fail");
			reportStep("Database  " + name + ": is Not Working Fine");
			flag=false;
		}
		
		
		return flag;
	}
	
	
public boolean checkLogs(int iRowCounter ) throws Exception {
        
        String sPath ="";
        String sName ="";
        boolean flag =false;
        sPath=ExcelHandler.getCellData(iRowCounter, 1);
        sName=ExcelHandler.getCellData(iRowCounter, 0);

        
       try {
    	   
       
        File dir = new File(sPath);
        if (dir.isDirectory()) {
            Optional<File> opFile = Arrays.stream(dir.listFiles(File::isFile))
              .max((f1, f2) -> Long.compare(f1.lastModified(), f2.lastModified()));
            
            System.out.println("The directory " + dir.getPath() + " is not empty");

 

            if (opFile.isPresent()){
                System.out.println(opFile.get().lastModified());
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
                String lastmodified =sdf.format(opFile.get().lastModified());
               

 

                System.out.println(lastmodified);

 

                Date date = new Date();
                date.getTime();
                String lastChecked = sdf.format(date.getTime());
                long datediff = date.getTime()-opFile.get().lastModified();

 

                System.out.println( date.getTime()-opFile.get().lastModified());

                if(sPath.contains("\\zaompwmpv711\\omoi\\Prod\\Captiva\\Captiva Batch Export\\CARMA"))
            	{
            		
                	 datediff = date.getTime()-dir.lastModified();
            	}
            	

                if(datediff<6000000)
                {
                    ExcelHandler.setCellData( "Pass",iRowCounter,2);
                    //testLogger.info("latest Logs present"+sUrl);
                    System.out.println("Pass");
                    ExcelHandler.setCellData( lastmodified,iRowCounter,3);
                    ExcelHandler.setCellData( lastChecked,iRowCounter,4);
                    //reportStep("Updated Logs for  " + sPath + " are Present");
                    flag=true;

 

                }
                else
                {
                	
                    ExcelHandler.setCellData( "Fail",iRowCounter,2);
                    //testLogger.info("No latest Logs present"+sUrl);
                    System.out.println("Fail");
                    ExcelHandler.setCellData( lastmodified,iRowCounter,3);
                    ExcelHandler.setCellData( lastChecked,iRowCounter,4);
                    reportStep("Updated Logs for  " + sName + " are not Present");
                    flag=false;

 

                }

 

            }
            else
            {
                System.out.println("The directory " + dir.getPath() + " is empty");
                ExcelHandler.setCellData( "Fail not accessable or dictionary is empty",iRowCounter,2);
                reportStep("Updated Logs for  " + sName + " are not Present");
                flag=false;
                ExcelHandler.setCellData( "Fail because Folder is empty or no access",iRowCounter,2);
                //testLogger.info("No latest Logs present"+sUrl);
                System.out.println("Fail");
                reportStep("Updated Logs for  " + sName + " are not Present");
                flag=false;
            }
        
        }
       
       }
       catch(Exception e)
       {
    	   ExcelHandler.setCellData( "Fail not accessable or dictionary is empty",iRowCounter,2);
           //testLogger.info("No latest Logs present"+sUrl);
    	   reportStep("Updated Logs for  " + sName + " are not Present");
           flag=false;
           e.printStackTrace();/*
			 * ExcelHandler.setCellData( lastmodified,iRowCounter,3);
			 * ExcelHandler.setCellData( lastChecked,iRowCounter,4);
			 */
          
    	   
       }
        
        return flag;
        
    }
	
	public boolean checkStoredProc(int iRowCounter) throws Exception
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		Date date = new Date();
        date.getTime();
        String lastChecked = sdf.format(date.getTime());
		
		boolean flag =true;
		try {
			
		
		String spName=ExcelHandler.getCellData(iRowCounter, 1);
		String connectionstr=ExcelHandler.getCellData(iRowCounter, 0);
		String user="X473215";
		String password="Lesedi@2021";

		//Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con=DriverManager.getConnection(connectionstr,user,password);

		System.out.println("Database Login");

		String sqlQuery = "{call "+spName+"()}";
		CallableStatement  stmt = con.prepareCall(sqlQuery);
		boolean resSet = stmt.execute();
		stmt.close();
		

		
		if(resSet) {
			System.out.println("Stored procedure called successfully!"); 
			System.out.println("This is Folder Check For Folder:");
			//testLogger.pass("All Folders Working Fine");
			//reportStep("Stored Procedure " + spName + " Executed Sucessfully");
			ExcelHandler.setCellData( "Pass",iRowCounter,2);
			ExcelHandler.setCellData( lastChecked,iRowCounter,3);
			//testLogger.info("No latest Logs present"+sUrl);
			System.out.println("Pass");
			flag =true;

		}
		else
		{
			reportStep("Stored Procedure " + spName + " Not Executed Sucessfully");
			ExcelHandler.setCellData( "Fail",iRowCounter,2);
			ExcelHandler.setCellData( lastChecked,iRowCounter,3);
			//testLogger.info("No latest Logs present"+sUrl);
			System.out.println("Fail");
			flag =false;
		}
		
		}
		catch(Exception  e)
		
		{
			e.printStackTrace();
			log.info(" Failed to retrieve connection " + e.getMessage());
			ExcelHandler.setCellData( "Fail",iRowCounter,2);
			ExcelHandler.setCellData( lastChecked,iRowCounter,3);
			flag =false;
		}
		
		return flag;
	}
	
	
	public boolean StoredProcedureExtract(int iRowCounter) throws Exception
	{
		boolean flag =true;
		String user="OMCORE\\X473215";
		String password="Lesedi@2021";
		
		String spName=ExcelHandler.getCellData(iRowCounter, 1);
		String connectionstr=ExcelHandler.getCellData(iRowCounter, 0);
		String sqlQuery = "{call "+spName+"()}";
        try (
        		
            Connection conn = DriverManager.getConnection(connectionstr, user, password);
        		CallableStatement  statement = conn.prepareCall(sqlQuery);
        ) {
 
//           statement.setInt(0, 5);
 
            boolean hadResults = statement.execute();
 
            // print headings
//            System.out.println("| Name| Run_Status | Last Run |");
//            System.out.println("================================");
// 
            while (hadResults) {
                ResultSet resultSet = statement.getResultSet();
 
                // process result set
                while (resultSet.next()) {
                    String name = resultSet.getString("name");                  
                    String  run_status= resultSet.getString("run_status");
//                    Timestamp Run = resultSet.getTimestamp("Run");
                    
                    
                   
//        			ExcelHandler.setCellData( "Status",iRowCounter,2);
//        			//testLogger.info("No latest Logs present"+sUrl);
//        			System.out.println("Fail");
//        			flag =false;
 
                    System.out.println(
                            "| " + name + " |  " + run_status + " | ");
                }
 
                hadResults = statement.getMoreResults();
            }
 
            statement.close();
            
    		
    		}
 
         catch (SQLException ex) {
//        	log.info(" Status retrieved " + ex.getMessage());
//			ExcelHandler.setCellData( "Status",iRowCounter,2);
			flag =false;
        }
		return flag;
	}
}
