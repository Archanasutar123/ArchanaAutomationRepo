package annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTestngClass
{
 ThreadLocal<RemoteWebDriver> driver = new ThreadLocal();
   public WebDriver getDriver() {
       return driver.get();
   }
   @BeforeMethod(groups = "smoke")
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\4060\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https:/www.google.com");
        driver.manage().window().maximize();
}@Test
    public void testCase1() {
        System.out.println(getDriver().getTitle());
        Assert.assertEquals(getDriver().getTitle(),"google","The title should be google");
        System.out.println("hiii");
    }@Test(groups = {"smoke","p0"})
    public void testCase2() {
        System.out.println(getDriver().getTitle());
    }@AfterMethod()
    public void afterMethod() {
        System.out.println(getDriver().getTitle());
        getDriver().close();
    }
}
