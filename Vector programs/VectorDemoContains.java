// Java code to illustrate contains() 
import java.util.*; 

public class VectorDemoContains { 
	public static void main(String args[]) 
	{ 
		// Creating an empty Vector 
		Vector<String> vec_tor = new Vector<String>(); 

		// Use add() method to add elements into the Vector 
		vec_tor.add("Welcome"); 
		vec_tor.add("To"); 
		vec_tor.add("Java"); 
		vec_tor.add("4"); 
		vec_tor.add("Java"); 

		// Displaying the Vector 
		System.out.println("Vector: " + vec_tor); 

		// Check for "Java" in the Vector 
		System.out.println("Does the vector contains 'Java'? "
						+ vec_tor.contains("Java")); 

		// Check for "4" in the Vector 
		System.out.println("Does the Vector contains '4'? "
						+ vec_tor.contains("4")); 

		// Check if the Queue contains "No" 
		System.out.println("Does the Queue contains 'No'? "
						+ vec_tor.contains("No")); 
	} 
} 
