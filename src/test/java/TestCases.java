import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    @Test
    public void testAdd() {
        int total = 8;
        int sum = add(4, 4);
        System.out.println("Verifying the first test case");
        Assert.assertEquals(sum, total);
    }

    @Test
    public void testForCheckInTest() {
        int total = 10;
        int sum = add(10, 5);
        System.out.println("Verifying the second test case");
        Assert.assertNotEquals(sum, total);
    }

    @Test
    public void testSub() {
        int total = 0;
        int sub = sub(4, 4);
        System.out.println("Verifying the third test case");
        Assert.assertEquals(sub, total);
    }
}
