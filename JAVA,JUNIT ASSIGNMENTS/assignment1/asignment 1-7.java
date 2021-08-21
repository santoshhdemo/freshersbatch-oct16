package helloworld;
import java.util.*;
public class java_A1_Q7 {

	public static void main(String args[])
	   {
	      int i;
	      double key;
	      Scanner sc=new Scanner(System.in);
		  System.out.print("enter the key value to search the position:");
		  key=sc.nextDouble();
	      int a[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};     
	      for(i= 0;i<a.length;i++)
	      {
	         if(a[i]==key) 
	         {
	           System.out.println(key+" is present at location "+(i+1));
	           break;
	         }
	      }
	      if(i==a.length)
	        System.out.println(key + " doesn't exist in array.");
	   }
	}