package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstMavenProgram {
    public static void main(String[] args)  {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\4060\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https:/www.facebook.com");
        driver.manage().window().maximize();

        driver.close();



    }
}
