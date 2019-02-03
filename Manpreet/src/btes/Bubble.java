package btes;

public class Bubble {

	public static void main(String[] args) {
		int[] arr= {11,2,5,8,7,9,6};
		int i,j;
		int temp;
		for(i=0;i<arr.length-1-i;i++) {
			for(j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			
			}
		}
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}	
		}
		

}
