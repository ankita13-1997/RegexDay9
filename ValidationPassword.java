package practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationPassword {
	
	Scanner sc= new Scanner(System.in);
	
	void checkpassword() 
	{
		// TODO Auto-generated method stub
		System.out.println("enter the password");
		System.out.println("password must have atleast 1.one upper case 2.lower case 3.one special character like @ # & $"
				            + " 4. 1 numberic character 4.length of password minimum be 4 maximum be 10" );
		System.out.println("warning you can only take 5 attempts only");
		 int count=0;
		for(int i= 0; i<5 ; i++)
		{
		    String password=sc.next();
		    String regex="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#&$])(?=\\S+$).{4,10}$";
			Pattern p = Pattern.compile(regex);
			
			 Matcher m = p.matcher(password);
			 boolean m1=m.matches();
			 System.out.println(m1);
			count+=1;

			 if (m1==false)
			 {
				 
				 System.out.println("invalid inputs for password please renter in the correct format");
				 System.out.println("you hav used "+count+ " from maximun 5 attempts");
				 continue;
				 
			 }
			 
			 else
			 {
				 System.out.println("your password "+password);
				
				 System.out.println("please Re-enter the correct password");
				 String password2=sc.next();
				 if(password2.contains(password))
				 {
					 System.out.println("you have succesfully set your password and made an account");
					
				 }
				 else
				 {
					 System.out.println("enter the password again");
					 continue;
				 }
				 break;
			 }
			
		}
			
		   
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ValidationPassword().checkpassword();
		

	}

}
