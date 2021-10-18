package stringtype.registration;

public class UserValidator {

    public boolean isValidUsername(String username) {
        return username!="";
    }
    public boolean isValidPassword(String password1, String password2) {
        return (password1.equals(password2)) && (password1.length()>7);
    }
    public boolean isValidEmail(String email) {
        return (email.indexOf("@")>0) && (email.indexOf(".") > ((email.indexOf("@"))+1)) && ((email.indexOf(".")+1)< email.length())  ;
    }
}
