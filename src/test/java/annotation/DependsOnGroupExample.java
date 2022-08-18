package annotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupExample {
    @Test(groups = "vote")
    public void testcaseA() {
        System.out.println("test case 1");
        Assert.assertTrue(false);
    }
    @Test(dependsOnGroups = "vote")
    public void testcaseB() {
        System.out.println("test case 2");
    }
    @Test
    public void testcaseC() {
        System.out.println("test case 3");
    }
    @Test
    public void testcaseD() {
        System.out.println("test case 4");
    }
}

