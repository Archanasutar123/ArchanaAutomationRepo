package annotation;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationsClassExample {
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("before method");
    }
    @Test
    public void testCase1() {
        System.out.println("test case 1");
    }
    @Test
    public void testCase2() {
        System.out.println("test case 2");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod");

    }

}

