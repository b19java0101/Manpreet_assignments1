package btes;

public class Array {

	public static void main(String[] args) {
		int[] arr= {22,33,5,98,9,75,55};
		int i,max,sec_max;
		max=arr[0];
       sec_max=arr[0];
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>max) {
				max=arr[i];
				
			}
			if(arr[i]>sec_max && arr[i] <max) {
				sec_max=arr[i];
				
			}
	}
		System.out.println("maximum number in array="+ max + "second maximum element in array="+ sec_max);
}}
