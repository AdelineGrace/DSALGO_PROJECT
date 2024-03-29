package POM_DsAlgo;


	import java.io.IOException;
import java.util.List;
import static Utilities.ConfigReader.getll;
import static Utilities.ConfigReader.getllinv;


	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Driver.DriverFactory;

	public class POMLinkedList {

    private WebElement dropdownElement;	
	WebDriver driver;
	Actions actions = new Actions(DriverFactory.getDriver());
		By linkedlist = By.xpath("//a[text()='Linked List']");
	By Options = By.xpath("//a[@class='nav-link dropdown-toggle']");
	By intorduction = By.xpath("//a[text()='Introduction']");

	By tryhere = By.xpath("//a[text()='Try here>>>']");

	By textbox = By.xpath("//form[@id='answer_form']/div/div/div/textarea");

	By console = By.xpath("//*[@id=\"output\"]");

	By clickRun=By.xpath("//button[text()='Run']");
	
	By stack=By.xpath("//a[text()='Stack']");
	
	public  POMLinkedList(WebDriver driver) {

	this.driver = driver ;
	this.actions = new Actions(driver);

	PageFactory.initElements(driver, this);

	}
		
	public void selectLinkedList() {

		driver.findElement(linkedlist).click();
	
	}
	 public void Options()
	   {
		   driver.findElement(Options).click();
	   }
	
		
	public void clickRun() {
		driver.findElement(clickRun).click();
		
	}

	public void clickIntroduction() {

	driver.findElement(intorduction).click();

	}

	public void clickTryHere () {

	driver.findElement(tryhere).click();

	}

	public void accpetAlert () {

	driver.switchTo().alert().accept();

	}

	public void typeCorrectCode() throws IOException {

	driver.findElement(textbox).sendKeys(getll());

	}
	 public void clearCode() {
		  actions.keyDown(driver.findElement(textbox), Keys.CONTROL).sendKeys("a").keyUp(driver.findElement(textbox), Keys.CONTROL).perform();
			actions.sendKeys(Keys.DELETE).perform();
	  }

	public void typeIncorrectCode() throws IOException {

	driver.findElement(textbox).sendKeys(getllinv());

	}
	
	  public void clickBack() {
	     	 
	     	 driver.navigate().back();
	      }

	public String consoleOutputCheck() {

	return driver.findElement(console).getText();

	}

	}


