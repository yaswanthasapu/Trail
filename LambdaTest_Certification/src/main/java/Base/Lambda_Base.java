package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

public class Lambda_Base {

    public WebDriver driver;
    DesiredCapabilities desiredCapabilities;

    ChromeOptions chromeOptions;

    EdgeOptions edgeOptions;
    FirefoxOptions firefoxOptions;
    InternetExplorerOptions internetExplorerOptions;
    @Parameters("browserName")
    @BeforeTest
    public void launchBrowser(String browserName) throws MalformedURLException {
        HashMap<String, Object> ltOptions = new HashMap<String, Object>();
        ltOptions.put("username", "yaswanth901");
        ltOptions.put("accessKey", "cejdFJRy5sRz1lMpclUf01fPKqzCBn4tfqRUThoXioQZQbUnOu");
        ltOptions.put("project", "Untitled");
        ltOptions.put("selenium_version", "4.0.0");
        ltOptions.put("w3c", true);

        switch (browserName)
        {
            case "chrome":
                chromeOptions = new ChromeOptions();
                chromeOptions.setPlatformName("Windows 10");
                chromeOptions.setBrowserVersion("88.0");
                chromeOptions.setCapability("LT:Options", ltOptions);
                driver=new RemoteWebDriver(new URL("https://yaswanthasapu946:vxVgfCdo89tpuQxLTiOM2nSk17zP9KZw1RB46dxZinNzisN0SR@hub.lambdatest.com/wd/hub"),chromeOptions);

                break;

            case "edge":
                edgeOptions = new EdgeOptions();
                edgeOptions.setPlatformName("macOS Sierra");
                edgeOptions.setBrowserVersion("87.0");
                edgeOptions.setCapability("LT:Options", ltOptions);
                driver=new RemoteWebDriver(new URL("https://yaswanthasapu946:vxVgfCdo89tpuQxLTiOM2nSk17zP9KZw1RB46dxZinNzisN0SR@hub.lambdatest.com/wd/hub"),edgeOptions);

                break;


            case "firefox":
                firefoxOptions=new FirefoxOptions();
                firefoxOptions.setPlatformName("Windows 7");
                firefoxOptions.setBrowserVersion("82.0");
                firefoxOptions.setCapability("LT:Options", ltOptions);
                driver=new RemoteWebDriver(new URL("https://yaswanthasapu946:vxVgfCdo89tpuQxLTiOM2nSk17zP9KZw1RB46dxZinNzisN0SR@hub.lambdatest.com/wd/hub"),firefoxOptions);

                break;
            case "internetexplorer":
                internetExplorerOptions=new InternetExplorerOptions();
                internetExplorerOptions.setPlatformName("Windows 10");
                internetExplorerOptions.setBrowserVersion("11.0");
                internetExplorerOptions.setCapability("LT:Options", ltOptions);
                driver=new RemoteWebDriver(new URL("https://yaswanthasapu946:vxVgfCdo89tpuQxLTiOM2nSk17zP9KZw1RB46dxZinNzisN0SR@hub.lambdatest.com/wd/hub"),internetExplorerOptions);

                break;


            default :
                System.out.println("Browser name is invalid");
                break;


        }
        driver.get("https://www.lambdatest.com/selenium-playground/");

    }

    @BeforeMethod
        public void url(){
        driver.get("https://www.lambdatest.com/selenium-playground/");
        driver.manage().window().maximize();

    }


    @AfterTest
    public void quit(){
        driver.quit();
    }
}

