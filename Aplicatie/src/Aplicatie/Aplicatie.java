package Aplicatie;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Aplicatie {
	public static void main(String[] args) {
		Date myDate = new Date();
		SimpleDateFormat thisDate = new SimpleDateFormat("dd/MM/YY hh:mm a ");
		System.out.println(thisDate.format(myDate));
		
		System.out.println("--------");
		
		String user = "user" ;
	    String pass = "pass";
	    
	    

	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter Username : ");
	    String username = scan.next();

	    
	    System.out.println("Enter Password : ");
	    String password = scan.next();

	    if (user.equals(user) && pass.equals(pass)) {

	        System.out.println("Access Granted! Welcome!");
	    }

	    else if (username.equals(user)) {
	        System.out.println("Invalid Password!");
	    } else if (password.equals(user)) {
	        System.out.println("Invalid Username!");
	    } else {
	        System.out.println("Invalid Username & Password!");
	    }
	    
	    System.out.println("--------");
	    
	    System.out.print("Enter Principal Amount : ");
      	double principal = scan.nextDouble(); 
      	System.out.print("Enter Rate of Interest : ");
      	double rate = scan.nextDouble(); 
      	rate =( rate/100)/12; 
      	System.out.print("Enter Time period in years : ");
      	int time = scan.nextInt();
      	time = time * 12; 
      	double p= (principal * rate) / (1 - Math.pow(1 + rate, -time));
      	
      	System.out.println("Payment: " + p);
	  
	}

}
