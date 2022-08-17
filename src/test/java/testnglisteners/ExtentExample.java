package testnglisteners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ITestListnerExample.class)
public class ExtentExample {

    ExtentReports extentReports = new ExtentReports();
    ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extentReports.html");
    ExtentTest extentTest;

    @BeforeTest
    void beforeTest() {
        extentReports.attachReporter(sparkReporter); }
    @Test
    public void testcaseA() {
        extentTest = extentReports.createTest("Launch the browser").pass("Test case is Pass").assignAuthor("Komal").assignDevice("Chrome");
        extentTest.pass("Test case is pass");
        Assert.assertTrue(true); }
    @Test(dependsOnMethods = "testcaseA")
    public void testcaseB() {
        extentTest = extentReports.createTest("Launch the browser").pass("Test case is Pass").assignAuthor("Komal").assignDevice("Safari");
        extentTest.pass("Test case is Pass");
        Assert.assertTrue(true); }
    @Test
    public void testcaseC() {
        extentTest = extentReports.createTest("Launch the browser").pass("Test case is Pass").assignAuthor("Archana").assignDevice("firefox");
        extentTest.fail("Test case is fail");
        Assert.assertTrue(false);
    }
    public void testcaseD() {
        extentTest = extentReports.createTest("Launch the browser").pass("Test case is Pass").assignAuthor("Komal").assignDevice("Edge");
        extentTest.pass("Test case is pass");
        Assert.assertTrue(true);
    }
    @AfterTest
    void afterTest(){
        extentReports.flush();
    }


}



