package btes;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner (System.in);
		System.out.println("enter any numbr");
       n=s.nextInt();
       if(n%2==0) {
    	   System.out.println("even number");
       }
       else {
    	   System.out.println("odd number");
       }
	}

}
