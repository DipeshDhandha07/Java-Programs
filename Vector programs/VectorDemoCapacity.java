// Java code to illustrate capacity() 
import java.util.*; 
class VectorDemoCapacity { 
	public static void main(String args[]) 
	{ 
		// Creating an empty Vector 
		Vector<String> vec_tor = new Vector<String>(); 

		// Use add() method to add elements into the Vector 
		vec_tor.add("Welcome"); 
		vec_tor.add("To"); 
		vec_tor.add("Java"); 
		vec_tor.add("4"); 
		vec_tor.add("JAVAA"); 
		vec_tor.add("Java"); 
		vec_tor.add("4"); 
		
		vec_tor.add("JAVAA"); 
		vec_tor.add("Java"); 
		vec_tor.add("4"); 
		vec_tor.add("JAVAA"); 
		vec_tor.add("JAVAA"); 
		vec_tor.add("Java"); 
		vec_tor.add("4"); 
		vec_tor.add("JAVAA"); 
		vec_tor.add("JAVAA"); 
		vec_tor.add("Java"); 
		vec_tor.add("4"); 
		vec_tor.add("JAVAA"); 
		vec_tor.add("JAVAA"); 
		vec_tor.add("Java"); 
		vec_tor.add("4"); 
		vec_tor.add("JAVAA"); 
		vec_tor.add("JAVAA"); 
		vec_tor.add("Java"); 
		vec_tor.add("4"); 
		vec_tor.add("JAVAA"); 

		// Displaying the Vector 
		System.out.println("Vector: " + vec_tor); 

		// Displaying the capacity of Vector 
		System.out.println("The capacity is: " + vec_tor.capacity()); 
	} 
} 
