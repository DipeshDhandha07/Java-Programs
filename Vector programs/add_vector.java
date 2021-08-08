import java.util.*; 
public class add_vector{
    public static void main (String[] args) {
 
        Vector v = new Vector();  // It creates a default vector 
      v.add(0,0);                   // Adds 0 at the index 0
        v.add(1);                 // Adds 1 at the end of the list
       v.add("Java");           // Adds "Java" at the end of the list
       v.add("is");             // Adds "is" at the end of the list
       v.add("Fun");            // Adds "Fun" at the end of the list
    v.add(2,"kirti");
 
       System.out.println("The vector is " + v); 
    } 
}