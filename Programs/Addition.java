import java.util.*;
class Addition
{
    public static void main(String[] args)
    {
      int a,b,add;
      Scanner c= new Scanner(System.in);
      System.out.println("Enter first number:");
      a=c.nextInt();
      System.out.println("Enter second number:");
      b=c.nextInt();
      add= a+b;
      System.out.println("Addition of numbers is:"+add);
      c.close();
    }    
}