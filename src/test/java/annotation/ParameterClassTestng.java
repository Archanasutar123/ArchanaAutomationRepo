package annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterClassTestng {
    public static WebDriver driver;

    @BeforeMethod(groups = "smoke")
    public void beforeMethod() {
        System.out.println("Digital Class");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\4060\\Downloads\\chromedriver_win32\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize(); }
    @Test
    @Parameters({"p1","p2"})
        public void testcase1(String p1,String p2) {
        System.out.println(driver.getTitle());
        WebElement element = driver.findElement(By.name("Mumbai"));
        element.sendKeys("p1" + "p2");
        element.sendKeys(Keys.ENTER);
    }
    @AfterMethod(groups = "smoke")
    public void afterMethod() {
        System.out.println(driver.getTitle());
        driver.close();
    }
}
