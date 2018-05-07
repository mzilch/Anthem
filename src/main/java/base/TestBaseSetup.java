package base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBaseSetup {

    //Declare ThreadLocal Driver (ThreadLocalMap) for ThreadSafe Tests
    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
	//public static WebDriver driver;	
	private static WebDriverWait wait;
	private static Actions builder;	
	public static String browserName;
	
	private static String ChromedriverPath = "C:\\Users\\Administrator\\Downloads\\Selenium\\Drivers\\Chrome 2.35\\";

	public static WebDriver getDriver() throws MalformedURLException {
		return driver.get();
	}
	public static Actions getBuilder() throws MalformedURLException {
		return  builder;
	}
	public static WebDriverWait getWait() throws MalformedURLException {
		return  wait;
	}
	
	@Parameters({ "browserType" })
	@BeforeClass	
	public void initializeTestBaseSetup( @Optional("firefox") String browserName) {
		try {
			setDriver(browserName);
			builder = new Actions(getDriver());
	        wait = new WebDriverWait(getDriver(), 10);

		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
	}

	public WebDriver setDriver(String browserType) throws MalformedURLException {
		switch (browserType) {
		case "chrome":
			driver = initChromeDriver();
			break;
		case "DockerChrome":
			driver = initDockerChromeDriver();
			break;
		case "firefox":
			driver = initFirefoxDriver();
			break;
		case "internetexplorer":
			driver = initIEDriver();
			break;
			
		default:
			System.out.println("browser : " + browserType
					+ " is invalid, Launching Firefox as browser of choice..");
			driver = (ThreadLocal<RemoteWebDriver>) initFirefoxDriver();
		}
		return driver.get();
	}

	private static ThreadLocal<RemoteWebDriver> initChromeDriver() throws MalformedURLException {
		System.out.println("Launching Google Chrome with new profile..");		 
		System.setProperty("webdriver.chrome.driver", ChromedriverPath	+ "chromedriver.exe");
		driver.set(new ChromeDriver());
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getDriver().manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		return driver;
	}

	private static ThreadLocal<RemoteWebDriver> initFirefoxDriver() throws MalformedURLException {
		System.out.println("Launching Firefox browser..");
		driver.set(new FirefoxDriver());
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getDriver().manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		//driver.navigate().to(appURL);
		return driver;
	}
	
	private static ThreadLocal<RemoteWebDriver> initDockerChromeDriver() throws MalformedURLException {
		System.out.println("Launching DockerChrome browser..");
	    DesiredCapabilities caps = DesiredCapabilities.chrome();
	    caps.setCapability(CapabilityType.VERSION, "");
	    caps.setCapability(CapabilityType.PLATFORM, "LINUX");
	    driver.set(new RemoteWebDriver(new URL("http://192.168.99.100:4446/wd/hub"),  caps));

		//driver.navigate().to(appURL);
		return driver;
	}
	private static ThreadLocal<RemoteWebDriver> initIEDriver() throws MalformedURLException {
	    System.setProperty("webdriver.ie.driver", "C:\\Users\\Administrator\\Desktop\\XPath Assistant Projects\\IEDriverServer\\IEDriverServer.exe");
	    DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
	    dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	    dc.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
	
	    driver.set(new InternetExplorerDriver(dc));
	    getDriver().manage().window().maximize();
	    getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    getDriver().manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	    
	    return driver;
	}
	
	
	@AfterClass
	public void tearDown() {
        try{
        	getDriver().quit();
        }
        catch (Exception e) {

            e.toString();
            e.printStackTrace();

        }
	}
}

