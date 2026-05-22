package pgm3;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginValidatorTest {
    @Test
    public void LoginPass(){
        Assert.assertEquals(LoginValidator.Validate("admin", "admin123"), "login successful");
    }

    @Test
    public void LoginFail(){
        Assert.assertEquals(LoginValidator.Validate("abc", "dbt"), "login failed");
    }

    @Test
    public void loginInvalid(){
        Assert.assertEquals(LoginValidator.Validate(null, null), "invalid");
    }
}
