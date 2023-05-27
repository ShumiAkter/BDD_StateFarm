package base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import object.Insurance;
import object.Investments;
import object.LogIn;
import object.PayBill;
import object.Banking;
import object.Claims;
import object.GetAQuote;
import object.HomePage;
import object.PersonalPricePlan;
import object.Vehicles;
//import utils.Browser;
import utils.Configuration;
import utils.Key_Constant;
import static utils.Key_Constant.*;
import static utils.Browser.*;

public class TestBase {

	protected static WebDriver driver;
	protected static HomePage homePage;
	protected static PersonalPricePlan personalPricePlan;
	protected static Vehicles vehicles;
	protected static Insurance insurance;
	protected static Banking branking;
	protected static Investments investments;
	protected static GetAQuote getAQuote;
	protected static Claims claims;
	protected static LogIn logIn;
	protected static PayBill payBill;
	Configuration configuration = new Configuration();

	public void beforeEachTest(String browserName) {
		// String browserName = configuration.getProp(getValue(Key_Constant.browser));
		initiatDriver(browserName);
		initObject();
		driver.manage().window().maximize();
		int pageLoadTime = configuration.getPropN(getValue(pageLoad));
		int implicitLoadTime = configuration.getPropN(getValue(implicitLoad));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTime));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitLoadTime));
		String url = configuration.getProp("url");
		driver.get(url);
	}

	public void initiatDriver(String browser) {
		switch (browser) {
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case SAFARI:
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;
		case CHROME:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case EDGE:
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}

	}

	protected void initObject() {
		homePage = new HomePage(driver);
		personalPricePlan = new PersonalPricePlan(driver);
		vehicles = new Vehicles(driver);
		insurance = new Insurance(driver);
		branking = new Banking(driver);
		investments = new Investments(driver);
		getAQuote = new GetAQuote(driver);
		claims = new Claims(driver);
		logIn = new LogIn(driver);
		payBill = new PayBill(driver);

	}

	public void closingBrower() {
		driver.quit();
	}

	public String getValue(Key_Constant key_Constant) {
		return key_Constant.name();
	}
}
