package annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssert {

    public static WebDriver driver;

    @BeforeMethod(groups = "smoke")
    public void beforeMethod() {
        System.out.println("before method");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\4060\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com"); }
        @Test
    public void testcase1() {
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Google", "The title should be Google");
        System.out.println("Hiiii"); }
    @Test(groups = {"smoke", "p0"})
    public void testcase2() {
        System.out.println(driver.getTitle());
    }
    @AfterMethod()
      public void afterMethod(){
        System.out.println(driver.getTitle());
        driver.close();
    }
}


