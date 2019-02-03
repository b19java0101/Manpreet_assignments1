package btes;

public class Selction {

	public static void main(String[] args) {
		int[] a= {11,55,8,6,52};
		int min;
		int temp;
		for(int i=0;i<a.length;i++)
		{
			min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
				temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
		for(int k=0;k<a.length;k++) {
	System.out.println(a[k]+" ");
}
	}

}

