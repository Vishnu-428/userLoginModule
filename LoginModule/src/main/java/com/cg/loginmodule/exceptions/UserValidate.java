package com.cg.loginmodule.exceptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidate {
public boolean validateUser(String user)
{
	String regex = "^[A-Za-z]\\w{5,29}$"; 
    Pattern p = Pattern.compile(regex); 
    if (user == null) { 
        return false; 
    } 
    Matcher m = p.matcher(user); 
    return m.matches();
	
}
public boolean validatePassword(String password)
{
	 String regex = "^(?=.*[0-9])"
             + "(?=.*[a-z])(?=.*[A-Z])"
             + "(?=.*[@#$%^&+=])"
             + "(?=\\S+$).{8,20}$"; 
	 Pattern p = Pattern.compile(regex); 
	    if (password == null) { 
	        return false; 
	    } 
	    Matcher m = p.matcher(password); 
	    return m.matches();}
}
