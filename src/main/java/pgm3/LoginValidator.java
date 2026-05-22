package pgm3;

public class LoginValidator {
    public static String Validate(String username, String password){
        if(username == null || password == null){
            return "invalid";
        }else if(username.equals("admin") && password.equals("admin123")){
            return "login successful";
        }else{
            return "login failed";
        }
    }
}
