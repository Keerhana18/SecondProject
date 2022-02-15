package Practice;

import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
		
	
String  first ="";
String Final = "";
Scanner aObj = new Scanner(System.in);
System.out.println("Enter String to Check:");
 first =aObj.next();
int j = first.length();
for (int i = j-1;i>=0;i--) {
	Final = Final+first.charAt(i);
	
	}
if(first.equalsIgnoreCase(Final)) {
	System.out.println("Entered String is Palindrome");
}
else {
	System.out.println("Entered string is not a Palindrome");
}
	}
}
