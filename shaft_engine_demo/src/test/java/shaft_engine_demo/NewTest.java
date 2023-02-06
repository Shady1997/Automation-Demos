package shaft_engine_demo;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;
import com.shaft.tools.io.ReportManager;

import database.MysqlConnect;

public class NewTest extends MysqlConnect {

	// class properties
	WebDriver driver;

	@Test
	public void loginToBRSubsystem() {
		// TODO Create web driver and browser action calling to navigate to br url
		ReportManager.log("First test case to login to br subsystem");
		driver = DriverFactory.getDriver();
		BrowserActions.navigateToURL(driver, "http://cqcehap001.qcenv.idemia.local/businessrules_frontend/#/app-login");

		// TODO Connect to database and get username and password
		startdbConnection();

		// TODO login to business rules subsystem
		ElementActions.type(driver, By.xpath("//input[@id='userName']"), resultList.get(2).getUserName());
		ElementActions.type(driver, By.xpath("//input[@id='password']"), resultList.get(2).getPassword());
		ElementActions.click(driver, By.xpath("//button[@type='submit']"));

	}

	@Test
	public void addNewBusinessRule() {
		// TODO fill business rule data
		ElementActions.click(driver, By.xpath("//i[@class='fa-3x d-block fa fa-plus-square']"));
		ElementActions.type(driver, By.xpath("//input[@id='name']"), "shady9");
		ElementActions.click(driver, By.xpath(
				"//mat-select[@id='mat-select-2']//div[@class='mat-select-trigger']//div[@class='mat-select-arrow-wrapper']//div[@class='mat-select-arrow']"));
		ElementActions.click(driver, By.xpath("//span[contains(text(),'النظام المركزي للتحركات')]"));
		ElementActions.type(driver, By.xpath("//input[@id='ExpiryDate']"), "01012021");
		ElementActions.type(driver, By.xpath("//input[@id='deactivationDate']"), "31122021");
		ElementActions.type(driver, By.xpath("//textarea[@id='description']"), "shady9 shady9");
		ElementActions.click(driver, By.xpath(
				"//div[@id='cdk-step-content-1-0']//div[@class='row ng-star-inserted']//div[@class='col-md-12 text-left m-t-xs']//button[@type='button'][contains(text(),'التالي')]"));
		try {
			driver.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
