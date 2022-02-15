package Practice;

public class StringReverse {
	public static void main(String[] args) {
		
	
	String first = "Abcde";
	System.out.println("Original String:"+first);
	StringBuilder Second = new StringBuilder(first);
	Second.reverse();
	String value = Second.toString();
	System.out.println("Reversed:" +value);
	
}

}
