package btes;

public class Linear_search {

	public static void main(String[] args) {
		int[] a= {9,3,6,5,4,7,8,2};
		int item=5;
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==item) {
				System.out.println("elemnt is found at"+i+"index");
				temp++;
			}
			
		}
		if(temp==0) {
			System.out.println("item not found in list");
		}
	}

}
