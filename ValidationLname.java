package practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationLname {
	
	Scanner sc=new Scanner(System.in);
	void CheckName(){
		
		System.out.println("enter your last name");
		System.out.println("enter your name");
		System.out.println("please enter the[1] first letter in captical[2]input of min 5 letter and maximum 10 is accepted");
		System.out.println();
		String lastName=sc.next(); 
		
		String regex="[A-Z]{1}[a-z]{2,10}$";
		Pattern p = Pattern.compile(regex);
		
		 Matcher m = p.matcher(lastName);
		 boolean m1=m.matches();
		 System.out.println(m1);
		
		 if (m1==false)
		 {
			 
			 System.out.println("invalid inputs in name please renter in the correct format");
			 
		 }
		 
		 else
		 {
			 System.out.println("your name "+lastName);
			 
		 }

}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ValidationName().CheckName();
		new ValidationLname().CheckName();
		
}
}