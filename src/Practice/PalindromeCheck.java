package Practice;

import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
		
	
String  first ="";
String Final = "";
Scanner input = new Scanner(System.in);
System.out.println("Enter String to reverse:");
String first1 = input.nextLine();
int length=first.length();
for (int i = length-1; i>0;i--) {
	String Final1= Final+first.charAt(i);
	if(first1.equals(Final1))
	{
		System.out.println("It is Palindrome");
	}
	else
	{
		System.out.println("Not a Palindrome");
	}
}
}
}