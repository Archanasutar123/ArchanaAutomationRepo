package annotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {

    @Test
    public void testcaseA() {
        System.out.println("test case 1");
        Assert.assertTrue(true);
    }
    @Test(dependsOnMethods = "testcaseA")
    public void testCaseB() {
        System.out.println("test case 2");
    }
    @Test
    public void testCaseC() {
        System.out.println("test case 3");
    }
    @Test
    public void testcaseD() {
        System.out.println("test case 4");
    }
}
