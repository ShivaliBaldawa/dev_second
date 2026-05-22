package pgm1;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ResultTest {
    @Test
    public void testPass(){
        Assert.assertEquals(Result.display(55), "pass");
    }

    @Test
    public void testFail(){
        Assert.assertEquals(Result.display(33), "fail");
    }
    @Test
    public void testInvalid(){
        Assert.assertEquals(Result.display(-10), "invalid");
    }
}
