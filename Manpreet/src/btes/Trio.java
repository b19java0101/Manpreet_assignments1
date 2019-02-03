package btes;

public class Trio {
	public static void main(String args[]){
	       int i,  t1=0,t2=1,t3=1;
	        System.out.println(t1 +" " + t2+" " + t3);
	        for(i=1;i<=10;i++){
	             int c=t1+t2+t3;
	            System.out.println(c);
	     
	        t1=t2;
	        t2=t3;
	        t3=c;
	          
	        }
	             
	            
	    }
}
