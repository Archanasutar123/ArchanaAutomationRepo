package annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class ArithmeticalExceptationExample {
    @Test(expectedExceptions = {ArithmeticException.class, IOException.class})
    public void testCase1() {
        System.out.println("test case 1");
        System.out.println(10 / 2);
        System.out.println("Archana");
    }
    @Test
    public void testCase2() {
        System.out.println("test case 2");
    }
    @Test
    public void testCase3() {
        System.out.println("test case 3");
    }
}
