import java.io.*;
import java.util.*;
class Subtraction
{
    public static void main(String[] args)throws IOException
    {
      int a,b,sub;
      Scanner s= new Scanner(System.in);
      System.out.println("Enter first number:");
      a=s.nextInt();
      System.out.println("Enter second number:");
      b=s.nextInt();
      sub=a-b;
      System.out.println("Subtraction of numbers is:"+sub);
      s.close();
    }    
}