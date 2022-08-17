package annotation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class SoftAssertClass {
    @BeforeMethod(groups = "smoke")
    public void beforeMethod(){
        System.out.println("Before Method");
        ChromeDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\4060\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver.get("https://wwww.facebook.com");
        driver.manage().window().maximize();}
    @Test
    public void testCaseA(){
        ChromeDriver driver = new ChromeDriver();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Facebbok", "The title should be Google");
        System.out.println("Hello");}
    @Test(groups = {"smoke"})
    public void testCaseB(){
        ChromeDriver driver = new ChromeDriver();
        SoftAssert softAssert = new SoftAssert();
        System.out.println(driver.getTitle());
        softAssert.assertEquals(driver.getTitle(),"Facebook", "The title should not be same");
        softAssert.assertTrue(driver.getTitle().contains("Test"),"title should contain Test");
        softAssert.assertAll();}
    @Test
    public void testCaseC(){
        ChromeDriver driver = new ChromeDriver();
        System.out.println(driver.getTitle());}
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");}
}
