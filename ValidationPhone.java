package practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationPhone {
	Scanner sc=new Scanner(System.in);
	void checkno() {
		// TODO Auto-generated method stub
		    System.out.println("enter the phone number");
		    System.out.println("number should valid its country code as +91 and must be of 9 digit number");
		    String phone=sc.next();
		    String regex="[91]{2}[0-9]{9}";
			Pattern p = Pattern.compile(regex);
			
			 Matcher m = p.matcher(phone);
			 boolean m1=m.matches();
			 System.out.println(m1);
			 if (m1==false)
			 {
				 
				 System.out.println("invalid inputs in name please renter in the correct format");
				 
			 }
			 
			 else
			 {
				 System.out.println("your contact number "+phone);
			 }
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ValidationPhone().checkno();
	}

}
