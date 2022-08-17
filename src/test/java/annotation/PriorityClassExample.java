package annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityClassExample {
    @Test
    public void testcaseA() {
        System.out.println("test case A");
    }
    @Test(priority = 3)
    public void testCaseB() {
        System.out.println("test case B");
    }
    @Test(priority = 2)
    public void testCaseC() {
        System.out.println("test case C");
    }
    @Test(priority = -4)
    public void testcaseD() {
        System.out.println("test case D");
    }

}