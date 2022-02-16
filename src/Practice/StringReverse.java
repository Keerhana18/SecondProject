package Practice;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		
	
	String a= "";
	String b ="";
	Scanner c = new Scanner(System.in);
	System.out.println("Enter String to be Revered:");
	a = c.nextLine();
	int length = a.length();
	for(int i =length-1;i>=0;i--) {
		b = b+a.charAt(i);
	}
		
		System.out.println("Reversed:" + b);
		
	}
	}
	
	

