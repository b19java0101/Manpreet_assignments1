package btes;

public class Binary {

	public static void main(String[] args) {
		int[] a={2,3,4,6,7,9,10,11,22,55};
		int ele=3;
		int li=0;
		int hi=a.length-1;
		int mi=li+hi/2;
		while(li<=hi)
		if(a[mi]==a[ele]) {
			System.out.println("element found");
		}
		if(a[mi]<a[ele]) {
			li=mi+1;
		}
		if(a[mi]>a[ele]) {
			hi=mi-1;
		}
		mi=li+hi/2;
	
	if(li>hi) {
		System.out.println("not fond");
	}

}}
