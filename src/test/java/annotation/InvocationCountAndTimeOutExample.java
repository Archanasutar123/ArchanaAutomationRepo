package annotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InvocationCountAndTimeOutExample {
    @Test (invocationCount = 200,invocationTimeOut = 40)
    public void testcaseA() {
        System.out.println("invocation test A");
    }
    @Test(priority = -3)
    public void testCaseB() {
        System.out.println("test case B");
    }
    @Test(priority = 2)
    public void testCaseC() {
        System.out.println("test case C");
    }
    @Test(priority = -4)
    public void testcaseD() {
        System.out.println("Test case D");
    }
}
