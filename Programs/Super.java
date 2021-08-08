public class Super 
{ // Superclass (parent)
      public void SuperSound()
       {
            System.out.println("The Super makes a sound");
      }
}

class Dog extends Super 
{ // Subclass (child)
      public void SuperSound()
      {
            super.SuperSound(); // Call the superclass method
            System.out.println("The dog says: bhau bhau");
      }
}
class MyMainClass {
      public static void main(String args[]) {
            Super myDog = new Dog(); // Create a Dog object
            myDog.SuperSound(); // Call the method on the Dog object
      }
}
