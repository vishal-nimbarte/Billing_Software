/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Administrator
 */
public class RegValidation 
{
    private Pattern name,email,password,mobile_number;
    private Matcher matcher;
    
    String name_pattern = "^[a-zA-Z ]{3,30}$";
    String email_pattern = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$";
    String password_pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{5,10}";
    String mobile_number_pattern = "(0/91)?[7-9][0-9]{9}";
    
    public RegValidation()
    {
        name = Pattern.compile(name_pattern);
        email = Pattern.compile(email_pattern);
        password = Pattern.compile(password_pattern);
        mobile_number = Pattern.compile(mobile_number_pattern);
    }
    
    public boolean nameValidation(String user_name)
    {
        matcher = name.matcher(user_name);
        return matcher.matches();
    }
    
    public boolean emailValidation(String user_email)
    {
        matcher = email.matcher(user_email);
        return matcher.matches();
    }
    
    public boolean passwordValidation(String user_password)
    {
        matcher = password.matcher(user_password);
        return matcher.matches();
    }
    
    public boolean mobileNumberValidation(String user_mobile_number)
    {
        matcher = mobile_number.matcher(user_mobile_number);
        return matcher.matches();
    }
}
