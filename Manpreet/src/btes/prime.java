package btes;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		int n;
		Scanner obj=new Scanner(System.in);
       System.out.println(" enter a number");
       n=obj.nextInt();
       for(int i=2;i<n;i++) {
    	   if(n/i==0)   
    	 System.out.print("is prime number");
       
    		   else {
    			   System.out.print("not prime");
          
       }
       
	}
	}
}
