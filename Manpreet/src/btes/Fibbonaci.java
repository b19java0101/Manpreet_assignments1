package btes;

public class Fibbonaci {

	public static void main(String[] args) {
		int i,t1=0,t2=1;
		System.out.println("fibbonaci series of numbers is"+t1+t2);
		for(i=0;i<=10;i++) {
			int c=t1+t2;
			System.out.println(c);
		
		t1=t2;
		t2=c;

		}
	}

}
