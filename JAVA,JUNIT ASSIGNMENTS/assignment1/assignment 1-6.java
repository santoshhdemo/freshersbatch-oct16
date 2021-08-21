package helloworld;

import java.util.Scanner;

public class java_A1_Q6 {

	public static void main(String[] args)
	{
     int attempts=0;
     String username="bharath",password="bharath123";
     Scanner sc=new Scanner(System.in);
     while(true)
     {
    	 System.out.println("enter the username and password:");
    	 String un=sc.next();
    	 String pw=sc.next();
    	 if((username.equals(pw))||(password.equals(pw)))
    	 {
    		System.out.println("welcome");
    		break;
    	 }
    	 else
    	 {
    		 attempts++;
    		 System.out.println("pls enter correct username");
    		 System.out.println("number off attempts left"+(3-attempts));
    	 }
     }
     }

}
