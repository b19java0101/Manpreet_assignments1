package btes;

public class Loops {

	public static void main(String[] args) {
	int i,j;
	for(i=0;i<=5;i++) {
		for(j=3;j>=i;j--) {
			System.out.print("  ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
}