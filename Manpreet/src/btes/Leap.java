package btes;

import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		int year;
		Scanner o=new Scanner (System.in);
		System.out.println("enter any year");
		year=o.nextInt();
		if ((year%4==0)||(year%400==0)&&(year%100!=0)) {
			System.out.println("year is leap year");
		
		}
		else {
			System.out.println("year is not leap year");
		}
	}

}
