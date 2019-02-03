package btes;
import java.util.Scanner;

public class Arms {
	public static void main(String args[]) {
		int num,a,s=0,rem;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a number");
		num=obj.nextInt();
          a=num;
		while(a>0) {
			rem=a%10;
			a=a/10;
			s=s+rem*rem*rem;
		}
			if(s==num) {
			System.out.print("armstrong");
		}
	else {
		System.out.println("not armstrong");
	}
	}}



