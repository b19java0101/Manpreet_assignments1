package btes;

import java.util.Scanner;

public class Arr {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[] arr= {2,5,8,7,6,3};
		System.out.println("enter element to search");
		int k=in.nextInt();
		for(int i=0;i<arr.length;i++) {
			int temp=arr[i];
		
		if(k==temp) {
			System.out.println("element present in array at"+" "+i +"index");
			
		}}
	}

}







