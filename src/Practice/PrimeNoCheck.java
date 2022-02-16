package Practice;

import java.util.Scanner;

public class PrimeNoCheck {

	public static void main(String[] args) {
		int a=0;
		int b=0;
	    
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter no to be checked:");
	    int n = in.nextInt();
	     
	     b = n/2;
	    for(a=2;a <= b;a++) {
	    	if(n%2 !=0) {
	    	System.out.println("Prime number ");
	    	break;
	    }
	    else {
	    	System.out.println("Not a prime number");
	    
	    	break;
	    }
		// TODO Auto-generated method stub

	}

}
}