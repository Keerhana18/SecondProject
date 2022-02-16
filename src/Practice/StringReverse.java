package Practice;

public class StringReverse {
	public static void main(String[] args) {
		
	
	String first = "abcdef";
	String Reverse = "'";
	System.out.println(first);
	int length= first.length();
	for (int i=length-1;i>=0;i--) {
		Reverse=Reverse + first.charAt(i);
		if(first.equalsIgnoreCase(Reverse)) {
		System.out.println(Reverse);
	}
	}
	}
}
