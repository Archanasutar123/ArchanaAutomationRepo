package dataprovider;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;

public class DataProviderClassExample {
    public static WebDriver driver;
    @DataProvider(name = "test_data")
    public Object[][] dataProviderFun() throws IOException {
        Object[][] arrObj = getExcelData("C:\\Users\\4060\\Desktop", "Data");
        return arrObj; }
    public String[][] getExcelData(String fileName, String sheetName) throws IOException {
        String[][] data = null;

        FileInputStream fis = new FileInputStream(fileName);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sh = wb.getSheet(sheetName);
        XSSFRow row = sh.getRow(0);
        int noOfRows = sh.getPhysicalNumberOfRows();
        int noOfCols = row.getLastCellNum();
        Cell cell;

        data = new String[noOfRows - 1][noOfCols];

        for (int i = 1; i < noOfRows; i++) {
            for (int j = 0; j < noOfCols; j++) {
                row = sh.getRow(i);
                cell = row.getCell(j);
                data[i-1][j] = cell.getStringCellValue();
            }
        }
        return data;
    }
    @BeforeMethod
    @Parameters({"Browser"})
    public void beforeMethod() {
            System.setProperty("webdriver.chrome.driver", "C:/Users/4060/Downloads/chromedriver_win32/chromedriver.exe");
            driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.manage().window().maximize();
    }
    @Test(dataProvider = "test_data")
    public void testCase2 (String technology, String City){
        System.out.println(driver.getTitle());
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(technology + "" + City);
        element.sendKeys("ENTER");
    }
    @AfterMethod
    public void afterMethod () {
        System.out.println(driver.getTitle());
        driver.close();
    }
}

