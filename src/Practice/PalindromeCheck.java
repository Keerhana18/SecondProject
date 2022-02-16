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
	


{

Scanner in = new Scanner(System.in);
System.out.println("Enter a number to check:");
int n = in.nextInt();
int sum= 0,r;
int temp = n;
while(n>0){
	r=n%10;
	sum=sum*10+r;
	n= n/10;
}
 if (temp==sum){
	System.out.println("Palindrome");
}
else {
	System.out.println("Not a Palindrome");
}
}
}
}