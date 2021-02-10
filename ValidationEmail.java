package practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationEmail {
	Scanner sc= new Scanner(System.in);
	
	
	void checkemail()
	{
		System.out.println("Enter your Email");
		System.out.println("[1]email must have domain name and .with it [2] must have a @ in Your input");
		String email=sc.next();
		    String regex="[a-zA-Z0-9_.]+@[a-zA-Z.]+$";
			Pattern p = Pattern.compile(regex);
			
			 Matcher m = p.matcher(email);
			 boolean m1=m.matches();
			 System.out.println(m1);
		
			 if (m1==false)
			 {
				 
				 System.out.println("invalid inputs for email please renter in the correct format");
				 
			 }
			 
			 else
			 {
				 System.out.println("your email is "+email);
			 }
			
			
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ValidationEmail().checkemail();

	}

}
