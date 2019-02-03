package btes;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		int i,fact=1;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter any number");
		int n=obj.nextInt();
		for (i=1;i<=n;i++) {
			fact=fact*i;
			
		}
		System.out.println("factorial of number is"+ fact);
	}

}
