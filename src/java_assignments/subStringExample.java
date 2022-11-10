package java_assignments;

public class subStringExample {

	public static void removeLastChar(String str) {
	
	str = str.substring(0, (str.length()-1));
	
	System.out.println(str.length());
	
		
	}
	
	public static void main(String[] args) {
		
		
		removeLastChar("poorva t");
	}
}
