import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment1 {
    private String username;
    private String email;
    private  String password;
    private int password_length = 10;


    public void account(String username,String email,String password){
        this.username=username;
        this.email=email;
        this.password=password;
    }
    private boolean checkusername(){
        return username != null && !username.isEmpty();
    }
    private boolean checkpassword(){
        return password != null && password.length() >= password_length;
    }
    private boolean checkemail(){
        String emailregex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailregex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public void checkall(){
        if (checkusername() && checkemail() && checkpassword()){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }

}
