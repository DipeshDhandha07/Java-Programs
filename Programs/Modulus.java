import java.io.*;
import java.util.*;
class Modulus
{
    public static void main(String[] args)throws IOException
    {
      int a,b,Mod;
      Scanner m=new Scanner(System.in);
      System.out.println("Enter first number:");
      a=m.nextInt();
      System.out.println("Enter second number:");
      b=m.nextInt();
      Mod=a%b;
      System.out.println("Modulus of numbers is: "+Mod);
      m.close();
    }    
}